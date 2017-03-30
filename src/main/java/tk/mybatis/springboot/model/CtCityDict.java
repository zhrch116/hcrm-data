package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_CITY_DICT")
public class CtCityDict {
    @Id
    @Column(name = "CITY_CODE")
    private String cityCode;

    @Column(name = "PROVINCE_CODE")
    private String provinceCode;

    @Column(name = "CITY_NAME")
    private String cityName;

    @Column(name = "CITY_TYPE_CODE")
    private String cityTypeCode;

    @Column(name = "CITY_TYPE_NAME")
    private String cityTypeName;

    @Column(name = "CITY_SHORT_SPELL")
    private String cityShortSpell;

    @Column(name = "CITY_FULL_SPELL")
    private String cityFullSpell;

    /**
     * 0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return CITY_CODE
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * @param cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * @return PROVINCE_CODE
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * @param provinceCode
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * @return CITY_NAME
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return CITY_TYPE_CODE
     */
    public String getCityTypeCode() {
        return cityTypeCode;
    }

    /**
     * @param cityTypeCode
     */
    public void setCityTypeCode(String cityTypeCode) {
        this.cityTypeCode = cityTypeCode;
    }

    /**
     * @return CITY_TYPE_NAME
     */
    public String getCityTypeName() {
        return cityTypeName;
    }

    /**
     * @param cityTypeName
     */
    public void setCityTypeName(String cityTypeName) {
        this.cityTypeName = cityTypeName;
    }

    /**
     * @return CITY_SHORT_SPELL
     */
    public String getCityShortSpell() {
        return cityShortSpell;
    }

    /**
     * @param cityShortSpell
     */
    public void setCityShortSpell(String cityShortSpell) {
        this.cityShortSpell = cityShortSpell;
    }

    /**
     * @return CITY_FULL_SPELL
     */
    public String getCityFullSpell() {
        return cityFullSpell;
    }

    /**
     * @param cityFullSpell
     */
    public void setCityFullSpell(String cityFullSpell) {
        this.cityFullSpell = cityFullSpell;
    }

    /**
     * 获取0：不可用；1：可用；
     *
     * @return IS_ENABLE - 0：不可用；1：可用；
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * 设置0：不可用；1：可用；
     *
     * @param isEnable 0：不可用；1：可用；
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }
}