package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_HOSPITAL_CONFIG_VALUE_LIST")
public class CtHospitalConfigValueList {
    @Id
    @Column(name = "VALUE_LIST_KEY_ID")
    private Integer valueListKeyId;

    @Column(name = "CONFIG_CODE")
    private String configCode;

    @Column(name = "VALUE")
    private String value;

    @Column(name = "VALUE_NAME")
    private String valueName;

    @Column(name = "VALUE_DESC")
    private String valueDesc;

    @Column(name = "ORDER_NO")
    private Integer orderNo;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return VALUE_LIST_KEY_ID
     */
    public Integer getValueListKeyId() {
        return valueListKeyId;
    }

    /**
     * @param valueListKeyId
     */
    public void setValueListKeyId(Integer valueListKeyId) {
        this.valueListKeyId = valueListKeyId;
    }

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
     * @return VALUE
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return VALUE_NAME
     */
    public String getValueName() {
        return valueName;
    }

    /**
     * @param valueName
     */
    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    /**
     * @return VALUE_DESC
     */
    public String getValueDesc() {
        return valueDesc;
    }

    /**
     * @param valueDesc
     */
    public void setValueDesc(String valueDesc) {
        this.valueDesc = valueDesc;
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