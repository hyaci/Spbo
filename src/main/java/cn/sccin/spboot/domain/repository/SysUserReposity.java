//package cn.sccin.spboot.domain.repository;
//
//import cn.sccin.spboot.domain.SysUser;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
///**
// * Created by developer_hyaci on 2015/9/25.
// */
//@Repository
//public class SysUserReposity implements BaseReposityInter<SysUser> {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public void modify(SysUser bean) {
//        entityManager.merge(bean);
//    }
//
//    @Override
//    public void remove(SysUser bean) {
//        entityManager.remove(bean);
//    }
//
//    @Override
//    public void removeById(String id) {
//        SysUser bean = entityManager.find(SysUser.class, id);
//        entityManager.remove(bean);
//    }
//
//    @Override
//    public SysUser getById(String id) {
//        return entityManager.find(SysUser.class, id);
//    }
//
//    @Override
//    public List<SysUser> getAll() {
//        return null;
//    }
//}
