package cn.sccin.spboot.domain;

import javax.persistence.*;

/**
 * Created by developer_hyaci on 2015/11/5.
 */
@Entity
@Table(name = "br_case_designer", schema = "", catalog = "spboot")
public class BrCaseDesigner {
    private String fid;
    private String fdesignid;
    private String fcaseid;

    @Id
    @Column(name = "FID")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "FDESIGNID")
    public String getFdesignid() {
        return fdesignid;
    }

    public void setFdesignid(String fdesignid) {
        this.fdesignid = fdesignid;
    }

    @Basic
    @Column(name = "FCASEID")
    public String getFcaseid() {
        return fcaseid;
    }

    public void setFcaseid(String fcaseid) {
        this.fcaseid = fcaseid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrCaseDesigner that = (BrCaseDesigner) o;

        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (fdesignid != null ? !fdesignid.equals(that.fdesignid) : that.fdesignid != null) return false;
        if (fcaseid != null ? !fcaseid.equals(that.fcaseid) : that.fcaseid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (fdesignid != null ? fdesignid.hashCode() : 0);
        result = 31 * result + (fcaseid != null ? fcaseid.hashCode() : 0);
        return result;
    }
}
