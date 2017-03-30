package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_VISIT_REMINDER_PUSH_RECORD")
public class CtVisitReminderPushRecord {
    @Id
    @Column(name = "VISIT_REMINDER_PUSH_KEY_ID")
    private Integer visitReminderPushKeyId;

    @Column(name = "TREATMENT_PLAN_KEY_ID")
    private Integer treatmentPlanKeyId;

    /**
     * 复诊提醒信息（前一天/当天）对应的预计推送时间
     */
    @Column(name = "VISIT_PLAN_PUSH_DATETIME")
    private Date visitPlanPushDatetime;

    /**
     * 0：未获取；1：已获取；
     */
    @Column(name = "IS_APP_GET")
    private Integer isAppGet;

    /**
     * 复诊提醒信息（前一天/当天）对应的实际推送时间
     */
    @Column(name = "VISIT_REAL_PUSH_DATETIME")
    private Date visitRealPushDatetime;

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
     * @return VISIT_REMINDER_PUSH_KEY_ID
     */
    public Integer getVisitReminderPushKeyId() {
        return visitReminderPushKeyId;
    }

    /**
     * @param visitReminderPushKeyId
     */
    public void setVisitReminderPushKeyId(Integer visitReminderPushKeyId) {
        this.visitReminderPushKeyId = visitReminderPushKeyId;
    }

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
     * 获取复诊提醒信息（前一天/当天）对应的预计推送时间
     *
     * @return VISIT_PLAN_PUSH_DATETIME - 复诊提醒信息（前一天/当天）对应的预计推送时间
     */
    public Date getVisitPlanPushDatetime() {
        return visitPlanPushDatetime;
    }

    /**
     * 设置复诊提醒信息（前一天/当天）对应的预计推送时间
     *
     * @param visitPlanPushDatetime 复诊提醒信息（前一天/当天）对应的预计推送时间
     */
    public void setVisitPlanPushDatetime(Date visitPlanPushDatetime) {
        this.visitPlanPushDatetime = visitPlanPushDatetime;
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
     * 获取复诊提醒信息（前一天/当天）对应的实际推送时间
     *
     * @return VISIT_REAL_PUSH_DATETIME - 复诊提醒信息（前一天/当天）对应的实际推送时间
     */
    public Date getVisitRealPushDatetime() {
        return visitRealPushDatetime;
    }

    /**
     * 设置复诊提醒信息（前一天/当天）对应的实际推送时间
     *
     * @param visitRealPushDatetime 复诊提醒信息（前一天/当天）对应的实际推送时间
     */
    public void setVisitRealPushDatetime(Date visitRealPushDatetime) {
        this.visitRealPushDatetime = visitRealPushDatetime;
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