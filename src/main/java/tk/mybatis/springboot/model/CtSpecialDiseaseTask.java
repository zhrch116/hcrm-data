package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_SPECIAL_DISEASE_TASK")
public class CtSpecialDiseaseTask {
    @Id
    @Column(name = "TASK_KEY_ID")
    private Integer taskKeyId;

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

    @Column(name = "FOLLOW_UP_USER_ID")
    private Integer followUpUserId;

    @Column(name = "FOLLOW_UP_TIME")
    private Date followUpTime;

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

    @Column(name = "TASK_REMARK")
    private String taskRemark;

    /**
     * @return TASK_KEY_ID
     */
    public Integer getTaskKeyId() {
        return taskKeyId;
    }

    /**
     * @param taskKeyId
     */
    public void setTaskKeyId(Integer taskKeyId) {
        this.taskKeyId = taskKeyId;
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
     * @return FOLLOW_UP_USER_ID
     */
    public Integer getFollowUpUserId() {
        return followUpUserId;
    }

    /**
     * @param followUpUserId
     */
    public void setFollowUpUserId(Integer followUpUserId) {
        this.followUpUserId = followUpUserId;
    }

    /**
     * @return FOLLOW_UP_TIME
     */
    public Date getFollowUpTime() {
        return followUpTime;
    }

    /**
     * @param followUpTime
     */
    public void setFollowUpTime(Date followUpTime) {
        this.followUpTime = followUpTime;
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
     * @return TASK_REMARK
     */
    public String getTaskRemark() {
        return taskRemark;
    }

    /**
     * @param taskRemark
     */
    public void setTaskRemark(String taskRemark) {
        this.taskRemark = taskRemark;
    }
}