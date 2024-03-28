package com.example.jims2.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "OFFICER", schema = "JIMS2", catalog = "JIMS2")
public class OfficerEntity {
    private int officerId;
    private String userid;
    private String officerType;
    private String officerSubtype;
    private String assignedArea;
    private String lastname;
    private String firstname;
    private String middlename;
    private String statusId;
    private String deptCode;
    private String ssn;
    private String badge;
    private String rank;
    private String pager;
    private String email;
    private String cellphone;
    private String workphone;
    private String workphoneext;
    private String homephone;
    private String fax;
    private String faxlocation;
    private String payrollnumber;
    private String division;
    private String radioNumber;
    private Integer locationId;
    private String workshift;
    private String mgrUserid;
    private String mgrFname;
    private String mgrMname;
    private String mgrLname;
    private String otheridnumber;
    private Integer juvlocunitId;
    private String createuser;
    private Date createdate;
    private String updateuser;
    private Date updatedate;
    private String createjims2User;
    private String updatejims2User;

    @Basic
    @Id
    @Column(name = "OFFICER_ID")
    public int getOfficerId() {
        return officerId;
    }

    public void setOfficerId(int officerId) {
        this.officerId = officerId;
    }

    @Basic
    @Column(name = "USERID")
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "OFFICER_TYPE")
    public String getOfficerType() {
        return officerType;
    }

    public void setOfficerType(String officerType) {
        this.officerType = officerType;
    }

    @Basic
    @Column(name = "OFFICER_SUBTYPE")
    public String getOfficerSubtype() {
        return officerSubtype;
    }

    public void setOfficerSubtype(String officerSubtype) {
        this.officerSubtype = officerSubtype;
    }

    @Basic
    @Column(name = "ASSIGNED_AREA")
    public String getAssignedArea() {
        return assignedArea;
    }

    public void setAssignedArea(String assignedArea) {
        this.assignedArea = assignedArea;
    }

    @Basic
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "MIDDLENAME")
    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    @Basic
    @Column(name = "STATUS_ID")
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "DEPT_CODE")
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Basic
    @Column(name = "SSN")
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Basic
    @Column(name = "BADGE")
    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    @Basic
    @Column(name = "RANK")
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "PAGER")
    public String getPager() {
        return pager;
    }

    public void setPager(String pager) {
        this.pager = pager;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "CELLPHONE")
    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Basic
    @Column(name = "WORKPHONE")
    public String getWorkphone() {
        return workphone;
    }

    public void setWorkphone(String workphone) {
        this.workphone = workphone;
    }

    @Basic
    @Column(name = "WORKPHONEEXT")
    public String getWorkphoneext() {
        return workphoneext;
    }

    public void setWorkphoneext(String workphoneext) {
        this.workphoneext = workphoneext;
    }

    @Basic
    @Column(name = "HOMEPHONE")
    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    @Basic
    @Column(name = "FAX")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "FAXLOCATION")
    public String getFaxlocation() {
        return faxlocation;
    }

    public void setFaxlocation(String faxlocation) {
        this.faxlocation = faxlocation;
    }

    @Basic
    @Column(name = "PAYROLLNUMBER")
    public String getPayrollnumber() {
        return payrollnumber;
    }

    public void setPayrollnumber(String payrollnumber) {
        this.payrollnumber = payrollnumber;
    }

    @Basic
    @Column(name = "DIVISION")
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Basic
    @Column(name = "RADIO_NUMBER")
    public String getRadioNumber() {
        return radioNumber;
    }

    public void setRadioNumber(String radioNumber) {
        this.radioNumber = radioNumber;
    }

    @Basic
    @Column(name = "LOCATION_ID")
    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "WORKSHIFT")
    public String getWorkshift() {
        return workshift;
    }

    public void setWorkshift(String workshift) {
        this.workshift = workshift;
    }

    @Basic
    @Column(name = "MGR_USERID")
    public String getMgrUserid() {
        return mgrUserid;
    }

    public void setMgrUserid(String mgrUserid) {
        this.mgrUserid = mgrUserid;
    }

    @Basic
    @Column(name = "MGR_FNAME")
    public String getMgrFname() {
        return mgrFname;
    }

    public void setMgrFname(String mgrFname) {
        this.mgrFname = mgrFname;
    }

    @Basic
    @Column(name = "MGR_MNAME")
    public String getMgrMname() {
        return mgrMname;
    }

    public void setMgrMname(String mgrMname) {
        this.mgrMname = mgrMname;
    }

    @Basic
    @Column(name = "MGR_LNAME")
    public String getMgrLname() {
        return mgrLname;
    }

    public void setMgrLname(String mgrLname) {
        this.mgrLname = mgrLname;
    }

    @Basic
    @Column(name = "OTHERIDNUMBER")
    public String getOtheridnumber() {
        return otheridnumber;
    }

    public void setOtheridnumber(String otheridnumber) {
        this.otheridnumber = otheridnumber;
    }

    @Basic
    @Column(name = "JUVLOCUNIT_ID")
    public Integer getJuvlocunitId() {
        return juvlocunitId;
    }

    public void setJuvlocunitId(Integer juvlocunitId) {
        this.juvlocunitId = juvlocunitId;
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

        OfficerEntity that = (OfficerEntity) o;

        if (officerId != that.officerId) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (officerType != null ? !officerType.equals(that.officerType) : that.officerType != null) return false;
        if (officerSubtype != null ? !officerSubtype.equals(that.officerSubtype) : that.officerSubtype != null)
            return false;
        if (assignedArea != null ? !assignedArea.equals(that.assignedArea) : that.assignedArea != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (middlename != null ? !middlename.equals(that.middlename) : that.middlename != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (deptCode != null ? !deptCode.equals(that.deptCode) : that.deptCode != null) return false;
        if (ssn != null ? !ssn.equals(that.ssn) : that.ssn != null) return false;
        if (badge != null ? !badge.equals(that.badge) : that.badge != null) return false;
        if (rank != null ? !rank.equals(that.rank) : that.rank != null) return false;
        if (pager != null ? !pager.equals(that.pager) : that.pager != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (cellphone != null ? !cellphone.equals(that.cellphone) : that.cellphone != null) return false;
        if (workphone != null ? !workphone.equals(that.workphone) : that.workphone != null) return false;
        if (workphoneext != null ? !workphoneext.equals(that.workphoneext) : that.workphoneext != null) return false;
        if (homephone != null ? !homephone.equals(that.homephone) : that.homephone != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (faxlocation != null ? !faxlocation.equals(that.faxlocation) : that.faxlocation != null) return false;
        if (payrollnumber != null ? !payrollnumber.equals(that.payrollnumber) : that.payrollnumber != null)
            return false;
        if (division != null ? !division.equals(that.division) : that.division != null) return false;
        if (radioNumber != null ? !radioNumber.equals(that.radioNumber) : that.radioNumber != null) return false;
        if (locationId != null ? !locationId.equals(that.locationId) : that.locationId != null) return false;
        if (workshift != null ? !workshift.equals(that.workshift) : that.workshift != null) return false;
        if (mgrUserid != null ? !mgrUserid.equals(that.mgrUserid) : that.mgrUserid != null) return false;
        if (mgrFname != null ? !mgrFname.equals(that.mgrFname) : that.mgrFname != null) return false;
        if (mgrMname != null ? !mgrMname.equals(that.mgrMname) : that.mgrMname != null) return false;
        if (mgrLname != null ? !mgrLname.equals(that.mgrLname) : that.mgrLname != null) return false;
        if (otheridnumber != null ? !otheridnumber.equals(that.otheridnumber) : that.otheridnumber != null)
            return false;
        if (juvlocunitId != null ? !juvlocunitId.equals(that.juvlocunitId) : that.juvlocunitId != null) return false;
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
        int result = officerId;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (officerType != null ? officerType.hashCode() : 0);
        result = 31 * result + (officerSubtype != null ? officerSubtype.hashCode() : 0);
        result = 31 * result + (assignedArea != null ? assignedArea.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (middlename != null ? middlename.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (deptCode != null ? deptCode.hashCode() : 0);
        result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
        result = 31 * result + (badge != null ? badge.hashCode() : 0);
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        result = 31 * result + (pager != null ? pager.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (cellphone != null ? cellphone.hashCode() : 0);
        result = 31 * result + (workphone != null ? workphone.hashCode() : 0);
        result = 31 * result + (workphoneext != null ? workphoneext.hashCode() : 0);
        result = 31 * result + (homephone != null ? homephone.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (faxlocation != null ? faxlocation.hashCode() : 0);
        result = 31 * result + (payrollnumber != null ? payrollnumber.hashCode() : 0);
        result = 31 * result + (division != null ? division.hashCode() : 0);
        result = 31 * result + (radioNumber != null ? radioNumber.hashCode() : 0);
        result = 31 * result + (locationId != null ? locationId.hashCode() : 0);
        result = 31 * result + (workshift != null ? workshift.hashCode() : 0);
        result = 31 * result + (mgrUserid != null ? mgrUserid.hashCode() : 0);
        result = 31 * result + (mgrFname != null ? mgrFname.hashCode() : 0);
        result = 31 * result + (mgrMname != null ? mgrMname.hashCode() : 0);
        result = 31 * result + (mgrLname != null ? mgrLname.hashCode() : 0);
        result = 31 * result + (otheridnumber != null ? otheridnumber.hashCode() : 0);
        result = 31 * result + (juvlocunitId != null ? juvlocunitId.hashCode() : 0);
        result = 31 * result + (createuser != null ? createuser.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (updateuser != null ? updateuser.hashCode() : 0);
        result = 31 * result + (updatedate != null ? updatedate.hashCode() : 0);
        result = 31 * result + (createjims2User != null ? createjims2User.hashCode() : 0);
        result = 31 * result + (updatejims2User != null ? updatejims2User.hashCode() : 0);
        return result;
    }
}
