package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_TREATMENT_PLAN_DETAIL")
public class CtTreatmentPlanDetail {
    @Id
    @Column(name = "TREATMENT_PLAN_DETAIL_KEY_ID")
    private Integer treatmentPlanDetailKeyId;

    @Column(name = "TREATMENT_PLAN_KEY_ID")
    private Integer treatmentPlanKeyId;

    @Column(name = "TEMPLATE_KEY_ID")
    private Integer templateKeyId;

    @Column(name = "QUESTION_KEY_ID")
    private Integer questionKeyId;

    /**
     * 多选题存储成本表中的多行数据
     */
    @Column(name = "OBJECTIVE_ANSWERS")
    private String objectiveAnswers;

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

    @Column(name = "SUBJECTIVE_ANSWERS")
    private String subjectiveAnswers;

    /**
     * @return TREATMENT_PLAN_DETAIL_KEY_ID
     */
    public Integer getTreatmentPlanDetailKeyId() {
        return treatmentPlanDetailKeyId;
    }

    /**
     * @param treatmentPlanDetailKeyId
     */
    public void setTreatmentPlanDetailKeyId(Integer treatmentPlanDetailKeyId) {
        this.treatmentPlanDetailKeyId = treatmentPlanDetailKeyId;
    }

    /**
     * @return TREATMENT_PLAN_KEY_ID
     */
    public Integer getTreatmentPlanKeyId() {
        return treatmentPlanKeyId;
    }

    /**
     * @param treatmentPlanKeyId
     */
    public void setTreatmentPlanKeyId(Integer treatmentPlanKeyId) {
        this.treatmentPlanKeyId = treatmentPlanKeyId;
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
     * @return QUESTION_KEY_ID
     */
    public Integer getQuestionKeyId() {
        return questionKeyId;
    }

    /**
     * @param questionKeyId
     */
    public void setQuestionKeyId(Integer questionKeyId) {
        this.questionKeyId = questionKeyId;
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