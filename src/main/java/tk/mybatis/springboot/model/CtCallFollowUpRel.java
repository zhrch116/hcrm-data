package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_CALL_FOLLOW_UP_REL")
public class CtCallFollowUpRel {
    /**
     * 云呼叫返回的本次呼叫ID
     */
    @Id
    @Column(name = "CALL_FOLLOW_UP_REL_KEY_ID")
    private Integer callFollowUpRelKeyId;

    @Column(name = "FOLLOW_UP_TASK_KEY_ID")
    private Integer followUpTaskKeyId;

    /**
     * 云呼叫返回的本次呼叫ID
     */
    @Column(name = "CALL_ID")
    private Integer callId;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Integer isEnable;

    /**
     * 获取云呼叫返回的本次呼叫ID
     *
     * @return CALL_FOLLOW_UP_REL_KEY_ID - 云呼叫返回的本次呼叫ID
     */
    public Integer getCallFollowUpRelKeyId() {
        return callFollowUpRelKeyId;
    }

    /**
     * 设置云呼叫返回的本次呼叫ID
     *
     * @param callFollowUpRelKeyId 云呼叫返回的本次呼叫ID
     */
    public void setCallFollowUpRelKeyId(Integer callFollowUpRelKeyId) {
        this.callFollowUpRelKeyId = callFollowUpRelKeyId;
    }

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
     * 获取云呼叫返回的本次呼叫ID
     *
     * @return CALL_ID - 云呼叫返回的本次呼叫ID
     */
    public Integer getCallId() {
        return callId;
    }

    /**
     * 设置云呼叫返回的本次呼叫ID
     *
     * @param callId 云呼叫返回的本次呼叫ID
     */
    public void setCallId(Integer callId) {
        this.callId = callId;
    }

    /**
     * 获取标记该条记录是否可用，0：不可用；1：可用；
     *
     * @return IS_ENABLE - 标记该条记录是否可用，0：不可用；1：可用；
     */
    public Integer getIsEnable() {
        return isEnable;
    }

    /**
     * 设置标记该条记录是否可用，0：不可用；1：可用；
     *
     * @param isEnable 标记该条记录是否可用，0：不可用；1：可用；
     */
    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }
}