package cn.sccin.spboot.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by developer_hyaci on 2015/11/5.
 */
@Entity
@Table(name = "b_commodity", schema = "", catalog = "spboot")
public class BCommodity {
    private String fid;
    private Integer fbtype;
    private String ftype;
    private String ftypename;
    private String fname;
    private BigDecimal fprice;
    private BigDecimal fmarketprice;
    private String funit;
    private String fdescrible;
    private String fproperty;
    private String fchoose;
    private String fpricerule;
    private String fisthumbnail;
    private String fisdetail;
    private String fseachkey;

    @Id
    @Column(name = "FID")
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "FBTYPE")
    public Integer getFbtype() {
        return fbtype;
    }

    public void setFbtype(Integer fbtype) {
        this.fbtype = fbtype;
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
    @Column(name = "FTYPENAME")
    public String getFtypename() {
        return ftypename;
    }

    public void setFtypename(String ftypename) {
        this.ftypename = ftypename;
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
    @Column(name = "FPRICE")
    public BigDecimal getFprice() {
        return fprice;
    }

    public void setFprice(BigDecimal fprice) {
        this.fprice = fprice;
    }

    @Basic
    @Column(name = "FMARKETPRICE")
    public BigDecimal getFmarketprice() {
        return fmarketprice;
    }

    public void setFmarketprice(BigDecimal fmarketprice) {
        this.fmarketprice = fmarketprice;
    }

    @Basic
    @Column(name = "FUNIT")
    public String getFunit() {
        return funit;
    }

    public void setFunit(String funit) {
        this.funit = funit;
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
    @Column(name = "FPROPERTY")
    public String getFproperty() {
        return fproperty;
    }

    public void setFproperty(String fproperty) {
        this.fproperty = fproperty;
    }

    @Basic
    @Column(name = "FCHOOSE")
    public String getFchoose() {
        return fchoose;
    }

    public void setFchoose(String fchoose) {
        this.fchoose = fchoose;
    }

    @Basic
    @Column(name = "FPRICERULE")
    public String getFpricerule() {
        return fpricerule;
    }

    public void setFpricerule(String fpricerule) {
        this.fpricerule = fpricerule;
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
    @Column(name = "FISDETAIL")
    public String getFisdetail() {
        return fisdetail;
    }

    public void setFisdetail(String fisdetail) {
        this.fisdetail = fisdetail;
    }

    @Basic
    @Column(name = "FSEACHKEY")
    public String getFseachkey() {
        return fseachkey;
    }

    public void setFseachkey(String fseachkey) {
        this.fseachkey = fseachkey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BCommodity that = (BCommodity) o;

        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (fbtype != null ? !fbtype.equals(that.fbtype) : that.fbtype != null) return false;
        if (ftype != null ? !ftype.equals(that.ftype) : that.ftype != null) return false;
        if (ftypename != null ? !ftypename.equals(that.ftypename) : that.ftypename != null) return false;
        if (fname != null ? !fname.equals(that.fname) : that.fname != null) return false;
        if (fprice != null ? !fprice.equals(that.fprice) : that.fprice != null) return false;
        if (fmarketprice != null ? !fmarketprice.equals(that.fmarketprice) : that.fmarketprice != null) return false;
        if (funit != null ? !funit.equals(that.funit) : that.funit != null) return false;
        if (fdescrible != null ? !fdescrible.equals(that.fdescrible) : that.fdescrible != null) return false;
        if (fproperty != null ? !fproperty.equals(that.fproperty) : that.fproperty != null) return false;
        if (fchoose != null ? !fchoose.equals(that.fchoose) : that.fchoose != null) return false;
        if (fpricerule != null ? !fpricerule.equals(that.fpricerule) : that.fpricerule != null) return false;
        if (fisthumbnail != null ? !fisthumbnail.equals(that.fisthumbnail) : that.fisthumbnail != null) return false;
        if (fisdetail != null ? !fisdetail.equals(that.fisdetail) : that.fisdetail != null) return false;
        if (fseachkey != null ? !fseachkey.equals(that.fseachkey) : that.fseachkey != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (fbtype != null ? fbtype.hashCode() : 0);
        result = 31 * result + (ftype != null ? ftype.hashCode() : 0);
        result = 31 * result + (ftypename != null ? ftypename.hashCode() : 0);
        result = 31 * result + (fname != null ? fname.hashCode() : 0);
        result = 31 * result + (fprice != null ? fprice.hashCode() : 0);
        result = 31 * result + (fmarketprice != null ? fmarketprice.hashCode() : 0);
        result = 31 * result + (funit != null ? funit.hashCode() : 0);
        result = 31 * result + (fdescrible != null ? fdescrible.hashCode() : 0);
        result = 31 * result + (fproperty != null ? fproperty.hashCode() : 0);
        result = 31 * result + (fchoose != null ? fchoose.hashCode() : 0);
        result = 31 * result + (fpricerule != null ? fpricerule.hashCode() : 0);
        result = 31 * result + (fisthumbnail != null ? fisthumbnail.hashCode() : 0);
        result = 31 * result + (fisdetail != null ? fisdetail.hashCode() : 0);
        result = 31 * result + (fseachkey != null ? fseachkey.hashCode() : 0);
        return result;
    }
}
