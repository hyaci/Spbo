package cn.sccin.spboot.domain;

import javax.persistence.*;

/**
 * Created by developer_hyaci on 2015/9/25.
 */
@Entity
@Table(name = "sys_role", schema = "", catalog = "spboot")
public class SysRole {
    private String fid;
    private String frolecode;
    private String fdescrible;
    private String fusefull;

    @Id
    @Column(name = "FID")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "FROLECODE")
    public String getFrolecode() {
        return frolecode;
    }

    public void setFrolecode(String frolecode) {
        this.frolecode = frolecode;
    }

    @Basic
    @Column(name = "FDESCRIBLE")
    public String getFdescrible() {
        return fdescrible;
    }

    public void setFdescrible(String fdescrible) {
        this.fdescrible = fdescrible;
    }

    @Basic
    @Column(name = "FUSEFULL")
    public String getFusefull() {
        return fusefull;
    }

    public void setFusefull(String fusefull) {
        this.fusefull = fusefull;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysRole sysRole = (SysRole) o;

        if (fid != null ? !fid.equals(sysRole.fid) : sysRole.fid != null) return false;
        if (frolecode != null ? !frolecode.equals(sysRole.frolecode) : sysRole.frolecode != null) return false;
        if (fdescrible != null ? !fdescrible.equals(sysRole.fdescrible) : sysRole.fdescrible != null) return false;
        if (fusefull != null ? !fusefull.equals(sysRole.fusefull) : sysRole.fusefull != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (frolecode != null ? frolecode.hashCode() : 0);
        result = 31 * result + (fdescrible != null ? fdescrible.hashCode() : 0);
        result = 31 * result + (fusefull != null ? fusefull.hashCode() : 0);
        return result;
    }
}
