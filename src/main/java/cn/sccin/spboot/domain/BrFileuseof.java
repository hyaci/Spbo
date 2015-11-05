package cn.sccin.spboot.domain;

import javax.persistence.*;

/**
 * Created by developer_hyaci on 2015/11/5.
 */
@Entity
@Table(name = "br_fileuseof", schema = "", catalog = "spboot")
public class BrFileuseof {
    private String fid;
    private String fileid;
    private Integer fusetype;
    private Integer findex;
    private String fdescribe;
    private String fisvalid;
    private String furlpath;
    private String fbid;

    @Id
    @Column(name = "FID")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "FILEID")
    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    @Basic
    @Column(name = "FUSETYPE")
    public Integer getFusetype() {
        return fusetype;
    }

    public void setFusetype(Integer fusetype) {
        this.fusetype = fusetype;
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
    @Column(name = "FDESCRIBE")
    public String getFdescribe() {
        return fdescribe;
    }

    public void setFdescribe(String fdescribe) {
        this.fdescribe = fdescribe;
    }

    @Basic
    @Column(name = "FISVALID")
    public String getFisvalid() {
        return fisvalid;
    }

    public void setFisvalid(String fisvalid) {
        this.fisvalid = fisvalid;
    }

    @Basic
    @Column(name = "FURLPATH")
    public String getFurlpath() {
        return furlpath;
    }

    public void setFurlpath(String furlpath) {
        this.furlpath = furlpath;
    }

    @Basic
    @Column(name = "FBID")
    public String getFbid() {
        return fbid;
    }

    public void setFbid(String fbid) {
        this.fbid = fbid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrFileuseof that = (BrFileuseof) o;

        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (fileid != null ? !fileid.equals(that.fileid) : that.fileid != null) return false;
        if (fusetype != null ? !fusetype.equals(that.fusetype) : that.fusetype != null) return false;
        if (findex != null ? !findex.equals(that.findex) : that.findex != null) return false;
        if (fdescribe != null ? !fdescribe.equals(that.fdescribe) : that.fdescribe != null) return false;
        if (fisvalid != null ? !fisvalid.equals(that.fisvalid) : that.fisvalid != null) return false;
        if (furlpath != null ? !furlpath.equals(that.furlpath) : that.furlpath != null) return false;
        if (fbid != null ? !fbid.equals(that.fbid) : that.fbid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (fileid != null ? fileid.hashCode() : 0);
        result = 31 * result + (fusetype != null ? fusetype.hashCode() : 0);
        result = 31 * result + (findex != null ? findex.hashCode() : 0);
        result = 31 * result + (fdescribe != null ? fdescribe.hashCode() : 0);
        result = 31 * result + (fisvalid != null ? fisvalid.hashCode() : 0);
        result = 31 * result + (furlpath != null ? furlpath.hashCode() : 0);
        result = 31 * result + (fbid != null ? fbid.hashCode() : 0);
        return result;
    }
}
