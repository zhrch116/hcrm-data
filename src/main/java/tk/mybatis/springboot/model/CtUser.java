package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_USER")
public class CtUser {
    @Id
    @Column(name = "USER_KEY_ID")
    private Integer userKeyId;

    @Column(name = "JZYH_USER_ID")
    private String jzyhUserId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;

    @Column(name = "JOB_NO")
    private String jobNo;

    @Column(name = "IS_MANAGER")
    private Boolean isManager;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ID_NO")
    private String idNo;

    @Column(name = "PHONE_NO")
    private String phoneNo;

    @Column(name = "E_MAIL")
    private String eMail;

    @Column(name = "SEX")
    private String sex;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name = "ACCOUNT")
    private String account;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "IS_ACCOUNT_NON_EXPIRED")
    private Boolean isAccountNonExpired;

    @Column(name = "IS_ACCOUNT_NON_LOCKED")
    private Boolean isAccountNonLocked;

    @Column(name = "IS_CREDENTIALS_NON_EXPIRED")
    private Boolean isCredentialsNonExpired;

    @Column(name = "CREATOR_ID")
    private Integer creatorId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "EDITOR_ID")
    private Integer editorId;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "CAN_DELETE")
    private Boolean canDelete;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    @Column(name = "REMARK")
    private String remark;

    /**
     * @return USER_KEY_ID
     */
    public Integer getUserKeyId() {
        return userKeyId;
    }

    /**
     * @param userKeyId
     */
    public void setUserKeyId(Integer userKeyId) {
        this.userKeyId = userKeyId;
    }

    /**
     * @return JZYH_USER_ID
     */
    public String getJzyhUserId() {
        return jzyhUserId;
    }

    /**
     * @param jzyhUserId
     */
    public void setJzyhUserId(String jzyhUserId) {
        this.jzyhUserId = jzyhUserId;
    }

    /**
     * @return HOSPITAL_ID
     */
    public Integer getHospitalId() {
        return hospitalId;
    }

    /**
     * @param hospitalId
     */
    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    /**
     * @return HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * @param hospitalName
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * @return JOB_NO
     */
    public String getJobNo() {
        return jobNo;
    }

    /**
     * @param jobNo
     */
    public void setJobNo(String jobNo) {
        this.jobNo = jobNo;
    }

    /**
     * @return IS_MANAGER
     */
    public Boolean getIsManager() {
        return isManager;
    }

    /**
     * @param isManager
     */
    public void setIsManager(Boolean isManager) {
        this.isManager = isManager;
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return ID_NO
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * @param idNo
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * @return PHONE_NO
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return E_MAIL
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * @return SEX
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return BIRTHDAY
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return ACCOUNT
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return IS_ACCOUNT_NON_EXPIRED
     */
    public Boolean getIsAccountNonExpired() {
        return isAccountNonExpired;
    }

    /**
     * @param isAccountNonExpired
     */
    public void setIsAccountNonExpired(Boolean isAccountNonExpired) {
        this.isAccountNonExpired = isAccountNonExpired;
    }

    /**
     * @return IS_ACCOUNT_NON_LOCKED
     */
    public Boolean getIsAccountNonLocked() {
        return isAccountNonLocked;
    }

    /**
     * @param isAccountNonLocked
     */
    public void setIsAccountNonLocked(Boolean isAccountNonLocked) {
        this.isAccountNonLocked = isAccountNonLocked;
    }

    /**
     * @return IS_CREDENTIALS_NON_EXPIRED
     */
    public Boolean getIsCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    /**
     * @param isCredentialsNonExpired
     */
    public void setIsCredentialsNonExpired(Boolean isCredentialsNonExpired) {
        this.isCredentialsNonExpired = isCredentialsNonExpired;
    }

    /**
     * @return CREATOR_ID
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * @param creatorId
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return EDITOR_ID
     */
    public Integer getEditorId() {
        return editorId;
    }

    /**
     * @param editorId
     */
    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return CAN_DELETE
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    /**
     * @param canDelete
     */
    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    /**
     * @return IS_ENABLE
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * @param isEnable
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}