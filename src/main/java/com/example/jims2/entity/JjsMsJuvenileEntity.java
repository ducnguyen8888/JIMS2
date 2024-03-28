package com.example.jims2.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "JJS_MS_JUVENILE", schema = "JIMS2", catalog = "JIMS2")
public class JjsMsJuvenileEntity {
    private int jjsMsJuvenileId;
    private Date actiondate;
    private String actionoperator;
    private Integer addressId;
    private Integer age;
    private String agency;
    private String attentionflag;
    private Date birthdate;
    private String casenotepart1;
    private String casenotepart2;
    private Date checkedoutdate;
    private String checkedoutto;
    private String custodystatus;
    private String detentionaddind;
    private String detentionfacility;
    private String detentionstatus;
    private String dobverification;
    private String familynum;
    private Integer gangid;
    private String gangind;
    private String jims2Extractind;
    private String jims2Lcuser;
    private String juvenileaddress;
    private String juvenilecounty;
    private String juvenilefname;
    private String juvenilekeymap;
    private String juvenilelname;
    private String juvenilemname;
    private Integer juvenilenum;
    private String juvenilessn;
    private String juveniletitle;
    private String juvenilezip;
    private String lastactionby;
    private String lastreferralnum;
    private Date lcdate;
    private Object lctime;
    private String lcuser;
    private String offenseseverity;
    private String offensetotal;
    private String oldstatus;
    private String propointjpoid;
    private String propointlevel;
    private String propointunit;
    private String provisionseverity;
    private String provisiontotal;
    private String purgeboxnum;
    private Date purgedate;
    private String purgeexecuteddate;
    private String purgeflag;
    private String purgesernum;
    private String race;
    private String rectype;
    private String referralcount;
    private String referralhistory;
    private Integer referralnum;
    private String referralofficer;
    private String referraltotal;
    private String sex;
    private String ssnrelation1;
    private String ssnrelation2;
    private String ssn1;
    private String ssn2;
    private String status;
    private Integer tjpcseqnum;
    private String originalrace;
    private String sealcomments;
    private Date sealeddate;
    private String purgecomments;
    private String preffirstname;
    private String causeOfDeath;
    private String deathVerification;
    private Date dateOfDeath;
    private Integer ageAtDeath;
    private String createuser;
    private Date createdate;
    private String updateuser;
    private Date updatedate;
    private String createjims2User;
    private String updatejims2User;

