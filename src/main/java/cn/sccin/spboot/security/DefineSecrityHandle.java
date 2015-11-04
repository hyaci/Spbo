package cn.sccin.spboot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.context.SecurityContextPersistenceFilter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

/**
 * Created by developer_hyaci on 2015/9/24.
 */
@Configuration
public class DefineSecrityHandle extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }




    @Configuration
    @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
    protected static class ApplicationSecurity extends WebSecurityConfigurerAdapter {

        @Autowired
        private SecurityProperties security;
        @Autowired
        private DataSource dataSource;

        @Bean
        public StandardPasswordEncoder creatBean(){
            return new StandardPasswordEncoder(security.getBasic().getPath()[0]);
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {

            http.authorizeRequests().antMatchers("/pub/**","/ui/**").permitAll().anyRequest().fullyAuthenticated().
                    and().formLogin().loginPage("/login").failureUrl("/login?error").permitAll().and()
                    .logout().permitAll();

        }

        @Override
        public void configure(AuthenticationManagerBuilder auth) throws Exception {

            //查询列必须仅仅为登陆名、登陆密码、是否可用（0、1、true\false）
            String queryByUserName="SELECT sys_user.FLOGINNAME,sys_user.FLOGINPSD,sys_user.FVALID FROM sys_user " +
                                   "WHERE sys_user.FLOGINNAME = ?";
            //查询列必须仅仅为登陆名、角色code;
            String queryAuthorities="SELECT sys_user.FLOGINNAME,sys_role.FROLECODE FROM sys_user " +
                                    "INNER JOIN r_user_role on r_user_role.FUSERID=sys_user.FID " +
                                    "inner join sys_role on sys_role.FID=r_user_role.FROLEID " +
                                    "WHERE sys_user.FLOGINNAME = ?";
            auth.jdbcAuthentication().dataSource(this.dataSource)
                    .usersByUsernameQuery(queryByUserName)
                    .authoritiesByUsernameQuery(queryAuthorities)
                    .passwordEncoder(this.creatBean());
        }

    }
}
