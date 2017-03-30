package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_SPECIAL_PATIENT_SPECIAL_FIELD")
public class CtSpecialPatientSpecialField {
    @Id
    @Column(name = "SPECIAL_FIELD_KEY_ID")
    private Integer specialFieldKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "SPECIAL_FIELD_NAME")
    private String specialFieldName;

    @Column(name = "SPECIAL_FIELD_CODE")
    private String specialFieldCode;

    @Column(name = "SPECIAL_FIELD_VALUE")
    private String specialFieldValue;

    @Column(name = "SPECIAL_FIELD_VALUE_CODE")
    private String specialFieldValueCode;

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
     * @return SPECIAL_FIELD_KEY_ID
     */
    public Integer getSpecialFieldKeyId() {
        return specialFieldKeyId;
    }

    /**
     * @param specialFieldKeyId
     */
    public void setSpecialFieldKeyId(Integer specialFieldKeyId) {
        this.specialFieldKeyId = specialFieldKeyId;
    }

    /**
     * @return PATIENT_KEY_ID
     */
    public Integer getPatientKeyId() {
        return patientKeyId;
    }

    /**
     * @param patientKeyId
     */
    public void setPatientKeyId(Integer patientKeyId) {
        this.patientKeyId = patientKeyId;
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
     * @return SPECIAL_FIELD_NAME
     */
    public String getSpecialFieldName() {
        return specialFieldName;
    }

    /**
     * @param specialFieldName
     */
    public void setSpecialFieldName(String specialFieldName) {
        this.specialFieldName = specialFieldName;
    }

    /**
     * @return SPECIAL_FIELD_CODE
     */
    public String getSpecialFieldCode() {
        return specialFieldCode;
    }

    /**
     * @param specialFieldCode
     */
    public void setSpecialFieldCode(String specialFieldCode) {
        this.specialFieldCode = specialFieldCode;
    }

    /**
     * @return SPECIAL_FIELD_VALUE
     */
    public String getSpecialFieldValue() {
        return specialFieldValue;
    }

    /**
     * @param specialFieldValue
     */
    public void setSpecialFieldValue(String specialFieldValue) {
        this.specialFieldValue = specialFieldValue;
    }

    /**
     * @return SPECIAL_FIELD_VALUE_CODE
     */
    public String getSpecialFieldValueCode() {
        return specialFieldValueCode;
    }

    /**
     * @param specialFieldValueCode
     */
    public void setSpecialFieldValueCode(String specialFieldValueCode) {
        this.specialFieldValueCode = specialFieldValueCode;
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