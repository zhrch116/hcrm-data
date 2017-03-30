package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_MEDICATION_REMINDER_RULE")
public class CtMedicationReminderRule {
    @Id
    @Column(name = "MEDICATION_REMINDER_RULE_KEY_ID")
    private Integer medicationReminderRuleKeyId;

    @Column(name = "MEDICATION_REMINDER_KEY_ID")
    private Integer medicationReminderKeyId;

    @Column(name = "MEDICATION_NAME")
    private String medicationName;

    @Column(name = "MEDICATION_PURPOSE")
    private String medicationPurpose;

    @Column(name = "USAGE_AND_DOSAGE")
    private String usageAndDosage;

    @Column(name = "BEGIN_DATE")
    private Date beginDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "FREQUENCY_TYPE_CODE")
    private String frequencyTypeCode;

    @Column(name = "FREQUENCY_TYPE_NAME")
    private String frequencyTypeName;

    @Column(name = "FREQUENCY_VALUE")
    private Integer frequencyValue;

    @Column(name = "WEEKDAY_LIST")
    private String weekdayList;

    @Column(name = "TIMING_LIST")
    private String timingList;

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

    @Column(name = "ATTENTION_ITEM")
    private String attentionItem;

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
     * @return MEDICATION_REMINDER_KEY_ID
     */
    public Integer getMedicationReminderKeyId() {
        return medicationReminderKeyId;
    }

    /**
     * @param medicationReminderKeyId
     */
    public void setMedicationReminderKeyId(Integer medicationReminderKeyId) {
        this.medicationReminderKeyId = medicationReminderKeyId;
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
     * @return BEGIN_DATE
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * @param beginDate
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * @return END_DATE
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return FREQUENCY_TYPE_CODE
     */
    public String getFrequencyTypeCode() {
        return frequencyTypeCode;
    }

    /**
     * @param frequencyTypeCode
     */
    public void setFrequencyTypeCode(String frequencyTypeCode) {
        this.frequencyTypeCode = frequencyTypeCode;
    }

    /**
     * @return FREQUENCY_TYPE_NAME
     */
    public String getFrequencyTypeName() {
        return frequencyTypeName;
    }

    /**
     * @param frequencyTypeName
     */
    public void setFrequencyTypeName(String frequencyTypeName) {
        this.frequencyTypeName = frequencyTypeName;
    }

    /**
     * @return FREQUENCY_VALUE
     */
    public Integer getFrequencyValue() {
        return frequencyValue;
    }

    /**
     * @param frequencyValue
     */
    public void setFrequencyValue(Integer frequencyValue) {
        this.frequencyValue = frequencyValue;
    }

    /**
     * @return WEEKDAY_LIST
     */
    public String getWeekdayList() {
        return weekdayList;
    }

    /**
     * @param weekdayList
     */
    public void setWeekdayList(String weekdayList) {
        this.weekdayList = weekdayList;
    }

    /**
     * @return TIMING_LIST
     */
    public String getTimingList() {
        return timingList;
    }

    /**
     * @param timingList
     */
    public void setTimingList(String timingList) {
        this.timingList = timingList;
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