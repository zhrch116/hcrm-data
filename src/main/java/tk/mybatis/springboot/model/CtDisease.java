package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_DISEASE")
public class CtDisease {
    @Id
    @Column(name = "DISEASE_ID")
    private Integer diseaseId;

    @Column(name = "DISEASE_CODE")
    private String diseaseCode;

    @Column(name = "DISEASE_NAME")
    private String diseaseName;

    @Column(name = "DISEASE_VERSION")
    private String diseaseVersion;

    @Column(name = "DISEASE_SHORT_SPELL")
    private String diseaseShortSpell;

    @Column(name = "CAN_DELETE")
    private Boolean canDelete;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

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

    /**
     * @return DISEASE_CODE
     */
    public String getDiseaseCode() {
        return diseaseCode;
    }

    /**
     * @param diseaseCode
     */
    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
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
     * @return DISEASE_VERSION
     */
    public String getDiseaseVersion() {
        return diseaseVersion;
    }

    /**
     * @param diseaseVersion
     */
    public void setDiseaseVersion(String diseaseVersion) {
        this.diseaseVersion = diseaseVersion;
    }

    /**
     * @return DISEASE_SHORT_SPELL
     */
    public String getDiseaseShortSpell() {
        return diseaseShortSpell;
    }

    /**
     * @param diseaseShortSpell
     */
    public void setDiseaseShortSpell(String diseaseShortSpell) {
        this.diseaseShortSpell = diseaseShortSpell;
    }

    /**
     * @return CAN_DELETE
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    /**
     * @param canDelete
     */
    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    /**
     * @return IS_ENABLE
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * @param isEnable
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }
}