package cn.sccin.spboot.domain.repository;

import cn.sccin.spboot.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by developer_hyaci on 2015/9/25.
 */
public interface SysUserReposityInter extends JpaRepository<SysUser,String>{

}
