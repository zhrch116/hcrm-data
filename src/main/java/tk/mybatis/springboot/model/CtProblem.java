package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_PROBLEM")
public class CtProblem {
    @Id
    @Column(name = "PROBLEM_ID")
    private Integer problemId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "PROBLEM_CONTENT")
    private String problemContent;

    /**
     * 字典表中就诊类别编码，区分住院/门诊/体检
     */
    @Column(name = "MEDICAL_CLASS_CODE")
    private String medicalClassCode;

    /**
     * 字典表中主观题、单选题和多选题的字典编码DICT_VALUE_CODE
     */
    @Column(name = "PROBLEM_FORM_CODE")
    private String problemFormCode;

    /**
     * 字典表中满意度、医学和科研类型的DICT_VALUE_CODE
     */
    @Column(name = "PROBLEM_TYPE")
    private String problemType;

    @Column(name = "PROBLEM_DESCRIPTION")
    private String problemDescription;

    @Column(name = "PROBLEM_SCORE")
    private Integer problemScore;

    /**
     * 非选择题本字段为空，字段值为1表示自定义选项类型，字段值为2表示固定选项类型
     */
    @Column(name = "OPTION_TYPE")
    private Integer optionType;

    /**
     * 创建题目的用户的姓名
     */
    @Column(name = "CREATOR_ID")
    private String creatorId;

    /**
     * 本行数据创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 修改题目的用户的姓名
     */
    @Column(name = "EDITOR_ID")
    private String editorId;

    /**
     * 本行数据最后更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 0 代表未被引用，1 代表已被引用
     */
    @Column(name = "WHETHER_USED")
    private Boolean whetherUsed;

    /**
     * 标记该条记录是否可用， 0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

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
     * @return PROBLEM_CONTENT
     */
    public String getProblemContent() {
        return problemContent;
    }

    /**
     * @param problemContent
     */
    public void setProblemContent(String problemContent) {
        this.problemContent = problemContent;
    }

    /**
     * 获取字典表中就诊类别编码，区分住院/门诊/体检
     *
     * @return MEDICAL_CLASS_CODE - 字典表中就诊类别编码，区分住院/门诊/体检
     */
    public String getMedicalClassCode() {
        return medicalClassCode;
    }

    /**
     * 设置字典表中就诊类别编码，区分住院/门诊/体检
     *
     * @param medicalClassCode 字典表中就诊类别编码，区分住院/门诊/体检
     */
    public void setMedicalClassCode(String medicalClassCode) {
        this.medicalClassCode = medicalClassCode;
    }

    /**
     * 获取字典表中主观题、单选题和多选题的字典编码DICT_VALUE_CODE
     *
     * @return PROBLEM_FORM_CODE - 字典表中主观题、单选题和多选题的字典编码DICT_VALUE_CODE
     */
    public String getProblemFormCode() {
        return problemFormCode;
    }

    /**
     * 设置字典表中主观题、单选题和多选题的字典编码DICT_VALUE_CODE
     *
     * @param problemFormCode 字典表中主观题、单选题和多选题的字典编码DICT_VALUE_CODE
     */
    public void setProblemFormCode(String problemFormCode) {
        this.problemFormCode = problemFormCode;
    }

    /**
     * 获取字典表中满意度、医学和科研类型的DICT_VALUE_CODE
     *
     * @return PROBLEM_TYPE - 字典表中满意度、医学和科研类型的DICT_VALUE_CODE
     */
    public String getProblemType() {
        return problemType;
    }

    /**
     * 设置字典表中满意度、医学和科研类型的DICT_VALUE_CODE
     *
     * @param problemType 字典表中满意度、医学和科研类型的DICT_VALUE_CODE
     */
    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    /**
     * @return PROBLEM_DESCRIPTION
     */
    public String getProblemDescription() {
        return problemDescription;
    }

    /**
     * @param problemDescription
     */
    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    /**
     * @return PROBLEM_SCORE
     */
    public Integer getProblemScore() {
        return problemScore;
    }

    /**
     * @param problemScore
     */
    public void setProblemScore(Integer problemScore) {
        this.problemScore = problemScore;
    }

    /**
     * 获取非选择题本字段为空，字段值为1表示自定义选项类型，字段值为2表示固定选项类型
     *
     * @return OPTION_TYPE - 非选择题本字段为空，字段值为1表示自定义选项类型，字段值为2表示固定选项类型
     */
    public Integer getOptionType() {
        return optionType;
    }

    /**
     * 设置非选择题本字段为空，字段值为1表示自定义选项类型，字段值为2表示固定选项类型
     *
     * @param optionType 非选择题本字段为空，字段值为1表示自定义选项类型，字段值为2表示固定选项类型
     */
    public void setOptionType(Integer optionType) {
        this.optionType = optionType;
    }

    /**
     * 获取创建题目的用户的姓名
     *
     * @return CREATOR_ID - 创建题目的用户的姓名
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建题目的用户的姓名
     *
     * @param creatorId 创建题目的用户的姓名
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
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
     * 获取修改题目的用户的姓名
     *
     * @return EDITOR_ID - 修改题目的用户的姓名
     */
    public String getEditorId() {
        return editorId;
    }

    /**
     * 设置修改题目的用户的姓名
     *
     * @param editorId 修改题目的用户的姓名
     */
    public void setEditorId(String editorId) {
        this.editorId = editorId;
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
     * 获取0 代表未被引用，1 代表已被引用
     *
     * @return WHETHER_USED - 0 代表未被引用，1 代表已被引用
     */
    public Boolean getWhetherUsed() {
        return whetherUsed;
    }

    /**
     * 设置0 代表未被引用，1 代表已被引用
     *
     * @param whetherUsed 0 代表未被引用，1 代表已被引用
     */
    public void setWhetherUsed(Boolean whetherUsed) {
        this.whetherUsed = whetherUsed;
    }

    /**
     * 获取标记该条记录是否可用， 0：不可用；1：可用；
     *
     * @return IS_ENABLE - 标记该条记录是否可用， 0：不可用；1：可用；
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * 设置标记该条记录是否可用， 0：不可用；1：可用；
     *
     * @param isEnable 标记该条记录是否可用， 0：不可用；1：可用；
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }
}