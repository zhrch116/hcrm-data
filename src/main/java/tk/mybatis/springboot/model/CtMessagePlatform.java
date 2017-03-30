package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_MESSAGE_PLATFORM")
public class CtMessagePlatform {
    @Id
    @Column(name = "MESSAGE_PLATFORM_ID")
    private Integer messagePlatformId;

    @Column(name = "MESSAGE_SUPPLIER_CODE")
    private String messageSupplierCode;

    @Column(name = "ENTERPRISE_ID")
    private String enterpriseId;

    @Column(name = "MESSAGE_ADDRESS")
    private String messageAddress;

    @Column(name = "MESSAGE_USERNAME")
    private String messageUsername;

    @Column(name = "MESSAGE_PASSWORD")
    private String messagePassword;

    @Column(name = "MESSAGE_SIGNATURE_LENGTH")
    private Integer messageSignatureLength;

    @Column(name = "REPLY_QUERY_ADDRESS")
    private String replyQueryAddress;

    @Column(name = "REPLY_CONFIRM_ADDRESS")
    private String replyConfirmAddress;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return MESSAGE_PLATFORM_ID
     */
    public Integer getMessagePlatformId() {
        return messagePlatformId;
    }

    /**
     * @param messagePlatformId
     */
    public void setMessagePlatformId(Integer messagePlatformId) {
        this.messagePlatformId = messagePlatformId;
    }

    /**
     * @return MESSAGE_SUPPLIER_CODE
     */
    public String getMessageSupplierCode() {
        return messageSupplierCode;
    }

    /**
     * @param messageSupplierCode
     */
    public void setMessageSupplierCode(String messageSupplierCode) {
        this.messageSupplierCode = messageSupplierCode;
    }

    /**
     * @return ENTERPRISE_ID
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * @param enterpriseId
     */
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * @return MESSAGE_ADDRESS
     */
    public String getMessageAddress() {
        return messageAddress;
    }

    /**
     * @param messageAddress
     */
    public void setMessageAddress(String messageAddress) {
        this.messageAddress = messageAddress;
    }

    /**
     * @return MESSAGE_USERNAME
     */
    public String getMessageUsername() {
        return messageUsername;
    }

    /**
     * @param messageUsername
     */
    public void setMessageUsername(String messageUsername) {
        this.messageUsername = messageUsername;
    }

    /**
     * @return MESSAGE_PASSWORD
     */
    public String getMessagePassword() {
        return messagePassword;
    }

    /**
     * @param messagePassword
     */
    public void setMessagePassword(String messagePassword) {
        this.messagePassword = messagePassword;
    }

    /**
     * @return MESSAGE_SIGNATURE_LENGTH
     */
    public Integer getMessageSignatureLength() {
        return messageSignatureLength;
    }

    /**
     * @param messageSignatureLength
     */
    public void setMessageSignatureLength(Integer messageSignatureLength) {
        this.messageSignatureLength = messageSignatureLength;
    }

    /**
     * @return REPLY_QUERY_ADDRESS
     */
    public String getReplyQueryAddress() {
        return replyQueryAddress;
    }

    /**
     * @param replyQueryAddress
     */
    public void setReplyQueryAddress(String replyQueryAddress) {
        this.replyQueryAddress = replyQueryAddress;
    }

    /**
     * @return REPLY_CONFIRM_ADDRESS
     */
    public String getReplyConfirmAddress() {
        return replyConfirmAddress;
    }

    /**
     * @param replyConfirmAddress
     */
    public void setReplyConfirmAddress(String replyConfirmAddress) {
        this.replyConfirmAddress = replyConfirmAddress;
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