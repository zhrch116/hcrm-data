package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_TREATMENT_PLAN_QUESTION")
public class CtTreatmentPlanQuestion {
    @Id
    @Column(name = "QUESTION_KEY_ID")
    private Integer questionKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    /**
     * 见字典表014
     */
    @Column(name = "SPECIAL_DISEASE_TYPE_CODE")
    private String specialDiseaseTypeCode;

    @Column(name = "QUESTION_CONTENT")
    private String questionContent;

    /**
     * 见字典017
     */
    @Column(name = "QUESTION_TYPE_CODE")
    private String questionTypeCode;

    @Column(name = "CREATOR_ID")
    private Integer creatorId;

    /**
     * 本行数据创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "EDITOR_ID")
    private Integer editorId;

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
     * 获取见字典表014
     *
     * @return SPECIAL_DISEASE_TYPE_CODE - 见字典表014
     */
    public String getSpecialDiseaseTypeCode() {
        return specialDiseaseTypeCode;
    }

    /**
     * 设置见字典表014
     *
     * @param specialDiseaseTypeCode 见字典表014
     */
    public void setSpecialDiseaseTypeCode(String specialDiseaseTypeCode) {
        this.specialDiseaseTypeCode = specialDiseaseTypeCode;
    }

    /**
     * @return QUESTION_CONTENT
     */
    public String getQuestionContent() {
        return questionContent;
    }

    /**
     * @param questionContent
     */
    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    /**
     * 获取见字典017
     *
     * @return QUESTION_TYPE_CODE - 见字典017
     */
    public String getQuestionTypeCode() {
        return questionTypeCode;
    }

    /**
     * 设置见字典017
     *
     * @param questionTypeCode 见字典017
     */
    public void setQuestionTypeCode(String questionTypeCode) {
        this.questionTypeCode = questionTypeCode;
    }

    /**
     * @return CREATOR_ID
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * @param creatorId
     */
    public void setCreatorId(Integer creatorId) {
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
     * @return EDITOR_ID
     */
    public Integer getEditorId() {
        return editorId;
    }

    /**
     * @param editorId
     */
    public void setEditorId(Integer editorId) {
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