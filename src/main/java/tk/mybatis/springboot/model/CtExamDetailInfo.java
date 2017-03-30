package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_EXAM_DETAIL_INFO")
public class CtExamDetailInfo {
    @Id
    @Column(name = "EXAM_DETAIL_KEY_ID")
    private Integer examDetailKeyId;

    @Column(name = "EXAM_KEY_ID")
    private Integer examKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "PATIENT_SOURCE")
    private String patientSource;

    @Column(name = "EXAM_NO")
    private String examNo;

    @Column(name = "ITEM_CODE")
    private String itemCode;

    @Column(name = "ITEM_NAME")
    private String itemName;

    /**
     * 见字典007
     */
    @Column(name = "DATA_SOURCE_CODE")
    private String dataSourceCode;

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
     * 检查结果的详细描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IMPRESSION")
    private String impression;

    @Column(name = "RECOMMENDATION")
    private String recommendation;

    @Column(name = "CLIN_DIAG")
    private String clinDiag;

    @Column(name = "EXAM_TIPS")
    private String examTips;

    /**
     * @return EXAM_DETAIL_KEY_ID
     */
    public Integer getExamDetailKeyId() {
        return examDetailKeyId;
    }

    /**
     * @param examDetailKeyId
     */
    public void setExamDetailKeyId(Integer examDetailKeyId) {
        this.examDetailKeyId = examDetailKeyId;
    }

    /**
     * @return EXAM_KEY_ID
     */
    public Integer getExamKeyId() {
        return examKeyId;
    }

    /**
     * @param examKeyId
     */
    public void setExamKeyId(Integer examKeyId) {
        this.examKeyId = examKeyId;
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
     * @return PATIENT_SOURCE
     */
    public String getPatientSource() {
        return patientSource;
    }

    /**
     * @param patientSource
     */
    public void setPatientSource(String patientSource) {
        this.patientSource = patientSource;
    }

    /**
     * @return EXAM_NO
     */
    public String getExamNo() {
        return examNo;
    }

    /**
     * @param examNo
     */
    public void setExamNo(String examNo) {
        this.examNo = examNo;
    }

    /**
     * @return ITEM_CODE
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return ITEM_NAME
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取见字典007
     *
     * @return DATA_SOURCE_CODE - 见字典007
     */
    public String getDataSourceCode() {
        return dataSourceCode;
    }

    /**
     * 设置见字典007
     *
     * @param dataSourceCode 见字典007
     */
    public void setDataSourceCode(String dataSourceCode) {
        this.dataSourceCode = dataSourceCode;
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

    /**
     * 获取检查结果的详细描述
     *
     * @return DESCRIPTION - 检查结果的详细描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置检查结果的详细描述
     *
     * @param description 检查结果的详细描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return IMPRESSION
     */
    public String getImpression() {
        return impression;
    }

    /**
     * @param impression
     */
    public void setImpression(String impression) {
        this.impression = impression;
    }

    /**
     * @return RECOMMENDATION
     */
    public String getRecommendation() {
        return recommendation;
    }

    /**
     * @param recommendation
     */
    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * @return CLIN_DIAG
     */
    public String getClinDiag() {
        return clinDiag;
    }

    /**
     * @param clinDiag
     */
    public void setClinDiag(String clinDiag) {
        this.clinDiag = clinDiag;
    }

    /**
     * @return EXAM_TIPS
     */
    public String getExamTips() {
        return examTips;
    }

    /**
     * @param examTips
     */
    public void setExamTips(String examTips) {
        this.examTips = examTips;
    }
}