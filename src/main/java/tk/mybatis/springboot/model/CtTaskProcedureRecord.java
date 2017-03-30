package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_TASK_PROCEDURE_RECORD")
public class CtTaskProcedureRecord {
    @Id
    @Column(name = "TASK_PROCEDURE_KEY_ID")
    private Integer taskProcedureKeyId;

    @Column(name = "FOLLOW_UP_TASK_KEY_ID")
    private Integer followUpTaskKeyId;

    @Column(name = "OPERATION_STEP_CODE")
    private String operationStepCode;

    @Column(name = "OPERATION_STEP_NAME")
    private String operationStepName;

    @Column(name = "OPERATION_STEP_DETAIL_CODE")
    private String operationStepDetailCode;

    @Column(name = "OPERATION_STEP_DETAIL_NAME")
    private String operationStepDetailName;

    @Column(name = "OPERATION_STEP_DETAIL_REMARK")
    private String operationStepDetailRemark;

    @Column(name = "BEFORE_OPERATION_TASK_STATUS_CODE")
    private String beforeOperationTaskStatusCode;

    @Column(name = "BEFORE_OPERATION_TASK_STATUS_NAME")
    private String beforeOperationTaskStatusName;

    @Column(name = "AFTER_OPERATION_TASK_STATUS_CODE")
    private String afterOperationTaskStatusCode;

    @Column(name = "AFTER_OPERATION_TASK_STATUS_NAME")
    private String afterOperationTaskStatusName;

    @Column(name = "OPERATION_TIME")
    private Date operationTime;

    @Column(name = "PROCEDURE_ORDER")
    private Integer procedureOrder;

    /**
     * PC随访时，存用户ID；APP随访/微信随访时，该字段存null就好。
     */
    @Column(name = "OPERATER_ID")
    private String operaterId;

    @Column(name = "OPERATER_NAME")
    private String operaterName;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return TASK_PROCEDURE_KEY_ID
     */
    public Integer getTaskProcedureKeyId() {
        return taskProcedureKeyId;
    }

    /**
     * @param taskProcedureKeyId
     */
    public void setTaskProcedureKeyId(Integer taskProcedureKeyId) {
        this.taskProcedureKeyId = taskProcedureKeyId;
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
     * @return OPERATION_STEP_CODE
     */
    public String getOperationStepCode() {
        return operationStepCode;
    }

    /**
     * @param operationStepCode
     */
    public void setOperationStepCode(String operationStepCode) {
        this.operationStepCode = operationStepCode;
    }

    /**
     * @return OPERATION_STEP_NAME
     */
    public String getOperationStepName() {
        return operationStepName;
    }

    /**
     * @param operationStepName
     */
    public void setOperationStepName(String operationStepName) {
        this.operationStepName = operationStepName;
    }

    /**
     * @return OPERATION_STEP_DETAIL_CODE
     */
    public String getOperationStepDetailCode() {
        return operationStepDetailCode;
    }

    /**
     * @param operationStepDetailCode
     */
    public void setOperationStepDetailCode(String operationStepDetailCode) {
        this.operationStepDetailCode = operationStepDetailCode;
    }

    /**
     * @return OPERATION_STEP_DETAIL_NAME
     */
    public String getOperationStepDetailName() {
        return operationStepDetailName;
    }

    /**
     * @param operationStepDetailName
     */
    public void setOperationStepDetailName(String operationStepDetailName) {
        this.operationStepDetailName = operationStepDetailName;
    }

    /**
     * @return OPERATION_STEP_DETAIL_REMARK
     */
    public String getOperationStepDetailRemark() {
        return operationStepDetailRemark;
    }

    /**
     * @param operationStepDetailRemark
     */
    public void setOperationStepDetailRemark(String operationStepDetailRemark) {
        this.operationStepDetailRemark = operationStepDetailRemark;
    }

    /**
     * @return BEFORE_OPERATION_TASK_STATUS_CODE
     */
    public String getBeforeOperationTaskStatusCode() {
        return beforeOperationTaskStatusCode;
    }

    /**
     * @param beforeOperationTaskStatusCode
     */
    public void setBeforeOperationTaskStatusCode(String beforeOperationTaskStatusCode) {
        this.beforeOperationTaskStatusCode = beforeOperationTaskStatusCode;
    }

    /**
     * @return BEFORE_OPERATION_TASK_STATUS_NAME
     */
    public String getBeforeOperationTaskStatusName() {
        return beforeOperationTaskStatusName;
    }

    /**
     * @param beforeOperationTaskStatusName
     */
    public void setBeforeOperationTaskStatusName(String beforeOperationTaskStatusName) {
        this.beforeOperationTaskStatusName = beforeOperationTaskStatusName;
    }

    /**
     * @return AFTER_OPERATION_TASK_STATUS_CODE
     */
    public String getAfterOperationTaskStatusCode() {
        return afterOperationTaskStatusCode;
    }

    /**
     * @param afterOperationTaskStatusCode
     */
    public void setAfterOperationTaskStatusCode(String afterOperationTaskStatusCode) {
        this.afterOperationTaskStatusCode = afterOperationTaskStatusCode;
    }

    /**
     * @return AFTER_OPERATION_TASK_STATUS_NAME
     */
    public String getAfterOperationTaskStatusName() {
        return afterOperationTaskStatusName;
    }

    /**
     * @param afterOperationTaskStatusName
     */
    public void setAfterOperationTaskStatusName(String afterOperationTaskStatusName) {
        this.afterOperationTaskStatusName = afterOperationTaskStatusName;
    }

    /**
     * @return OPERATION_TIME
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * @param operationTime
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    /**
     * @return PROCEDURE_ORDER
     */
    public Integer getProcedureOrder() {
        return procedureOrder;
    }

    /**
     * @param procedureOrder
     */
    public void setProcedureOrder(Integer procedureOrder) {
        this.procedureOrder = procedureOrder;
    }

    /**
     * 获取PC随访时，存用户ID；APP随访/微信随访时，该字段存null就好。
     *
     * @return OPERATER_ID - PC随访时，存用户ID；APP随访/微信随访时，该字段存null就好。
     */
    public String getOperaterId() {
        return operaterId;
    }

    /**
     * 设置PC随访时，存用户ID；APP随访/微信随访时，该字段存null就好。
     *
     * @param operaterId PC随访时，存用户ID；APP随访/微信随访时，该字段存null就好。
     */
    public void setOperaterId(String operaterId) {
        this.operaterId = operaterId;
    }

    /**
     * @return OPERATER_NAME
     */
    public String getOperaterName() {
        return operaterName;
    }

    /**
     * @param operaterName
     */
    public void setOperaterName(String operaterName) {
        this.operaterName = operaterName;
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