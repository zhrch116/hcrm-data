package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_CALL_RECORD")
public class CtCallRecord {
    /**
     * 云呼叫返回的本次呼叫ID
     */
    @Id
    @Column(name = "CALL_ID")
    private Integer callId;

    @Column(name = "CALL_RETURN_ID")
    private String callReturnId;

    @Column(name = "CALL_START_TIME")
    private Date callStartTime;

    /**
     * 单位为秒
     */
    @Column(name = "CALL_DURATION")
    private Integer callDuration;

    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * 如果客服用座机拨打，就取客服表中的<工作电话>
     */
    @Column(name = "CALLING_TELEPHONE")
    private String callingTelephone;

    @Column(name = "CALLED_TELEPHONE")
    private String calledTelephone;

    @Column(name = "CALL_LOCAL_ADDRESS")
    private String callLocalAddress;

    @Column(name = "CALL_SUPPLIER_ADDRESS")
    private String callSupplierAddress;

    @Column(name = "SUPPLIER_CODE")
    private String supplierCode;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Integer isEnable;

    /**
     * 获取云呼叫返回的本次呼叫ID
     *
     * @return CALL_ID - 云呼叫返回的本次呼叫ID
     */
    public Integer getCallId() {
        return callId;
    }

    /**
     * 设置云呼叫返回的本次呼叫ID
     *
     * @param callId 云呼叫返回的本次呼叫ID
     */
    public void setCallId(Integer callId) {
        this.callId = callId;
    }

    /**
     * @return CALL_RETURN_ID
     */
    public String getCallReturnId() {
        return callReturnId;
    }

    /**
     * @param callReturnId
     */
    public void setCallReturnId(String callReturnId) {
        this.callReturnId = callReturnId;
    }

    /**
     * @return CALL_START_TIME
     */
    public Date getCallStartTime() {
        return callStartTime;
    }

    /**
     * @param callStartTime
     */
    public void setCallStartTime(Date callStartTime) {
        this.callStartTime = callStartTime;
    }

    /**
     * 获取单位为秒
     *
     * @return CALL_DURATION - 单位为秒
     */
    public Integer getCallDuration() {
        return callDuration;
    }

    /**
     * 设置单位为秒
     *
     * @param callDuration 单位为秒
     */
    public void setCallDuration(Integer callDuration) {
        this.callDuration = callDuration;
    }

    /**
     * @return USER_ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取如果客服用座机拨打，就取客服表中的<工作电话>
     *
     * @return CALLING_TELEPHONE - 如果客服用座机拨打，就取客服表中的<工作电话>
     */
    public String getCallingTelephone() {
        return callingTelephone;
    }

    /**
     * 设置如果客服用座机拨打，就取客服表中的<工作电话>
     *
     * @param callingTelephone 如果客服用座机拨打，就取客服表中的<工作电话>
     */
    public void setCallingTelephone(String callingTelephone) {
        this.callingTelephone = callingTelephone;
    }

    /**
     * @return CALLED_TELEPHONE
     */
    public String getCalledTelephone() {
        return calledTelephone;
    }

    /**
     * @param calledTelephone
     */
    public void setCalledTelephone(String calledTelephone) {
        this.calledTelephone = calledTelephone;
    }

    /**
     * @return CALL_LOCAL_ADDRESS
     */
    public String getCallLocalAddress() {
        return callLocalAddress;
    }

    /**
     * @param callLocalAddress
     */
    public void setCallLocalAddress(String callLocalAddress) {
        this.callLocalAddress = callLocalAddress;
    }

    /**
     * @return CALL_SUPPLIER_ADDRESS
     */
    public String getCallSupplierAddress() {
        return callSupplierAddress;
    }

    /**
     * @param callSupplierAddress
     */
    public void setCallSupplierAddress(String callSupplierAddress) {
        this.callSupplierAddress = callSupplierAddress;
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
     * 获取标记该条记录是否可用，0：不可用；1：可用；
     *
     * @return IS_ENABLE - 标记该条记录是否可用，0：不可用；1：可用；
     */
    public Integer getIsEnable() {
        return isEnable;
    }

    /**
     * 设置标记该条记录是否可用，0：不可用；1：可用；
     *
     * @param isEnable 标记该条记录是否可用，0：不可用；1：可用；
     */
    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }
}