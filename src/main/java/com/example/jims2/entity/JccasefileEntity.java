package com.example.jims2.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "JCCASEFILE", schema = "JIMS2", catalog = "JIMS2")
public class JccasefileEntity {
    private int casefileId;
    private Date activationdate;
    private String juvenileId;
    private String casestatuscd;
    private String sprvsiontypecd;
    private int officerId;
    private int juvseqnum;
    private Short ismaysineeded;
    private Short isriskrefrneeded;
    private Short isriskintvneeded;
    private Short isrisktestneeded;
    private Short isriskcommneeded;
    private Short isriskresineeded;
    private Short isriskprogneeded;
    private Short isbenasmntneeded;
    private Date suprvsionenddate;
    private Integer caseplanId;
    private String cntrollingreferral;
    private Date crtordprobstartdat;
    private Short isriskresprogneeded;
    private String rectype;
    private String referraldatesstatus;
    private String createuser;
    private Date createdate;
    private String updateuser;
    private Date updatedate;
    private String createjims2User;
    private String updatejims2User;

    @Basic
    @Id
    @Column(name = "CASEFILE_ID")
    public int getCasefileId() {
        return casefileId;
    }

    public void setCasefileId(int casefileId) {
        this.casefileId = casefileId;
    }

    @Basic
    @Column(name = "ACTIVATIONDATE")
    public Date getActivationdate() {
        return activationdate;
    }

    public void setActivationdate(Date activationdate) {
        this.activationdate = activationdate;
    }

    @Basic
    @Column(name = "JUVENILE_ID")
    public String getJuvenileId() {
        return juvenileId;
    }

    public void setJuvenileId(String juvenileId) {
        this.juvenileId = juvenileId;
    }

    @Basic
    @Column(name = "CASESTATUSCD")
    public String getCasestatuscd() {
        return casestatuscd;
    }

    public void setCasestatuscd(String casestatuscd) {
        this.casestatuscd = casestatuscd;
    }

    @Basic
    @Column(name = "SPRVSIONTYPECD")
    public String getSprvsiontypecd() {
        return sprvsiontypecd;
    }

    public void setSprvsiontypecd(String sprvsiontypecd) {
        this.sprvsiontypecd = sprvsiontypecd;
    }

    @Basic
    @Column(name = "OFFICER_ID")
    public int getOfficerId() {
        return officerId;
    }

    public void setOfficerId(int officerId) {
        this.officerId = officerId;
    }

    @Basic
    @Column(name = "JUVSEQNUM")
    public int getJuvseqnum() {
        return juvseqnum;
    }

    public void setJuvseqnum(int juvseqnum) {
        this.juvseqnum = juvseqnum;
    }

    @Basic
    @Column(name = "ISMAYSINEEDED")
    public Short getIsmaysineeded() {
        return ismaysineeded;
    }

    public void setIsmaysineeded(Short ismaysineeded) {
        this.ismaysineeded = ismaysineeded;
    }

    @Basic
    @Column(name = "ISRISKREFRNEEDED")
    public Short getIsriskrefrneeded() {
        return isriskrefrneeded;
    }

    public void setIsriskrefrneeded(Short isriskrefrneeded) {
        this.isriskrefrneeded = isriskrefrneeded;
    }

    @Basic
    @Column(name = "ISRISKINTVNEEDED")
    public Short getIsriskintvneeded() {
        return isriskintvneeded;
    }

    public void setIsriskintvneeded(Short isriskintvneeded) {
        this.isriskintvneeded = isriskintvneeded;
    }

    @Basic
    @Column(name = "ISRISKTESTNEEDED")
    public Short getIsrisktestneeded() {
        return isrisktestneeded;
    }

    public void setIsrisktestneeded(Short isrisktestneeded) {
        this.isrisktestneeded = isrisktestneeded;
    }

    @Basic
    @Column(name = "ISRISKCOMMNEEDED")
    public Short getIsriskcommneeded() {
        return isriskcommneeded;
    }

    public void setIsriskcommneeded(Short isriskcommneeded) {
        this.isriskcommneeded = isriskcommneeded;
    }

    @Basic
    @Column(name = "ISRISKRESINEEDED")
    public Short getIsriskresineeded() {
        return isriskresineeded;
    }

    public void setIsriskresineeded(Short isriskresineeded) {
        this.isriskresineeded = isriskresineeded;
    }

    @Basic
    @Column(name = "ISRISKPROGNEEDED")
    public Short getIsriskprogneeded() {
        return isriskprogneeded;
    }

