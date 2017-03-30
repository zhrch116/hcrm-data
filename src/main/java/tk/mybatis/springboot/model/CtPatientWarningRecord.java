package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_PATIENT_WARNING_RECORD")
public class CtPatientWarningRecord {
    @Id
    @Column(name = "PATIENT_WARNING_KEY_ID")
    private Integer patientWarningKeyId;

    @Column(name = "MONITOR_QUOTA_KEY_ID")
    private Integer monitorQuotaKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    /**
     * 见字典表014
     */
    @Column(name = "SPECIAL_DISEASE_TYPE_CODE")
    private String specialDiseaseTypeCode;

    @Column(name = "ACTUAL_WARNING_VALUE")
    private String actualWarningValue;

    @Column(name = "ACTUAL_WARNING_TIME")
    private Date actualWarningTime;

    @Column(name = "IS_CANCEL_WARNING")
    private Integer isCancelWarning;

    @Column(name = "CANCEL_USER_ID")
    private Integer cancelUserId;

    @Column(name = "CANCEL_TIME")
    private Date cancelTime;

    /**
     * 本行数据创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return PATIENT_WARNING_KEY_ID
     */
    public Integer getPatientWarningKeyId() {
        return patientWarningKeyId;
    }

    /**
     * @param patientWarningKeyId
     */
    public void setPatientWarningKeyId(Integer patientWarningKeyId) {
        this.patientWarningKeyId = patientWarningKeyId;
    }

    /**
     * @return MONITOR_QUOTA_KEY_ID
     */
    public Integer getMonitorQuotaKeyId() {
        return monitorQuotaKeyId;
    }

    /**
     * @param monitorQuotaKeyId
     */
    public void setMonitorQuotaKeyId(Integer monitorQuotaKeyId) {
        this.monitorQuotaKeyId = monitorQuotaKeyId;
    }

    /**
     * @return PATIENT_KEY_ID
     */
    public Integer getPatientKeyId() {
        return patientKeyId;
    }

    /**
     * @param patientKeyId
     */
    public void setPatientKeyId(Integer patientKeyId) {
        this.patientKeyId = patientKeyId;
    }

    /**
     * 获取见字典表014
     *
     * @return SPECIAL_DISEASE_TYPE_CODE - 见字典表014
     */
    public String getSpecialDiseaseTypeCode() {
        return specialDiseaseTypeCode;
    }

    /**
     * 设置见字典表014
     *
     * @param specialDiseaseTypeCode 见字典表014
     */
    public void setSpecialDiseaseTypeCode(String specialDiseaseTypeCode) {
        this.specialDiseaseTypeCode = specialDiseaseTypeCode;
    }

    /**
     * @return ACTUAL_WARNING_VALUE
     */
    public String getActualWarningValue() {
        return actualWarningValue;
    }

    /**
     * @param actualWarningValue
     */
    public void setActualWarningValue(String actualWarningValue) {
        this.actualWarningValue = actualWarningValue;
    }

    /**
     * @return ACTUAL_WARNING_TIME
     */
    public Date getActualWarningTime() {
        return actualWarningTime;
    }

    /**
     * @param actualWarningTime
     */
    public void setActualWarningTime(Date actualWarningTime) {
        this.actualWarningTime = actualWarningTime;
    }

    /**
     * @return IS_CANCEL_WARNING
     */
    public Integer getIsCancelWarning() {
        return isCancelWarning;
    }

    /**
     * @param isCancelWarning
     */
    public void setIsCancelWarning(Integer isCancelWarning) {
        this.isCancelWarning = isCancelWarning;
    }

    /**
     * @return CANCEL_USER_ID
     */
    public Integer getCancelUserId() {
        return cancelUserId;
    }

    /**
     * @param cancelUserId
     */
    public void setCancelUserId(Integer cancelUserId) {
        this.cancelUserId = cancelUserId;
    }

    /**
     * @return CANCEL_TIME
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * @param cancelTime
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
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
}