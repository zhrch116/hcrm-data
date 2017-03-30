package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_MONITOR_QUOTA")
public class CtMonitorQuota {
    @Id
    @Column(name = "MONITOR_QUOTA_KEY_ID")
    private Integer monitorQuotaKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    /**
     * 见字典表014
     */
    @Column(name = "SPECIAL_DISEASE_TYPE_CODE")
    private String specialDiseaseTypeCode;

    @Column(name = "QUOTA_NAME")
    private String quotaName;

    @Column(name = "QUOTA_UNIT")
    private String quotaUnit;

    /**
     * 0-否；1-是；
     */
    @Column(name = "IS_WARNING")
    private Integer isWarning;

    @Column(name = "BEGIN_WARNING_VALUE")
    private Float beginWarningValue;

    @Column(name = "END_WARNING_VALUE")
    private Float endWarningValue;

    /**
     * 本字段存储体检/检验项目名称
     */
    @Column(name = "HIS_QUOTA_SOURCE")
    private String hisQuotaSource;

    /**
     * 本字段存储模板的字段主键ID
     */
    @Column(name = "FOLLOW_UP_QUOTA_SOURCE")
    private String followUpQuotaSource;

    /**
     * 0：不是；1：是；默认为0
     */
    @Column(name = "IS_FIXED_QUOTA")
    private Integer isFixedQuota;

    @Column(name = "FIXED_QUOTA_CODE")
    private String fixedQuotaCode;

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
     * @return MONITOR_QUOTA_KEY_ID
     */
    public Integer getMonitorQuotaKeyId() {
        return monitorQuotaKeyId;
    }

    /**
     * @param monitorQuotaKeyId
     */
    public void setMonitorQuotaKeyId(Integer monitorQuotaKeyId) {
        this.monitorQuotaKeyId = monitorQuotaKeyId;
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
     * @return QUOTA_NAME
     */
    public String getQuotaName() {
        return quotaName;
    }

    /**
     * @param quotaName
     */
    public void setQuotaName(String quotaName) {
        this.quotaName = quotaName;
    }

    /**
     * @return QUOTA_UNIT
     */
    public String getQuotaUnit() {
        return quotaUnit;
    }

    /**
     * @param quotaUnit
     */
    public void setQuotaUnit(String quotaUnit) {
        this.quotaUnit = quotaUnit;
    }

    /**
     * 获取0-否；1-是；
     *
     * @return IS_WARNING - 0-否；1-是；
     */
    public Integer getIsWarning() {
        return isWarning;
    }

    /**
     * 设置0-否；1-是；
     *
     * @param isWarning 0-否；1-是；
     */
    public void setIsWarning(Integer isWarning) {
        this.isWarning = isWarning;
    }

    /**
     * @return BEGIN_WARNING_VALUE
     */
    public Float getBeginWarningValue() {
        return beginWarningValue;
    }

    /**
     * @param beginWarningValue
     */
    public void setBeginWarningValue(Float beginWarningValue) {
        this.beginWarningValue = beginWarningValue;
    }

    /**
     * @return END_WARNING_VALUE
     */
    public Float getEndWarningValue() {
        return endWarningValue;
    }

    /**
     * @param endWarningValue
     */
    public void setEndWarningValue(Float endWarningValue) {
        this.endWarningValue = endWarningValue;
    }

    /**
     * 获取本字段存储体检/检验项目名称
     *
     * @return HIS_QUOTA_SOURCE - 本字段存储体检/检验项目名称
     */
    public String getHisQuotaSource() {
        return hisQuotaSource;
    }

    /**
     * 设置本字段存储体检/检验项目名称
     *
     * @param hisQuotaSource 本字段存储体检/检验项目名称
     */
    public void setHisQuotaSource(String hisQuotaSource) {
        this.hisQuotaSource = hisQuotaSource;
    }

    /**
     * 获取本字段存储模板的字段主键ID
     *
     * @return FOLLOW_UP_QUOTA_SOURCE - 本字段存储模板的字段主键ID
     */
    public String getFollowUpQuotaSource() {
        return followUpQuotaSource;
    }

    /**
     * 设置本字段存储模板的字段主键ID
     *
     * @param followUpQuotaSource 本字段存储模板的字段主键ID
     */
    public void setFollowUpQuotaSource(String followUpQuotaSource) {
        this.followUpQuotaSource = followUpQuotaSource;
    }

    /**
     * 获取0：不是；1：是；默认为0
     *
     * @return IS_FIXED_QUOTA - 0：不是；1：是；默认为0
     */
    public Integer getIsFixedQuota() {
        return isFixedQuota;
    }

    /**
     * 设置0：不是；1：是；默认为0
     *
     * @param isFixedQuota 0：不是；1：是；默认为0
     */
    public void setIsFixedQuota(Integer isFixedQuota) {
        this.isFixedQuota = isFixedQuota;
    }

    /**
     * @return FIXED_QUOTA_CODE
     */
    public String getFixedQuotaCode() {
        return fixedQuotaCode;
    }

    /**
     * @param fixedQuotaCode
     */
    public void setFixedQuotaCode(String fixedQuotaCode) {
        this.fixedQuotaCode = fixedQuotaCode;
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