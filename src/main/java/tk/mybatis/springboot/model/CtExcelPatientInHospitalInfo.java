package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_EXCEL_PATIENT_IN_HOSPITAL_INFO")
public class CtExcelPatientInHospitalInfo {
    @Id
    @Column(name = "PATIENT_IN_HOSPITAL_KEY_ID")
    private Integer patientInHospitalKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "INHOSPITAL_NO")
    private String inhospitalNo;

    /**
     * 病房的正式名称
     */
    @Column(name = "WARD_NAME")
    private String wardName;

    /**
     * 科室的正式名称
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "BED_NO")
    private String bedNo;

    @Column(name = "ADMISSION_DATE_TIME")
    private Date admissionDateTime;

    @Column(name = "DISCHARGE_DATE_TIME")
    private Date dischargeDateTime;

    @Column(name = "MAIN_ICD_CODE")
    private String mainIcdCode;

    @Column(name = "MAIN_ICD_NAME")
    private String mainIcdName;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    @Column(name = "DOCTOR_IN_CHARGE_NAME")
    private String doctorInChargeName;

    @Column(name = "DIRECTOR_NAME")
    private String directorName;

    @Column(name = "DISCHARGE_STATUS")
    private String dischargeStatus;

    /**
     * 0：未归档；1：已归档；
     */
    @Column(name = "IS_FILED")
    private Integer isFiled;

    @Column(name = "CREATOR_ID")
    private Integer creatorId;

    /**
     * 本行数据创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "EDITOR_ID")
    private Integer editorId;

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
     * @return PATIENT_IN_HOSPITAL_KEY_ID
     */
    public Integer getPatientInHospitalKeyId() {
        return patientInHospitalKeyId;
    }

    /**
     * @param patientInHospitalKeyId
     */
    public void setPatientInHospitalKeyId(Integer patientInHospitalKeyId) {
        this.patientInHospitalKeyId = patientInHospitalKeyId;
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
     * @return INHOSPITAL_NO
     */
    public String getInhospitalNo() {
        return inhospitalNo;
    }

    /**
     * @param inhospitalNo
     */
    public void setInhospitalNo(String inhospitalNo) {
        this.inhospitalNo = inhospitalNo;
    }

    /**
     * 获取病房的正式名称
     *
     * @return WARD_NAME - 病房的正式名称
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * 设置病房的正式名称
     *
     * @param wardName 病房的正式名称
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * 获取科室的正式名称
     *
     * @return DEPT_NAME - 科室的正式名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室的正式名称
     *
     * @param deptName 科室的正式名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * @param bedNo
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * @return ADMISSION_DATE_TIME
     */
    public Date getAdmissionDateTime() {
        return admissionDateTime;
    }

    /**
     * @param admissionDateTime
     */
    public void setAdmissionDateTime(Date admissionDateTime) {
        this.admissionDateTime = admissionDateTime;
    }

    /**
     * @return DISCHARGE_DATE_TIME
     */
    public Date getDischargeDateTime() {
        return dischargeDateTime;
    }

    /**
     * @param dischargeDateTime
     */
    public void setDischargeDateTime(Date dischargeDateTime) {
        this.dischargeDateTime = dischargeDateTime;
    }

    /**
     * @return MAIN_ICD_CODE
     */
    public String getMainIcdCode() {
        return mainIcdCode;
    }

    /**
     * @param mainIcdCode
     */
    public void setMainIcdCode(String mainIcdCode) {
        this.mainIcdCode = mainIcdCode;
    }

    /**
     * @return MAIN_ICD_NAME
     */
    public String getMainIcdName() {
        return mainIcdName;
    }

    /**
     * @param mainIcdName
     */
    public void setMainIcdName(String mainIcdName) {
        this.mainIcdName = mainIcdName;
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
     * @return DOCTOR_IN_CHARGE_NAME
     */
    public String getDoctorInChargeName() {
        return doctorInChargeName;
    }

    /**
     * @param doctorInChargeName
     */
    public void setDoctorInChargeName(String doctorInChargeName) {
        this.doctorInChargeName = doctorInChargeName;
    }

    /**
     * @return DIRECTOR_NAME
     */
    public String getDirectorName() {
        return directorName;
    }

    /**
     * @param directorName
     */
    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    /**
     * @return DISCHARGE_STATUS
     */
    public String getDischargeStatus() {
        return dischargeStatus;
    }

    /**
     * @param dischargeStatus
     */
    public void setDischargeStatus(String dischargeStatus) {
        this.dischargeStatus = dischargeStatus;
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
     * @return CREATOR_ID
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * @param creatorId
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
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
     * @return EDITOR_ID
     */
    public Integer getEditorId() {
        return editorId;
    }

    /**
     * @param editorId
     */
    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
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