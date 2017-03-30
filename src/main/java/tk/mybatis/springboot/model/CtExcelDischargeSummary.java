package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_EXCEL_DISCHARGE_SUMMARY")
public class CtExcelDischargeSummary {
    @Id
    @Column(name = "DISCHARGE_SUMMARY_KEY_ID")
    private Integer dischargeSummaryKeyId;

    @Column(name = "PATIENT_IN_HOSPITAL_KEY_ID")
    private Integer patientInHospitalKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "DISCHARGE_CREATE_TIME")
    private Date dischargeCreateTime;

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

    @Column(name = "CLINIC_DIAGNOSIS")
    private String clinicDiagnosis;

    @Column(name = "ADM_MAJOR_SYM_SIGNS")
    private String admMajorSymSigns;

    @Column(name = "ADM_ICD_CODE")
    private String admIcdCode;

    @Column(name = "ADM_ICD_NAME")
    private String admIcdName;

    @Column(name = "DIS_ICD_CODE")
    private String disIcdCode;

    @Column(name = "DIS_ICD_NAME")
    private String disIcdName;

    @Column(name = "COU_TREA_RESULT")
    private String couTreaResult;

    @Column(name = "MAJOR_TEST_RESULT")
    private String majorTestResult;

    @Column(name = "X_RAY_NO")
    private String xRayNo;

    @Column(name = "INSPECTION_CONSULTATION")
    private String inspectionConsultation;

    @Column(name = "COMPLICATION")
    private String complication;

    @Column(name = "DIS_MAJOR_SYM_SIGNS")
    private String disMajorSymSigns;

    @Column(name = "DIS_MEDICATION_SUGGESTION")
    private String disMedicationSuggestion;

    @Column(name = "DIS_OTHER_MEDICATION_SUGGESTION")
    private String disOtherMedicationSuggestion;

    @Column(name = "TREATMENT_RESULT")
    private String treatmentResult;

    /**
     * @return DISCHARGE_SUMMARY_KEY_ID
     */
    public Integer getDischargeSummaryKeyId() {
        return dischargeSummaryKeyId;
    }

    /**
     * @param dischargeSummaryKeyId
     */
    public void setDischargeSummaryKeyId(Integer dischargeSummaryKeyId) {
        this.dischargeSummaryKeyId = dischargeSummaryKeyId;
    }

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
     * @return DISCHARGE_CREATE_TIME
     */
    public Date getDischargeCreateTime() {
        return dischargeCreateTime;
    }

    /**
     * @param dischargeCreateTime
     */
    public void setDischargeCreateTime(Date dischargeCreateTime) {
        this.dischargeCreateTime = dischargeCreateTime;
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

    /**
     * @return CLINIC_DIAGNOSIS
     */
    public String getClinicDiagnosis() {
        return clinicDiagnosis;
    }

    /**
     * @param clinicDiagnosis
     */
    public void setClinicDiagnosis(String clinicDiagnosis) {
        this.clinicDiagnosis = clinicDiagnosis;
    }

    /**
     * @return ADM_MAJOR_SYM_SIGNS
     */
    public String getAdmMajorSymSigns() {
        return admMajorSymSigns;
    }

    /**
     * @param admMajorSymSigns
     */
    public void setAdmMajorSymSigns(String admMajorSymSigns) {
        this.admMajorSymSigns = admMajorSymSigns;
    }

    /**
     * @return ADM_ICD_CODE
     */
    public String getAdmIcdCode() {
        return admIcdCode;
    }

    /**
     * @param admIcdCode
     */
    public void setAdmIcdCode(String admIcdCode) {
        this.admIcdCode = admIcdCode;
    }

    /**
     * @return ADM_ICD_NAME
     */
    public String getAdmIcdName() {
        return admIcdName;
    }

    /**
     * @param admIcdName
     */
    public void setAdmIcdName(String admIcdName) {
        this.admIcdName = admIcdName;
    }

    /**
     * @return DIS_ICD_CODE
     */
    public String getDisIcdCode() {
        return disIcdCode;
    }

    /**
     * @param disIcdCode
     */
    public void setDisIcdCode(String disIcdCode) {
        this.disIcdCode = disIcdCode;
    }

    /**
     * @return DIS_ICD_NAME
     */
    public String getDisIcdName() {
        return disIcdName;
    }

    /**
     * @param disIcdName
     */
    public void setDisIcdName(String disIcdName) {
        this.disIcdName = disIcdName;
    }

    /**
     * @return COU_TREA_RESULT
     */
    public String getCouTreaResult() {
        return couTreaResult;
    }

    /**
     * @param couTreaResult
     */
    public void setCouTreaResult(String couTreaResult) {
        this.couTreaResult = couTreaResult;
    }

    /**
     * @return MAJOR_TEST_RESULT
     */
    public String getMajorTestResult() {
        return majorTestResult;
    }

    /**
     * @param majorTestResult
     */
    public void setMajorTestResult(String majorTestResult) {
        this.majorTestResult = majorTestResult;
    }

    /**
     * @return X_RAY_NO
     */
    public String getxRayNo() {
        return xRayNo;
    }

    /**
     * @param xRayNo
     */
    public void setxRayNo(String xRayNo) {
        this.xRayNo = xRayNo;
    }

    /**
     * @return INSPECTION_CONSULTATION
     */
    public String getInspectionConsultation() {
        return inspectionConsultation;
    }

    /**
     * @param inspectionConsultation
     */
    public void setInspectionConsultation(String inspectionConsultation) {
        this.inspectionConsultation = inspectionConsultation;
    }

    /**
     * @return COMPLICATION
     */
    public String getComplication() {
        return complication;
    }

    /**
     * @param complication
     */
    public void setComplication(String complication) {
        this.complication = complication;
    }

    /**
     * @return DIS_MAJOR_SYM_SIGNS
     */
    public String getDisMajorSymSigns() {
        return disMajorSymSigns;
    }

    /**
     * @param disMajorSymSigns
     */
    public void setDisMajorSymSigns(String disMajorSymSigns) {
        this.disMajorSymSigns = disMajorSymSigns;
    }

    /**
     * @return DIS_MEDICATION_SUGGESTION
     */
    public String getDisMedicationSuggestion() {
        return disMedicationSuggestion;
    }

    /**
     * @param disMedicationSuggestion
     */
    public void setDisMedicationSuggestion(String disMedicationSuggestion) {
        this.disMedicationSuggestion = disMedicationSuggestion;
    }

    /**
     * @return DIS_OTHER_MEDICATION_SUGGESTION
     */
    public String getDisOtherMedicationSuggestion() {
        return disOtherMedicationSuggestion;
    }

    /**
     * @param disOtherMedicationSuggestion
     */
    public void setDisOtherMedicationSuggestion(String disOtherMedicationSuggestion) {
        this.disOtherMedicationSuggestion = disOtherMedicationSuggestion;
    }

    /**
     * @return TREATMENT_RESULT
     */
    public String getTreatmentResult() {
        return treatmentResult;
    }

    /**
     * @param treatmentResult
     */
    public void setTreatmentResult(String treatmentResult) {
        this.treatmentResult = treatmentResult;
    }
}