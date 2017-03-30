package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_OPTION_PROPERTY")
public class CtOptionProperty {
    @Id
    @Column(name = "OPTION_PROPERTY_KEY_ID")
    private Integer optionPropertyKeyId;

    @Column(name = "TEMPLATE_ID")
    private Integer templateId;

    @Column(name = "PROBLEM_ID")
    private Integer problemId;

    @Column(name = "OPTION_ID")
    private Integer optionId;

    /**
     * 默认为不需要健康指导
     */
    @Column(name = "IS_NEED_HEALTH_GUIDCE")
    private Integer isNeedHealthGuidce;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return OPTION_PROPERTY_KEY_ID
     */
    public Integer getOptionPropertyKeyId() {
        return optionPropertyKeyId;
    }

    /**
     * @param optionPropertyKeyId
     */
    public void setOptionPropertyKeyId(Integer optionPropertyKeyId) {
        this.optionPropertyKeyId = optionPropertyKeyId;
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
     * @return PROBLEM_ID
     */
    public Integer getProblemId() {
        return problemId;
    }

    /**
     * @param problemId
     */
    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    /**
     * @return OPTION_ID
     */
    public Integer getOptionId() {
        return optionId;
    }

    /**
     * @param optionId
     */
    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    /**
     * 获取默认为不需要健康指导
     *
     * @return IS_NEED_HEALTH_GUIDCE - 默认为不需要健康指导
     */
    public Integer getIsNeedHealthGuidce() {
        return isNeedHealthGuidce;
    }

    /**
     * 设置默认为不需要健康指导
     *
     * @param isNeedHealthGuidce 默认为不需要健康指导
     */
    public void setIsNeedHealthGuidce(Integer isNeedHealthGuidce) {
        this.isNeedHealthGuidce = isNeedHealthGuidce;
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