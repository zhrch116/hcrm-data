package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_ETL_JOB_PARAMETER")
public class CtEtlJobParameter {
    @Id
    @Column(name = "JOB_PARAMETER_KEY_ID")
    private Integer jobParameterKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "JOB_CODE")
    private String jobCode;

    @Column(name = "JOB_PARAMETER_DICT_KEY_ID")
    private Integer jobParameterDictKeyId;

    @Column(name = "PARAMETER_CODE")
    private String parameterCode;

    @Column(name = "PARAMETER_VALUE")
    private String parameterValue;

    /**
     * 0-不可用；1-可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return JOB_PARAMETER_KEY_ID
     */
    public Integer getJobParameterKeyId() {
        return jobParameterKeyId;
    }

    /**
     * @param jobParameterKeyId
     */
    public void setJobParameterKeyId(Integer jobParameterKeyId) {
        this.jobParameterKeyId = jobParameterKeyId;
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
     * @return JOB_CODE
     */
    public String getJobCode() {
        return jobCode;
    }

    /**
     * @param jobCode
     */
    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    /**
     * @return JOB_PARAMETER_DICT_KEY_ID
     */
    public Integer getJobParameterDictKeyId() {
        return jobParameterDictKeyId;
    }

    /**
     * @param jobParameterDictKeyId
     */
    public void setJobParameterDictKeyId(Integer jobParameterDictKeyId) {
        this.jobParameterDictKeyId = jobParameterDictKeyId;
    }

    /**
     * @return PARAMETER_CODE
     */
    public String getParameterCode() {
        return parameterCode;
    }

    /**
     * @param parameterCode
     */
    public void setParameterCode(String parameterCode) {
        this.parameterCode = parameterCode;
    }

    /**
     * @return PARAMETER_VALUE
     */
    public String getParameterValue() {
        return parameterValue;
    }

    /**
     * @param parameterValue
     */
    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * 获取0-不可用；1-可用；
     *
     * @return IS_ENABLE - 0-不可用；1-可用；
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * 设置0-不可用；1-可用；
     *
     * @param isEnable 0-不可用；1-可用；
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }
}