    public void setIsriskprogneeded(Short isriskprogneeded) {
        this.isriskprogneeded = isriskprogneeded;
    }

    @Basic
    @Column(name = "ISBENASMNTNEEDED")
    public Short getIsbenasmntneeded() {
        return isbenasmntneeded;
    }

    public void setIsbenasmntneeded(Short isbenasmntneeded) {
        this.isbenasmntneeded = isbenasmntneeded;
    }

    @Basic
    @Column(name = "SUPRVSIONENDDATE")
    public Date getSuprvsionenddate() {
        return suprvsionenddate;
    }

    public void setSuprvsionenddate(Date suprvsionenddate) {
        this.suprvsionenddate = suprvsionenddate;
    }

    @Basic
    @Column(name = "CASEPLAN_ID")
    public Integer getCaseplanId() {
        return caseplanId;
    }

    public void setCaseplanId(Integer caseplanId) {
        this.caseplanId = caseplanId;
    }

    @Basic
    @Column(name = "CNTROLLINGREFERRAL")
    public String getCntrollingreferral() {
        return cntrollingreferral;
    }

    public void setCntrollingreferral(String cntrollingreferral) {
        this.cntrollingreferral = cntrollingreferral;
    }

    @Basic
    @Column(name = "CRTORDPROBSTARTDAT")
    public Date getCrtordprobstartdat() {
        return crtordprobstartdat;
    }

    public void setCrtordprobstartdat(Date crtordprobstartdat) {
        this.crtordprobstartdat = crtordprobstartdat;
    }

    @Basic
    @Column(name = "ISRISKRESPROGNEEDED")
    public Short getIsriskresprogneeded() {
        return isriskresprogneeded;
    }

    public void setIsriskresprogneeded(Short isriskresprogneeded) {
        this.isriskresprogneeded = isriskresprogneeded;
    }

    @Basic
    @Column(name = "RECTYPE")
    public String getRectype() {
        return rectype;
    }

    public void setRectype(String rectype) {
        this.rectype = rectype;
    }

    @Basic
    @Column(name = "REFERRALDATESSTATUS")
    public String getReferraldatesstatus() {
        return referraldatesstatus;
    }

    public void setReferraldatesstatus(String referraldatesstatus) {
        this.referraldatesstatus = referraldatesstatus;
    }

    @Basic
    @Column(name = "CREATEUSER")
    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    @Basic
    @Column(name = "CREATEDATE")
    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Basic
    @Column(name = "UPDATEUSER")
    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

    @Basic
    @Column(name = "UPDATEDATE")
    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    @Basic
    @Column(name = "CREATEJIMS2USER")
    public String getCreatejims2User() {
        return createjims2User;
    }

    public void setCreatejims2User(String createjims2User) {
        this.createjims2User = createjims2User;
    }

    @Basic
    @Column(name = "UPDATEJIMS2USER")
    public String getUpdatejims2User() {
        return updatejims2User;
    }

