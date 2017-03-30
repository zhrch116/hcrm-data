package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_HOSPITALIZATION_HISTORY")
public class CtHospitalizationHistory {
    @Id
    @Column(name = "HOSPITALIZATION_HISTORY_KEY_ID")
    private Integer hospitalizationHistoryKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "HOSPITALIZATION_TIME")
    private Date hospitalizationTime;

    @Column(name = "DIAGNOSIS")
    private String diagnosis;

    @Column(name = "MEDICAL_INSTITUTION_NAME")
    private String medicalInstitutionName;

    /**
     * 见字典007
     */
    @Column(name = "DATA_SOURCE_CODE")
    private String dataSourceCode;

    @Column(name = "HOSPITALIZATION_REASON")
    private String hospitalizationReason;

    @Column(name = "REMARK")
    private String remark;

    /**
     * @return HOSPITALIZATION_HISTORY_KEY_ID
     */
    public Integer getHospitalizationHistoryKeyId() {
        return hospitalizationHistoryKeyId;
    }

    /**
     * @param hospitalizationHistoryKeyId
     */
    public void setHospitalizationHistoryKeyId(Integer hospitalizationHistoryKeyId) {
        this.hospitalizationHistoryKeyId = hospitalizationHistoryKeyId;
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
     * @return HOSPITALIZATION_TIME
     */
    public Date getHospitalizationTime() {
        return hospitalizationTime;
    }

    /**
     * @param hospitalizationTime
     */
    public void setHospitalizationTime(Date hospitalizationTime) {
        this.hospitalizationTime = hospitalizationTime;
    }

    /**
     * @return DIAGNOSIS
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * @param diagnosis
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * @return MEDICAL_INSTITUTION_NAME
     */
    public String getMedicalInstitutionName() {
        return medicalInstitutionName;
    }

    /**
     * @param medicalInstitutionName
     */
    public void setMedicalInstitutionName(String medicalInstitutionName) {
        this.medicalInstitutionName = medicalInstitutionName;
    }

    /**
     * 获取见字典007
     *
     * @return DATA_SOURCE_CODE - 见字典007
     */
    public String getDataSourceCode() {
        return dataSourceCode;
    }

    /**
     * 设置见字典007
     *
     * @param dataSourceCode 见字典007
     */
    public void setDataSourceCode(String dataSourceCode) {
        this.dataSourceCode = dataSourceCode;
    }

    /**
     * @return HOSPITALIZATION_REASON
     */
    public String getHospitalizationReason() {
        return hospitalizationReason;
    }

    /**
     * @param hospitalizationReason
     */
    public void setHospitalizationReason(String hospitalizationReason) {
        this.hospitalizationReason = hospitalizationReason;
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}