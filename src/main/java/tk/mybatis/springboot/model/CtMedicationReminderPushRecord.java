package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_MEDICATION_REMINDER_PUSH_RECORD")
public class CtMedicationReminderPushRecord {
    @Id
    @Column(name = "MEDICATION_REMINDER_PUSH_KEY_ID")
    private Integer medicationReminderPushKeyId;

    @Column(name = "MEDICATION_REMINDER_RULE_KEY_ID")
    private Integer medicationReminderRuleKeyId;

    @Column(name = "MEDICATION_NAME")
    private String medicationName;

    @Column(name = "MEDICATION_PURPOSE")
    private String medicationPurpose;

    @Column(name = "USAGE_AND_DOSAGE")
    private String usageAndDosage;

    @Column(name = "PLAN_PUSH_DATETIME")
    private Date planPushDatetime;

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

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "ATTENTION_ITEM")
    private String attentionItem;

    /**
     * @return MEDICATION_REMINDER_PUSH_KEY_ID
     */
    public Integer getMedicationReminderPushKeyId() {
        return medicationReminderPushKeyId;
    }

    /**
     * @param medicationReminderPushKeyId
     */
    public void setMedicationReminderPushKeyId(Integer medicationReminderPushKeyId) {
        this.medicationReminderPushKeyId = medicationReminderPushKeyId;
    }

    /**
     * @return MEDICATION_REMINDER_RULE_KEY_ID
     */
    public Integer getMedicationReminderRuleKeyId() {
        return medicationReminderRuleKeyId;
    }

    /**
     * @param medicationReminderRuleKeyId
     */
    public void setMedicationReminderRuleKeyId(Integer medicationReminderRuleKeyId) {
        this.medicationReminderRuleKeyId = medicationReminderRuleKeyId;
    }

    /**
     * @return MEDICATION_NAME
     */
    public String getMedicationName() {
        return medicationName;
    }

    /**
     * @param medicationName
     */
    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    /**
     * @return MEDICATION_PURPOSE
     */
    public String getMedicationPurpose() {
        return medicationPurpose;
    }

    /**
     * @param medicationPurpose
     */
    public void setMedicationPurpose(String medicationPurpose) {
        this.medicationPurpose = medicationPurpose;
    }

    /**
     * @return USAGE_AND_DOSAGE
     */
    public String getUsageAndDosage() {
        return usageAndDosage;
    }

    /**
     * @param usageAndDosage
     */
    public void setUsageAndDosage(String usageAndDosage) {
        this.usageAndDosage = usageAndDosage;
    }

    /**
     * @return PLAN_PUSH_DATETIME
     */
    public Date getPlanPushDatetime() {
        return planPushDatetime;
    }

    /**
     * @param planPushDatetime
     */
    public void setPlanPushDatetime(Date planPushDatetime) {
        this.planPushDatetime = planPushDatetime;
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

    /**
     * @return ATTENTION_ITEM
     */
    public String getAttentionItem() {
        return attentionItem;
    }

    /**
     * @param attentionItem
     */
    public void setAttentionItem(String attentionItem) {
        this.attentionItem = attentionItem;
    }
}