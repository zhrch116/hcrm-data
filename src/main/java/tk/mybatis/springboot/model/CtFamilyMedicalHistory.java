package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_FAMILY_MEDICAL_HISTORY")
public class CtFamilyMedicalHistory {
    @Id
    @Column(name = "FAMILY_MEDICAL_HISTORY_KEY_ID")
    private Integer familyMedicalHistoryKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "DISEASE_NAME")
    private String diseaseName;

    @Column(name = "RELATIONSHIP")
    private String relationship;

    /**
     * 见字典007
     */
    @Column(name = "DATA_SOURCE_CODE")
    private String dataSourceCode;

    @Column(name = "REMARK")
    private String remark;

    /**
     * @return FAMILY_MEDICAL_HISTORY_KEY_ID
     */
    public Integer getFamilyMedicalHistoryKeyId() {
        return familyMedicalHistoryKeyId;
    }

    /**
     * @param familyMedicalHistoryKeyId
     */
    public void setFamilyMedicalHistoryKeyId(Integer familyMedicalHistoryKeyId) {
        this.familyMedicalHistoryKeyId = familyMedicalHistoryKeyId;
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
     * @return DISEASE_NAME
     */
    public String getDiseaseName() {
        return diseaseName;
    }

    /**
     * @param diseaseName
     */
    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    /**
     * @return RELATIONSHIP
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * @param relationship
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
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