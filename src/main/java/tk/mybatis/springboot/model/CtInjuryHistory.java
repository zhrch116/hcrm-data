package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_INJURY_HISTORY")
public class CtInjuryHistory {
    @Id
    @Column(name = "INJURY_HISTORY_KEY_ID")
    private Integer injuryHistoryKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "INJURY_NAME")
    private String injuryName;

    @Column(name = "INJURY_TIME")
    private Date injuryTime;

    /**
     * 见字典007
     */
    @Column(name = "DATA_SOURCE_CODE")
    private String dataSourceCode;

    @Column(name = "REMARK")
    private String remark;

    /**
     * @return INJURY_HISTORY_KEY_ID
     */
    public Integer getInjuryHistoryKeyId() {
        return injuryHistoryKeyId;
    }

    /**
     * @param injuryHistoryKeyId
     */
    public void setInjuryHistoryKeyId(Integer injuryHistoryKeyId) {
        this.injuryHistoryKeyId = injuryHistoryKeyId;
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
     * @return INJURY_NAME
     */
    public String getInjuryName() {
        return injuryName;
    }

    /**
     * @param injuryName
     */
    public void setInjuryName(String injuryName) {
        this.injuryName = injuryName;
    }

    /**
     * @return INJURY_TIME
     */
    public Date getInjuryTime() {
        return injuryTime;
    }

    /**
     * @param injuryTime
     */
    public void setInjuryTime(Date injuryTime) {
        this.injuryTime = injuryTime;
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