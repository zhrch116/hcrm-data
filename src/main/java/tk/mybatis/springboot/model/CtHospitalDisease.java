package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_HOSPITAL_DISEASE")
public class CtHospitalDisease {
    @Id
    @Column(name = "HOSPITAL_DISEASE_KEY_ID")
    private Integer hospitalDiseaseKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "HOSPITAL_DISEASE_CODE")
    private String hospitalDiseaseCode;

    @Column(name = "HOSPITAL_DISEASE_NAME")
    private String hospitalDiseaseName;

    @Column(name = "ETL_IMPORT_INSERT_TIME")
    private Date etlImportInsertTime;

    @Column(name = "ETL_IMPORT_UPDATE_TIME")
    private Date etlImportUpdateTime;

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
     * @return HOSPITAL_DISEASE_KEY_ID
     */
    public Integer getHospitalDiseaseKeyId() {
        return hospitalDiseaseKeyId;
    }

    /**
     * @param hospitalDiseaseKeyId
     */
    public void setHospitalDiseaseKeyId(Integer hospitalDiseaseKeyId) {
        this.hospitalDiseaseKeyId = hospitalDiseaseKeyId;
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
     * @return HOSPITAL_DISEASE_CODE
     */
    public String getHospitalDiseaseCode() {
        return hospitalDiseaseCode;
    }

    /**
     * @param hospitalDiseaseCode
     */
    public void setHospitalDiseaseCode(String hospitalDiseaseCode) {
        this.hospitalDiseaseCode = hospitalDiseaseCode;
    }

    /**
     * @return HOSPITAL_DISEASE_NAME
     */
    public String getHospitalDiseaseName() {
        return hospitalDiseaseName;
    }

    /**
     * @param hospitalDiseaseName
     */
    public void setHospitalDiseaseName(String hospitalDiseaseName) {
        this.hospitalDiseaseName = hospitalDiseaseName;
    }

    /**
     * @return ETL_IMPORT_INSERT_TIME
     */
    public Date getEtlImportInsertTime() {
        return etlImportInsertTime;
    }

    /**
     * @param etlImportInsertTime
     */
    public void setEtlImportInsertTime(Date etlImportInsertTime) {
        this.etlImportInsertTime = etlImportInsertTime;
    }

    /**
     * @return ETL_IMPORT_UPDATE_TIME
     */
    public Date getEtlImportUpdateTime() {
        return etlImportUpdateTime;
    }

    /**
     * @param etlImportUpdateTime
     */
    public void setEtlImportUpdateTime(Date etlImportUpdateTime) {
        this.etlImportUpdateTime = etlImportUpdateTime;
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