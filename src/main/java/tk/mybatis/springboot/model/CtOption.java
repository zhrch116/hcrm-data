package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_OPTION")
public class CtOption {
    @Id
    @Column(name = "OPTION_ID")
    private Integer optionId;

    @Column(name = "PROBLEM_ID")
    private Integer problemId;

    @Column(name = "OPTION_CONTENT")
    private String optionContent;

    @Column(name = "OPTION_DESCRIPTION")
    private String optionDescription;

    @Column(name = "OPTION_ORDER")
    private Boolean optionOrder;

    @Column(name = "OPTION_SCORE")
    private Integer optionScore;

    /**
     * 0：没有；1：有。默认为0。
     */
    @Column(name = "IS_OPTION_REMARK")
    private Integer isOptionRemark;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return OPTION_ID
     */
    public Integer getOptionId() {
        return optionId;
    }

    /**
     * @param optionId
     */
    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
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
     * @return OPTION_CONTENT
     */
    public String getOptionContent() {
        return optionContent;
    }

    /**
     * @param optionContent
     */
    public void setOptionContent(String optionContent) {
        this.optionContent = optionContent;
    }

    /**
     * @return OPTION_DESCRIPTION
     */
    public String getOptionDescription() {
        return optionDescription;
    }

    /**
     * @param optionDescription
     */
    public void setOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
    }

    /**
     * @return OPTION_ORDER
     */
    public Boolean getOptionOrder() {
        return optionOrder;
    }

    /**
     * @param optionOrder
     */
    public void setOptionOrder(Boolean optionOrder) {
        this.optionOrder = optionOrder;
    }

    /**
     * @return OPTION_SCORE
     */
    public Integer getOptionScore() {
        return optionScore;
    }

    /**
     * @param optionScore
     */
    public void setOptionScore(Integer optionScore) {
        this.optionScore = optionScore;
    }

    /**
     * 获取0：没有；1：有。默认为0。
     *
     * @return IS_OPTION_REMARK - 0：没有；1：有。默认为0。
     */
    public Integer getIsOptionRemark() {
        return isOptionRemark;
    }

    /**
     * 设置0：没有；1：有。默认为0。
     *
     * @param isOptionRemark 0：没有；1：有。默认为0。
     */
    public void setIsOptionRemark(Integer isOptionRemark) {
        this.isOptionRemark = isOptionRemark;
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