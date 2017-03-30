package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_STREET_TOWNSHIP_DICT")
public class CtStreetTownshipDict {
    @Id
    @Column(name = "STREET_TOWNSHIP_CODE")
    private String streetTownshipCode;

    @Column(name = "COUNTY_DISTRICT_CODE")
    private String countyDistrictCode;

    @Column(name = "STREET_TOWNSHIP_NAME")
    private String streetTownshipName;

    @Column(name = "STREET_TOWNSHIP_TYPE_CODE")
    private String streetTownshipTypeCode;

    @Column(name = "STREET_TOWNSHIP_TYPE_NAME")
    private String streetTownshipTypeName;

    @Column(name = "STREET_TOWNSHIP_SHORT_SPELL")
    private String streetTownshipShortSpell;

    @Column(name = "STREET_TOWNSHIP_FULL_SPELL")
    private String streetTownshipFullSpell;

    /**
     * 0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return STREET_TOWNSHIP_CODE
     */
    public String getStreetTownshipCode() {
        return streetTownshipCode;
    }

    /**
     * @param streetTownshipCode
     */
    public void setStreetTownshipCode(String streetTownshipCode) {
        this.streetTownshipCode = streetTownshipCode;
    }

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
     * @return STREET_TOWNSHIP_NAME
     */
    public String getStreetTownshipName() {
        return streetTownshipName;
    }

    /**
     * @param streetTownshipName
     */
    public void setStreetTownshipName(String streetTownshipName) {
        this.streetTownshipName = streetTownshipName;
    }

    /**
     * @return STREET_TOWNSHIP_TYPE_CODE
     */
    public String getStreetTownshipTypeCode() {
        return streetTownshipTypeCode;
    }

    /**
     * @param streetTownshipTypeCode
     */
    public void setStreetTownshipTypeCode(String streetTownshipTypeCode) {
        this.streetTownshipTypeCode = streetTownshipTypeCode;
    }

    /**
     * @return STREET_TOWNSHIP_TYPE_NAME
     */
    public String getStreetTownshipTypeName() {
        return streetTownshipTypeName;
    }

    /**
     * @param streetTownshipTypeName
     */
    public void setStreetTownshipTypeName(String streetTownshipTypeName) {
        this.streetTownshipTypeName = streetTownshipTypeName;
    }

    /**
     * @return STREET_TOWNSHIP_SHORT_SPELL
     */
    public String getStreetTownshipShortSpell() {
        return streetTownshipShortSpell;
    }

    /**
     * @param streetTownshipShortSpell
     */
    public void setStreetTownshipShortSpell(String streetTownshipShortSpell) {
        this.streetTownshipShortSpell = streetTownshipShortSpell;
    }

    /**
     * @return STREET_TOWNSHIP_FULL_SPELL
     */
    public String getStreetTownshipFullSpell() {
        return streetTownshipFullSpell;
    }

    /**
     * @param streetTownshipFullSpell
     */
    public void setStreetTownshipFullSpell(String streetTownshipFullSpell) {
        this.streetTownshipFullSpell = streetTownshipFullSpell;
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