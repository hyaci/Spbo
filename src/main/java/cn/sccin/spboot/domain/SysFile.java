package cn.sccin.spboot.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by developer_hyaci on 2015/10/23.
 */
@Entity
@Table(name = "sys_file", schema = "", catalog = "spboot")
public class SysFile {
    private String fid;
    private String fshowname;
    private String fsavename;
    private String fsuffix;
    private String frelativepath;
    private String fabsolutepath;
    private Timestamp fcreatetime;
    private String fexpend;

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
    @Column(name = "FSAVENAME")
    public String getFsavename() {
        return fsavename;
    }

    public void setFsavename(String fsavename) {
        this.fsavename = fsavename;
    }

    @Basic
    @Column(name = "FSUFFIX")
    public String getFsuffix() {
        return fsuffix;
    }

    public void setFsuffix(String fsuffix) {
        this.fsuffix = fsuffix;
    }

    @Basic
    @Column(name = "FRELATIVEPATH")
    public String getFrelativepath() {
        return frelativepath;
    }

    public void setFrelativepath(String frelativepath) {
        this.frelativepath = frelativepath;
    }

    @Basic
    @Column(name = "FABSOLUTEPATH")
    public String getFabsolutepath() {
        return fabsolutepath;
    }

    public void setFabsolutepath(String fabsolutepath) {
        this.fabsolutepath = fabsolutepath;
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
    @Column(name = "FEXPEND")
    public String getFexpend() {
        return fexpend;
    }

    public void setFexpend(String fexpend) {
        this.fexpend = fexpend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysFile sysFile = (SysFile) o;

        if (fid != null ? !fid.equals(sysFile.fid) : sysFile.fid != null) return false;
        if (fshowname != null ? !fshowname.equals(sysFile.fshowname) : sysFile.fshowname != null) return false;
        if (fsavename != null ? !fsavename.equals(sysFile.fsavename) : sysFile.fsavename != null) return false;
        if (fsuffix != null ? !fsuffix.equals(sysFile.fsuffix) : sysFile.fsuffix != null) return false;
        if (frelativepath != null ? !frelativepath.equals(sysFile.frelativepath) : sysFile.frelativepath != null)
            return false;
        if (fabsolutepath != null ? !fabsolutepath.equals(sysFile.fabsolutepath) : sysFile.fabsolutepath != null)
            return false;
        if (fcreatetime != null ? !fcreatetime.equals(sysFile.fcreatetime) : sysFile.fcreatetime != null) return false;
        if (fexpend != null ? !fexpend.equals(sysFile.fexpend) : sysFile.fexpend != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (fshowname != null ? fshowname.hashCode() : 0);
        result = 31 * result + (fsavename != null ? fsavename.hashCode() : 0);
        result = 31 * result + (fsuffix != null ? fsuffix.hashCode() : 0);
        result = 31 * result + (frelativepath != null ? frelativepath.hashCode() : 0);
        result = 31 * result + (fabsolutepath != null ? fabsolutepath.hashCode() : 0);
        result = 31 * result + (fcreatetime != null ? fcreatetime.hashCode() : 0);
        result = 31 * result + (fexpend != null ? fexpend.hashCode() : 0);
        return result;
    }
}
