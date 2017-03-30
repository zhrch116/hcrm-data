package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_FOLLOW_UP_TASK")
public class CtFollowUpTask {
    @Id
    @Column(name = "FOLLOW_UP_TASK_KEY_ID")
    private Integer followUpTaskKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;

    @Column(name = "SOURCE_DEPT_ID")
    private Integer sourceDeptId;

    @Column(name = "TARGET_DEPT_ID")
    private Integer targetDeptId;

    /**
     * 见字典012-住院/门诊/体检
     */
    @Column(name = "VISIT_TYPE_CODE")
    private String visitTypeCode;

    @Column(name = "VISIT_TYPE_NAME")
    private String visitTypeName;

    /**
     * 当就诊类别编码为01200010-住院时，患者来源主键ID为就诊记录表中的主键ID；同样，其他情况为门诊记录表/体检记录表的主键ID
     */
    @Column(name = "PATIENT_SOURCE_KEY_ID")
    private Integer patientSourceKeyId;

    /**
     * 当该任务是：另一任务随访时，选择「第二次随访」时生成的任务的时候，另一个任务的主键ID就是该字段的值。
     */
    @Column(name = "SOURCE_TASK_KEY_ID")
    private Integer sourceTaskKeyId;

    /**
     * 任务的适用类型，见字典表006
     */
    @Column(name = "APPLICABLE_TYPE_CODE")
    private String applicableTypeCode;

    /**
     * 见字典表
     */
    @Column(name = "CURRENT_STATUS_CODE")
    private String currentStatusCode;

    @Column(name = "CURRENT_STATUS_NAME")
    private String currentStatusName;

    @Column(name = "PLAN_START_DATE")
    private Date planStartDate;

    @Column(name = "REAL_START_TIME")
    private Date realStartTime;

    /**
     * 当任务被稍后再拨后，再次开始的时间就记录在本字段
     */
    @Column(name = "DELAY_START_TIME")
    private Date delayStartTime;

    @Column(name = "REAL_END_TIME")
    private Date realEndTime;

    /**
     * 0：未结束；1：已结束。
     */
    @Column(name = "TASK_IS_END")
    private Integer taskIsEnd;

    /**
     * 0：不需要健康指导；1：需要健康指导。
     */
    @Column(name = "IS_NEED_HEALTH_GUIDANCE")
    private Integer isNeedHealthGuidance;

    /**
     * 0：未健康指导；1：已健康指导；
     */
    @Column(name = "IS_HEALTH_GUIDANCE_END")
    private Integer isHealthGuidanceEnd;

    /**
     * 0：未推送；1：已推送。
     */
    @Column(name = "IS_SEND_APP")
    private Integer isSendApp;

    @Column(name = "SEND_APP_TIME")
    private Date sendAppTime;

    /**
     * 0：未更新；1：已更新；默认值为null
     */
    @Column(name = "IS_UPDATE_APP_AFTER_TELEPHONE")
    private Integer isUpdateAppAfterTelephone;

    @Column(name = "UPDATE_APP_TIME")
    private Date updateAppTime;

    /**
     * 0：未推送；1：已推送。
     */
    @Column(name = "IS_SEND_WECHAT")
    private Integer isSendWechat;

    @Column(name = "SEND_WECHAT_TIME")
    private Date sendWechatTime;

    @Column(name = "LOCK_USER_ID")
    private Integer lockUserId;

    @Column(name = "LOCK_DUE_DATE")
    private Date lockDueDate;

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

    @Column(name = "FROM_PATIENT_FEEDBACK")
    private String fromPatientFeedback;

    /**
     * 客服或者医生对患者的备注信息
     */
    @Column(name = "TO_PATIENT_FEEDBACK")
    private String toPatientFeedback;

    /**
     * @return FOLLOW_UP_TASK_KEY_ID
     */
    public Integer getFollowUpTaskKeyId() {
        return followUpTaskKeyId;
    }

