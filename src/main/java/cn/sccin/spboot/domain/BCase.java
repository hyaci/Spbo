package cn.sccin.spboot.domain;

import javax.persistence.*;

/**
 * Created by developer_hyaci on 2015/11/5.
 */
@Entity
@Table(name = "b_case", schema = "", catalog = "spboot")
public class BCase {
    private String fid;
    private String ftype;
    private String fname;
    private String ftypename;
    private String fcasedetail;
    private String fisthumbnail;
    private String fisdesignchart;
    private String fdescrible;
    private String fisdesigner;

    @Id
    @Column(name = "FID")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
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
    @Column(name = "FNAME")
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Basic
    @Column(name = "FTYPENAME")
    public String getFtypename() {
        return ftypename;
    }

    public void setFtypename(String ftypename) {
        this.ftypename = ftypename;
    }

    @Basic
    @Column(name = "FCASEDETAIL")
    public String getFcasedetail() {
        return fcasedetail;
    }

    public void setFcasedetail(String fcasedetail) {
        this.fcasedetail = fcasedetail;
    }

    @Basic
    @Column(name = "FISTHUMBNAIL")
    public String getFisthumbnail() {
        return fisthumbnail;
    }

    public void setFisthumbnail(String fisthumbnail) {
        this.fisthumbnail = fisthumbnail;
    }

    @Basic
    @Column(name = "FISDESIGNCHART")
    public String getFisdesignchart() {
        return fisdesignchart;
    }

    public void setFisdesignchart(String fisdesignchart) {
        this.fisdesignchart = fisdesignchart;
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
    @Column(name = "FISDESIGNER")
    public String getFisdesigner() {
        return fisdesigner;
    }

    public void setFisdesigner(String fisdesigner) {
        this.fisdesigner = fisdesigner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BCase bCase = (BCase) o;

        if (fid != null ? !fid.equals(bCase.fid) : bCase.fid != null) return false;
        if (ftype != null ? !ftype.equals(bCase.ftype) : bCase.ftype != null) return false;
        if (fname != null ? !fname.equals(bCase.fname) : bCase.fname != null) return false;
        if (ftypename != null ? !ftypename.equals(bCase.ftypename) : bCase.ftypename != null) return false;
        if (fcasedetail != null ? !fcasedetail.equals(bCase.fcasedetail) : bCase.fcasedetail != null) return false;
        if (fisthumbnail != null ? !fisthumbnail.equals(bCase.fisthumbnail) : bCase.fisthumbnail != null) return false;
        if (fisdesignchart != null ? !fisdesignchart.equals(bCase.fisdesignchart) : bCase.fisdesignchart != null)
            return false;
        if (fdescrible != null ? !fdescrible.equals(bCase.fdescrible) : bCase.fdescrible != null) return false;
        if (fisdesigner != null ? !fisdesigner.equals(bCase.fisdesigner) : bCase.fisdesigner != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (ftype != null ? ftype.hashCode() : 0);
        result = 31 * result + (fname != null ? fname.hashCode() : 0);
        result = 31 * result + (ftypename != null ? ftypename.hashCode() : 0);
        result = 31 * result + (fcasedetail != null ? fcasedetail.hashCode() : 0);
        result = 31 * result + (fisthumbnail != null ? fisthumbnail.hashCode() : 0);
        result = 31 * result + (fisdesignchart != null ? fisdesignchart.hashCode() : 0);
        result = 31 * result + (fdescrible != null ? fdescrible.hashCode() : 0);
        result = 31 * result + (fisdesigner != null ? fisdesigner.hashCode() : 0);
        return result;
    }
}
