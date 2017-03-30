package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_DRAWN_BLACK")
public class CtDrawnBlack {
    @Id
    @Column(name = "DRAWN_BLACK_KEY_ID")
    private Integer drawnBlackKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "DRAWN_BLACK_TASK_ID")
    private Integer drawnBlackTaskId;

    @Column(name = "DRAWN_BLACK_REASON_CODE")
    private String drawnBlackReasonCode;

    @Column(name = "DRAWN_BLACK_REASON_NAME")
    private String drawnBlackReasonName;

    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    @Column(name = "DRAWN_BLACK_TIME")
    private Date drawnBlackTime;

    /**
     * 0：未解除；1：已解除
     */
    @Column(name = "IS_RELIEVE")
    private Integer isRelieve;

    @Column(name = "RELIEVE_TIME")
    private Date relieveTime;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return DRAWN_BLACK_KEY_ID
     */
    public Integer getDrawnBlackKeyId() {
        return drawnBlackKeyId;
    }

    /**
     * @param drawnBlackKeyId
     */
    public void setDrawnBlackKeyId(Integer drawnBlackKeyId) {
        this.drawnBlackKeyId = drawnBlackKeyId;
    }

    /**
     * @return PATIENT_KEY_ID
     */
    public Integer getPatientKeyId() {
        return patientKeyId;
    }

    /**
     * @param patientKeyId
     */
    public void setPatientKeyId(Integer patientKeyId) {
        this.patientKeyId = patientKeyId;
    }

    /**
     * @return DRAWN_BLACK_TASK_ID
     */
    public Integer getDrawnBlackTaskId() {
        return drawnBlackTaskId;
    }

    /**
     * @param drawnBlackTaskId
     */
    public void setDrawnBlackTaskId(Integer drawnBlackTaskId) {
        this.drawnBlackTaskId = drawnBlackTaskId;
    }

    /**
     * @return DRAWN_BLACK_REASON_CODE
     */
    public String getDrawnBlackReasonCode() {
        return drawnBlackReasonCode;
    }

    /**
     * @param drawnBlackReasonCode
     */
    public void setDrawnBlackReasonCode(String drawnBlackReasonCode) {
        this.drawnBlackReasonCode = drawnBlackReasonCode;
    }

    /**
     * @return DRAWN_BLACK_REASON_NAME
     */
    public String getDrawnBlackReasonName() {
        return drawnBlackReasonName;
    }

    /**
     * @param drawnBlackReasonName
     */
    public void setDrawnBlackReasonName(String drawnBlackReasonName) {
        this.drawnBlackReasonName = drawnBlackReasonName;
    }

    /**
     * @return CUSTOMER_ID
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * @return DRAWN_BLACK_TIME
     */
    public Date getDrawnBlackTime() {
        return drawnBlackTime;
    }

    /**
     * @param drawnBlackTime
     */
    public void setDrawnBlackTime(Date drawnBlackTime) {
        this.drawnBlackTime = drawnBlackTime;
    }

    /**
     * 获取0：未解除；1：已解除
     *
     * @return IS_RELIEVE - 0：未解除；1：已解除
     */
    public Integer getIsRelieve() {
        return isRelieve;
    }

    /**
     * 设置0：未解除；1：已解除
     *
     * @param isRelieve 0：未解除；1：已解除
     */
    public void setIsRelieve(Integer isRelieve) {
        this.isRelieve = isRelieve;
    }

    /**
     * @return RELIEVE_TIME
     */
    public Date getRelieveTime() {
        return relieveTime;
    }

    /**
     * @param relieveTime
     */
    public void setRelieveTime(Date relieveTime) {
        this.relieveTime = relieveTime;
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