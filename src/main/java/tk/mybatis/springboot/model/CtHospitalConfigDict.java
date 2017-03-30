package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_HOSPITAL_CONFIG_DICT")
public class CtHospitalConfigDict {
    @Id
    @Column(name = "CONFIG_CODE")
    private String configCode;

    @Column(name = "GROUP_CODE")
    private String groupCode;

    @Column(name = "CONFIG_NAME")
    private String configName;

    @Column(name = "DETAIL_DESC")
    private String detailDesc;

    @Column(name = "ANSWER_TYPE")
    private Integer answerType;

    @Column(name = "ORDER_NO")
    private Integer orderNo;

    @Column(name = "DEFAULT_VALUE")
    private String defaultValue;

    @Column(name = "IS_REQUIRED")
    private Boolean isRequired;

    @Column(name = "IS_SHOW")
    private Boolean isShow;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return CONFIG_CODE
     */
    public String getConfigCode() {
        return configCode;
    }

    /**
     * @param configCode
     */
    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    /**
     * @return GROUP_CODE
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * @param groupCode
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    /**
     * @return CONFIG_NAME
     */
    public String getConfigName() {
        return configName;
    }

    /**
     * @param configName
     */
    public void setConfigName(String configName) {
        this.configName = configName;
    }

    /**
     * @return DETAIL_DESC
     */
    public String getDetailDesc() {
        return detailDesc;
    }

    /**
     * @param detailDesc
     */
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    /**
     * @return ANSWER_TYPE
     */
    public Integer getAnswerType() {
        return answerType;
    }

    /**
     * @param answerType
     */
    public void setAnswerType(Integer answerType) {
        this.answerType = answerType;
    }

    /**
     * @return ORDER_NO
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return DEFAULT_VALUE
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * @param defaultValue
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * @return IS_REQUIRED
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    /**
     * @param isRequired
     */
    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * @return IS_SHOW
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * @param isShow
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
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