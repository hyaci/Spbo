package cn.sccin.spboot.domain;

import javax.persistence.*;

/**
 * Created by developer_hyaci on 2015/9/25.
 */
@Entity
@Table(name = "r_role_power", schema = "", catalog = "spboot")
public class RRolePower {
    private String fid;
    private String froleid;
    private String fpwoerid;

    @Id
    @Column(name = "FID")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "FROLEID")
    public String getFroleid() {
        return froleid;
    }

    public void setFroleid(String froleid) {
        this.froleid = froleid;
    }

    @Basic
    @Column(name = "FPWOERID")
    public String getFpwoerid() {
        return fpwoerid;
    }

    public void setFpwoerid(String fpwoerid) {
        this.fpwoerid = fpwoerid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RRolePower that = (RRolePower) o;

        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (froleid != null ? !froleid.equals(that.froleid) : that.froleid != null) return false;
        if (fpwoerid != null ? !fpwoerid.equals(that.fpwoerid) : that.fpwoerid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (froleid != null ? froleid.hashCode() : 0);
        result = 31 * result + (fpwoerid != null ? fpwoerid.hashCode() : 0);
        return result;
    }
}
