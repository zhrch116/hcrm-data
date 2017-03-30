package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ETL_PHYSICAL_RECORD")
public class CtEtlPhysicalRecord {
    @Id
    @Column(name = "PHYSICAL_KEY_ID")
    private Integer physicalKeyId;

    @Column(name = "HOS_PHYSICAL_KEY_ID")
    private Integer hosPhysicalKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "HOSPITAL_PATIENT_ID")
    private String hospitalPatientId;

    @Column(name = "PHYSICAL_NUMBER")
    private String physicalNumber;

    @Column(name = "PHYSICAL_TIME")
    private Date physicalTime;

    @Column(name = "TOTAL_INSPECTION_DOCTOR_CODE")
    private String totalInspectionDoctorCode;

    @Column(name = "TOTAL_INSPECTION_DOCTOR_NAME")
    private String totalInspectionDoctorName;

    @Column(name = "TOTAL_INSPECTION_TIME")
    private Date totalInspectionTime;

    /**
     * 0：未归档；1：已归档；
     */
    @Column(name = "IS_FILED")
    private Integer isFiled;

    @Column(name = "FILE_TIME")
    private Date fileTime;

    /**
     * 本行数据创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

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

    @Column(name = "OVERVIEW")
    private String overview;

    @Column(name = "SUGGEST")
    private String suggest;

    /**
     * @return PHYSICAL_KEY_ID
     */
    public Integer getPhysicalKeyId() {
        return physicalKeyId;
    }

    /**
     * @param physicalKeyId
     */
    public void setPhysicalKeyId(Integer physicalKeyId) {
        this.physicalKeyId = physicalKeyId;
    }

    /**
     * @return HOS_PHYSICAL_KEY_ID
     */
    public Integer getHosPhysicalKeyId() {
        return hosPhysicalKeyId;
    }

    /**
     * @param hosPhysicalKeyId
     */
    public void setHosPhysicalKeyId(Integer hosPhysicalKeyId) {
        this.hosPhysicalKeyId = hosPhysicalKeyId;
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
     * @return HOSPITAL_PATIENT_ID
     */
    public String getHospitalPatientId() {
        return hospitalPatientId;
    }

    /**
     * @param hospitalPatientId
     */
    public void setHospitalPatientId(String hospitalPatientId) {
        this.hospitalPatientId = hospitalPatientId;
    }

    /**
     * @return PHYSICAL_NUMBER
     */
    public String getPhysicalNumber() {
        return physicalNumber;
    }

    /**
     * @param physicalNumber
     */
    public void setPhysicalNumber(String physicalNumber) {
        this.physicalNumber = physicalNumber;
    }

    /**
     * @return PHYSICAL_TIME
     */
    public Date getPhysicalTime() {
        return physicalTime;
    }

    /**
     * @param physicalTime
     */
    public void setPhysicalTime(Date physicalTime) {
        this.physicalTime = physicalTime;
    }

    /**
     * @return TOTAL_INSPECTION_DOCTOR_CODE
     */
    public String getTotalInspectionDoctorCode() {
        return totalInspectionDoctorCode;
    }

    /**
     * @param totalInspectionDoctorCode
     */
    public void setTotalInspectionDoctorCode(String totalInspectionDoctorCode) {
        this.totalInspectionDoctorCode = totalInspectionDoctorCode;
    }

    /**
     * @return TOTAL_INSPECTION_DOCTOR_NAME
     */
    public String getTotalInspectionDoctorName() {
        return totalInspectionDoctorName;
    }

    /**
     * @param totalInspectionDoctorName
     */
    public void setTotalInspectionDoctorName(String totalInspectionDoctorName) {
        this.totalInspectionDoctorName = totalInspectionDoctorName;
    }

    /**
     * @return TOTAL_INSPECTION_TIME
     */
    public Date getTotalInspectionTime() {
        return totalInspectionTime;
    }

    /**
     * @param totalInspectionTime
     */
    public void setTotalInspectionTime(Date totalInspectionTime) {
        this.totalInspectionTime = totalInspectionTime;
    }

    /**
     * 获取0：未归档；1：已归档；
     *
     * @return IS_FILED - 0：未归档；1：已归档；
     */
    public Integer getIsFiled() {
        return isFiled;
    }

    /**
     * 设置0：未归档；1：已归档；
     *
     * @param isFiled 0：未归档；1：已归档；
     */
    public void setIsFiled(Integer isFiled) {
        this.isFiled = isFiled;
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
     * @return OVERVIEW
     */
    public String getOverview() {
        return overview;
    }

    /**
     * @param overview
     */
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     * @return SUGGEST
     */
    public String getSuggest() {
        return suggest;
    }

    /**
     * @param suggest
     */
    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }
}