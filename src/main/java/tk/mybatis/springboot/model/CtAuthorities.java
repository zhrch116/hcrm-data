package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_AUTHORITIES")
public class CtAuthorities {
    @Id
    @Column(name = "AUTHORITIES_KEY_ID")
    private Integer authoritiesKeyId;

    @Column(name = "AUTHORITIES_CODE")
    private String authoritiesCode;

    @Column(name = "AUTHORITIES_NAME")
    private String authoritiesName;

    @Column(name = "PARENT_AUTHORITIES_CODE")
    private String parentAuthoritiesCode;

    @Column(name = "AUTHORITIES_LEVEL")
    private Integer authoritiesLevel;

    @Column(name = "AUTHORITIES_ORDER")
    private Integer authoritiesOrder;

    @Column(name = "AUTHORITIES_TYPE_CODE")
    private String authoritiesTypeCode;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return AUTHORITIES_KEY_ID
     */
    public Integer getAuthoritiesKeyId() {
        return authoritiesKeyId;
    }

    /**
     * @param authoritiesKeyId
     */
    public void setAuthoritiesKeyId(Integer authoritiesKeyId) {
        this.authoritiesKeyId = authoritiesKeyId;
    }

    /**
     * @return AUTHORITIES_CODE
     */
    public String getAuthoritiesCode() {
        return authoritiesCode;
    }

    /**
     * @param authoritiesCode
     */
    public void setAuthoritiesCode(String authoritiesCode) {
        this.authoritiesCode = authoritiesCode;
    }

    /**
     * @return AUTHORITIES_NAME
     */
    public String getAuthoritiesName() {
        return authoritiesName;
    }

    /**
     * @param authoritiesName
     */
    public void setAuthoritiesName(String authoritiesName) {
        this.authoritiesName = authoritiesName;
    }

    /**
     * @return PARENT_AUTHORITIES_CODE
     */
    public String getParentAuthoritiesCode() {
        return parentAuthoritiesCode;
    }

    /**
     * @param parentAuthoritiesCode
     */
    public void setParentAuthoritiesCode(String parentAuthoritiesCode) {
        this.parentAuthoritiesCode = parentAuthoritiesCode;
    }

    /**
     * @return AUTHORITIES_LEVEL
     */
    public Integer getAuthoritiesLevel() {
        return authoritiesLevel;
    }

    /**
     * @param authoritiesLevel
     */
    public void setAuthoritiesLevel(Integer authoritiesLevel) {
        this.authoritiesLevel = authoritiesLevel;
    }

    /**
     * @return AUTHORITIES_ORDER
     */
    public Integer getAuthoritiesOrder() {
        return authoritiesOrder;
    }

    /**
     * @param authoritiesOrder
     */
    public void setAuthoritiesOrder(Integer authoritiesOrder) {
        this.authoritiesOrder = authoritiesOrder;
    }

    /**
     * @return AUTHORITIES_TYPE_CODE
     */
    public String getAuthoritiesTypeCode() {
        return authoritiesTypeCode;
    }

    /**
     * @param authoritiesTypeCode
     */
    public void setAuthoritiesTypeCode(String authoritiesTypeCode) {
        this.authoritiesTypeCode = authoritiesTypeCode;
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