package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_SPECIAL_DISEASE_FIELD_OPTION")
public class CtSpecialDiseaseFieldOption {
    @Id
    @Column(name = "FIELD_OPTION_KEY_ID")
    private Integer fieldOptionKeyId;

    @Column(name = "FIELD_KEY_ID")
    private Integer fieldKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "OPTION_NAME")
    private String optionName;

    @Column(name = "OPTION_ORDER")
    private Integer optionOrder;

    /**
     * 0-否；1-是；
     */
    @Column(name = "IS_NEED_REMARK")
    private Integer isNeedRemark;

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
     * @return FIELD_OPTION_KEY_ID
     */
    public Integer getFieldOptionKeyId() {
        return fieldOptionKeyId;
    }

    /**
     * @param fieldOptionKeyId
     */
    public void setFieldOptionKeyId(Integer fieldOptionKeyId) {
        this.fieldOptionKeyId = fieldOptionKeyId;
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
     * @return OPTION_NAME
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * @param optionName
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * @return OPTION_ORDER
     */
    public Integer getOptionOrder() {
        return optionOrder;
    }

    /**
     * @param optionOrder
     */
    public void setOptionOrder(Integer optionOrder) {
        this.optionOrder = optionOrder;
    }

    /**
     * 获取0-否；1-是；
     *
     * @return IS_NEED_REMARK - 0-否；1-是；
     */
    public Integer getIsNeedRemark() {
        return isNeedRemark;
    }

    /**
     * 设置0-否；1-是；
     *
     * @param isNeedRemark 0-否；1-是；
     */
    public void setIsNeedRemark(Integer isNeedRemark) {
        this.isNeedRemark = isNeedRemark;
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