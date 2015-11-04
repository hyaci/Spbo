package cn.sccin.spboot.domain;


import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by developer_hyaci on 2015/9/25.
 */
@Entity
@Table(name = "sys_user", schema = "", catalog = "spboot")
public class SysUser {
    private String fid;
    private String fshowname;
    private String floginname;
    private String floginpsd;
    private Timestamp fcreatetime;
    private String flastip;
    private String forgnum;
    private String forgname;
    private String faddresscode;
    private String faddressname;
    private String fusefull;
    private String fvalid;
    private String flocked;
    private String fca;
    private String fcavalid;
    private String fcaexpand;
    private String fexpand;

    @Id
    @Column(name = "FID")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "FSHOWNAME")
    public String getFshowname() {
        return fshowname;
    }

    public void setFshowname(String fshowname) {
        this.fshowname = fshowname;
    }

    @Basic
    @Column(name = "FLOGINNAME")
    public String getFloginname() {
        return floginname;
    }

    public void setFloginname(String floginname) {
        this.floginname = floginname;
    }

    @Basic
    @Column(name = "FLOGINPSD")
    public String getFloginpsd() {
        return floginpsd;
    }

    public void setFloginpsd(String floginpsd) {
        this.floginpsd = floginpsd;
    }

    @Basic
    @Column(name = "FCREATETIME")
    public Timestamp getFcreatetime() {
        return fcreatetime;
    }

    public void setFcreatetime(Timestamp fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    @Basic
    @Column(name = "FLASTIP")
    public String getFlastip() {
        return flastip;
    }

    public void setFlastip(String flastip) {
        this.flastip = flastip;
    }

    @Basic
    @Column(name = "FORGNUM")
    public String getForgnum() {
        return forgnum;
    }

    public void setForgnum(String forgnum) {
        this.forgnum = forgnum;
    }

    @Basic
    @Column(name = "FORGNAME")
    public String getForgname() {
        return forgname;
    }

    public void setForgname(String forgname) {
        this.forgname = forgname;
    }

    @Basic
    @Column(name = "FADDRESSCODE")
    public String getFaddresscode() {
        return faddresscode;
    }

    public void setFaddresscode(String faddresscode) {
        this.faddresscode = faddresscode;
    }

    @Basic
    @Column(name = "FADDRESSNAME")
    public String getFaddressname() {
        return faddressname;
    }

    public void setFaddressname(String faddressname) {
        this.faddressname = faddressname;
    }

    @Basic
    @Column(name = "FUSEFULL")
    public String getFusefull() {
        return fusefull;
    }

    public void setFusefull(String fusefull) {
        this.fusefull = fusefull;
    }

    @Basic
    @Column(name = "FVALID")
    public String getFvalid() {
        return fvalid;
    }

    public void setFvalid(String fvalid) {
        this.fvalid = fvalid;
    }

    @Basic
    @Column(name = "FLOCKED")
    public String getFlocked() {
        return flocked;
    }

    public void setFlocked(String flocked) {
        this.flocked = flocked;
    }

    @Basic
    @Column(name = "FCA")
    public String getFca() {
        return fca;
    }

    public void setFca(String fca) {
        this.fca = fca;
    }

    @Basic
    @Column(name = "FCAVALID")
    public String getFcavalid() {
        return fcavalid;
    }

    public void setFcavalid(String fcavalid) {
        this.fcavalid = fcavalid;
    }

    @Basic
    @Column(name = "FCAEXPAND")
    public String getFcaexpand() {
        return fcaexpand;
    }

    public void setFcaexpand(String fcaexpand) {
        this.fcaexpand = fcaexpand;
    }

    @Basic
    @Column(name = "FEXPAND")
    public String getFexpand() {
        return fexpand;
    }

    public void setFexpand(String fexpand) {
        this.fexpand = fexpand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysUser sysUser = (SysUser) o;

        if (fid != null ? !fid.equals(sysUser.fid) : sysUser.fid != null) return false;
        if (fshowname != null ? !fshowname.equals(sysUser.fshowname) : sysUser.fshowname != null) return false;
        if (floginname != null ? !floginname.equals(sysUser.floginname) : sysUser.floginname != null) return false;
        if (floginpsd != null ? !floginpsd.equals(sysUser.floginpsd) : sysUser.floginpsd != null) return false;
        if (fcreatetime != null ? !fcreatetime.equals(sysUser.fcreatetime) : sysUser.fcreatetime != null) return false;
        if (flastip != null ? !flastip.equals(sysUser.flastip) : sysUser.flastip != null) return false;
        if (forgnum != null ? !forgnum.equals(sysUser.forgnum) : sysUser.forgnum != null) return false;
        if (forgname != null ? !forgname.equals(sysUser.forgname) : sysUser.forgname != null) return false;
        if (faddresscode != null ? !faddresscode.equals(sysUser.faddresscode) : sysUser.faddresscode != null)
            return false;
        if (faddressname != null ? !faddressname.equals(sysUser.faddressname) : sysUser.faddressname != null)
            return false;
        if (fusefull != null ? !fusefull.equals(sysUser.fusefull) : sysUser.fusefull != null) return false;
        if (fvalid != null ? !fvalid.equals(sysUser.fvalid) : sysUser.fvalid != null) return false;
        if (flocked != null ? !flocked.equals(sysUser.flocked) : sysUser.flocked != null) return false;
        if (fca != null ? !fca.equals(sysUser.fca) : sysUser.fca != null) return false;
        if (fcavalid != null ? !fcavalid.equals(sysUser.fcavalid) : sysUser.fcavalid != null) return false;
        if (fcaexpand != null ? !fcaexpand.equals(sysUser.fcaexpand) : sysUser.fcaexpand != null) return false;
        if (fexpand != null ? !fexpand.equals(sysUser.fexpand) : sysUser.fexpand != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (fshowname != null ? fshowname.hashCode() : 0);
        result = 31 * result + (floginname != null ? floginname.hashCode() : 0);
        result = 31 * result + (floginpsd != null ? floginpsd.hashCode() : 0);
        result = 31 * result + (fcreatetime != null ? fcreatetime.hashCode() : 0);
        result = 31 * result + (flastip != null ? flastip.hashCode() : 0);
        result = 31 * result + (forgnum != null ? forgnum.hashCode() : 0);
        result = 31 * result + (forgname != null ? forgname.hashCode() : 0);
        result = 31 * result + (faddresscode != null ? faddresscode.hashCode() : 0);
        result = 31 * result + (faddressname != null ? faddressname.hashCode() : 0);
        result = 31 * result + (fusefull != null ? fusefull.hashCode() : 0);
        result = 31 * result + (fvalid != null ? fvalid.hashCode() : 0);
        result = 31 * result + (flocked != null ? flocked.hashCode() : 0);
        result = 31 * result + (fca != null ? fca.hashCode() : 0);
        result = 31 * result + (fcavalid != null ? fcavalid.hashCode() : 0);
        result = 31 * result + (fcaexpand != null ? fcaexpand.hashCode() : 0);
        result = 31 * result + (fexpand != null ? fexpand.hashCode() : 0);
        return result;
    }
}
