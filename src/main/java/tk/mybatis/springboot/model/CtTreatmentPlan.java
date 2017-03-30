package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_TREATMENT_PLAN")
public class CtTreatmentPlan {
    @Id
    @Column(name = "TREATMENT_PLAN_KEY_ID")
    private Integer treatmentPlanKeyId;

    @Column(name = "TEMPLATE_KEY_ID")
    private Integer templateKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    /**
     * 见字典表014
     */
    @Column(name = "SPECIAL_DISEASE_TYPE_CODE")
    private String specialDiseaseTypeCode;

    @Column(name = "RESPONSIBILITY_DOCTOR_NAME")
    private String responsibilityDoctorName;

    @Column(name = "RESPONSIBILITY_DEPT_NAME")
    private String responsibilityDeptName;

    @Column(name = "PUSH_DATETIME")
    private Date pushDatetime;

    @Column(name = "VISIT_DATE")
    private Date visitDate;

    /**
     * 0：未获取；1：已获取；
     */
    @Column(name = "IS_APP_GET")
    private Integer isAppGet;

    @Column(name = "REAL_PUSH_DATETIME")
    private Date realPushDatetime;

    /**
     * 0：失败；1：成功；
     */
    @Column(name = "PUSH_STATUS")
    private Integer pushStatus;

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

    /**
     * @return TREATMENT_PLAN_KEY_ID
     */
    public Integer getTreatmentPlanKeyId() {
        return treatmentPlanKeyId;
    }

    /**
     * @param treatmentPlanKeyId
     */
    public void setTreatmentPlanKeyId(Integer treatmentPlanKeyId) {
        this.treatmentPlanKeyId = treatmentPlanKeyId;
    }

    /**
     * @return TEMPLATE_KEY_ID
     */
    public Integer getTemplateKeyId() {
        return templateKeyId;
    }

    /**
     * @param templateKeyId
     */
    public void setTemplateKeyId(Integer templateKeyId) {
        this.templateKeyId = templateKeyId;
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
     * @return RESPONSIBILITY_DOCTOR_NAME
     */
    public String getResponsibilityDoctorName() {
        return responsibilityDoctorName;
    }

    /**
     * @param responsibilityDoctorName
     */
    public void setResponsibilityDoctorName(String responsibilityDoctorName) {
        this.responsibilityDoctorName = responsibilityDoctorName;
    }

    /**
     * @return RESPONSIBILITY_DEPT_NAME
     */
    public String getResponsibilityDeptName() {
        return responsibilityDeptName;
    }

    /**
     * @param responsibilityDeptName
     */
    public void setResponsibilityDeptName(String responsibilityDeptName) {
        this.responsibilityDeptName = responsibilityDeptName;
    }

    /**
     * @return PUSH_DATETIME
     */
    public Date getPushDatetime() {
        return pushDatetime;
    }

    /**
     * @param pushDatetime
     */
    public void setPushDatetime(Date pushDatetime) {
        this.pushDatetime = pushDatetime;
    }

    /**
     * @return VISIT_DATE
     */
    public Date getVisitDate() {
        return visitDate;
    }

    /**
     * @param visitDate
     */
    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * 获取0：未获取；1：已获取；
     *
     * @return IS_APP_GET - 0：未获取；1：已获取；
     */
    public Integer getIsAppGet() {
        return isAppGet;
    }

    /**
     * 设置0：未获取；1：已获取；
     *
     * @param isAppGet 0：未获取；1：已获取；
     */
    public void setIsAppGet(Integer isAppGet) {
        this.isAppGet = isAppGet;
    }

    /**
     * @return REAL_PUSH_DATETIME
     */
    public Date getRealPushDatetime() {
        return realPushDatetime;
    }

    /**
     * @param realPushDatetime
     */
    public void setRealPushDatetime(Date realPushDatetime) {
        this.realPushDatetime = realPushDatetime;
    }

    /**
     * 获取0：失败；1：成功；
     *
     * @return PUSH_STATUS - 0：失败；1：成功；
     */
    public Integer getPushStatus() {
        return pushStatus;
    }

    /**
     * 设置0：失败；1：成功；
     *
     * @param pushStatus 0：失败；1：成功；
     */
    public void setPushStatus(Integer pushStatus) {
        this.pushStatus = pushStatus;
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
}