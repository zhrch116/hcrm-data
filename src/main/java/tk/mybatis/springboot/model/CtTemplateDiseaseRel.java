package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_TEMPLATE_DISEASE_REL")
public class CtTemplateDiseaseRel {
    @Id
    @Column(name = "TEMPLATE_DISEASE_KEY_ID")
    private Integer templateDiseaseKeyId;

    @Column(name = "DISEASE_ID")
    private Integer diseaseId;

    @Column(name = "TEMPLATE_ID")
    private Integer templateId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return TEMPLATE_DISEASE_KEY_ID
     */
    public Integer getTemplateDiseaseKeyId() {
        return templateDiseaseKeyId;
    }

    /**
     * @param templateDiseaseKeyId
     */
    public void setTemplateDiseaseKeyId(Integer templateDiseaseKeyId) {
        this.templateDiseaseKeyId = templateDiseaseKeyId;
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

    /**
     * @return TEMPLATE_ID
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * @param templateId
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
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