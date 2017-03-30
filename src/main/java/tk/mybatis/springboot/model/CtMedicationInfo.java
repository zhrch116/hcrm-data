package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_MEDICATION_INFO")
public class CtMedicationInfo {
    @Id
    @Column(name = "MEDICATION_KEY_ID")
    private Integer medicationKeyId;

    /**
     * 当本条记录就诊类别为「住院」时，存储的是病人档案住院记录表的对应数据的主键ID；当本条记录就诊类别为「门诊」时，存储的是病人档案门诊记录表的对应数据的主键ID；
     */
    @Column(name = "VISIT_RECORD_KEY_ID")
    private Integer visitRecordKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "MEDICATION_ID")
    private String medicationId;

    @Column(name = "HOSPITAL_PATIENT_ID")
    private String hospitalPatientId;

    @Column(name = "VISIT_ID")
    private String visitId;

    @Column(name = "REGISTERED_NO")
    private String registeredNo;

    /**
     * 直接存储汉字，值为「住院」/「门诊」
     */
    @Column(name = "PATIENT_SOURCE")
    private String patientSource;

    /**
     * 0表示用药记录数据非结构化，“用药文本”字段有值；1表示用药记录数据结构化，其他字段有值
     */
    @Column(name = "IS_STRUCTURING")
    private Integer isStructuring;

    @Column(name = "DRUG_NAME")
    private String drugName;

    @Column(name = "DRUG_UNITS")
    private String drugUnits;

    @Column(name = "DRUG_USAGE")
    private String drugUsage;

    @Column(name = "DRUG_DOSAGE")
    private String drugDosage;

    @Column(name = "MEDICATION_DATE")
    private Date medicationDate;

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

    @Column(name = "MEDICATION_TEXT")
    private String medicationText;

    /**
     * @return MEDICATION_KEY_ID
     */
    public Integer getMedicationKeyId() {
        return medicationKeyId;
    }

    /**
     * @param medicationKeyId
     */
    public void setMedicationKeyId(Integer medicationKeyId) {
        this.medicationKeyId = medicationKeyId;
    }

    /**
     * 获取当本条记录就诊类别为「住院」时，存储的是病人档案住院记录表的对应数据的主键ID；当本条记录就诊类别为「门诊」时，存储的是病人档案门诊记录表的对应数据的主键ID；
     *
     * @return VISIT_RECORD_KEY_ID - 当本条记录就诊类别为「住院」时，存储的是病人档案住院记录表的对应数据的主键ID；当本条记录就诊类别为「门诊」时，存储的是病人档案门诊记录表的对应数据的主键ID；
     */
    public Integer getVisitRecordKeyId() {
        return visitRecordKeyId;
    }

    /**
     * 设置当本条记录就诊类别为「住院」时，存储的是病人档案住院记录表的对应数据的主键ID；当本条记录就诊类别为「门诊」时，存储的是病人档案门诊记录表的对应数据的主键ID；
     *
     * @param visitRecordKeyId 当本条记录就诊类别为「住院」时，存储的是病人档案住院记录表的对应数据的主键ID；当本条记录就诊类别为「门诊」时，存储的是病人档案门诊记录表的对应数据的主键ID；
     */
    public void setVisitRecordKeyId(Integer visitRecordKeyId) {
        this.visitRecordKeyId = visitRecordKeyId;
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
     * @return MEDICATION_ID
     */
    public String getMedicationId() {
        return medicationId;
    }

    /**
     * @param medicationId
     */
    public void setMedicationId(String medicationId) {
        this.medicationId = medicationId;
    }

    /**
     * @return HOSPITAL_PATIENT_ID
     */
    public String getHospitalPatientId() {
        return hospitalPatientId;
    }

    /**
     * @param hospitalPatientId
     */
    public void setHospitalPatientId(String hospitalPatientId) {
        this.hospitalPatientId = hospitalPatientId;
    }

    /**
     * @return VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * @param visitId
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * @return REGISTERED_NO
     */
    public String getRegisteredNo() {
        return registeredNo;
    }

    /**
     * @param registeredNo
     */
    public void setRegisteredNo(String registeredNo) {
        this.registeredNo = registeredNo;
    }

    /**
     * 获取直接存储汉字，值为「住院」/「门诊」
     *
     * @return PATIENT_SOURCE - 直接存储汉字，值为「住院」/「门诊」
     */
    public String getPatientSource() {
        return patientSource;
    }

    /**
     * 设置直接存储汉字，值为「住院」/「门诊」
     *
     * @param patientSource 直接存储汉字，值为「住院」/「门诊」
     */
    public void setPatientSource(String patientSource) {
        this.patientSource = patientSource;
    }

    /**
     * 获取0表示用药记录数据非结构化，“用药文本”字段有值；1表示用药记录数据结构化，其他字段有值
     *
     * @return IS_STRUCTURING - 0表示用药记录数据非结构化，“用药文本”字段有值；1表示用药记录数据结构化，其他字段有值
     */
    public Integer getIsStructuring() {
        return isStructuring;
    }

    /**
     * 设置0表示用药记录数据非结构化，“用药文本”字段有值；1表示用药记录数据结构化，其他字段有值
     *
     * @param isStructuring 0表示用药记录数据非结构化，“用药文本”字段有值；1表示用药记录数据结构化，其他字段有值
     */
    public void setIsStructuring(Integer isStructuring) {
        this.isStructuring = isStructuring;
    }

    /**
     * @return DRUG_NAME
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * @param drugName
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    /**
     * @return DRUG_UNITS
     */
    public String getDrugUnits() {
        return drugUnits;
    }

    /**
     * @param drugUnits
     */
    public void setDrugUnits(String drugUnits) {
        this.drugUnits = drugUnits;
    }

    /**
     * @return DRUG_USAGE
     */
    public String getDrugUsage() {
        return drugUsage;
    }

    /**
     * @param drugUsage
     */
    public void setDrugUsage(String drugUsage) {
        this.drugUsage = drugUsage;
    }

    /**
     * @return DRUG_DOSAGE
     */
    public String getDrugDosage() {
        return drugDosage;
    }

    /**
     * @param drugDosage
     */
    public void setDrugDosage(String drugDosage) {
        this.drugDosage = drugDosage;
    }

    /**
     * @return MEDICATION_DATE
     */
    public Date getMedicationDate() {
        return medicationDate;
    }

    /**
     * @param medicationDate
     */
    public void setMedicationDate(Date medicationDate) {
        this.medicationDate = medicationDate;
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
     * @return MEDICATION_TEXT
     */
    public String getMedicationText() {
        return medicationText;
    }

    /**
     * @param medicationText
     */
    public void setMedicationText(String medicationText) {
        this.medicationText = medicationText;
    }
}