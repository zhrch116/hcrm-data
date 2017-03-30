package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_FILE_RECORD")
public class CtFileRecord {
    @Id
    @Column(name = "FILE_RECORD_KEY_ID")
    private Integer fileRecordKeyId;

    @Column(name = "FILE_TABLE_NAME")
    private String fileTableName;

    @Column(name = "FILE_TABLE_KEY_ID")
    private Integer fileTableKeyId;

    /**
     * 见字典表
     */
    @Column(name = "PATIENT_INFO_SOURDE_CODE")
    private String patientInfoSourdeCode;

    @Column(name = "PATIENT_INFO_SOURDE_NAME")
    private String patientInfoSourdeName;

    @Column(name = "SOURCE_TABLE_NAME")
    private String sourceTableName;

    @Column(name = "SOURDE_KEY_ID")
    private Integer sourdeKeyId;

    @Column(name = "FILE_TIME")
    private Date fileTime;

    @Column(name = "UNFILED_TIME")
    private Date unfiledTime;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return FILE_RECORD_KEY_ID
     */
    public Integer getFileRecordKeyId() {
        return fileRecordKeyId;
    }

    /**
     * @param fileRecordKeyId
     */
    public void setFileRecordKeyId(Integer fileRecordKeyId) {
        this.fileRecordKeyId = fileRecordKeyId;
    }

    /**
     * @return FILE_TABLE_NAME
     */
    public String getFileTableName() {
        return fileTableName;
    }

    /**
     * @param fileTableName
     */
    public void setFileTableName(String fileTableName) {
        this.fileTableName = fileTableName;
    }

    /**
     * @return FILE_TABLE_KEY_ID
     */
    public Integer getFileTableKeyId() {
        return fileTableKeyId;
    }

    /**
     * @param fileTableKeyId
     */
    public void setFileTableKeyId(Integer fileTableKeyId) {
        this.fileTableKeyId = fileTableKeyId;
    }

    /**
     * 获取见字典表
     *
     * @return PATIENT_INFO_SOURDE_CODE - 见字典表
     */
    public String getPatientInfoSourdeCode() {
        return patientInfoSourdeCode;
    }

    /**
     * 设置见字典表
     *
     * @param patientInfoSourdeCode 见字典表
     */
    public void setPatientInfoSourdeCode(String patientInfoSourdeCode) {
        this.patientInfoSourdeCode = patientInfoSourdeCode;
    }

    /**
     * @return PATIENT_INFO_SOURDE_NAME
     */
    public String getPatientInfoSourdeName() {
        return patientInfoSourdeName;
    }

    /**
     * @param patientInfoSourdeName
     */
    public void setPatientInfoSourdeName(String patientInfoSourdeName) {
        this.patientInfoSourdeName = patientInfoSourdeName;
    }

    /**
     * @return SOURCE_TABLE_NAME
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    /**
     * @param sourceTableName
     */
    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    /**
     * @return SOURDE_KEY_ID
     */
    public Integer getSourdeKeyId() {
        return sourdeKeyId;
    }

    /**
     * @param sourdeKeyId
     */
    public void setSourdeKeyId(Integer sourdeKeyId) {
        this.sourdeKeyId = sourdeKeyId;
    }

    /**
     * @return FILE_TIME
     */
    public Date getFileTime() {
        return fileTime;
    }

    /**
     * @param fileTime
     */
    public void setFileTime(Date fileTime) {
        this.fileTime = fileTime;
    }

    /**
     * @return UNFILED_TIME
     */
    public Date getUnfiledTime() {
        return unfiledTime;
    }

    /**
     * @param unfiledTime
     */
    public void setUnfiledTime(Date unfiledTime) {
        this.unfiledTime = unfiledTime;
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