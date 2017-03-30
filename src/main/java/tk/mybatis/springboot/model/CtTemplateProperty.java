package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_TEMPLATE_PROPERTY")
public class CtTemplateProperty {
    @Id
    @Column(name = "TEMPLATE_PROPERTY_ID")
    private Integer templatePropertyId;

    @Column(name = "TEMPLATE_ID")
    private Integer templateId;

    /**
     * 是从字典表中获取的DICT_VALUE_CODE，比如：00900020
     */
    @Column(name = "TEMPLATE_PROPERTY_CODE")
    private String templatePropertyCode;

    /**
     * 是从字典表中获取的DICT_VALUE_NAME，比如：科室
     */
    @Column(name = "TEMPLATE_PROPERTY_NAME")
    private String templatePropertyName;

    /**
     * 比如：存储具体的科室ID，比如：27；疾病编码：A00.1等
     */
    @Column(name = "TEMPLATE_PROPERTY_VALUE_CODE")
    private String templatePropertyValueCode;

    /**
     * 比如：存储具体的科室名称，比如：27对应的是肿瘤科，这里保存；疾病编码：A00.1对应的慢性咽炎等
     */
    @Column(name = "TEMPLATE_PROPERTY_VALUE_NAME")
    private String templatePropertyValueName;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return TEMPLATE_PROPERTY_ID
     */
    public Integer getTemplatePropertyId() {
        return templatePropertyId;
    }

    /**
     * @param templatePropertyId
     */
    public void setTemplatePropertyId(Integer templatePropertyId) {
        this.templatePropertyId = templatePropertyId;
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
     * 获取是从字典表中获取的DICT_VALUE_CODE，比如：00900020
     *
     * @return TEMPLATE_PROPERTY_CODE - 是从字典表中获取的DICT_VALUE_CODE，比如：00900020
     */
    public String getTemplatePropertyCode() {
        return templatePropertyCode;
    }

    /**
     * 设置是从字典表中获取的DICT_VALUE_CODE，比如：00900020
     *
     * @param templatePropertyCode 是从字典表中获取的DICT_VALUE_CODE，比如：00900020
     */
    public void setTemplatePropertyCode(String templatePropertyCode) {
        this.templatePropertyCode = templatePropertyCode;
    }

    /**
     * 获取是从字典表中获取的DICT_VALUE_NAME，比如：科室
     *
     * @return TEMPLATE_PROPERTY_NAME - 是从字典表中获取的DICT_VALUE_NAME，比如：科室
     */
    public String getTemplatePropertyName() {
        return templatePropertyName;
    }

    /**
     * 设置是从字典表中获取的DICT_VALUE_NAME，比如：科室
     *
     * @param templatePropertyName 是从字典表中获取的DICT_VALUE_NAME，比如：科室
     */
    public void setTemplatePropertyName(String templatePropertyName) {
        this.templatePropertyName = templatePropertyName;
    }

    /**
     * 获取比如：存储具体的科室ID，比如：27；疾病编码：A00.1等
     *
     * @return TEMPLATE_PROPERTY_VALUE_CODE - 比如：存储具体的科室ID，比如：27；疾病编码：A00.1等
     */
    public String getTemplatePropertyValueCode() {
        return templatePropertyValueCode;
    }

    /**
     * 设置比如：存储具体的科室ID，比如：27；疾病编码：A00.1等
     *
     * @param templatePropertyValueCode 比如：存储具体的科室ID，比如：27；疾病编码：A00.1等
     */
    public void setTemplatePropertyValueCode(String templatePropertyValueCode) {
        this.templatePropertyValueCode = templatePropertyValueCode;
    }

    /**
     * 获取比如：存储具体的科室名称，比如：27对应的是肿瘤科，这里保存；疾病编码：A00.1对应的慢性咽炎等
     *
     * @return TEMPLATE_PROPERTY_VALUE_NAME - 比如：存储具体的科室名称，比如：27对应的是肿瘤科，这里保存；疾病编码：A00.1对应的慢性咽炎等
     */
    public String getTemplatePropertyValueName() {
        return templatePropertyValueName;
    }

    /**
     * 设置比如：存储具体的科室名称，比如：27对应的是肿瘤科，这里保存；疾病编码：A00.1对应的慢性咽炎等
     *
     * @param templatePropertyValueName 比如：存储具体的科室名称，比如：27对应的是肿瘤科，这里保存；疾病编码：A00.1对应的慢性咽炎等
     */
    public void setTemplatePropertyValueName(String templatePropertyValueName) {
        this.templatePropertyValueName = templatePropertyValueName;
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