package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_PHYSICAL_DETAILED_RECORD")
public class CtPhysicalDetailedRecord {
    @Id
    @Column(name = "PHYSICAL_DETAILED_KEY_ID")
    private Integer physicalDetailedKeyId;

    @Column(name = "PHYSICAL_SUMMARY_KEY_ID")
    private Integer physicalSummaryKeyId;

    @Column(name = "PHYSICAL_KEY_ID")
    private Integer physicalKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "PHYSICAL_DETAILED_ID")
    private String physicalDetailedId;

    @Column(name = "ITEM_CLASS_CODE")
    private String itemClassCode;

    @Column(name = "ITEM_CLASS_NAME")
    private String itemClassName;

    @Column(name = "ITEM_CODE")
    private String itemCode;

    @Column(name = "ITEM_NAME")
    private String itemName;

    @Column(name = "UNIT")
    private String unit;

    @Column(name = "PHYSICAL_DETAILED_TIME")
    private Date physicalDetailedTime;

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

    @Column(name = "RESULT")
    private String result;

    @Column(name = "REFERENCE_RANGE")
    private String referenceRange;

    @Column(name = "ABNORMAL")
    private String abnormal;

    /**
     * @return PHYSICAL_DETAILED_KEY_ID
     */
    public Integer getPhysicalDetailedKeyId() {
        return physicalDetailedKeyId;
    }

    /**
     * @param physicalDetailedKeyId
     */
    public void setPhysicalDetailedKeyId(Integer physicalDetailedKeyId) {
        this.physicalDetailedKeyId = physicalDetailedKeyId;
    }

    /**
     * @return PHYSICAL_SUMMARY_KEY_ID
     */
    public Integer getPhysicalSummaryKeyId() {
        return physicalSummaryKeyId;
    }

    /**
     * @param physicalSummaryKeyId
     */
    public void setPhysicalSummaryKeyId(Integer physicalSummaryKeyId) {
        this.physicalSummaryKeyId = physicalSummaryKeyId;
    }

    /**
     * @return PHYSICAL_KEY_ID
     */
    public Integer getPhysicalKeyId() {
        return physicalKeyId;
    }

    /**
     * @param physicalKeyId
     */
    public void setPhysicalKeyId(Integer physicalKeyId) {
        this.physicalKeyId = physicalKeyId;
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
     * @return PHYSICAL_DETAILED_ID
     */
    public String getPhysicalDetailedId() {
        return physicalDetailedId;
    }

    /**
     * @param physicalDetailedId
     */
    public void setPhysicalDetailedId(String physicalDetailedId) {
        this.physicalDetailedId = physicalDetailedId;
    }

    /**
     * @return ITEM_CLASS_CODE
     */
    public String getItemClassCode() {
        return itemClassCode;
    }

    /**
     * @param itemClassCode
     */
    public void setItemClassCode(String itemClassCode) {
        this.itemClassCode = itemClassCode;
    }

    /**
     * @return ITEM_CLASS_NAME
     */
    public String getItemClassName() {
        return itemClassName;
    }

    /**
     * @param itemClassName
     */
    public void setItemClassName(String itemClassName) {
        this.itemClassName = itemClassName;
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
     * @return UNIT
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return PHYSICAL_DETAILED_TIME
     */
    public Date getPhysicalDetailedTime() {
        return physicalDetailedTime;
    }

    /**
     * @param physicalDetailedTime
     */
    public void setPhysicalDetailedTime(Date physicalDetailedTime) {
        this.physicalDetailedTime = physicalDetailedTime;
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
     * @return RESULT
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return REFERENCE_RANGE
     */
    public String getReferenceRange() {
        return referenceRange;
    }

    /**
     * @param referenceRange
     */
    public void setReferenceRange(String referenceRange) {
        this.referenceRange = referenceRange;
    }

    /**
     * @return ABNORMAL
     */
    public String getAbnormal() {
        return abnormal;
    }

    /**
     * @param abnormal
     */
    public void setAbnormal(String abnormal) {
        this.abnormal = abnormal;
    }
}