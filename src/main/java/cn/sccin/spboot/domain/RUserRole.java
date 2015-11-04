package cn.sccin.spboot.domain;

import javax.persistence.*;

/**
 * Created by developer_hyaci on 2015/9/25.
 */
@Entity
@Table(name = "r_user_role", schema = "", catalog = "spboot")
public class RUserRole {
    private String fid;
    private String fuserid;
    private String froleid;

    @Id
    @Column(name = "FID")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "FUSERID")
    public String getFuserid() {
        return fuserid;
    }

    public void setFuserid(String fuserid) {
        this.fuserid = fuserid;
    }

    @Basic
    @Column(name = "FROLEID")
    public String getFroleid() {
        return froleid;
    }

    public void setFroleid(String froleid) {
        this.froleid = froleid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RUserRole rUserRole = (RUserRole) o;

        if (fid != null ? !fid.equals(rUserRole.fid) : rUserRole.fid != null) return false;
        if (fuserid != null ? !fuserid.equals(rUserRole.fuserid) : rUserRole.fuserid != null) return false;
        if (froleid != null ? !froleid.equals(rUserRole.froleid) : rUserRole.froleid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (fuserid != null ? fuserid.hashCode() : 0);
        result = 31 * result + (froleid != null ? froleid.hashCode() : 0);
        return result;
    }
}
