package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_COUNTY_DISTRICT_DICT")
public class CtCountyDistrictDict {
    @Id
    @Column(name = "COUNTY_DISTRICT_CODE")
    private String countyDistrictCode;

    @Column(name = "CITY_CODE")
    private String cityCode;

    @Column(name = "COUNTY_DISTRICT_NAME")
    private String countyDistrictName;

    @Column(name = "COUNTY_DISTRICT_TYPE_CODE")
    private String countyDistrictTypeCode;

    @Column(name = "COUNTY_DISTRICT_TYPE_NAME")
    private String countyDistrictTypeName;

    @Column(name = "COUNTY_DISTRICT_SHORT_SPELL")
    private String countyDistrictShortSpell;

    @Column(name = "COUNTY_DISTRICT_FULL_SPELL")
    private String countyDistrictFullSpell;

    /**
     * 0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return COUNTY_DISTRICT_CODE
     */
    public String getCountyDistrictCode() {
        return countyDistrictCode;
    }

    /**
     * @param countyDistrictCode
     */
    public void setCountyDistrictCode(String countyDistrictCode) {
        this.countyDistrictCode = countyDistrictCode;
    }

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
     * @return COUNTY_DISTRICT_NAME
     */
    public String getCountyDistrictName() {
        return countyDistrictName;
    }

    /**
     * @param countyDistrictName
     */
    public void setCountyDistrictName(String countyDistrictName) {
        this.countyDistrictName = countyDistrictName;
    }

    /**
     * @return COUNTY_DISTRICT_TYPE_CODE
     */
    public String getCountyDistrictTypeCode() {
        return countyDistrictTypeCode;
    }

    /**
     * @param countyDistrictTypeCode
     */
    public void setCountyDistrictTypeCode(String countyDistrictTypeCode) {
        this.countyDistrictTypeCode = countyDistrictTypeCode;
    }

    /**
     * @return COUNTY_DISTRICT_TYPE_NAME
     */
    public String getCountyDistrictTypeName() {
        return countyDistrictTypeName;
    }

    /**
     * @param countyDistrictTypeName
     */
    public void setCountyDistrictTypeName(String countyDistrictTypeName) {
        this.countyDistrictTypeName = countyDistrictTypeName;
    }

    /**
     * @return COUNTY_DISTRICT_SHORT_SPELL
     */
    public String getCountyDistrictShortSpell() {
        return countyDistrictShortSpell;
    }

    /**
     * @param countyDistrictShortSpell
     */
    public void setCountyDistrictShortSpell(String countyDistrictShortSpell) {
        this.countyDistrictShortSpell = countyDistrictShortSpell;
    }

    /**
     * @return COUNTY_DISTRICT_FULL_SPELL
     */
    public String getCountyDistrictFullSpell() {
        return countyDistrictFullSpell;
    }

    /**
     * @param countyDistrictFullSpell
     */
    public void setCountyDistrictFullSpell(String countyDistrictFullSpell) {
        this.countyDistrictFullSpell = countyDistrictFullSpell;
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