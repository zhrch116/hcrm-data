package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_SPECIAL_DISEASE_TASK_RESULT")
public class CtSpecialDiseaseTaskResult {
    @Id
    @Column(name = "TASK_RESULT_KEY_ID")
    private Integer taskResultKeyId;

    @Column(name = "TASK_KEY_ID")
    private Integer taskKeyId;

    @Column(name = "TEMPLATE_KEY_ID")
    private Integer templateKeyId;

    @Column(name = "FIELD_KEY_ID")
    private Integer fieldKeyId;

    /**
     * 多选题存储成本表中的多行数据
     */
    @Column(name = "OBJECTIVE_ANSWERS")
    private String objectiveAnswers;

    /**
     * 本行数据创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    @Column(name = "SUBJECTIVE_ANSWERS")
    private String subjectiveAnswers;

    /**
     * @return TASK_RESULT_KEY_ID
     */
    public Integer getTaskResultKeyId() {
        return taskResultKeyId;
    }

    /**
     * @param taskResultKeyId
     */
    public void setTaskResultKeyId(Integer taskResultKeyId) {
        this.taskResultKeyId = taskResultKeyId;
    }

    /**
     * @return TASK_KEY_ID
     */
    public Integer getTaskKeyId() {
        return taskKeyId;
    }

    /**
     * @param taskKeyId
     */
    public void setTaskKeyId(Integer taskKeyId) {
        this.taskKeyId = taskKeyId;
    }

    /**
     * @return TEMPLATE_KEY_ID
     */
    public Integer getTemplateKeyId() {
        return templateKeyId;
    }

    /**
     * @param templateKeyId
     */
    public void setTemplateKeyId(Integer templateKeyId) {
        this.templateKeyId = templateKeyId;
    }

    /**
     * @return FIELD_KEY_ID
     */
    public Integer getFieldKeyId() {
        return fieldKeyId;
    }

    /**
     * @param fieldKeyId
     */
    public void setFieldKeyId(Integer fieldKeyId) {
        this.fieldKeyId = fieldKeyId;
    }

    /**
     * 获取多选题存储成本表中的多行数据
     *
     * @return OBJECTIVE_ANSWERS - 多选题存储成本表中的多行数据
     */
    public String getObjectiveAnswers() {
        return objectiveAnswers;
    }

    /**
     * 设置多选题存储成本表中的多行数据
     *
     * @param objectiveAnswers 多选题存储成本表中的多行数据
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
}