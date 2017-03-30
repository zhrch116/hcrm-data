package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_SPECIAL_DISEASE_FIELD")
public class CtSpecialDiseaseField {
    @Id
    @Column(name = "FIELD_KEY_ID")
    private Integer fieldKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    /**
     * 见字典表014
     */
    @Column(name = "SPECIAL_DISEASE_TYPE_CODE")
    private String specialDiseaseTypeCode;

    @Column(name = "FIELD_NAME")
    private String fieldName;

    @Column(name = "FIELD_UNIT")
    private String fieldUnit;

    /**
     * 见字典011
     */
    @Column(name = "FIELD_TYPE_CODE")
    private String fieldTypeCode;

    @Column(name = "DECIMAL_LIMIT")
    private Integer decimalLimit;

    /**
     * 1-单倍距；2-双倍距；
     */
    @Column(name = "FIELD_PAGE_WIDTH")
    private Integer fieldPageWidth;

    /**
     * 0-否；1-是；
     */
    @Column(name = "IS_FIXED_FIELD")
    private Integer isFixedField;

    /**
     * 当「是否是固定字段」值为1时非空
     */
    @Column(name = "FIXED_FIELD_CODE")
    private String fixedFieldCode;

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
     * @return FIELD_NAME
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * @param fieldName
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * @return FIELD_UNIT
     */
    public String getFieldUnit() {
        return fieldUnit;
    }

    /**
     * @param fieldUnit
     */
    public void setFieldUnit(String fieldUnit) {
        this.fieldUnit = fieldUnit;
    }

    /**
     * 获取见字典011
     *
     * @return FIELD_TYPE_CODE - 见字典011
     */
    public String getFieldTypeCode() {
        return fieldTypeCode;
    }

    /**
     * 设置见字典011
     *
     * @param fieldTypeCode 见字典011
     */
    public void setFieldTypeCode(String fieldTypeCode) {
        this.fieldTypeCode = fieldTypeCode;
    }

    /**
     * @return DECIMAL_LIMIT
     */
    public Integer getDecimalLimit() {
        return decimalLimit;
    }

    /**
     * @param decimalLimit
     */
    public void setDecimalLimit(Integer decimalLimit) {
        this.decimalLimit = decimalLimit;
    }

    /**
     * 获取1-单倍距；2-双倍距；
     *
     * @return FIELD_PAGE_WIDTH - 1-单倍距；2-双倍距；
     */
    public Integer getFieldPageWidth() {
        return fieldPageWidth;
    }

    /**
     * 设置1-单倍距；2-双倍距；
     *
     * @param fieldPageWidth 1-单倍距；2-双倍距；
     */
    public void setFieldPageWidth(Integer fieldPageWidth) {
        this.fieldPageWidth = fieldPageWidth;
    }

    /**
     * 获取0-否；1-是；
     *
     * @return IS_FIXED_FIELD - 0-否；1-是；
     */
    public Integer getIsFixedField() {
        return isFixedField;
    }

    /**
     * 设置0-否；1-是；
     *
     * @param isFixedField 0-否；1-是；
     */
    public void setIsFixedField(Integer isFixedField) {
        this.isFixedField = isFixedField;
    }

    /**
     * 获取当「是否是固定字段」值为1时非空
     *
     * @return FIXED_FIELD_CODE - 当「是否是固定字段」值为1时非空
     */
    public String getFixedFieldCode() {
        return fixedFieldCode;
    }

    /**
     * 设置当「是否是固定字段」值为1时非空
     *
     * @param fixedFieldCode 当「是否是固定字段」值为1时非空
     */
    public void setFixedFieldCode(String fixedFieldCode) {
        this.fixedFieldCode = fixedFieldCode;
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