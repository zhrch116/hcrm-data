package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ETL_ERROR_DATA_RECORD")
public class CtEtlErrorDataRecord {
    @Id
    @Column(name = "ETL_ERROR_DATA_RECORD_KEY_ID")
    private Integer etlErrorDataRecordKeyId;

    /**
     * 日志ID
     */
    @Column(name = "LOG_ID")
    private Integer logId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "ETL_STEP_NAME")
    private String etlStepName;

    @Column(name = "ERROR_COLUMN_NAME")
    private String errorColumnName;

    @Column(name = "ERROR_CODE")
    private String errorCode;

    @Column(name = "IMPORT_DATETIME")
    private Date importDatetime;

    @Column(name = "CLOUD_ETL_VERSION")
    private String cloudEtlVersion;

    /**
     * 0：未处理；1：已处理；
     */
    @Column(name = "IS_DEAL")
    private Byte isDeal;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 0：不可用；1：可用
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    @Column(name = "ERROR_DESCRIPTION")
    private String errorDescription;

    @Column(name = "IMPORT_ERROR_DATA")
    private String importErrorData;

    /**
     * @return ETL_ERROR_DATA_RECORD_KEY_ID
     */
    public Integer getEtlErrorDataRecordKeyId() {
        return etlErrorDataRecordKeyId;
    }

    /**
     * @param etlErrorDataRecordKeyId
     */
    public void setEtlErrorDataRecordKeyId(Integer etlErrorDataRecordKeyId) {
        this.etlErrorDataRecordKeyId = etlErrorDataRecordKeyId;
    }

    /**
     * 获取日志ID
     *
     * @return LOG_ID - 日志ID
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * 设置日志ID
     *
     * @param logId 日志ID
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
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
     * @return TABLE_NAME
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return ETL_STEP_NAME
     */
    public String getEtlStepName() {
        return etlStepName;
    }

    /**
     * @param etlStepName
     */
    public void setEtlStepName(String etlStepName) {
        this.etlStepName = etlStepName;
    }

    /**
     * @return ERROR_COLUMN_NAME
     */
    public String getErrorColumnName() {
        return errorColumnName;
    }

    /**
     * @param errorColumnName
     */
    public void setErrorColumnName(String errorColumnName) {
        this.errorColumnName = errorColumnName;
    }

    /**
     * @return ERROR_CODE
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return IMPORT_DATETIME
     */
    public Date getImportDatetime() {
        return importDatetime;
    }

    /**
     * @param importDatetime
     */
    public void setImportDatetime(Date importDatetime) {
        this.importDatetime = importDatetime;
    }

    /**
     * @return CLOUD_ETL_VERSION
     */
    public String getCloudEtlVersion() {
        return cloudEtlVersion;
    }

    /**
     * @param cloudEtlVersion
     */
    public void setCloudEtlVersion(String cloudEtlVersion) {
        this.cloudEtlVersion = cloudEtlVersion;
    }

    /**
     * 获取0：未处理；1：已处理；
     *
     * @return IS_DEAL - 0：未处理；1：已处理；
     */
    public Byte getIsDeal() {
        return isDeal;
    }

    /**
     * 设置0：未处理；1：已处理；
     *
     * @param isDeal 0：未处理；1：已处理；
     */
    public void setIsDeal(Byte isDeal) {
        this.isDeal = isDeal;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取0：不可用；1：可用
     *
     * @return IS_ENABLE - 0：不可用；1：可用
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * 设置0：不可用；1：可用
     *
     * @param isEnable 0：不可用；1：可用
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * @return ERROR_DESCRIPTION
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * @param errorDescription
     */
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * @return IMPORT_ERROR_DATA
     */
    public String getImportErrorData() {
        return importErrorData;
    }

    /**
     * @param importErrorData
     */
    public void setImportErrorData(String importErrorData) {
        this.importErrorData = importErrorData;
    }
}