    @Basic
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "JJS_MS_JUVENILE_ID")
    public int getJjsMsJuvenileId() {
        return jjsMsJuvenileId;
    }

    public void setJjsMsJuvenileId(int jjsMsJuvenileId) {
        this.jjsMsJuvenileId = jjsMsJuvenileId;
    }

    @Basic
    @Column(name = "ACTIONDATE")
    public Date getActiondate() {
        return actiondate;
    }

    public void setActiondate(Date actiondate) {
        this.actiondate = actiondate;
    }

    @Basic
    @Column(name = "ACTIONOPERATOR")
    public String getActionoperator() {
        return actionoperator;
    }

    public void setActionoperator(String actionoperator) {
        this.actionoperator = actionoperator;
    }

    @Basic
    @Column(name = "ADDRESS_ID")
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "AGE")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "AGENCY")
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Basic
    @Column(name = "ATTENTIONFLAG")
    public String getAttentionflag() {
        return attentionflag;
    }

    public void setAttentionflag(String attentionflag) {
        this.attentionflag = attentionflag;
    }

    @Basic
    @Column(name = "BIRTHDATE")
    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Basic
    @Column(name = "CASENOTEPART1")
    public String getCasenotepart1() {
        return casenotepart1;
    }

    public void setCasenotepart1(String casenotepart1) {
        this.casenotepart1 = casenotepart1;
    }

    @Basic
    @Column(name = "CASENOTEPART2")
    public String getCasenotepart2() {
        return casenotepart2;
    }

    public void setCasenotepart2(String casenotepart2) {
        this.casenotepart2 = casenotepart2;
    }

    @Basic
    @Column(name = "CHECKEDOUTDATE")
    public Date getCheckedoutdate() {
        return checkedoutdate;
    }

    public void setCheckedoutdate(Date checkedoutdate) {
        this.checkedoutdate = checkedoutdate;
    }

    @Basic
    @Column(name = "CHECKEDOUTTO")
    public String getCheckedoutto() {
        return checkedoutto;
    }

    public void setCheckedoutto(String checkedoutto) {
        this.checkedoutto = checkedoutto;
    }

    @Basic
    @Column(name = "CUSTODYSTATUS")
    public String getCustodystatus() {
        return custodystatus;
    }

    public void setCustodystatus(String custodystatus) {
        this.custodystatus = custodystatus;
    }

    @Basic
    @Column(name = "DETENTIONADDIND")
    public String getDetentionaddind() {
        return detentionaddind;
    }

    public void setDetentionaddind(String detentionaddind) {
        this.detentionaddind = detentionaddind;
    }

    @Basic
    @Column(name = "DETENTIONFACILITY")
    public String getDetentionfacility() {
        return detentionfacility;
    }

    public void setDetentionfacility(String detentionfacility) {
        this.detentionfacility = detentionfacility;
    }

    @Basic
    @Column(name = "DETENTIONSTATUS")
    public String getDetentionstatus() {
        return detentionstatus;
    }

    public void setDetentionstatus(String detentionstatus) {
        this.detentionstatus = detentionstatus;
    }

    @Basic
    @Column(name = "DOBVERIFICATION")
    public String getDobverification() {
        return dobverification;
    }

    public void setDobverification(String dobverification) {
        this.dobverification = dobverification;
    }

    @Basic
    @Column(name = "FAMILYNUM")
    public String getFamilynum() {
        return familynum;
    }

    public void setFamilynum(String familynum) {
        this.familynum = familynum;
    }

    @Basic
    @Column(name = "GANGID")
    public Integer getGangid() {
        return gangid;
    }

    public void setGangid(Integer gangid) {
        this.gangid = gangid;
    }

    @Basic
    @Column(name = "GANGIND")
    public String getGangind() {
        return gangind;
    }

    public void setGangind(String gangind) {
        this.gangind = gangind;
    }

    @Basic
    @Column(name = "JIMS2EXTRACTIND")
    public String getJims2Extractind() {
        return jims2Extractind;
    }

    public void setJims2Extractind(String jims2Extractind) {
        this.jims2Extractind = jims2Extractind;
    }

    @Basic
    @Column(name = "JIMS2LCUSER")
    public String getJims2Lcuser() {
        return jims2Lcuser;
    }

    public void setJims2Lcuser(String jims2Lcuser) {
        this.jims2Lcuser = jims2Lcuser;
    }

    @Basic
    @Column(name = "JUVENILEADDRESS")
    public String getJuvenileaddress() {
        return juvenileaddress;
    }

    public void setJuvenileaddress(String juvenileaddress) {
        this.juvenileaddress = juvenileaddress;
    }

    @Basic
    @Column(name = "JUVENILECOUNTY")
    public String getJuvenilecounty() {
        return juvenilecounty;
    }

    public void setJuvenilecounty(String juvenilecounty) {
        this.juvenilecounty = juvenilecounty;
    }

    @Basic
    @Column(name = "JUVENILEFNAME")
    public String getJuvenilefname() {
        return juvenilefname;
    }

    public void setJuvenilefname(String juvenilefname) {
        this.juvenilefname = juvenilefname;
    }

    @Basic
    @Column(name = "JUVENILEKEYMAP")
    public String getJuvenilekeymap() {
        return juvenilekeymap;
    }

    public void setJuvenilekeymap(String juvenilekeymap) {
        this.juvenilekeymap = juvenilekeymap;
    }

    @Basic
    @Column(name = "JUVENILELNAME")
    public String getJuvenilelname() {
        return juvenilelname;
    }

    public void setJuvenilelname(String juvenilelname) {
        this.juvenilelname = juvenilelname;
    }

    @Basic
    @Column(name = "JUVENILEMNAME")
    public String getJuvenilemname() {
        return juvenilemname;
    }

    public void setJuvenilemname(String juvenilemname) {
        this.juvenilemname = juvenilemname;
    }

    @Basic
    @Column(name = "JUVENILENUM")
    public Integer getJuvenilenum() {
        return juvenilenum;
    }

    public void setJuvenilenum(Integer juvenilenum) {
        this.juvenilenum = juvenilenum;
    }

    @Basic
    @Column(name = "JUVENILESSN")
    public String getJuvenilessn() {
        return juvenilessn;
    }

    public void setJuvenilessn(String juvenilessn) {
        this.juvenilessn = juvenilessn;
    }

    @Basic
    @Column(name = "JUVENILETITLE")
    public String getJuveniletitle() {
        return juveniletitle;
    }

    public void setJuveniletitle(String juveniletitle) {
        this.juveniletitle = juveniletitle;
    }

    @Basic
    @Column(name = "JUVENILEZIP")
    public String getJuvenilezip() {
        return juvenilezip;
    }

    public void setJuvenilezip(String juvenilezip) {
        this.juvenilezip = juvenilezip;
    }

    @Basic
    @Column(name = "LASTACTIONBY")
    public String getLastactionby() {
        return lastactionby;
    }

    public void setLastactionby(String lastactionby) {
        this.lastactionby = lastactionby;
    }

    @Basic
    @Column(name = "LASTREFERRALNUM")
    public String getLastreferralnum() {
        return lastreferralnum;
    }

    public void setLastreferralnum(String lastreferralnum) {
        this.lastreferralnum = lastreferralnum;
    }

    @Basic
    @Column(name = "LCDATE")
    public Date getLcdate() {
        return lcdate;
    }

    public void setLcdate(Date lcdate) {
        this.lcdate = lcdate;
    }

    @Basic
    @Column(name = "LCTIME")
    public Object getLctime() {
        return lctime;
    }

    public void setLctime(Object lctime) {
        this.lctime = lctime;
    }

    @Basic
    @Column(name = "LCUSER")
    public String getLcuser() {
        return lcuser;
    }

    public void setLcuser(String lcuser) {
        this.lcuser = lcuser;
    }

    @Basic
    @Column(name = "OFFENSESEVERITY")
    public String getOffenseseverity() {
        return offenseseverity;
    }

    public void setOffenseseverity(String offenseseverity) {
        this.offenseseverity = offenseseverity;
    }

    @Basic
    @Column(name = "OFFENSETOTAL")
    public String getOffensetotal() {
        return offensetotal;
    }

    public void setOffensetotal(String offensetotal) {
        this.offensetotal = offensetotal;
    }

    @Basic
    @Column(name = "OLDSTATUS")
    public String getOldstatus() {
        return oldstatus;
    }

    public void setOldstatus(String oldstatus) {
        this.oldstatus = oldstatus;
    }

    @Basic
    @Column(name = "PROPOINTJPOID")
    public String getPropointjpoid() {
        return propointjpoid;
    }

    public void setPropointjpoid(String propointjpoid) {
        this.propointjpoid = propointjpoid;
    }

    @Basic
    @Column(name = "PROPOINTLEVEL")
    public String getPropointlevel() {
        return propointlevel;
    }

    public void setPropointlevel(String propointlevel) {
        this.propointlevel = propointlevel;
    }

    @Basic
    @Column(name = "PROPOINTUNIT")
    public String getPropointunit() {
        return propointunit;
    }

    public void setPropointunit(String propointunit) {
        this.propointunit = propointunit;
    }

    @Basic
    @Column(name = "PROVISIONSEVERITY")
    public String getProvisionseverity() {
        return provisionseverity;
    }

    public void setProvisionseverity(String provisionseverity) {
        this.provisionseverity = provisionseverity;
    }

    @Basic
    @Column(name = "PROVISIONTOTAL")
    public String getProvisiontotal() {
        return provisiontotal;
    }

    public void setProvisiontotal(String provisiontotal) {
        this.provisiontotal = provisiontotal;
    }

    @Basic
    @Column(name = "PURGEBOXNUM")
    public String getPurgeboxnum() {
        return purgeboxnum;
    }

    public void setPurgeboxnum(String purgeboxnum) {
        this.purgeboxnum = purgeboxnum;
    }

    @Basic
    @Column(name = "PURGEDATE")
    public Date getPurgedate() {
        return purgedate;
    }

    public void setPurgedate(Date purgedate) {
        this.purgedate = purgedate;
    }

    @Basic
    @Column(name = "PURGEEXECUTEDDATE")
    public String getPurgeexecuteddate() {
        return purgeexecuteddate;
    }

    public void setPurgeexecuteddate(String purgeexecuteddate) {
        this.purgeexecuteddate = purgeexecuteddate;
    }

    @Basic
    @Column(name = "PURGEFLAG")
    public String getPurgeflag() {
        return purgeflag;
    }

    public void setPurgeflag(String purgeflag) {
        this.purgeflag = purgeflag;
    }

    @Basic
    @Column(name = "PURGESERNUM")
    public String getPurgesernum() {
        return purgesernum;
    }

    public void setPurgesernum(String purgesernum) {
        this.purgesernum = purgesernum;
    }

    @Basic
    @Column(name = "RACE")
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
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
    @Column(name = "REFERRALCOUNT")
    public String getReferralcount() {
        return referralcount;
    }

    public void setReferralcount(String referralcount) {
        this.referralcount = referralcount;
    }

    @Basic
    @Column(name = "REFERRALHISTORY")
    public String getReferralhistory() {
        return referralhistory;
    }

    public void setReferralhistory(String referralhistory) {
        this.referralhistory = referralhistory;
    }

    @Basic
    @Column(name = "REFERRALNUM")
    public Integer getReferralnum() {
        return referralnum;
    }

    public void setReferralnum(Integer referralnum) {
        this.referralnum = referralnum;
    }

    @Basic
    @Column(name = "REFERRALOFFICER")
    public String getReferralofficer() {
        return referralofficer;
    }

    public void setReferralofficer(String referralofficer) {
        this.referralofficer = referralofficer;
    }

    @Basic
    @Column(name = "REFERRALTOTAL")
    public String getReferraltotal() {
        return referraltotal;
    }

    public void setReferraltotal(String referraltotal) {
        this.referraltotal = referraltotal;
    }

    @Basic
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "SSNRELATION1")
    public String getSsnrelation1() {
        return ssnrelation1;
    }

    public void setSsnrelation1(String ssnrelation1) {
        this.ssnrelation1 = ssnrelation1;
    }

    @Basic
    @Column(name = "SSNRELATION2")
    public String getSsnrelation2() {
        return ssnrelation2;
    }

    public void setSsnrelation2(String ssnrelation2) {
        this.ssnrelation2 = ssnrelation2;
    }

    @Basic
    @Column(name = "SSN1")
    public String getSsn1() {
        return ssn1;
    }

    public void setSsn1(String ssn1) {
        this.ssn1 = ssn1;
    }

    @Basic
    @Column(name = "SSN2")
    public String getSsn2() {
        return ssn2;
    }

    public void setSsn2(String ssn2) {
        this.ssn2 = ssn2;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "TJPCSEQNUM")
    public Integer getTjpcseqnum() {
        return tjpcseqnum;
    }

    public void setTjpcseqnum(Integer tjpcseqnum) {
        this.tjpcseqnum = tjpcseqnum;
    }

    @Basic
    @Column(name = "ORIGINALRACE")
    public String getOriginalrace() {
        return originalrace;
    }

    public void setOriginalrace(String originalrace) {
        this.originalrace = originalrace;
    }

    @Basic
    @Column(name = "SEALCOMMENTS")
    public String getSealcomments() {
        return sealcomments;
    }

    public void setSealcomments(String sealcomments) {
        this.sealcomments = sealcomments;
    }

    @Basic
    @Column(name = "SEALEDDATE")
    public Date getSealeddate() {
        return sealeddate;
    }

    public void setSealeddate(Date sealeddate) {
        this.sealeddate = sealeddate;
    }

    @Basic
    @Column(name = "PURGECOMMENTS")
    public String getPurgecomments() {
        return purgecomments;
    }

    public void setPurgecomments(String purgecomments) {
        this.purgecomments = purgecomments;
    }

    @Basic
    @Column(name = "PREFFIRSTNAME")
    public String getPreffirstname() {
        return preffirstname;
    }

    public void setPreffirstname(String preffirstname) {
        this.preffirstname = preffirstname;
    }

    @Basic
    @Column(name = "CAUSE_OF_DEATH")
    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    @Basic
    @Column(name = "DEATH_VERIFICATION")
    public String getDeathVerification() {
        return deathVerification;
    }

    public void setDeathVerification(String deathVerification) {
        this.deathVerification = deathVerification;
    }

    @Basic
    @Column(name = "DATE_OF_DEATH")
    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    @Basic
    @Column(name = "AGE_AT_DEATH")
    public Integer getAgeAtDeath() {
        return ageAtDeath;
    }

    public void setAgeAtDeath(Integer ageAtDeath) {
        this.ageAtDeath = ageAtDeath;
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

        JjsMsJuvenileEntity that = (JjsMsJuvenileEntity) o;

        if (jjsMsJuvenileId != that.jjsMsJuvenileId) return false;
        if (actiondate != null ? !actiondate.equals(that.actiondate) : that.actiondate != null) return false;
        if (actionoperator != null ? !actionoperator.equals(that.actionoperator) : that.actionoperator != null)
            return false;
        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (agency != null ? !agency.equals(that.agency) : that.agency != null) return false;
        if (attentionflag != null ? !attentionflag.equals(that.attentionflag) : that.attentionflag != null)
            return false;
        if (birthdate != null ? !birthdate.equals(that.birthdate) : that.birthdate != null) return false;
        if (casenotepart1 != null ? !casenotepart1.equals(that.casenotepart1) : that.casenotepart1 != null)
            return false;
        if (casenotepart2 != null ? !casenotepart2.equals(that.casenotepart2) : that.casenotepart2 != null)
            return false;
        if (checkedoutdate != null ? !checkedoutdate.equals(that.checkedoutdate) : that.checkedoutdate != null)
            return false;
        if (checkedoutto != null ? !checkedoutto.equals(that.checkedoutto) : that.checkedoutto != null) return false;
        if (custodystatus != null ? !custodystatus.equals(that.custodystatus) : that.custodystatus != null)
            return false;
        if (detentionaddind != null ? !detentionaddind.equals(that.detentionaddind) : that.detentionaddind != null)
            return false;
        if (detentionfacility != null ? !detentionfacility.equals(that.detentionfacility) : that.detentionfacility != null)
            return false;
        if (detentionstatus != null ? !detentionstatus.equals(that.detentionstatus) : that.detentionstatus != null)
            return false;
        if (dobverification != null ? !dobverification.equals(that.dobverification) : that.dobverification != null)
            return false;
        if (familynum != null ? !familynum.equals(that.familynum) : that.familynum != null) return false;
        if (gangid != null ? !gangid.equals(that.gangid) : that.gangid != null) return false;
        if (gangind != null ? !gangind.equals(that.gangind) : that.gangind != null) return false;
        if (jims2Extractind != null ? !jims2Extractind.equals(that.jims2Extractind) : that.jims2Extractind != null)
            return false;
        if (jims2Lcuser != null ? !jims2Lcuser.equals(that.jims2Lcuser) : that.jims2Lcuser != null) return false;
        if (juvenileaddress != null ? !juvenileaddress.equals(that.juvenileaddress) : that.juvenileaddress != null)
            return false;
        if (juvenilecounty != null ? !juvenilecounty.equals(that.juvenilecounty) : that.juvenilecounty != null)
            return false;
        if (juvenilefname != null ? !juvenilefname.equals(that.juvenilefname) : that.juvenilefname != null)
            return false;
        if (juvenilekeymap != null ? !juvenilekeymap.equals(that.juvenilekeymap) : that.juvenilekeymap != null)
            return false;
        if (juvenilelname != null ? !juvenilelname.equals(that.juvenilelname) : that.juvenilelname != null)
            return false;
        if (juvenilemname != null ? !juvenilemname.equals(that.juvenilemname) : that.juvenilemname != null)
            return false;
        if (juvenilenum != null ? !juvenilenum.equals(that.juvenilenum) : that.juvenilenum != null) return false;
        if (juvenilessn != null ? !juvenilessn.equals(that.juvenilessn) : that.juvenilessn != null) return false;
        if (juveniletitle != null ? !juveniletitle.equals(that.juveniletitle) : that.juveniletitle != null)
            return false;
        if (juvenilezip != null ? !juvenilezip.equals(that.juvenilezip) : that.juvenilezip != null) return false;
        if (lastactionby != null ? !lastactionby.equals(that.lastactionby) : that.lastactionby != null) return false;
        if (lastreferralnum != null ? !lastreferralnum.equals(that.lastreferralnum) : that.lastreferralnum != null)
            return false;
        if (lcdate != null ? !lcdate.equals(that.lcdate) : that.lcdate != null) return false;
        if (lctime != null ? !lctime.equals(that.lctime) : that.lctime != null) return false;
        if (lcuser != null ? !lcuser.equals(that.lcuser) : that.lcuser != null) return false;
        if (offenseseverity != null ? !offenseseverity.equals(that.offenseseverity) : that.offenseseverity != null)
            return false;
        if (offensetotal != null ? !offensetotal.equals(that.offensetotal) : that.offensetotal != null) return false;
        if (oldstatus != null ? !oldstatus.equals(that.oldstatus) : that.oldstatus != null) return false;
        if (propointjpoid != null ? !propointjpoid.equals(that.propointjpoid) : that.propointjpoid != null)
            return false;
        if (propointlevel != null ? !propointlevel.equals(that.propointlevel) : that.propointlevel != null)
            return false;
        if (propointunit != null ? !propointunit.equals(that.propointunit) : that.propointunit != null) return false;
        if (provisionseverity != null ? !provisionseverity.equals(that.provisionseverity) : that.provisionseverity != null)
            return false;
        if (provisiontotal != null ? !provisiontotal.equals(that.provisiontotal) : that.provisiontotal != null)
            return false;
        if (purgeboxnum != null ? !purgeboxnum.equals(that.purgeboxnum) : that.purgeboxnum != null) return false;
        if (purgedate != null ? !purgedate.equals(that.purgedate) : that.purgedate != null) return false;
        if (purgeexecuteddate != null ? !purgeexecuteddate.equals(that.purgeexecuteddate) : that.purgeexecuteddate != null)
            return false;
        if (purgeflag != null ? !purgeflag.equals(that.purgeflag) : that.purgeflag != null) return false;
        if (purgesernum != null ? !purgesernum.equals(that.purgesernum) : that.purgesernum != null) return false;
        if (race != null ? !race.equals(that.race) : that.race != null) return false;
        if (rectype != null ? !rectype.equals(that.rectype) : that.rectype != null) return false;
        if (referralcount != null ? !referralcount.equals(that.referralcount) : that.referralcount != null)
            return false;
        if (referralhistory != null ? !referralhistory.equals(that.referralhistory) : that.referralhistory != null)
            return false;
        if (referralnum != null ? !referralnum.equals(that.referralnum) : that.referralnum != null) return false;
        if (referralofficer != null ? !referralofficer.equals(that.referralofficer) : that.referralofficer != null)
            return false;
        if (referraltotal != null ? !referraltotal.equals(that.referraltotal) : that.referraltotal != null)
            return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (ssnrelation1 != null ? !ssnrelation1.equals(that.ssnrelation1) : that.ssnrelation1 != null) return false;
        if (ssnrelation2 != null ? !ssnrelation2.equals(that.ssnrelation2) : that.ssnrelation2 != null) return false;
        if (ssn1 != null ? !ssn1.equals(that.ssn1) : that.ssn1 != null) return false;
        if (ssn2 != null ? !ssn2.equals(that.ssn2) : that.ssn2 != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (tjpcseqnum != null ? !tjpcseqnum.equals(that.tjpcseqnum) : that.tjpcseqnum != null) return false;
        if (originalrace != null ? !originalrace.equals(that.originalrace) : that.originalrace != null) return false;
        if (sealcomments != null ? !sealcomments.equals(that.sealcomments) : that.sealcomments != null) return false;
        if (sealeddate != null ? !sealeddate.equals(that.sealeddate) : that.sealeddate != null) return false;
        if (purgecomments != null ? !purgecomments.equals(that.purgecomments) : that.purgecomments != null)
            return false;
        if (preffirstname != null ? !preffirstname.equals(that.preffirstname) : that.preffirstname != null)
            return false;
        if (causeOfDeath != null ? !causeOfDeath.equals(that.causeOfDeath) : that.causeOfDeath != null) return false;
        if (deathVerification != null ? !deathVerification.equals(that.deathVerification) : that.deathVerification != null)
            return false;
        if (dateOfDeath != null ? !dateOfDeath.equals(that.dateOfDeath) : that.dateOfDeath != null) return false;
        if (ageAtDeath != null ? !ageAtDeath.equals(that.ageAtDeath) : that.ageAtDeath != null) return false;
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
        int result = jjsMsJuvenileId;
        result = 31 * result + (actiondate != null ? actiondate.hashCode() : 0);
        result = 31 * result + (actionoperator != null ? actionoperator.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (agency != null ? agency.hashCode() : 0);
        result = 31 * result + (attentionflag != null ? attentionflag.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (casenotepart1 != null ? casenotepart1.hashCode() : 0);
        result = 31 * result + (casenotepart2 != null ? casenotepart2.hashCode() : 0);
        result = 31 * result + (checkedoutdate != null ? checkedoutdate.hashCode() : 0);
        result = 31 * result + (checkedoutto != null ? checkedoutto.hashCode() : 0);
        result = 31 * result + (custodystatus != null ? custodystatus.hashCode() : 0);
        result = 31 * result + (detentionaddind != null ? detentionaddind.hashCode() : 0);
        result = 31 * result + (detentionfacility != null ? detentionfacility.hashCode() : 0);
        result = 31 * result + (detentionstatus != null ? detentionstatus.hashCode() : 0);
        result = 31 * result + (dobverification != null ? dobverification.hashCode() : 0);
        result = 31 * result + (familynum != null ? familynum.hashCode() : 0);
        result = 31 * result + (gangid != null ? gangid.hashCode() : 0);
        result = 31 * result + (gangind != null ? gangind.hashCode() : 0);
        result = 31 * result + (jims2Extractind != null ? jims2Extractind.hashCode() : 0);
        result = 31 * result + (jims2Lcuser != null ? jims2Lcuser.hashCode() : 0);
        result = 31 * result + (juvenileaddress != null ? juvenileaddress.hashCode() : 0);
        result = 31 * result + (juvenilecounty != null ? juvenilecounty.hashCode() : 0);
        result = 31 * result + (juvenilefname != null ? juvenilefname.hashCode() : 0);
        result = 31 * result + (juvenilekeymap != null ? juvenilekeymap.hashCode() : 0);
        result = 31 * result + (juvenilelname != null ? juvenilelname.hashCode() : 0);
        result = 31 * result + (juvenilemname != null ? juvenilemname.hashCode() : 0);
        result = 31 * result + (juvenilenum != null ? juvenilenum.hashCode() : 0);
        result = 31 * result + (juvenilessn != null ? juvenilessn.hashCode() : 0);
        result = 31 * result + (juveniletitle != null ? juveniletitle.hashCode() : 0);
        result = 31 * result + (juvenilezip != null ? juvenilezip.hashCode() : 0);
        result = 31 * result + (lastactionby != null ? lastactionby.hashCode() : 0);
        result = 31 * result + (lastreferralnum != null ? lastreferralnum.hashCode() : 0);
        result = 31 * result + (lcdate != null ? lcdate.hashCode() : 0);
        result = 31 * result + (lctime != null ? lctime.hashCode() : 0);
        result = 31 * result + (lcuser != null ? lcuser.hashCode() : 0);
        result = 31 * result + (offenseseverity != null ? offenseseverity.hashCode() : 0);
        result = 31 * result + (offensetotal != null ? offensetotal.hashCode() : 0);
        result = 31 * result + (oldstatus != null ? oldstatus.hashCode() : 0);
        result = 31 * result + (propointjpoid != null ? propointjpoid.hashCode() : 0);
        result = 31 * result + (propointlevel != null ? propointlevel.hashCode() : 0);
        result = 31 * result + (propointunit != null ? propointunit.hashCode() : 0);
        result = 31 * result + (provisionseverity != null ? provisionseverity.hashCode() : 0);
        result = 31 * result + (provisiontotal != null ? provisiontotal.hashCode() : 0);
        result = 31 * result + (purgeboxnum != null ? purgeboxnum.hashCode() : 0);
        result = 31 * result + (purgedate != null ? purgedate.hashCode() : 0);
        result = 31 * result + (purgeexecuteddate != null ? purgeexecuteddate.hashCode() : 0);
        result = 31 * result + (purgeflag != null ? purgeflag.hashCode() : 0);
        result = 31 * result + (purgesernum != null ? purgesernum.hashCode() : 0);
        result = 31 * result + (race != null ? race.hashCode() : 0);
        result = 31 * result + (rectype != null ? rectype.hashCode() : 0);
        result = 31 * result + (referralcount != null ? referralcount.hashCode() : 0);
        result = 31 * result + (referralhistory != null ? referralhistory.hashCode() : 0);
        result = 31 * result + (referralnum != null ? referralnum.hashCode() : 0);
        result = 31 * result + (referralofficer != null ? referralofficer.hashCode() : 0);
        result = 31 * result + (referraltotal != null ? referraltotal.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (ssnrelation1 != null ? ssnrelation1.hashCode() : 0);
        result = 31 * result + (ssnrelation2 != null ? ssnrelation2.hashCode() : 0);
        result = 31 * result + (ssn1 != null ? ssn1.hashCode() : 0);
        result = 31 * result + (ssn2 != null ? ssn2.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (tjpcseqnum != null ? tjpcseqnum.hashCode() : 0);
        result = 31 * result + (originalrace != null ? originalrace.hashCode() : 0);
        result = 31 * result + (sealcomments != null ? sealcomments.hashCode() : 0);
        result = 31 * result + (sealeddate != null ? sealeddate.hashCode() : 0);
        result = 31 * result + (purgecomments != null ? purgecomments.hashCode() : 0);
        result = 31 * result + (preffirstname != null ? preffirstname.hashCode() : 0);
        result = 31 * result + (causeOfDeath != null ? causeOfDeath.hashCode() : 0);
        result = 31 * result + (deathVerification != null ? deathVerification.hashCode() : 0);
        result = 31 * result + (dateOfDeath != null ? dateOfDeath.hashCode() : 0);
        result = 31 * result + (ageAtDeath != null ? ageAtDeath.hashCode() : 0);
        result = 31 * result + (createuser != null ? createuser.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (updateuser != null ? updateuser.hashCode() : 0);
        result = 31 * result + (updatedate != null ? updatedate.hashCode() : 0);
        result = 31 * result + (createjims2User != null ? createjims2User.hashCode() : 0);
        result = 31 * result + (updatejims2User != null ? updatejims2User.hashCode() : 0);
        return result;
    }
}
