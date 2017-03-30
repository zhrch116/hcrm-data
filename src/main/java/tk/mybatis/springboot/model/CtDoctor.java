package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_DOCTOR")
public class CtDoctor {
    @Id
    @Column(name = "DOCTOR_KEY_ID")
    private Integer doctorKeyId;

    @Column(name = "HOS_DOCTOR_KEY_ID")
    private Integer hosDoctorKeyId;

    @Column(name = "DOCTOR_CODE")
    private String doctorCode;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    @Column(name = "PHONE_NO")
    private String phoneNo;

    @Column(name = "ID_NO")
    private String idNo;

    /**
     * 这个应该保存到字典表中，M 男、F 女、U 未知
     */
    @Column(name = "SEX")
    private String sex;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name = "MAILBOX")
    private String mailbox;

    @Column(name = "HOS_TITLE_CODE")
    private String hosTitleCode;

    @Column(name = "TITLE_NAME")
    private String titleName;

    @Column(name = "POSITION")
    private String position;

    @Column(name = "HOSPITAL_ACCOUNT")
    private String hospitalAccount;

    @Column(name = "HOSPITAL_PASSWORD")
    private String hospitalPassword;

    @Column(name = "ETL_IMPORT_INSERT_TIME")
    private Date etlImportInsertTime;

    @Column(name = "ETL_IMPORT_UPDATE_TIME")
    private Date etlImportUpdateTime;

    @Column(name = "CREATOR_ID")
    private Integer creatorId;

    /**
     * 本行数据创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "EDITOR_ID")
    private Integer editorId;

    /**
     * 本行数据最后更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    @Column(name = "SUMMARY")
    private String summary;

    /**
     * @return DOCTOR_KEY_ID
     */
    public Integer getDoctorKeyId() {
        return doctorKeyId;
    }

    /**
     * @param doctorKeyId
     */
    public void setDoctorKeyId(Integer doctorKeyId) {
        this.doctorKeyId = doctorKeyId;
    }

    /**
     * @return HOS_DOCTOR_KEY_ID
     */
    public Integer getHosDoctorKeyId() {
        return hosDoctorKeyId;
    }

    /**
     * @param hosDoctorKeyId
     */
    public void setHosDoctorKeyId(Integer hosDoctorKeyId) {
        this.hosDoctorKeyId = hosDoctorKeyId;
    }

    /**
     * @return DOCTOR_CODE
     */
    public String getDoctorCode() {
        return doctorCode;
    }

    /**
     * @param doctorCode
     */
    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
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
     * @return DOCTOR_NAME
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * @param doctorName
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
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
     * 获取这个应该保存到字典表中，M 男、F 女、U 未知
     *
     * @return SEX - 这个应该保存到字典表中，M 男、F 女、U 未知
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置这个应该保存到字典表中，M 男、F 女、U 未知
     *
     * @param sex 这个应该保存到字典表中，M 男、F 女、U 未知
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
     * @return MAILBOX
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * @param mailbox
     */
    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    /**
     * @return HOS_TITLE_CODE
     */
    public String getHosTitleCode() {
        return hosTitleCode;
    }

    /**
     * @param hosTitleCode
     */
    public void setHosTitleCode(String hosTitleCode) {
        this.hosTitleCode = hosTitleCode;
    }

    /**
     * @return TITLE_NAME
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * @param titleName
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    /**
     * @return POSITION
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return HOSPITAL_ACCOUNT
     */
    public String getHospitalAccount() {
        return hospitalAccount;
    }

    /**
     * @param hospitalAccount
     */
    public void setHospitalAccount(String hospitalAccount) {
        this.hospitalAccount = hospitalAccount;
    }

    /**
     * @return HOSPITAL_PASSWORD
     */
    public String getHospitalPassword() {
        return hospitalPassword;
    }

    /**
     * @param hospitalPassword
     */
    public void setHospitalPassword(String hospitalPassword) {
        this.hospitalPassword = hospitalPassword;
    }

    /**
     * @return ETL_IMPORT_INSERT_TIME
     */
    public Date getEtlImportInsertTime() {
        return etlImportInsertTime;
    }

    /**
     * @param etlImportInsertTime
     */
    public void setEtlImportInsertTime(Date etlImportInsertTime) {
        this.etlImportInsertTime = etlImportInsertTime;
    }

    /**
     * @return ETL_IMPORT_UPDATE_TIME
     */
    public Date getEtlImportUpdateTime() {
        return etlImportUpdateTime;
    }

    /**
     * @param etlImportUpdateTime
     */
    public void setEtlImportUpdateTime(Date etlImportUpdateTime) {
        this.etlImportUpdateTime = etlImportUpdateTime;
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
     * 获取本行数据创建时间
     *
     * @return CREATE_TIME - 本行数据创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置本行数据创建时间
     *
     * @param createTime 本行数据创建时间
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
     * 获取本行数据最后更新时间
     *
     * @return UPDATE_TIME - 本行数据最后更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置本行数据最后更新时间
     *
     * @param updateTime 本行数据最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取标记该条记录是否可用，0：不可用；1：可用；
     *
     * @return IS_ENABLE - 标记该条记录是否可用，0：不可用；1：可用；
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * 设置标记该条记录是否可用，0：不可用；1：可用；
     *
     * @param isEnable 标记该条记录是否可用，0：不可用；1：可用；
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * @return SUMMARY
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
}