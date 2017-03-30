package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_TEMPLATE_PROBLEM_REL")
public class CtTemplateProblemRel {
    @Id
    @Column(name = "PROBLEM_ID")
    private Integer problemId;

    @Id
    @Column(name = "TEMPLATE_ID")
    private Integer templateId;

    /**
     * 默认是必须的0 非必须1 必须
     */
    @Column(name = "WHETHER_MUST_ANSWER")
    private Boolean whetherMustAnswer;

    @Column(name = "PROBLEM_ORDER")
    private Boolean problemOrder;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
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
     * @return TEMPLATE_ID
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * @param templateId
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * 获取默认是必须的0 非必须1 必须
     *
     * @return WHETHER_MUST_ANSWER - 默认是必须的0 非必须1 必须
     */
    public Boolean getWhetherMustAnswer() {
        return whetherMustAnswer;
    }

    /**
     * 设置默认是必须的0 非必须1 必须
     *
     * @param whetherMustAnswer 默认是必须的0 非必须1 必须
     */
    public void setWhetherMustAnswer(Boolean whetherMustAnswer) {
        this.whetherMustAnswer = whetherMustAnswer;
    }

    /**
     * @return PROBLEM_ORDER
     */
    public Boolean getProblemOrder() {
        return problemOrder;
    }

    /**
     * @param problemOrder
     */
    public void setProblemOrder(Boolean problemOrder) {
        this.problemOrder = problemOrder;
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