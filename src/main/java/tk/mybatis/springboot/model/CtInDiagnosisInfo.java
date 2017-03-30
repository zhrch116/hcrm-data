package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_IN_DIAGNOSIS_INFO")
public class CtInDiagnosisInfo {
    @Id
    @Column(name = "IN_DIAGNOSIS_INFO_KEY_ID")
    private Integer inDiagnosisInfoKeyId;

    @Column(name = "PATIENT_IN_HOSPITAL_KEY_ID")
    private Integer patientInHospitalKeyId;

    @Column(name = "HOSPITAL_PATIENT_ID")
    private String hospitalPatientId;

    @Column(name = "VISIT_ID")
    private String visitId;

    @Column(name = "INHOSPITAL_NO")
    private String inhospitalNo;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    /**
     * 病人住院所属科室的代码。用于区分一个病房包含多个科室的床位的情况。病人住院登记后，将该字段置为空，在入科分配床位时，根据床位属性将该字段置为所在科室代码，转科时，由转出科室将该代码置为空
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 科室的正式名称
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "HOS_ICD_CODE")
    private String hosIcdCode;

    @Column(name = "HOS_ICD_NAME")
    private String hosIcdName;

    @Column(name = "ICD_CODE")
    private String icdCode;

    @Column(name = "ICD_NAME")
    private String icdName;

    @Column(name = "DIAGNOSIS_NO")
    private Integer diagnosisNo;

    @Column(name = "DIAGNOSIS_DATE")
    private Date diagnosisDate;

    /**
     * 0：非手术治疗；1：手术治疗
     */
    @Column(name = "OPER_TREAT_INDICATOR")
    private String operTreatIndicator;

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

    @Column(name = "DIAGNOSIS_DESC")
    private String diagnosisDesc;

    /**
     * @return IN_DIAGNOSIS_INFO_KEY_ID
     */
    public Integer getInDiagnosisInfoKeyId() {
        return inDiagnosisInfoKeyId;
    }

    /**
     * @param inDiagnosisInfoKeyId
     */
    public void setInDiagnosisInfoKeyId(Integer inDiagnosisInfoKeyId) {
        this.inDiagnosisInfoKeyId = inDiagnosisInfoKeyId;
    }

    /**
     * @return PATIENT_IN_HOSPITAL_KEY_ID
     */
    public Integer getPatientInHospitalKeyId() {
        return patientInHospitalKeyId;
    }

    /**
     * @param patientInHospitalKeyId
     */
    public void setPatientInHospitalKeyId(Integer patientInHospitalKeyId) {
        this.patientInHospitalKeyId = patientInHospitalKeyId;
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
     * @return INHOSPITAL_NO
     */
    public String getInhospitalNo() {
        return inhospitalNo;
    }

    /**
     * @param inhospitalNo
     */
    public void setInhospitalNo(String inhospitalNo) {
        this.inhospitalNo = inhospitalNo;
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
     * 获取病人住院所属科室的代码。用于区分一个病房包含多个科室的床位的情况。病人住院登记后，将该字段置为空，在入科分配床位时，根据床位属性将该字段置为所在科室代码，转科时，由转出科室将该代码置为空
     *
     * @return DEPT_CODE - 病人住院所属科室的代码。用于区分一个病房包含多个科室的床位的情况。病人住院登记后，将该字段置为空，在入科分配床位时，根据床位属性将该字段置为所在科室代码，转科时，由转出科室将该代码置为空
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置病人住院所属科室的代码。用于区分一个病房包含多个科室的床位的情况。病人住院登记后，将该字段置为空，在入科分配床位时，根据床位属性将该字段置为所在科室代码，转科时，由转出科室将该代码置为空
     *
     * @param deptCode 病人住院所属科室的代码。用于区分一个病房包含多个科室的床位的情况。病人住院登记后，将该字段置为空，在入科分配床位时，根据床位属性将该字段置为所在科室代码，转科时，由转出科室将该代码置为空
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * 获取科室的正式名称
     *
     * @return DEPT_NAME - 科室的正式名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置科室的正式名称
     *
     * @param deptName 科室的正式名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return HOS_ICD_CODE
     */
    public String getHosIcdCode() {
        return hosIcdCode;
    }

    /**
     * @param hosIcdCode
     */
    public void setHosIcdCode(String hosIcdCode) {
        this.hosIcdCode = hosIcdCode;
    }

    /**
     * @return HOS_ICD_NAME
     */
    public String getHosIcdName() {
        return hosIcdName;
    }

    /**
     * @param hosIcdName
     */
    public void setHosIcdName(String hosIcdName) {
        this.hosIcdName = hosIcdName;
    }

    /**
     * @return ICD_CODE
     */
    public String getIcdCode() {
        return icdCode;
    }

    /**
     * @param icdCode
     */
    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    /**
     * @return ICD_NAME
     */
    public String getIcdName() {
        return icdName;
    }

    /**
     * @param icdName
     */
    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    /**
     * @return DIAGNOSIS_NO
     */
    public Integer getDiagnosisNo() {
        return diagnosisNo;
    }

    /**
     * @param diagnosisNo
     */
    public void setDiagnosisNo(Integer diagnosisNo) {
        this.diagnosisNo = diagnosisNo;
    }

    /**
     * @return DIAGNOSIS_DATE
     */
    public Date getDiagnosisDate() {
        return diagnosisDate;
    }

    /**
     * @param diagnosisDate
     */
    public void setDiagnosisDate(Date diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

    /**
     * 获取0：非手术治疗；1：手术治疗
     *
     * @return OPER_TREAT_INDICATOR - 0：非手术治疗；1：手术治疗
     */
    public String getOperTreatIndicator() {
        return operTreatIndicator;
    }

    /**
     * 设置0：非手术治疗；1：手术治疗
     *
     * @param operTreatIndicator 0：非手术治疗；1：手术治疗
     */
    public void setOperTreatIndicator(String operTreatIndicator) {
        this.operTreatIndicator = operTreatIndicator;
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
     * @return DIAGNOSIS_DESC
     */
    public String getDiagnosisDesc() {
        return diagnosisDesc;
    }

    /**
     * @param diagnosisDesc
     */
    public void setDiagnosisDesc(String diagnosisDesc) {
        this.diagnosisDesc = diagnosisDesc;
    }
}