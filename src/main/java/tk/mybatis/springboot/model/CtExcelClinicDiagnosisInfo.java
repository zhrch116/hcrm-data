package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_EXCEL_CLINIC_DIAGNOSIS_INFO")
public class CtExcelClinicDiagnosisInfo {
    @Id
    @Column(name = "CLINIC_DIAGNOSIS_KEY_ID")
    private Integer clinicDiagnosisKeyId;

    @Column(name = "PATIENT_CLINIC_ID")
    private Integer patientClinicId;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "HOS_ICD_CODE")
    private String hosIcdCode;

    @Column(name = "HOS_ICD_NAME")
    private String hosIcdName;

    @Column(name = "DIAGNOSIS_NO")
    private Integer diagnosisNo;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

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