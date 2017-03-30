package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_SYSTEM_SETTING")
public class CtSystemSetting {
    @Id
    @Column(name = "SYSTEM_SETTING_ID")
    private Integer systemSettingId;

    @Column(name = "SYSTEM_SETTING_CODE")
    private String systemSettingCode;

    @Column(name = "SYSTEM_SETTING_DESC")
    private String systemSettingDesc;

    @Column(name = "SYSTEM_SETTING_VALUE")
    private String systemSettingValue;

    /**
     * @return SYSTEM_SETTING_ID
     */
    public Integer getSystemSettingId() {
        return systemSettingId;
    }

    /**
     * @param systemSettingId
     */
    public void setSystemSettingId(Integer systemSettingId) {
        this.systemSettingId = systemSettingId;
    }

    /**
     * @return SYSTEM_SETTING_CODE
     */
    public String getSystemSettingCode() {
        return systemSettingCode;
    }

    /**
     * @param systemSettingCode
     */
    public void setSystemSettingCode(String systemSettingCode) {
        this.systemSettingCode = systemSettingCode;
    }

    /**
     * @return SYSTEM_SETTING_DESC
     */
    public String getSystemSettingDesc() {
        return systemSettingDesc;
    }

    /**
     * @param systemSettingDesc
     */
    public void setSystemSettingDesc(String systemSettingDesc) {
        this.systemSettingDesc = systemSettingDesc;
    }

    /**
     * @return SYSTEM_SETTING_VALUE
     */
    public String getSystemSettingValue() {
        return systemSettingValue;
    }

    /**
     * @param systemSettingValue
     */
    public void setSystemSettingValue(String systemSettingValue) {
        this.systemSettingValue = systemSettingValue;
    }
}