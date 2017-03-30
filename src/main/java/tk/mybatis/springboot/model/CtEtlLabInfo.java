package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ETL_LAB_INFO")
public class CtEtlLabInfo {
    @Id
    @Column(name = "LAB_KEY_ID")
    private Integer labKeyId;

    @Column(name = "HOS_LAB_KEY_ID")
    private Integer hosLabKeyId;

    /**
     * 当本条记录就诊类别为「住院」时，存储的是病人档案住院记录表的对应数据的主键ID；当本条记录就诊类别为「门诊」时，存储的是病人档案门诊记录表的对应数据的主键ID；
     */
    @Column(name = "VISIT_RECORD_KEY_ID")
    private Integer visitRecordKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "HOSPITAL_PATIENT_ID")
    private String hospitalPatientId;

    @Column(name = "VISIT_ID")
    private String visitId;

    @Column(name = "REGISTERED_NO")
    private String registeredNo;

    @Column(name = "PATIENT_SOURCE")
    private String patientSource;

    @Column(name = "LAB_NO")
    private String labNo;

    @Column(name = "LAB_NAME")
    private String labName;

    @Column(name = "SPECIMEN_TYPE")
    private String specimenType;

    @Column(name = "DOCTOR_CODE")
    private String doctorCode;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    @Column(name = "DEPT_CODE")
    private String deptCode;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "LAB_DATE")
    private Date labDate;

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

    /**
     * @return LAB_KEY_ID
     */
    public Integer getLabKeyId() {
        return labKeyId;
    }

    /**
     * @param labKeyId
     */
    public void setLabKeyId(Integer labKeyId) {
        this.labKeyId = labKeyId;
    }

    /**
     * @return HOS_LAB_KEY_ID
     */
    public Integer getHosLabKeyId() {
        return hosLabKeyId;
    }

    /**
     * @param hosLabKeyId
     */
    public void setHosLabKeyId(Integer hosLabKeyId) {
        this.hosLabKeyId = hosLabKeyId;
    }

    /**
     * 获取当本条记录就诊类别为「住院」时，存储的是病人档案住院记录表的对应数据的主键ID；当本条记录就诊类别为「门诊」时，存储的是病人档案门诊记录表的对应数据的主键ID；
     *
     * @return VISIT_RECORD_KEY_ID - 当本条记录就诊类别为「住院」时，存储的是病人档案住院记录表的对应数据的主键ID；当本条记录就诊类别为「门诊」时，存储的是病人档案门诊记录表的对应数据的主键ID；
     */
    public Integer getVisitRecordKeyId() {
        return visitRecordKeyId;
    }

    /**
     * 设置当本条记录就诊类别为「住院」时，存储的是病人档案住院记录表的对应数据的主键ID；当本条记录就诊类别为「门诊」时，存储的是病人档案门诊记录表的对应数据的主键ID；
     *
     * @param visitRecordKeyId 当本条记录就诊类别为「住院」时，存储的是病人档案住院记录表的对应数据的主键ID；当本条记录就诊类别为「门诊」时，存储的是病人档案门诊记录表的对应数据的主键ID；
     */
    public void setVisitRecordKeyId(Integer visitRecordKeyId) {
        this.visitRecordKeyId = visitRecordKeyId;
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
     * @return VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * @param visitId
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * @return REGISTERED_NO
     */
    public String getRegisteredNo() {
        return registeredNo;
    }

    /**
     * @param registeredNo
     */
    public void setRegisteredNo(String registeredNo) {
        this.registeredNo = registeredNo;
    }

    /**
     * @return PATIENT_SOURCE
     */
    public String getPatientSource() {
        return patientSource;
    }

    /**
     * @param patientSource
     */
    public void setPatientSource(String patientSource) {
        this.patientSource = patientSource;
    }

    /**
     * @return LAB_NO
     */
    public String getLabNo() {
        return labNo;
    }

    /**
     * @param labNo
     */
    public void setLabNo(String labNo) {
        this.labNo = labNo;
    }

    /**
     * @return LAB_NAME
     */
    public String getLabName() {
        return labName;
    }

    /**
     * @param labName
     */
    public void setLabName(String labName) {
        this.labName = labName;
    }

    /**
     * @return SPECIMEN_TYPE
     */
    public String getSpecimenType() {
        return specimenType;
    }

    /**
     * @param specimenType
     */
    public void setSpecimenType(String specimenType) {
        this.specimenType = specimenType;
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
     * @return DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * @param deptCode
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * @return DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return LAB_DATE
     */
    public Date getLabDate() {
        return labDate;
    }

    /**
     * @param labDate
     */
    public void setLabDate(Date labDate) {
        this.labDate = labDate;
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
}