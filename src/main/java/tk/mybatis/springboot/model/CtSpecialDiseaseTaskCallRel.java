package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_SPECIAL_DISEASE_TASK_CALL_REL")
public class CtSpecialDiseaseTaskCallRel {
    @Id
    @Column(name = "TASK_CALL_REL_KEY_ID")
    private Integer taskCallRelKeyId;

    @Column(name = "TASK_KEY_ID")
    private Integer taskKeyId;

    @Column(name = "CALL_ID")
    private Integer callId;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Integer isEnable;

    /**
     * @return TASK_CALL_REL_KEY_ID
     */
    public Integer getTaskCallRelKeyId() {
        return taskCallRelKeyId;
    }

    /**
     * @param taskCallRelKeyId
     */
    public void setTaskCallRelKeyId(Integer taskCallRelKeyId) {
        this.taskCallRelKeyId = taskCallRelKeyId;
    }

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
     * @return CALL_ID
     */
    public Integer getCallId() {
        return callId;
    }

    /**
     * @param callId
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