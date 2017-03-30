package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ETL_PHYSICAL_SUMMARY_RECORD")
public class CtEtlPhysicalSummaryRecord {
    @Id
    @Column(name = "PHYSICAL_SUMMARY_KEY_ID")
    private Integer physicalSummaryKeyId;

    @Column(name = "HOS_PHYSICAL_SUMMARY_KEY_ID")
    private Integer hosPhysicalSummaryKeyId;

    @Column(name = "PHYSICAL_KEY_ID")
    private Integer physicalKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "PHYSICAL_SUMMARY_ID")
    private String physicalSummaryId;

    @Column(name = "ITEM_CLASS_CODE")
    private String itemClassCode;

    @Column(name = "ITEM_CLASS_NAME")
    private String itemClassName;

    @Column(name = "DOCTOR_CODE")
    private String doctorCode;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    @Column(name = "PHYSICAL_SUMMARY_TIME")
    private Date physicalSummaryTime;

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

    @Column(name = "PHYSICAL_SUMMARY")
    private String physicalSummary;

    /**
     * @return PHYSICAL_SUMMARY_KEY_ID
     */
    public Integer getPhysicalSummaryKeyId() {
        return physicalSummaryKeyId;
    }

    /**
     * @param physicalSummaryKeyId
     */
    public void setPhysicalSummaryKeyId(Integer physicalSummaryKeyId) {
        this.physicalSummaryKeyId = physicalSummaryKeyId;
    }

    /**
     * @return HOS_PHYSICAL_SUMMARY_KEY_ID
     */
    public Integer getHosPhysicalSummaryKeyId() {
        return hosPhysicalSummaryKeyId;
    }

    /**
     * @param hosPhysicalSummaryKeyId
     */
    public void setHosPhysicalSummaryKeyId(Integer hosPhysicalSummaryKeyId) {
        this.hosPhysicalSummaryKeyId = hosPhysicalSummaryKeyId;
    }

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
     * @return PHYSICAL_SUMMARY_ID
     */
    public String getPhysicalSummaryId() {
        return physicalSummaryId;
    }

    /**
     * @param physicalSummaryId
     */
    public void setPhysicalSummaryId(String physicalSummaryId) {
        this.physicalSummaryId = physicalSummaryId;
    }

    /**
     * @return ITEM_CLASS_CODE
     */
    public String getItemClassCode() {
        return itemClassCode;
    }

    /**
     * @param itemClassCode
     */
    public void setItemClassCode(String itemClassCode) {
        this.itemClassCode = itemClassCode;
    }

    /**
     * @return ITEM_CLASS_NAME
     */
    public String getItemClassName() {
        return itemClassName;
    }

    /**
     * @param itemClassName
     */
    public void setItemClassName(String itemClassName) {
        this.itemClassName = itemClassName;
    }

    /**
     * @return DOCTOR_CODE
     */
    public String getDoctorCode() {
        return doctorCode;
    }

    /**
     * @param doctorCode
     */
    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    /**
     * @return DOCTOR_NAME
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * @param doctorName
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    /**
     * @return PHYSICAL_SUMMARY_TIME
     */
    public Date getPhysicalSummaryTime() {
        return physicalSummaryTime;
    }

    /**
     * @param physicalSummaryTime
     */
    public void setPhysicalSummaryTime(Date physicalSummaryTime) {
        this.physicalSummaryTime = physicalSummaryTime;
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
     * @return PHYSICAL_SUMMARY
     */
    public String getPhysicalSummary() {
        return physicalSummary;
    }

    /**
     * @param physicalSummary
     */
    public void setPhysicalSummary(String physicalSummary) {
        this.physicalSummary = physicalSummary;
    }
}