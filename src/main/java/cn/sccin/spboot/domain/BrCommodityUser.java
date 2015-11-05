package cn.sccin.spboot.domain;

import javax.persistence.*;

/**
 * Created by developer_hyaci on 2015/11/5.
 */
@Entity
@Table(name = "br_commodity_user", schema = "", catalog = "spboot")
public class BrCommodityUser {
    private String fid;
    private String fuserid;
    private String fcommodityid;

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
    @Column(name = "FCOMMODITYID")
    public String getFcommodityid() {
        return fcommodityid;
    }

    public void setFcommodityid(String fcommodityid) {
        this.fcommodityid = fcommodityid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrCommodityUser that = (BrCommodityUser) o;

        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (fuserid != null ? !fuserid.equals(that.fuserid) : that.fuserid != null) return false;
        if (fcommodityid != null ? !fcommodityid.equals(that.fcommodityid) : that.fcommodityid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (fuserid != null ? fuserid.hashCode() : 0);
        result = 31 * result + (fcommodityid != null ? fcommodityid.hashCode() : 0);
        return result;
    }
}
