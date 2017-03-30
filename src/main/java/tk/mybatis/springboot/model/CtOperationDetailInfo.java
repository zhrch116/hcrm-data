package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_OPERATION_DETAIL_INFO")
public class CtOperationDetailInfo {
    @Id
    @Column(name = "OPERATION_DETAIL_KEY_ID")
    private Integer operationDetailKeyId;

    @Column(name = "OPERATION_KEY_ID")
    private Integer operationKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    /**
     * 直接存储汉字，值为「住院」/「门诊」
     */
    @Column(name = "PATIENT_SOURCE")
    private String patientSource;

    @Column(name = "OPERATION_DETAIL_ID")
    private String operationDetailId;

    @Column(name = "DEPT_CODE")
    private String deptCode;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "FIRST_ASSISTANT_ID")
    private String firstAssistantId;

    @Column(name = "FIRST_ASSISTANT_NAME")
    private String firstAssistantName;

    @Column(name = "SECOND_ASSISTANT_ID")
    private String secondAssistantId;

    @Column(name = "SECOND_ASSISTANT_NAME")
    private String secondAssistantName;

    @Column(name = "THIRD_ASSISTANT_ID")
    private String thirdAssistantId;

    @Column(name = "THIRD_ASSISTANT_NAME")
    private String thirdAssistantName;

    @Column(name = "ANESTHESIA_METHODS")
    private String anesthesiaMethods;

    @Column(name = "ANESTHESIA_DOSAGE")
    private String anesthesiaDosage;

    @Column(name = "ANESTHETIST_ID")
    private String anesthetistId;

    @Column(name = "ANESTHETIST_NAME")
    private String anesthetistName;

    @Column(name = "INSTRUMENT_NURSE_ID")
    private String instrumentNurseId;

    @Column(name = "INSTRUMENT_NURSE_NAME")
    private String instrumentNurseName;

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

    @Column(name = "PREOPERATIVE_DIAGNOSIS")
    private String preoperativeDiagnosis;

    @Column(name = "INTRAOPERATIVE_DIAGNOSIS")
    private String intraoperativeDiagnosis;

    @Column(name = "POSTOPERATIVE_DIAGNOSIS")
    private String postoperativeDiagnosis;

    @Column(name = "OPERATION_PROCEDURE")
    private String operationProcedure;

    /**
     * @return OPERATION_DETAIL_KEY_ID
     */
    public Integer getOperationDetailKeyId() {
        return operationDetailKeyId;
    }

    /**
     * @param operationDetailKeyId
     */
    public void setOperationDetailKeyId(Integer operationDetailKeyId) {
        this.operationDetailKeyId = operationDetailKeyId;
    }

    /**
     * @return OPERATION_KEY_ID
     */
    public Integer getOperationKeyId() {
        return operationKeyId;
    }

    /**
     * @param operationKeyId
     */
    public void setOperationKeyId(Integer operationKeyId) {
        this.operationKeyId = operationKeyId;
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
     * @return OPERATION_DETAIL_ID
     */
    public String getOperationDetailId() {
        return operationDetailId;
    }

    /**
     * @param operationDetailId
     */
    public void setOperationDetailId(String operationDetailId) {
        this.operationDetailId = operationDetailId;
    }

    /**
     * @return DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * @param deptCode
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * @return DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return FIRST_ASSISTANT_ID
     */
    public String getFirstAssistantId() {
        return firstAssistantId;
    }

    /**
     * @param firstAssistantId
     */
    public void setFirstAssistantId(String firstAssistantId) {
        this.firstAssistantId = firstAssistantId;
    }

    /**
     * @return FIRST_ASSISTANT_NAME
     */
    public String getFirstAssistantName() {
        return firstAssistantName;
    }

    /**
     * @param firstAssistantName
     */
    public void setFirstAssistantName(String firstAssistantName) {
        this.firstAssistantName = firstAssistantName;
    }

    /**
     * @return SECOND_ASSISTANT_ID
     */
    public String getSecondAssistantId() {
        return secondAssistantId;
    }

    /**
     * @param secondAssistantId
     */
    public void setSecondAssistantId(String secondAssistantId) {
        this.secondAssistantId = secondAssistantId;
    }

    /**
     * @return SECOND_ASSISTANT_NAME
     */
    public String getSecondAssistantName() {
        return secondAssistantName;
    }

    /**
     * @param secondAssistantName
     */
    public void setSecondAssistantName(String secondAssistantName) {
        this.secondAssistantName = secondAssistantName;
    }

    /**
     * @return THIRD_ASSISTANT_ID
     */
    public String getThirdAssistantId() {
        return thirdAssistantId;
    }

    /**
     * @param thirdAssistantId
     */
    public void setThirdAssistantId(String thirdAssistantId) {
        this.thirdAssistantId = thirdAssistantId;
    }

    /**
     * @return THIRD_ASSISTANT_NAME
     */
    public String getThirdAssistantName() {
        return thirdAssistantName;
    }

    /**
     * @param thirdAssistantName
     */
    public void setThirdAssistantName(String thirdAssistantName) {
        this.thirdAssistantName = thirdAssistantName;
    }

    /**
     * @return ANESTHESIA_METHODS
     */
    public String getAnesthesiaMethods() {
        return anesthesiaMethods;
    }

    /**
     * @param anesthesiaMethods
     */
    public void setAnesthesiaMethods(String anesthesiaMethods) {
        this.anesthesiaMethods = anesthesiaMethods;
    }

    /**
     * @return ANESTHESIA_DOSAGE
     */
    public String getAnesthesiaDosage() {
        return anesthesiaDosage;
    }

    /**
     * @param anesthesiaDosage
     */
    public void setAnesthesiaDosage(String anesthesiaDosage) {
        this.anesthesiaDosage = anesthesiaDosage;
    }

    /**
     * @return ANESTHETIST_ID
     */
    public String getAnesthetistId() {
        return anesthetistId;
    }

    /**
     * @param anesthetistId
     */
    public void setAnesthetistId(String anesthetistId) {
        this.anesthetistId = anesthetistId;
    }

    /**
     * @return ANESTHETIST_NAME
     */
    public String getAnesthetistName() {
        return anesthetistName;
    }

    /**
     * @param anesthetistName
     */
    public void setAnesthetistName(String anesthetistName) {
        this.anesthetistName = anesthetistName;
    }

    /**
     * @return INSTRUMENT_NURSE_ID
     */
    public String getInstrumentNurseId() {
        return instrumentNurseId;
    }

    /**
     * @param instrumentNurseId
     */
    public void setInstrumentNurseId(String instrumentNurseId) {
        this.instrumentNurseId = instrumentNurseId;
    }

    /**
     * @return INSTRUMENT_NURSE_NAME
     */
    public String getInstrumentNurseName() {
        return instrumentNurseName;
    }

    /**
     * @param instrumentNurseName
     */
    public void setInstrumentNurseName(String instrumentNurseName) {
        this.instrumentNurseName = instrumentNurseName;
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
     * @return PREOPERATIVE_DIAGNOSIS
     */
    public String getPreoperativeDiagnosis() {
        return preoperativeDiagnosis;
    }

    /**
     * @param preoperativeDiagnosis
     */
    public void setPreoperativeDiagnosis(String preoperativeDiagnosis) {
        this.preoperativeDiagnosis = preoperativeDiagnosis;
    }

    /**
     * @return INTRAOPERATIVE_DIAGNOSIS
     */
    public String getIntraoperativeDiagnosis() {
        return intraoperativeDiagnosis;
    }

    /**
     * @param intraoperativeDiagnosis
     */
    public void setIntraoperativeDiagnosis(String intraoperativeDiagnosis) {
        this.intraoperativeDiagnosis = intraoperativeDiagnosis;
    }

    /**
     * @return POSTOPERATIVE_DIAGNOSIS
     */
    public String getPostoperativeDiagnosis() {
        return postoperativeDiagnosis;
    }

    /**
     * @param postoperativeDiagnosis
     */
    public void setPostoperativeDiagnosis(String postoperativeDiagnosis) {
        this.postoperativeDiagnosis = postoperativeDiagnosis;
    }

    /**
     * @return OPERATION_PROCEDURE
     */
    public String getOperationProcedure() {
        return operationProcedure;
    }

    /**
     * @param operationProcedure
     */
    public void setOperationProcedure(String operationProcedure) {
        this.operationProcedure = operationProcedure;
    }
}