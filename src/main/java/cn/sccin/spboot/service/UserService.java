package cn.sccin.spboot.service;

import cn.sccin.spboot.domain.RUserRole;
import cn.sccin.spboot.domain.SysRole;
import cn.sccin.spboot.domain.SysUser;
//import cn.sccin.spboot.domain.repository.SysUserReposity;
import cn.sccin.spboot.domain.repository.RUserRoleReposityInter;
import cn.sccin.spboot.domain.repository.SysRoleReposityInter;
import cn.sccin.spboot.domain.repository.SysUserReposityInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * Created by developer_hyaci on 2015/9/24.
 */
@Component("userService")
@Transactional
public class UserService {

//    private SysUserReposity reposity;
    private SysUserReposityInter userReposity;
    private SysRoleReposityInter roleReposity;
    private RUserRoleReposityInter userRoleReposity;
    private StandardPasswordEncoder passwordEncoder;

    @Autowired
    public UserService(SysUserReposityInter reposity,SysRoleReposityInter roleReposity,
                       RUserRoleReposityInter userRoleReposity,StandardPasswordEncoder passwordEncoder){
        this.userReposity=reposity;
        this.roleReposity=roleReposity;
        this.userRoleReposity=userRoleReposity;
        this.passwordEncoder=passwordEncoder;
    }

    @Transactional
    public void register(String userName,String psd){
        SysUser user=new SysUser();
        user.setFid(UUID.randomUUID().toString());
        user.setFloginname(userName);
        user.setFloginpsd(this.passwordEncoder.encode(psd));
        user.setFvalid("1");
        userReposity.save(user);
        SysRole role = roleReposity.findByFrolecode("ADMIN");
        RUserRole userRole=new RUserRole();
        userRole.setFid(UUID.randomUUID().toString());
        userRole.setFroleid(role.getFid());
        userRole.setFuserid(user.getFid());
        userRoleReposity.save(userRole);

    }
}
