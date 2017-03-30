package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ETL_CLI_PATIENT_CLINIC_INFO")
public class CtEtlCliPatientClinicInfo {
    @Id
    @Column(name = "PATIENT_CLINIC_ID")
    private Integer patientClinicId;

    @Column(name = "HOS_PATIENT_CLINIC_ID")
    private Integer hosPatientClinicId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "HOSPITAL_PATIENT_ID")
    private String hospitalPatientId;

    @Column(name = "CLINIC_NO")
    private String clinicNo;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;

    @Column(name = "DEPT_ID")
    private Integer deptId;

    /**
     * 病人住院所属科室的代码
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "VISIT_DATE_TIME")
    private Date visitDateTime;

    @Column(name = "HOS_ICD_CODE")
    private String hosIcdCode;

    @Column(name = "HOS_ICD_NAME")
    private String hosIcdName;

    @Column(name = "DOCTOR_CODE")
    private String doctorCode;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

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
     * @return PATIENT_CLINIC_ID
     */
    public Integer getPatientClinicId() {
        return patientClinicId;
    }

    /**
     * @param patientClinicId
     */
    public void setPatientClinicId(Integer patientClinicId) {
        this.patientClinicId = patientClinicId;
    }

    /**
     * @return HOS_PATIENT_CLINIC_ID
     */
    public Integer getHosPatientClinicId() {
        return hosPatientClinicId;
    }

    /**
     * @param hosPatientClinicId
     */
    public void setHosPatientClinicId(Integer hosPatientClinicId) {
        this.hosPatientClinicId = hosPatientClinicId;
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
     * @return CLINIC_NO
     */
    public String getClinicNo() {
        return clinicNo;
    }

    /**
     * @param clinicNo
     */
    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
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
     * @return HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * @param hospitalName
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * @return DEPT_ID
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * @param deptId
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取病人住院所属科室的代码
     *
     * @return DEPT_CODE - 病人住院所属科室的代码
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置病人住院所属科室的代码
     *
     * @param deptCode 病人住院所属科室的代码
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
     * @return VISIT_DATE_TIME
     */
    public Date getVisitDateTime() {
        return visitDateTime;
    }

    /**
     * @param visitDateTime
     */
    public void setVisitDateTime(Date visitDateTime) {
        this.visitDateTime = visitDateTime;
    }

    /**
     * @return HOS_ICD_CODE
     */
    public String getHosIcdCode() {
        return hosIcdCode;
    }

    /**
     * @param hosIcdCode
     */
    public void setHosIcdCode(String hosIcdCode) {
        this.hosIcdCode = hosIcdCode;
    }

    /**
     * @return HOS_ICD_NAME
     */
    public String getHosIcdName() {
        return hosIcdName;
    }

    /**
     * @param hosIcdName
     */
    public void setHosIcdName(String hosIcdName) {
        this.hosIcdName = hosIcdName;
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