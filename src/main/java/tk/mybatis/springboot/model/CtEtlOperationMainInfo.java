package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ETL_OPERATION_MAIN_INFO")
public class CtEtlOperationMainInfo {
    @Id
    @Column(name = "OPERATION_KEY_ID")
    private Integer operationKeyId;

    @Column(name = "HOS_OPERATION_KEY_ID")
    private Integer hosOperationKeyId;

    /**
     * 当本条记录就诊类别为「住院」时，存储的是病人档案住院记录表的对应数据的主键ID；当本条记录就诊类别为「门诊」时，存储的是病人档案门诊记录表的对应数据的主键ID；
     */
    @Column(name = "VISIT_RECORD_KEY_ID")
    private Integer visitRecordKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "OPERATION_MAIN_ID")
    private String operationMainId;

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

    @Column(name = "OPERATION_NAME")
    private String operationName;

    @Column(name = "OPERATOR_ID")
    private String operatorId;

    @Column(name = "OPERATOR_NAME")
    private String operatorName;

    @Column(name = "OPERATION_DATE")
    private Date operationDate;

    /**
     * 0：未归档；1：已归档；
     */
    @Column(name = "IS_FILED")
    private Integer isFiled;

    @Column(name = "FILE_TIME")
    private Date fileTime;

    /**
     * 本行数据创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

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
     * @return HOS_OPERATION_KEY_ID
     */
    public Integer getHosOperationKeyId() {
        return hosOperationKeyId;
    }

    /**
     * @param hosOperationKeyId
     */
    public void setHosOperationKeyId(Integer hosOperationKeyId) {
        this.hosOperationKeyId = hosOperationKeyId;
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
     * @return OPERATION_MAIN_ID
     */
    public String getOperationMainId() {
        return operationMainId;
    }

    /**
     * @param operationMainId
     */
    public void setOperationMainId(String operationMainId) {
        this.operationMainId = operationMainId;
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
     * @return OPERATION_NAME
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * @param operationName
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * @return OPERATOR_ID
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * @return OPERATOR_NAME
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * @param operatorName
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    /**
     * @return OPERATION_DATE
     */
    public Date getOperationDate() {
        return operationDate;
    }

    /**
     * @param operationDate
     */
    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    /**
     * 获取0：未归档；1：已归档；
     *
     * @return IS_FILED - 0：未归档；1：已归档；
     */
    public Integer getIsFiled() {
        return isFiled;
    }

    /**
     * 设置0：未归档；1：已归档；
     *
     * @param isFiled 0：未归档；1：已归档；
     */
    public void setIsFiled(Integer isFiled) {
        this.isFiled = isFiled;
    }

    /**
     * @return FILE_TIME
     */
    public Date getFileTime() {
        return fileTime;
    }

    /**
     * @param fileTime
     */
    public void setFileTime(Date fileTime) {
        this.fileTime = fileTime;
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