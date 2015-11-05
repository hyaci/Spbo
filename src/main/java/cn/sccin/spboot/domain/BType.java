package cn.sccin.spboot.domain;

import javax.persistence.*;

/**
 * Created by developer_hyaci on 2015/11/5.
 */
@Entity
@Table(name = "b_type", schema = "", catalog = "spboot")
public class BType {
    private String fid;
    private Integer findex;
    private String fname;
    private String fparent;
    private String ftypecode;
    private String fparentname;

    @Id
    @Column(name = "FID")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "FINDEX")
    public Integer getFindex() {
        return findex;
    }

    public void setFindex(Integer findex) {
        this.findex = findex;
    }

    @Basic
    @Column(name = "FNAME")
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
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
    @Column(name = "FTYPECODE")
    public String getFtypecode() {
        return ftypecode;
    }

    public void setFtypecode(String ftypecode) {
        this.ftypecode = ftypecode;
    }

    @Basic
    @Column(name = "FPARENTNAME")
    public String getFparentname() {
        return fparentname;
    }

    public void setFparentname(String fparentname) {
        this.fparentname = fparentname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BType bType = (BType) o;

        if (fid != null ? !fid.equals(bType.fid) : bType.fid != null) return false;
        if (findex != null ? !findex.equals(bType.findex) : bType.findex != null) return false;
        if (fname != null ? !fname.equals(bType.fname) : bType.fname != null) return false;
        if (fparent != null ? !fparent.equals(bType.fparent) : bType.fparent != null) return false;
        if (ftypecode != null ? !ftypecode.equals(bType.ftypecode) : bType.ftypecode != null) return false;
        if (fparentname != null ? !fparentname.equals(bType.fparentname) : bType.fparentname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (findex != null ? findex.hashCode() : 0);
        result = 31 * result + (fname != null ? fname.hashCode() : 0);
        result = 31 * result + (fparent != null ? fparent.hashCode() : 0);
        result = 31 * result + (ftypecode != null ? ftypecode.hashCode() : 0);
        result = 31 * result + (fparentname != null ? fparentname.hashCode() : 0);
        return result;
    }
}
