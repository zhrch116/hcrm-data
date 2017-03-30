package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_HOSPITAL_CONFIG")
public class CtHospitalConfig {
    @Id
    @Column(name = "HOSPITAL_CONFIG_ID")
    private Integer hospitalConfigId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "CONFIG_CODE")
    private String configCode;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    @Column(name = "CONFIG_VALUE")
    private String configValue;

    /**
     * @return HOSPITAL_CONFIG_ID
     */
    public Integer getHospitalConfigId() {
        return hospitalConfigId;
    }

    /**
     * @param hospitalConfigId
     */
    public void setHospitalConfigId(Integer hospitalConfigId) {
        this.hospitalConfigId = hospitalConfigId;
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

    /**
     * @return CONFIG_VALUE
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * @param configValue
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}