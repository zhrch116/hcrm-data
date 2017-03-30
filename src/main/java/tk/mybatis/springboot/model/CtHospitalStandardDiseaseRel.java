package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_HOSPITAL_STANDARD_DISEASE_REL")
public class CtHospitalStandardDiseaseRel {
    @Id
    @Column(name = "HOSPITAL_STANDARD_DISEASE_REL_KEY_ID")
    private Integer hospitalStandardDiseaseRelKeyId;

    @Column(name = "HOSPITAL_DISEASE_KEY_ID")
    private Integer hospitalDiseaseKeyId;

    @Column(name = "DISEASE_ID")
    private Integer diseaseId;

    /**
     * @return HOSPITAL_STANDARD_DISEASE_REL_KEY_ID
     */
    public Integer getHospitalStandardDiseaseRelKeyId() {
        return hospitalStandardDiseaseRelKeyId;
    }

    /**
     * @param hospitalStandardDiseaseRelKeyId
     */
    public void setHospitalStandardDiseaseRelKeyId(Integer hospitalStandardDiseaseRelKeyId) {
        this.hospitalStandardDiseaseRelKeyId = hospitalStandardDiseaseRelKeyId;
    }

    /**
     * @return HOSPITAL_DISEASE_KEY_ID
     */
    public Integer getHospitalDiseaseKeyId() {
        return hospitalDiseaseKeyId;
    }

    /**
     * @param hospitalDiseaseKeyId
     */
    public void setHospitalDiseaseKeyId(Integer hospitalDiseaseKeyId) {
        this.hospitalDiseaseKeyId = hospitalDiseaseKeyId;
    }

    /**
     * @return DISEASE_ID
     */
    public Integer getDiseaseId() {
        return diseaseId;
    }

    /**
     * @param diseaseId
     */
    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }
}