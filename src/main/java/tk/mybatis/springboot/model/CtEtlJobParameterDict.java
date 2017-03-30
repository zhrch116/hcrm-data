package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_ETL_JOB_PARAMETER_DICT")
public class CtEtlJobParameterDict {
    @Id
    @Column(name = "JOB_PARAMETER_DICT_KEY_ID")
    private Integer jobParameterDictKeyId;

    @Column(name = "PARAMETER_CODE")
    private String parameterCode;

    @Column(name = "PARAMETER_NAME")
    private String parameterName;

    @Column(name = "VARIABLE_NAME")
    private String variableName;

    @Column(name = "PARAMETER_DESCRIPTION")
    private String parameterDescription;

    /**
     * 0-不可用；1-可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

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
     * @return PARAMETER_NAME
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * @param parameterName
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * @return VARIABLE_NAME
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * @param variableName
     */
    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    /**
     * @return PARAMETER_DESCRIPTION
     */
    public String getParameterDescription() {
        return parameterDescription;
    }

    /**
     * @param parameterDescription
     */
    public void setParameterDescription(String parameterDescription) {
        this.parameterDescription = parameterDescription;
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