    /**
     * @param followUpTaskKeyId
     */
    public void setFollowUpTaskKeyId(Integer followUpTaskKeyId) {
        this.followUpTaskKeyId = followUpTaskKeyId;
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
     * @return SOURCE_DEPT_ID
     */
    public Integer getSourceDeptId() {
        return sourceDeptId;
    }

    /**
     * @param sourceDeptId
     */
    public void setSourceDeptId(Integer sourceDeptId) {
        this.sourceDeptId = sourceDeptId;
    }

    /**
     * @return TARGET_DEPT_ID
     */
    public Integer getTargetDeptId() {
        return targetDeptId;
    }

    /**
     * @param targetDeptId
     */
    public void setTargetDeptId(Integer targetDeptId) {
        this.targetDeptId = targetDeptId;
    }

    /**
     * 获取见字典012-住院/门诊/体检
     *
     * @return VISIT_TYPE_CODE - 见字典012-住院/门诊/体检
     */
    public String getVisitTypeCode() {
        return visitTypeCode;
    }

    /**
     * 设置见字典012-住院/门诊/体检
     *
     * @param visitTypeCode 见字典012-住院/门诊/体检
     */
    public void setVisitTypeCode(String visitTypeCode) {
        this.visitTypeCode = visitTypeCode;
    }

    /**
     * @return VISIT_TYPE_NAME
     */
    public String getVisitTypeName() {
        return visitTypeName;
    }

    /**
     * @param visitTypeName
     */
    public void setVisitTypeName(String visitTypeName) {
        this.visitTypeName = visitTypeName;
    }

    /**
     * 获取当就诊类别编码为01200010-住院时，患者来源主键ID为就诊记录表中的主键ID；同样，其他情况为门诊记录表/体检记录表的主键ID
     *
     * @return PATIENT_SOURCE_KEY_ID - 当就诊类别编码为01200010-住院时，患者来源主键ID为就诊记录表中的主键ID；同样，其他情况为门诊记录表/体检记录表的主键ID
     */
    public Integer getPatientSourceKeyId() {
        return patientSourceKeyId;
    }

    /**
     * 设置当就诊类别编码为01200010-住院时，患者来源主键ID为就诊记录表中的主键ID；同样，其他情况为门诊记录表/体检记录表的主键ID
     *
     * @param patientSourceKeyId 当就诊类别编码为01200010-住院时，患者来源主键ID为就诊记录表中的主键ID；同样，其他情况为门诊记录表/体检记录表的主键ID
     */
    public void setPatientSourceKeyId(Integer patientSourceKeyId) {
        this.patientSourceKeyId = patientSourceKeyId;
    }

    /**
     * 获取当该任务是：另一任务随访时，选择「第二次随访」时生成的任务的时候，另一个任务的主键ID就是该字段的值。
     *
     * @return SOURCE_TASK_KEY_ID - 当该任务是：另一任务随访时，选择「第二次随访」时生成的任务的时候，另一个任务的主键ID就是该字段的值。
     */
    public Integer getSourceTaskKeyId() {
        return sourceTaskKeyId;
    }

    /**
     * 设置当该任务是：另一任务随访时，选择「第二次随访」时生成的任务的时候，另一个任务的主键ID就是该字段的值。
     *
     * @param sourceTaskKeyId 当该任务是：另一任务随访时，选择「第二次随访」时生成的任务的时候，另一个任务的主键ID就是该字段的值。
     */
    public void setSourceTaskKeyId(Integer sourceTaskKeyId) {
        this.sourceTaskKeyId = sourceTaskKeyId;
    }

    /**
     * 获取任务的适用类型，见字典表006
     *
     * @return APPLICABLE_TYPE_CODE - 任务的适用类型，见字典表006
     */
    public String getApplicableTypeCode() {
        return applicableTypeCode;
    }

    /**
     * 设置任务的适用类型，见字典表006
     *
     * @param applicableTypeCode 任务的适用类型，见字典表006
     */
    public void setApplicableTypeCode(String applicableTypeCode) {
        this.applicableTypeCode = applicableTypeCode;
    }

    /**
     * 获取见字典表
     *
     * @return CURRENT_STATUS_CODE - 见字典表
     */
    public String getCurrentStatusCode() {
        return currentStatusCode;
    }

    /**
     * 设置见字典表
     *
     * @param currentStatusCode 见字典表
     */
    public void setCurrentStatusCode(String currentStatusCode) {
        this.currentStatusCode = currentStatusCode;
    }

    /**
     * @return CURRENT_STATUS_NAME
     */
    public String getCurrentStatusName() {
        return currentStatusName;
    }

    /**
     * @param currentStatusName
     */
    public void setCurrentStatusName(String currentStatusName) {
        this.currentStatusName = currentStatusName;
    }

    /**
     * @return PLAN_START_DATE
     */
    public Date getPlanStartDate() {
        return planStartDate;
    }

    /**
     * @param planStartDate
     */
    public void setPlanStartDate(Date planStartDate) {
        this.planStartDate = planStartDate;
    }

    /**
     * @return REAL_START_TIME
     */
    public Date getRealStartTime() {
        return realStartTime;
    }

    /**
     * @param realStartTime
     */
    public void setRealStartTime(Date realStartTime) {
        this.realStartTime = realStartTime;
    }

    /**
     * 获取当任务被稍后再拨后，再次开始的时间就记录在本字段
     *
     * @return DELAY_START_TIME - 当任务被稍后再拨后，再次开始的时间就记录在本字段
     */
    public Date getDelayStartTime() {
        return delayStartTime;
    }

    /**
     * 设置当任务被稍后再拨后，再次开始的时间就记录在本字段
     *
     * @param delayStartTime 当任务被稍后再拨后，再次开始的时间就记录在本字段
     */
    public void setDelayStartTime(Date delayStartTime) {
        this.delayStartTime = delayStartTime;
    }

    /**
     * @return REAL_END_TIME
     */
    public Date getRealEndTime() {
        return realEndTime;
    }

    /**
     * @param realEndTime
     */
    public void setRealEndTime(Date realEndTime) {
        this.realEndTime = realEndTime;
    }

    /**
     * 获取0：未结束；1：已结束。
     *
     * @return TASK_IS_END - 0：未结束；1：已结束。
     */
    public Integer getTaskIsEnd() {
        return taskIsEnd;
    }

    /**
     * 设置0：未结束；1：已结束。
     *
     * @param taskIsEnd 0：未结束；1：已结束。
     */
    public void setTaskIsEnd(Integer taskIsEnd) {
        this.taskIsEnd = taskIsEnd;
    }

    /**
     * 获取0：不需要健康指导；1：需要健康指导。
     *
     * @return IS_NEED_HEALTH_GUIDANCE - 0：不需要健康指导；1：需要健康指导。
     */
    public Integer getIsNeedHealthGuidance() {
        return isNeedHealthGuidance;
    }

    /**
     * 设置0：不需要健康指导；1：需要健康指导。
     *
     * @param isNeedHealthGuidance 0：不需要健康指导；1：需要健康指导。
     */
    public void setIsNeedHealthGuidance(Integer isNeedHealthGuidance) {
        this.isNeedHealthGuidance = isNeedHealthGuidance;
    }

    /**
     * 获取0：未健康指导；1：已健康指导；
     *
     * @return IS_HEALTH_GUIDANCE_END - 0：未健康指导；1：已健康指导；
     */
    public Integer getIsHealthGuidanceEnd() {
        return isHealthGuidanceEnd;
    }

    /**
     * 设置0：未健康指导；1：已健康指导；
     *
     * @param isHealthGuidanceEnd 0：未健康指导；1：已健康指导；
     */
    public void setIsHealthGuidanceEnd(Integer isHealthGuidanceEnd) {
        this.isHealthGuidanceEnd = isHealthGuidanceEnd;
    }

    /**
     * 获取0：未推送；1：已推送。
     *
     * @return IS_SEND_APP - 0：未推送；1：已推送。
     */
    public Integer getIsSendApp() {
        return isSendApp;
    }

    /**
     * 设置0：未推送；1：已推送。
     *
     * @param isSendApp 0：未推送；1：已推送。
     */
    public void setIsSendApp(Integer isSendApp) {
        this.isSendApp = isSendApp;
    }

    /**
     * @return SEND_APP_TIME
     */
    public Date getSendAppTime() {
        return sendAppTime;
    }

    /**
     * @param sendAppTime
     */
    public void setSendAppTime(Date sendAppTime) {
        this.sendAppTime = sendAppTime;
    }

    /**
     * 获取0：未更新；1：已更新；默认值为null
     *
     * @return IS_UPDATE_APP_AFTER_TELEPHONE - 0：未更新；1：已更新；默认值为null
     */
    public Integer getIsUpdateAppAfterTelephone() {
        return isUpdateAppAfterTelephone;
    }

    /**
     * 设置0：未更新；1：已更新；默认值为null
     *
     * @param isUpdateAppAfterTelephone 0：未更新；1：已更新；默认值为null
     */
    public void setIsUpdateAppAfterTelephone(Integer isUpdateAppAfterTelephone) {
        this.isUpdateAppAfterTelephone = isUpdateAppAfterTelephone;
    }

    /**
     * @return UPDATE_APP_TIME
     */
    public Date getUpdateAppTime() {
        return updateAppTime;
    }

    /**
     * @param updateAppTime
     */
    public void setUpdateAppTime(Date updateAppTime) {
        this.updateAppTime = updateAppTime;
    }

    /**
     * 获取0：未推送；1：已推送。
     *
     * @return IS_SEND_WECHAT - 0：未推送；1：已推送。
     */
    public Integer getIsSendWechat() {
        return isSendWechat;
    }

    /**
     * 设置0：未推送；1：已推送。
     *
     * @param isSendWechat 0：未推送；1：已推送。
     */
    public void setIsSendWechat(Integer isSendWechat) {
        this.isSendWechat = isSendWechat;
    }

    /**
     * @return SEND_WECHAT_TIME
     */
    public Date getSendWechatTime() {
        return sendWechatTime;
    }

    /**
     * @param sendWechatTime
     */
    public void setSendWechatTime(Date sendWechatTime) {
        this.sendWechatTime = sendWechatTime;
    }

    /**
     * @return LOCK_USER_ID
     */
    public Integer getLockUserId() {
        return lockUserId;
    }

    /**
     * @param lockUserId
     */
    public void setLockUserId(Integer lockUserId) {
        this.lockUserId = lockUserId;
    }

    /**
     * @return LOCK_DUE_DATE
     */
    public Date getLockDueDate() {
        return lockDueDate;
    }

    /**
     * @param lockDueDate
     */
    public void setLockDueDate(Date lockDueDate) {
        this.lockDueDate = lockDueDate;
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
     * @return FROM_PATIENT_FEEDBACK
     */
    public String getFromPatientFeedback() {
        return fromPatientFeedback;
    }

    /**
     * @param fromPatientFeedback
     */
    public void setFromPatientFeedback(String fromPatientFeedback) {
        this.fromPatientFeedback = fromPatientFeedback;
    }

    /**
     * 获取客服或者医生对患者的备注信息
     *
     * @return TO_PATIENT_FEEDBACK - 客服或者医生对患者的备注信息
     */
    public String getToPatientFeedback() {
        return toPatientFeedback;
    }

    /**
     * 设置客服或者医生对患者的备注信息
     *
     * @param toPatientFeedback 客服或者医生对患者的备注信息
     */
    public void setToPatientFeedback(String toPatientFeedback) {
        this.toPatientFeedback = toPatientFeedback;
    }
}