    public void setUpdatejims2User(String updatejims2User) {
        this.updatejims2User = updatejims2User;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JccasefileEntity that = (JccasefileEntity) o;

        if (casefileId != that.casefileId) return false;
        if (officerId != that.officerId) return false;
        if (juvseqnum != that.juvseqnum) return false;
        if (activationdate != null ? !activationdate.equals(that.activationdate) : that.activationdate != null)
            return false;
        if (juvenileId != null ? !juvenileId.equals(that.juvenileId) : that.juvenileId != null) return false;
        if (casestatuscd != null ? !casestatuscd.equals(that.casestatuscd) : that.casestatuscd != null) return false;
        if (sprvsiontypecd != null ? !sprvsiontypecd.equals(that.sprvsiontypecd) : that.sprvsiontypecd != null)
            return false;
        if (ismaysineeded != null ? !ismaysineeded.equals(that.ismaysineeded) : that.ismaysineeded != null)
            return false;
        if (isriskrefrneeded != null ? !isriskrefrneeded.equals(that.isriskrefrneeded) : that.isriskrefrneeded != null)
            return false;
        if (isriskintvneeded != null ? !isriskintvneeded.equals(that.isriskintvneeded) : that.isriskintvneeded != null)
            return false;
        if (isrisktestneeded != null ? !isrisktestneeded.equals(that.isrisktestneeded) : that.isrisktestneeded != null)
            return false;
        if (isriskcommneeded != null ? !isriskcommneeded.equals(that.isriskcommneeded) : that.isriskcommneeded != null)
            return false;
        if (isriskresineeded != null ? !isriskresineeded.equals(that.isriskresineeded) : that.isriskresineeded != null)
            return false;
        if (isriskprogneeded != null ? !isriskprogneeded.equals(that.isriskprogneeded) : that.isriskprogneeded != null)
            return false;
        if (isbenasmntneeded != null ? !isbenasmntneeded.equals(that.isbenasmntneeded) : that.isbenasmntneeded != null)
            return false;
        if (suprvsionenddate != null ? !suprvsionenddate.equals(that.suprvsionenddate) : that.suprvsionenddate != null)
            return false;
        if (caseplanId != null ? !caseplanId.equals(that.caseplanId) : that.caseplanId != null) return false;
        if (cntrollingreferral != null ? !cntrollingreferral.equals(that.cntrollingreferral) : that.cntrollingreferral != null)
            return false;
        if (crtordprobstartdat != null ? !crtordprobstartdat.equals(that.crtordprobstartdat) : that.crtordprobstartdat != null)
            return false;
        if (isriskresprogneeded != null ? !isriskresprogneeded.equals(that.isriskresprogneeded) : that.isriskresprogneeded != null)
            return false;
        if (rectype != null ? !rectype.equals(that.rectype) : that.rectype != null) return false;
        if (referraldatesstatus != null ? !referraldatesstatus.equals(that.referraldatesstatus) : that.referraldatesstatus != null)
            return false;
        if (createuser != null ? !createuser.equals(that.createuser) : that.createuser != null) return false;
        if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
        if (updateuser != null ? !updateuser.equals(that.updateuser) : that.updateuser != null) return false;
        if (updatedate != null ? !updatedate.equals(that.updatedate) : that.updatedate != null) return false;
        if (createjims2User != null ? !createjims2User.equals(that.createjims2User) : that.createjims2User != null)
            return false;
        if (updatejims2User != null ? !updatejims2User.equals(that.updatejims2User) : that.updatejims2User != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = casefileId;
        result = 31 * result + (activationdate != null ? activationdate.hashCode() : 0);
        result = 31 * result + (juvenileId != null ? juvenileId.hashCode() : 0);
        result = 31 * result + (casestatuscd != null ? casestatuscd.hashCode() : 0);
        result = 31 * result + (sprvsiontypecd != null ? sprvsiontypecd.hashCode() : 0);
        result = 31 * result + officerId;
        result = 31 * result + juvseqnum;
        result = 31 * result + (ismaysineeded != null ? ismaysineeded.hashCode() : 0);
        result = 31 * result + (isriskrefrneeded != null ? isriskrefrneeded.hashCode() : 0);
        result = 31 * result + (isriskintvneeded != null ? isriskintvneeded.hashCode() : 0);
        result = 31 * result + (isrisktestneeded != null ? isrisktestneeded.hashCode() : 0);
        result = 31 * result + (isriskcommneeded != null ? isriskcommneeded.hashCode() : 0);
        result = 31 * result + (isriskresineeded != null ? isriskresineeded.hashCode() : 0);
        result = 31 * result + (isriskprogneeded != null ? isriskprogneeded.hashCode() : 0);
        result = 31 * result + (isbenasmntneeded != null ? isbenasmntneeded.hashCode() : 0);
        result = 31 * result + (suprvsionenddate != null ? suprvsionenddate.hashCode() : 0);
        result = 31 * result + (caseplanId != null ? caseplanId.hashCode() : 0);
        result = 31 * result + (cntrollingreferral != null ? cntrollingreferral.hashCode() : 0);
        result = 31 * result + (crtordprobstartdat != null ? crtordprobstartdat.hashCode() : 0);
        result = 31 * result + (isriskresprogneeded != null ? isriskresprogneeded.hashCode() : 0);
        result = 31 * result + (rectype != null ? rectype.hashCode() : 0);
        result = 31 * result + (referraldatesstatus != null ? referraldatesstatus.hashCode() : 0);
        result = 31 * result + (createuser != null ? createuser.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (updateuser != null ? updateuser.hashCode() : 0);
        result = 31 * result + (updatedate != null ? updatedate.hashCode() : 0);
        result = 31 * result + (createjims2User != null ? createjims2User.hashCode() : 0);
        result = 31 * result + (updatejims2User != null ? updatejims2User.hashCode() : 0);
        return result;
    }
}
