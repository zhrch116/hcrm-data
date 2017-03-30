package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_PROVINCE_DICT")
public class CtProvinceDict {
    @Id
    @Column(name = "PROVINCE_CODE")
    private String provinceCode;

    @Column(name = "PROVINCE_NAME")
    private String provinceName;

    /**
     * 见字典表
     */
    @Column(name = "PROVINCE_TYPE_CODE")
    private String provinceTypeCode;

    /**
     * 见字典表
     */
    @Column(name = "PROVINCE_TYPE_NAME")
    private String provinceTypeName;

    @Column(name = "PROVINCE_SHORT_SPELL")
    private String provinceShortSpell;

    @Column(name = "PROVINCE_FULL_SPELL")
    private String provinceFullSpell;

    /**
     * 0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

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
     * @return PROVINCE_NAME
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * @param provinceName
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * 获取见字典表
     *
     * @return PROVINCE_TYPE_CODE - 见字典表
     */
    public String getProvinceTypeCode() {
        return provinceTypeCode;
    }

    /**
     * 设置见字典表
     *
     * @param provinceTypeCode 见字典表
     */
    public void setProvinceTypeCode(String provinceTypeCode) {
        this.provinceTypeCode = provinceTypeCode;
    }

    /**
     * 获取见字典表
     *
     * @return PROVINCE_TYPE_NAME - 见字典表
     */
    public String getProvinceTypeName() {
        return provinceTypeName;
    }

    /**
     * 设置见字典表
     *
     * @param provinceTypeName 见字典表
     */
    public void setProvinceTypeName(String provinceTypeName) {
        this.provinceTypeName = provinceTypeName;
    }

    /**
     * @return PROVINCE_SHORT_SPELL
     */
    public String getProvinceShortSpell() {
        return provinceShortSpell;
    }

    /**
     * @param provinceShortSpell
     */
    public void setProvinceShortSpell(String provinceShortSpell) {
        this.provinceShortSpell = provinceShortSpell;
    }

    /**
     * @return PROVINCE_FULL_SPELL
     */
    public String getProvinceFullSpell() {
        return provinceFullSpell;
    }

    /**
     * @param provinceFullSpell
     */
    public void setProvinceFullSpell(String provinceFullSpell) {
        this.provinceFullSpell = provinceFullSpell;
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