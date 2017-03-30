package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_TRANSFUSION_HISTORY")
public class CtTransfusionHistory {
    @Id
    @Column(name = "TRANSFUSION_HISTORY_KEY_ID")
    private Integer transfusionHistoryKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "TRANSFUSION_TIME")
    private Date transfusionTime;

    @Column(name = "TRANSFUSION_VOLUME")
    private String transfusionVolume;

    /**
     * 见字典007
     */
    @Column(name = "DATA_SOURCE_CODE")
    private String dataSourceCode;

    @Column(name = "TRANSFUSION_REASON")
    private String transfusionReason;

    @Column(name = "REMARK")
    private String remark;

    /**
     * @return TRANSFUSION_HISTORY_KEY_ID
     */
    public Integer getTransfusionHistoryKeyId() {
        return transfusionHistoryKeyId;
    }

    /**
     * @param transfusionHistoryKeyId
     */
    public void setTransfusionHistoryKeyId(Integer transfusionHistoryKeyId) {
        this.transfusionHistoryKeyId = transfusionHistoryKeyId;
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
     * @return TRANSFUSION_TIME
     */
    public Date getTransfusionTime() {
        return transfusionTime;
    }

    /**
     * @param transfusionTime
     */
    public void setTransfusionTime(Date transfusionTime) {
        this.transfusionTime = transfusionTime;
    }

    /**
     * @return TRANSFUSION_VOLUME
     */
    public String getTransfusionVolume() {
        return transfusionVolume;
    }

    /**
     * @param transfusionVolume
     */
    public void setTransfusionVolume(String transfusionVolume) {
        this.transfusionVolume = transfusionVolume;
    }

    /**
     * 获取见字典007
     *
     * @return DATA_SOURCE_CODE - 见字典007
     */
    public String getDataSourceCode() {
        return dataSourceCode;
    }

    /**
     * 设置见字典007
     *
     * @param dataSourceCode 见字典007
     */
    public void setDataSourceCode(String dataSourceCode) {
        this.dataSourceCode = dataSourceCode;
    }

    /**
     * @return TRANSFUSION_REASON
     */
    public String getTransfusionReason() {
        return transfusionReason;
    }

    /**
     * @param transfusionReason
     */
    public void setTransfusionReason(String transfusionReason) {
        this.transfusionReason = transfusionReason;
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}