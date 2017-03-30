package tk.mybatis.springboot.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_CHRONIC_NEPHROPATHY_CKD_RESULT")
public class CtChronicNephropathyCkdResult {
    @Id
    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Id
    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    /**
     * 根据HIS和随访信息中的最新数据计算得到CKD_RESULT
     */
    @Column(name = "CKD_RESULT")
    private BigDecimal ckdResult;

    /**
     * 根据CKD结果值划分出分期信息
     */
    @Column(name = "CKD_STAGE_RESULT")
    private String ckdStageResult;

    /**
     * 本行数据创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 本行数据最后更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

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
     * @return HOSPITAL_ID
     */
    public Integer getHospitalId() {
        return hospitalId;
    }

    /**
     * @param hospitalId
     */
    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    /**
     * 获取根据HIS和随访信息中的最新数据计算得到CKD_RESULT
     *
     * @return CKD_RESULT - 根据HIS和随访信息中的最新数据计算得到CKD_RESULT
     */
    public BigDecimal getCkdResult() {
        return ckdResult;
    }

    /**
     * 设置根据HIS和随访信息中的最新数据计算得到CKD_RESULT
     *
     * @param ckdResult 根据HIS和随访信息中的最新数据计算得到CKD_RESULT
     */
    public void setCkdResult(BigDecimal ckdResult) {
        this.ckdResult = ckdResult;
    }

    /**
     * 获取根据CKD结果值划分出分期信息
     *
     * @return CKD_STAGE_RESULT - 根据CKD结果值划分出分期信息
     */
    public String getCkdStageResult() {
        return ckdStageResult;
    }

    /**
     * 设置根据CKD结果值划分出分期信息
     *
     * @param ckdStageResult 根据CKD结果值划分出分期信息
     */
    public void setCkdStageResult(String ckdStageResult) {
        this.ckdStageResult = ckdStageResult;
    }

    /**
     * 获取本行数据创建时间
     *
     * @return CREATE_TIME - 本行数据创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置本行数据创建时间
     *
     * @param createTime 本行数据创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取本行数据最后更新时间
     *
     * @return UPDATE_TIME - 本行数据最后更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置本行数据最后更新时间
     *
     * @param updateTime 本行数据最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取标记该条记录是否可用，0：不可用；1：可用；
     *
     * @return IS_ENABLE - 标记该条记录是否可用，0：不可用；1：可用；
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * 设置标记该条记录是否可用，0：不可用；1：可用；
     *
     * @param isEnable 标记该条记录是否可用，0：不可用；1：可用；
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }
}