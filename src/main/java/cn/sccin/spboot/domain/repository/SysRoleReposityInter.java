package cn.sccin.spboot.domain.repository;

import cn.sccin.spboot.domain.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by developer_hyaci on 2015/9/25.
 */
public interface SysRoleReposityInter extends JpaRepository<SysRole,String>{
   SysRole findByFrolecode(String frolecode);
}
