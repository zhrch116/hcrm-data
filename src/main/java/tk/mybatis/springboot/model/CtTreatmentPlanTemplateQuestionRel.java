package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_TREATMENT_PLAN_TEMPLATE_QUESTION_REL")
public class CtTreatmentPlanTemplateQuestionRel {
    @Id
    @Column(name = "TEMPLATE_QUESTION_REL_KEY_ID")
    private Integer templateQuestionRelKeyId;

    @Column(name = "TEMPLATE_KEY_ID")
    private Integer templateKeyId;

    @Column(name = "QUESTION_KEY_ID")
    private Integer questionKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "QUESTION_ORDER")
    private Integer questionOrder;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return TEMPLATE_QUESTION_REL_KEY_ID
     */
    public Integer getTemplateQuestionRelKeyId() {
        return templateQuestionRelKeyId;
    }

    /**
     * @param templateQuestionRelKeyId
     */
    public void setTemplateQuestionRelKeyId(Integer templateQuestionRelKeyId) {
        this.templateQuestionRelKeyId = templateQuestionRelKeyId;
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
     * @return QUESTION_KEY_ID
     */
    public Integer getQuestionKeyId() {
        return questionKeyId;
    }

    /**
     * @param questionKeyId
     */
    public void setQuestionKeyId(Integer questionKeyId) {
        this.questionKeyId = questionKeyId;
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
     * @return QUESTION_ORDER
     */
    public Integer getQuestionOrder() {
        return questionOrder;
    }

    /**
     * @param questionOrder
     */
    public void setQuestionOrder(Integer questionOrder) {
        this.questionOrder = questionOrder;
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