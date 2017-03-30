package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_OPERATION_HISTORY")
public class CtOperationHistory {
    @Id
    @Column(name = "OPERATION_HISTORY_KEY_ID")
    private Integer operationHistoryKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "OPERATION_NAME")
    private String operationName;

    @Column(name = "OPERATION_TIME")
    private Date operationTime;

    @Column(name = "OPERATION_DIAGNOSIS")
    private String operationDiagnosis;

    /**
     * 见字典007
     */
    @Column(name = "DATA_SOURCE_CODE")
    private String dataSourceCode;

    @Column(name = "REMARK")
    private String remark;

    /**
     * @return OPERATION_HISTORY_KEY_ID
     */
    public Integer getOperationHistoryKeyId() {
        return operationHistoryKeyId;
    }

    /**
     * @param operationHistoryKeyId
     */
    public void setOperationHistoryKeyId(Integer operationHistoryKeyId) {
        this.operationHistoryKeyId = operationHistoryKeyId;
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
     * @return OPERATION_NAME
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * @param operationName
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
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
     * @return OPERATION_DIAGNOSIS
     */
    public String getOperationDiagnosis() {
        return operationDiagnosis;
    }

    /**
     * @param operationDiagnosis
     */
    public void setOperationDiagnosis(String operationDiagnosis) {
        this.operationDiagnosis = operationDiagnosis;
    }

    /**
     * 获取见字典007
     *
     * @return DATA_SOURCE_CODE - 见字典007
     */
    public String getDataSourceCode() {
        return dataSourceCode;
    }

    /**
     * 设置见字典007
     *
     * @param dataSourceCode 见字典007
     */
    public void setDataSourceCode(String dataSourceCode) {
        this.dataSourceCode = dataSourceCode;
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
}