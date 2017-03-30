package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_SPEC_DISE_TEMPLATE_FIELD_REL")
public class CtSpecDiseTemplateFieldRel {
    @Id
    @Column(name = "TEMPLATE_FIELD_REL_KEY_ID")
    private Integer templateFieldRelKeyId;

    @Column(name = "TEMPLATE_KEY_ID")
    private Integer templateKeyId;

    @Column(name = "FIELD_KEY_ID")
    private Integer fieldKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "FIELD_ORDER")
    private Integer fieldOrder;

    /**
     * 0-否；1-是；
     */
    @Column(name = "IS_REQUIRED")
    private Integer isRequired;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return TEMPLATE_FIELD_REL_KEY_ID
     */
    public Integer getTemplateFieldRelKeyId() {
        return templateFieldRelKeyId;
    }

    /**
     * @param templateFieldRelKeyId
     */
    public void setTemplateFieldRelKeyId(Integer templateFieldRelKeyId) {
        this.templateFieldRelKeyId = templateFieldRelKeyId;
    }

    /**
     * @return TEMPLATE_KEY_ID
     */
    public Integer getTemplateKeyId() {
        return templateKeyId;
    }

    /**
     * @param templateKeyId
     */
    public void setTemplateKeyId(Integer templateKeyId) {
        this.templateKeyId = templateKeyId;
    }

    /**
     * @return FIELD_KEY_ID
     */
    public Integer getFieldKeyId() {
        return fieldKeyId;
    }

    /**
     * @param fieldKeyId
     */
    public void setFieldKeyId(Integer fieldKeyId) {
        this.fieldKeyId = fieldKeyId;
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
     * @return FIELD_ORDER
     */
    public Integer getFieldOrder() {
        return fieldOrder;
    }

    /**
     * @param fieldOrder
     */
    public void setFieldOrder(Integer fieldOrder) {
        this.fieldOrder = fieldOrder;
    }

    /**
     * 获取0-否；1-是；
     *
     * @return IS_REQUIRED - 0-否；1-是；
     */
    public Integer getIsRequired() {
        return isRequired;
    }

    /**
     * 设置0-否；1-是；
     *
     * @param isRequired 0-否；1-是；
     */
    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
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