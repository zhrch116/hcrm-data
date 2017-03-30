package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ETL_CLINIC_DIAGNOSIS_INFO")
public class CtEtlClinicDiagnosisInfo {
    @Id
    @Column(name = "CLINIC_DIAGNOSIS_KEY_ID")
    private Integer clinicDiagnosisKeyId;

    @Column(name = "HOS_CLINIC_DIAGNOSIS_KEY_ID")
    private Integer hosClinicDiagnosisKeyId;

    @Column(name = "PATIENT_CLINIC_ID")
    private Integer patientClinicId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "HOSPITAL_PATIENT_ID")
    private String hospitalPatientId;

    @Column(name = "CLINIC_NO")
    private String clinicNo;

    /**
     * 病人住院所属科室的代码。用于区分一个病房包含多个科室的床位的情况。病人住院登记后，将该字段置为空，在入科分配床位时，根据床位属性将该字段置为所在科室代码，转科时，由转出科室将该代码置为空
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "HOS_ICD_CODE")
    private String hosIcdCode;

    @Column(name = "HOS_ICD_NAME")
    private String hosIcdName;

    @Column(name = "DIAGNOSIS_NO")
    private Integer diagnosisNo;

    @Column(name = "DIAGNOSIS_DATE")
    private Date diagnosisDate;

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

    @Column(name = "DIAGNOSIS_RESULT")
    private String diagnosisResult;

    /**
     * @return CLINIC_DIAGNOSIS_KEY_ID
     */
    public Integer getClinicDiagnosisKeyId() {
        return clinicDiagnosisKeyId;
    }

    /**
     * @param clinicDiagnosisKeyId
     */
    public void setClinicDiagnosisKeyId(Integer clinicDiagnosisKeyId) {
        this.clinicDiagnosisKeyId = clinicDiagnosisKeyId;
    }

    /**
     * @return HOS_CLINIC_DIAGNOSIS_KEY_ID
     */
    public Integer getHosClinicDiagnosisKeyId() {
        return hosClinicDiagnosisKeyId;
    }

    /**
     * @param hosClinicDiagnosisKeyId
     */
    public void setHosClinicDiagnosisKeyId(Integer hosClinicDiagnosisKeyId) {
        this.hosClinicDiagnosisKeyId = hosClinicDiagnosisKeyId;
    }

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
     * 获取病人住院所属科室的代码。用于区分一个病房包含多个科室的床位的情况。病人住院登记后，将该字段置为空，在入科分配床位时，根据床位属性将该字段置为所在科室代码，转科时，由转出科室将该代码置为空
     *
     * @return DEPT_CODE - 病人住院所属科室的代码。用于区分一个病房包含多个科室的床位的情况。病人住院登记后，将该字段置为空，在入科分配床位时，根据床位属性将该字段置为所在科室代码，转科时，由转出科室将该代码置为空
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置病人住院所属科室的代码。用于区分一个病房包含多个科室的床位的情况。病人住院登记后，将该字段置为空，在入科分配床位时，根据床位属性将该字段置为所在科室代码，转科时，由转出科室将该代码置为空
     *
     * @param deptCode 病人住院所属科室的代码。用于区分一个病房包含多个科室的床位的情况。病人住院登记后，将该字段置为空，在入科分配床位时，根据床位属性将该字段置为所在科室代码，转科时，由转出科室将该代码置为空
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
     * @return DIAGNOSIS_NO
     */
    public Integer getDiagnosisNo() {
        return diagnosisNo;
    }

    /**
     * @param diagnosisNo
     */
    public void setDiagnosisNo(Integer diagnosisNo) {
        this.diagnosisNo = diagnosisNo;
    }

    /**
     * @return DIAGNOSIS_DATE
     */
    public Date getDiagnosisDate() {
        return diagnosisDate;
    }

    /**
     * @param diagnosisDate
     */
    public void setDiagnosisDate(Date diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
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

    /**
     * @return DIAGNOSIS_RESULT
     */
    public String getDiagnosisResult() {
        return diagnosisResult;
    }

    /**
     * @param diagnosisResult
     */
    public void setDiagnosisResult(String diagnosisResult) {
        this.diagnosisResult = diagnosisResult;
    }
}