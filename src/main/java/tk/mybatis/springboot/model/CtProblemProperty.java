package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_PROBLEM_PROPERTY")
public class CtProblemProperty {
    @Id
    @Column(name = "PROBLEM_PROPERTY_ID")
    private Integer problemPropertyId;

    @Column(name = "PROBLEM_ID")
    private Integer problemId;

    /**
     * 是从字典表中获取的DICT_VALUE_CODE，比如：00900020
     */
    @Column(name = "PROBLEM_PROPERTY_CODE")
    private String problemPropertyCode;

    /**
     * 是从字典表中获取的DICT_VALUE_NAME，比如：科室
     */
    @Column(name = "PROBLEM_PROPERTY_NAME")
    private String problemPropertyName;

    /**
     * 比如：存储具体的科室ID，比如：27；疾病编码：A00.1等
     */
    @Column(name = "PROBLEM_PROPERTY_VALUE_CODE")
    private String problemPropertyValueCode;

    /**
     * 比如：存储具体的科室名称，比如：27对应的是肿瘤科，这里保存；疾病编码：A00.1对应的慢性咽炎等
     */
    @Column(name = "PROBLEM_PROPERTY_VALUE_NAME")
    private String problemPropertyValueName;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return PROBLEM_PROPERTY_ID
     */
    public Integer getProblemPropertyId() {
        return problemPropertyId;
    }

    /**
     * @param problemPropertyId
     */
    public void setProblemPropertyId(Integer problemPropertyId) {
        this.problemPropertyId = problemPropertyId;
    }

    /**
     * @return PROBLEM_ID
     */
    public Integer getProblemId() {
        return problemId;
    }

    /**
     * @param problemId
     */
    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    /**
     * 获取是从字典表中获取的DICT_VALUE_CODE，比如：00900020
     *
     * @return PROBLEM_PROPERTY_CODE - 是从字典表中获取的DICT_VALUE_CODE，比如：00900020
     */
    public String getProblemPropertyCode() {
        return problemPropertyCode;
    }

    /**
     * 设置是从字典表中获取的DICT_VALUE_CODE，比如：00900020
     *
     * @param problemPropertyCode 是从字典表中获取的DICT_VALUE_CODE，比如：00900020
     */
    public void setProblemPropertyCode(String problemPropertyCode) {
        this.problemPropertyCode = problemPropertyCode;
    }

    /**
     * 获取是从字典表中获取的DICT_VALUE_NAME，比如：科室
     *
     * @return PROBLEM_PROPERTY_NAME - 是从字典表中获取的DICT_VALUE_NAME，比如：科室
     */
    public String getProblemPropertyName() {
        return problemPropertyName;
    }

    /**
     * 设置是从字典表中获取的DICT_VALUE_NAME，比如：科室
     *
     * @param problemPropertyName 是从字典表中获取的DICT_VALUE_NAME，比如：科室
     */
    public void setProblemPropertyName(String problemPropertyName) {
        this.problemPropertyName = problemPropertyName;
    }

    /**
     * 获取比如：存储具体的科室ID，比如：27；疾病编码：A00.1等
     *
     * @return PROBLEM_PROPERTY_VALUE_CODE - 比如：存储具体的科室ID，比如：27；疾病编码：A00.1等
     */
    public String getProblemPropertyValueCode() {
        return problemPropertyValueCode;
    }

    /**
     * 设置比如：存储具体的科室ID，比如：27；疾病编码：A00.1等
     *
     * @param problemPropertyValueCode 比如：存储具体的科室ID，比如：27；疾病编码：A00.1等
     */
    public void setProblemPropertyValueCode(String problemPropertyValueCode) {
        this.problemPropertyValueCode = problemPropertyValueCode;
    }

    /**
     * 获取比如：存储具体的科室名称，比如：27对应的是肿瘤科，这里保存；疾病编码：A00.1对应的慢性咽炎等
     *
     * @return PROBLEM_PROPERTY_VALUE_NAME - 比如：存储具体的科室名称，比如：27对应的是肿瘤科，这里保存；疾病编码：A00.1对应的慢性咽炎等
     */
    public String getProblemPropertyValueName() {
        return problemPropertyValueName;
    }

    /**
     * 设置比如：存储具体的科室名称，比如：27对应的是肿瘤科，这里保存；疾病编码：A00.1对应的慢性咽炎等
     *
     * @param problemPropertyValueName 比如：存储具体的科室名称，比如：27对应的是肿瘤科，这里保存；疾病编码：A00.1对应的慢性咽炎等
     */
    public void setProblemPropertyValueName(String problemPropertyValueName) {
        this.problemPropertyValueName = problemPropertyValueName;
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