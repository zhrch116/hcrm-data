package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_CALL_PLATFORM")
public class CtCallPlatform {
    @Id
    @Column(name = "CALL_PLATFORM_ID")
    private Integer callPlatformId;

    @Column(name = "SUPPLIER_CODE")
    private String supplierCode;

    @Column(name = "CTI_ADDRESS")
    private String ctiAddress;

    @Column(name = "CTI_DB_ADDRESS")
    private String ctiDbAddress;

    @Column(name = "RECORD_UPLOAD_PATH")
    private String recordUploadPath;

    @Column(name = "RECORD_ORI_PATH")
    private String recordOriPath;

    @Column(name = "RECORD_NET_PATH")
    private String recordNetPath;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return CALL_PLATFORM_ID
     */
    public Integer getCallPlatformId() {
        return callPlatformId;
    }

    /**
     * @param callPlatformId
     */
    public void setCallPlatformId(Integer callPlatformId) {
        this.callPlatformId = callPlatformId;
    }

    /**
     * @return SUPPLIER_CODE
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * @param supplierCode
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    /**
     * @return CTI_ADDRESS
     */
    public String getCtiAddress() {
        return ctiAddress;
    }

    /**
     * @param ctiAddress
     */
    public void setCtiAddress(String ctiAddress) {
        this.ctiAddress = ctiAddress;
    }

    /**
     * @return CTI_DB_ADDRESS
     */
    public String getCtiDbAddress() {
        return ctiDbAddress;
    }

    /**
     * @param ctiDbAddress
     */
    public void setCtiDbAddress(String ctiDbAddress) {
        this.ctiDbAddress = ctiDbAddress;
    }

    /**
     * @return RECORD_UPLOAD_PATH
     */
    public String getRecordUploadPath() {
        return recordUploadPath;
    }

    /**
     * @param recordUploadPath
     */
    public void setRecordUploadPath(String recordUploadPath) {
        this.recordUploadPath = recordUploadPath;
    }

    /**
     * @return RECORD_ORI_PATH
     */
    public String getRecordOriPath() {
        return recordOriPath;
    }

    /**
     * @param recordOriPath
     */
    public void setRecordOriPath(String recordOriPath) {
        this.recordOriPath = recordOriPath;
    }

    /**
     * @return RECORD_NET_PATH
     */
    public String getRecordNetPath() {
        return recordNetPath;
    }

    /**
     * @param recordNetPath
     */
    public void setRecordNetPath(String recordNetPath) {
        this.recordNetPath = recordNetPath;
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