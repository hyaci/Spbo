package cn.sccin.spboot.domain;

import javax.persistence.*;

/**
 * Created by developer_hyaci on 2015/9/25.
 */
@Entity
@Table(name = "r_power_moudle", schema = "", catalog = "spboot")
public class RPowerMoudle {
    private String fid;
    private String fpowerid;
    private String fmoudleid;

    @Id
    @Column(name = "FID")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "FPOWERID")
    public String getFpowerid() {
        return fpowerid;
    }

    public void setFpowerid(String fpowerid) {
        this.fpowerid = fpowerid;
    }

    @Basic
    @Column(name = "FMOUDLEID")
    public String getFmoudleid() {
        return fmoudleid;
    }

    public void setFmoudleid(String fmoudleid) {
        this.fmoudleid = fmoudleid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RPowerMoudle that = (RPowerMoudle) o;

        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (fpowerid != null ? !fpowerid.equals(that.fpowerid) : that.fpowerid != null) return false;
        if (fmoudleid != null ? !fmoudleid.equals(that.fmoudleid) : that.fmoudleid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (fpowerid != null ? fpowerid.hashCode() : 0);
        result = 31 * result + (fmoudleid != null ? fmoudleid.hashCode() : 0);
        return result;
    }
}
