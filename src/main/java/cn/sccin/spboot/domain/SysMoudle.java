package cn.sccin.spboot.domain;

import javax.persistence.*;

/**
 * Created by developer_hyaci on 2015/9/25.
 */
@Entity
@Table(name = "sys_moudle", schema = "", catalog = "spboot")
public class SysMoudle {
    private String fid;
    private String fmoudlename;
    private String fdescrible;
    private String ftype;
    private String fparent;
    private String furl;
    private String fislast;

    @Id
    @Column(name = "FID")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "FMOUDLENAME")
    public String getFmoudlename() {
        return fmoudlename;
    }

    public void setFmoudlename(String fmoudlename) {
        this.fmoudlename = fmoudlename;
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
    @Column(name = "FTYPE")
    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    @Basic
    @Column(name = "FPARENT")
    public String getFparent() {
        return fparent;
    }

    public void setFparent(String fparent) {
        this.fparent = fparent;
    }

    @Basic
    @Column(name = "FURL")
    public String getFurl() {
        return furl;
    }

    public void setFurl(String furl) {
        this.furl = furl;
    }

    @Basic
    @Column(name = "FISLAST")
    public String getFislast() {
        return fislast;
    }

    public void setFislast(String fislast) {
        this.fislast = fislast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysMoudle sysMoudle = (SysMoudle) o;

        if (fid != null ? !fid.equals(sysMoudle.fid) : sysMoudle.fid != null) return false;
        if (fmoudlename != null ? !fmoudlename.equals(sysMoudle.fmoudlename) : sysMoudle.fmoudlename != null)
            return false;
        if (fdescrible != null ? !fdescrible.equals(sysMoudle.fdescrible) : sysMoudle.fdescrible != null) return false;
        if (ftype != null ? !ftype.equals(sysMoudle.ftype) : sysMoudle.ftype != null) return false;
        if (fparent != null ? !fparent.equals(sysMoudle.fparent) : sysMoudle.fparent != null) return false;
        if (furl != null ? !furl.equals(sysMoudle.furl) : sysMoudle.furl != null) return false;
        if (fislast != null ? !fislast.equals(sysMoudle.fislast) : sysMoudle.fislast != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (fmoudlename != null ? fmoudlename.hashCode() : 0);
        result = 31 * result + (fdescrible != null ? fdescrible.hashCode() : 0);
        result = 31 * result + (ftype != null ? ftype.hashCode() : 0);
        result = 31 * result + (fparent != null ? fparent.hashCode() : 0);
        result = 31 * result + (furl != null ? furl.hashCode() : 0);
        result = 31 * result + (fislast != null ? fislast.hashCode() : 0);
        return result;
    }
}
