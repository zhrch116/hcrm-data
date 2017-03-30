package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ETL_IMPORT_RECORD")
public class CtEtlImportRecord {
    @Id
    @Column(name = "ETL_IMPORT_RECORD_KEY_ID")
    private Integer etlImportRecordKeyId;

    /**
     * 日志ID
     */
    @Column(name = "LOG_ID")
    private Integer logId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "IMPORT_INSERT_COUNT")
    private Integer importInsertCount;

    @Column(name = "IMPORT_UPDATE_COUNT")
    private Integer importUpdateCount;

    @Column(name = "IMPORT_DATE")
    private Date importDate;

    /**
     * 0：不可用；1：可用
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return ETL_IMPORT_RECORD_KEY_ID
     */
    public Integer getEtlImportRecordKeyId() {
        return etlImportRecordKeyId;
    }

    /**
     * @param etlImportRecordKeyId
     */
    public void setEtlImportRecordKeyId(Integer etlImportRecordKeyId) {
        this.etlImportRecordKeyId = etlImportRecordKeyId;
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
     * @return IMPORT_INSERT_COUNT
     */
    public Integer getImportInsertCount() {
        return importInsertCount;
    }

    /**
     * @param importInsertCount
     */
    public void setImportInsertCount(Integer importInsertCount) {
        this.importInsertCount = importInsertCount;
    }

    /**
     * @return IMPORT_UPDATE_COUNT
     */
    public Integer getImportUpdateCount() {
        return importUpdateCount;
    }

    /**
     * @param importUpdateCount
     */
    public void setImportUpdateCount(Integer importUpdateCount) {
        this.importUpdateCount = importUpdateCount;
    }

    /**
     * @return IMPORT_DATE
     */
    public Date getImportDate() {
        return importDate;
    }

    /**
     * @param importDate
     */
    public void setImportDate(Date importDate) {
        this.importDate = importDate;
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
}