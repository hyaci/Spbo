package cn.sccin.spboot.domain;

import javax.persistence.*;

/**
 * Created by developer_hyaci on 2015/9/25.
 */
@Entity
@Table(name = "sys_power", schema = "", catalog = "spboot")
public class SysPower {
    private String fid;
    private String fpowername;
    private String fdescrible;
    private String fmark;
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
    @Column(name = "FPOWERNAME")
    public String getFpowername() {
        return fpowername;
    }

    public void setFpowername(String fpowername) {
        this.fpowername = fpowername;
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
    @Column(name = "FMARK")
    public String getFmark() {
        return fmark;
    }

    public void setFmark(String fmark) {
        this.fmark = fmark;
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

        SysPower sysPower = (SysPower) o;

        if (fid != null ? !fid.equals(sysPower.fid) : sysPower.fid != null) return false;
        if (fpowername != null ? !fpowername.equals(sysPower.fpowername) : sysPower.fpowername != null) return false;
        if (fdescrible != null ? !fdescrible.equals(sysPower.fdescrible) : sysPower.fdescrible != null) return false;
        if (fmark != null ? !fmark.equals(sysPower.fmark) : sysPower.fmark != null) return false;
        if (fusefull != null ? !fusefull.equals(sysPower.fusefull) : sysPower.fusefull != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (fpowername != null ? fpowername.hashCode() : 0);
        result = 31 * result + (fdescrible != null ? fdescrible.hashCode() : 0);
        result = 31 * result + (fmark != null ? fmark.hashCode() : 0);
        result = 31 * result + (fusefull != null ? fusefull.hashCode() : 0);
        return result;
    }
}
