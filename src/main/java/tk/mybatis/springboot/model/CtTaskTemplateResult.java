package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_TASK_TEMPLATE_RESULT")
public class CtTaskTemplateResult {
    @Id
    @Column(name = "TASK_TEMPLATE_RESULT_KEY_ID")
    private Integer taskTemplateResultKeyId;

    @Column(name = "TASK_TEMPLATE_REL_KEY_ID")
    private Integer taskTemplateRelKeyId;

    @Column(name = "PROBLEM_ID")
    private Integer problemId;

    @Column(name = "SUBJECTIVE_ANSWERS")
    private String subjectiveAnswers;

    /**
     * 多选题的多个选项ID用「，」符号隔开拼接起来
     */
    @Column(name = "OBJECTIVE_ANSWERS")
    private String objectiveAnswers;

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
     * @return TASK_TEMPLATE_RESULT_KEY_ID
     */
    public Integer getTaskTemplateResultKeyId() {
        return taskTemplateResultKeyId;
    }

    /**
     * @param taskTemplateResultKeyId
     */
    public void setTaskTemplateResultKeyId(Integer taskTemplateResultKeyId) {
        this.taskTemplateResultKeyId = taskTemplateResultKeyId;
    }

    /**
     * @return TASK_TEMPLATE_REL_KEY_ID
     */
    public Integer getTaskTemplateRelKeyId() {
        return taskTemplateRelKeyId;
    }

    /**
     * @param taskTemplateRelKeyId
     */
    public void setTaskTemplateRelKeyId(Integer taskTemplateRelKeyId) {
        this.taskTemplateRelKeyId = taskTemplateRelKeyId;
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
     * @return SUBJECTIVE_ANSWERS
     */
    public String getSubjectiveAnswers() {
        return subjectiveAnswers;
    }

    /**
     * @param subjectiveAnswers
     */
    public void setSubjectiveAnswers(String subjectiveAnswers) {
        this.subjectiveAnswers = subjectiveAnswers;
    }

    /**
     * 获取多选题的多个选项ID用「，」符号隔开拼接起来
     *
     * @return OBJECTIVE_ANSWERS - 多选题的多个选项ID用「，」符号隔开拼接起来
     */
    public String getObjectiveAnswers() {
        return objectiveAnswers;
    }

    /**
     * 设置多选题的多个选项ID用「，」符号隔开拼接起来
     *
     * @param objectiveAnswers 多选题的多个选项ID用「，」符号隔开拼接起来
     */
    public void setObjectiveAnswers(String objectiveAnswers) {
        this.objectiveAnswers = objectiveAnswers;
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