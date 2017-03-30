package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_TEMPLATE")
public class CtTemplate {
    @Id
    @Column(name = "TEMPLATE_ID")
    private Integer templateId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "TEMPLATE_DESCRIPTION")
    private String templateDescription;

    @Column(name = "TEMPLATE_NAME")
    private String templateName;

    /**
     * 字典表中就诊类别编码-012，区分住院/门诊/体检
     */
    @Column(name = "MEDICAL_CLASS_CODE")
    private String medicalClassCode;

    /**
     * 见字典006
     */
    @Column(name = "TEMPLATE_TYPE_CODE")
    private String templateTypeCode;

    @Column(name = "TEMPLATE_TYPE_NAME")
    private String templateTypeName;

    /**
     * 0 代表未被引用；1 代表已被引用；
     */
    @Column(name = "WHETHER_USED")
    private Boolean whetherUsed;

    /**
     * 创建模版的用户的姓名
     */
    @Column(name = "CREATOR_ID")
    private String creatorId;

    /**
     * 本行数据创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 修改模版的用户的姓名
     */
    @Column(name = "EDITOR_ID")
    private String editorId;

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
     * @return TEMPLATE_DESCRIPTION
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    /**
     * @param templateDescription
     */
    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * @return TEMPLATE_NAME
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * 获取字典表中就诊类别编码-012，区分住院/门诊/体检
     *
     * @return MEDICAL_CLASS_CODE - 字典表中就诊类别编码-012，区分住院/门诊/体检
     */
    public String getMedicalClassCode() {
        return medicalClassCode;
    }

    /**
     * 设置字典表中就诊类别编码-012，区分住院/门诊/体检
     *
     * @param medicalClassCode 字典表中就诊类别编码-012，区分住院/门诊/体检
     */
    public void setMedicalClassCode(String medicalClassCode) {
        this.medicalClassCode = medicalClassCode;
    }

    /**
     * 获取见字典006
     *
     * @return TEMPLATE_TYPE_CODE - 见字典006
     */
    public String getTemplateTypeCode() {
        return templateTypeCode;
    }

    /**
     * 设置见字典006
     *
     * @param templateTypeCode 见字典006
     */
    public void setTemplateTypeCode(String templateTypeCode) {
        this.templateTypeCode = templateTypeCode;
    }

    /**
     * @return TEMPLATE_TYPE_NAME
     */
    public String getTemplateTypeName() {
        return templateTypeName;
    }

    /**
     * @param templateTypeName
     */
    public void setTemplateTypeName(String templateTypeName) {
        this.templateTypeName = templateTypeName;
    }

    /**
     * 获取0 代表未被引用；1 代表已被引用；
     *
     * @return WHETHER_USED - 0 代表未被引用；1 代表已被引用；
     */
    public Boolean getWhetherUsed() {
        return whetherUsed;
    }

    /**
     * 设置0 代表未被引用；1 代表已被引用；
     *
     * @param whetherUsed 0 代表未被引用；1 代表已被引用；
     */
    public void setWhetherUsed(Boolean whetherUsed) {
        this.whetherUsed = whetherUsed;
    }

    /**
     * 获取创建模版的用户的姓名
     *
     * @return CREATOR_ID - 创建模版的用户的姓名
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建模版的用户的姓名
     *
     * @param creatorId 创建模版的用户的姓名
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
     * 获取修改模版的用户的姓名
     *
     * @return EDITOR_ID - 修改模版的用户的姓名
     */
    public String getEditorId() {
        return editorId;
    }

    /**
     * 设置修改模版的用户的姓名
     *
     * @param editorId 修改模版的用户的姓名
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