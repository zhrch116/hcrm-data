package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_DISEASE_HISTORY")
public class CtDiseaseHistory {
    @Id
    @Column(name = "DISEASE_HISTORY_KEY_ID")
    private Integer diseaseHistoryKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "DISEASE_NAME")
    private String diseaseName;

    @Column(name = "TIME_OF_DIAGNOSIS")
    private Date timeOfDiagnosis;

    /**
     * 见字典007
     */
    @Column(name = "DATA_SOURCE_CODE")
    private String dataSourceCode;

    @Column(name = "REMARK")
    private String remark;

    /**
     * @return DISEASE_HISTORY_KEY_ID
     */
    public Integer getDiseaseHistoryKeyId() {
        return diseaseHistoryKeyId;
    }

    /**
     * @param diseaseHistoryKeyId
     */
    public void setDiseaseHistoryKeyId(Integer diseaseHistoryKeyId) {
        this.diseaseHistoryKeyId = diseaseHistoryKeyId;
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
     * @return TIME_OF_DIAGNOSIS
     */
    public Date getTimeOfDiagnosis() {
        return timeOfDiagnosis;
    }

    /**
     * @param timeOfDiagnosis
     */
    public void setTimeOfDiagnosis(Date timeOfDiagnosis) {
        this.timeOfDiagnosis = timeOfDiagnosis;
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