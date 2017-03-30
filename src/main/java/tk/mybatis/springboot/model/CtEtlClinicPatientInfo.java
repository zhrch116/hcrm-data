package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ETL_CLINIC_PATIENT_INFO")
public class CtEtlClinicPatientInfo {
    @Id
    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "HOS_PATIENT_KEY_ID")
    private Integer hosPatientKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "HOSPITAL_PATIENT_ID")
    private String hospitalPatientId;

    /**
     * 病人姓名
     */
    @Column(name = "NAME")
    private String name;

    @Column(name = "ID_NO")
    private String idNo;

    @Column(name = "MEDICAL_INSURANCE_CARD_NO")
    private String medicalInsuranceCardNo;

    @Column(name = "SOCIAL_SECURITY_CARD_NO")
    private String socialSecurityCardNo;

    @Column(name = "PASSPORT_NO")
    private String passportNo;

    /**
     * 男；女；默认为NULL；
     */
    @Column(name = "SEX")
    private String sex;

    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    @Column(name = "NATION")
    private String nation;

    /**
     * 见字典表
     */
    @Column(name = "BLOOD_TYPE_CODE")
    private String bloodTypeCode;

    /**
     * 见字典表
     */
    @Column(name = "BLOOD_TYPE_NAME")
    private String bloodTypeName;

    /**
     * 阳性；阴性；
     */
    @Column(name = "RH_NEGATIVE")
    private String rhNegative;

    @Column(name = "OCCUPATION")
    private String occupation;

    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;

    @Column(name = "INSURANCE_TYPE")
    private String insuranceType;

    @Column(name = "WORK_UNIT")
    private String workUnit;

    @Column(name = "PHONE_NO")
    private String phoneNo;

    @Column(name = "MAILBOX")
    private String mailbox;

    /**
     * 病人的亲属姓名
     */
    @Column(name = "NEXT_OF_KIN")
    private String nextOfKin;

    /**
     * 夫妻、父子等
     */
    @Column(name = "RELATIONSHIP_NAME")
    private String relationshipName;

    @Column(name = "NEXT_OF_KIN_PHONE")
    private String nextOfKinPhone;

    /**
     * 0：不重要；1：重要
     */
    @Column(name = "IMPORTANT_TYPE")
    private Integer importantType;

    /**
     * 0：不是高血压患者；1：高血压确诊患者；2：高血压疑似患者
     */
    @Column(name = "HYPERTENSION_TYPE")
    private Integer hypertensionType;

    /**
     * 0：不是糖尿病患者；1：糖尿病确诊患者；2：糖尿病疑似患者
     */
    @Column(name = "DIABETES_TYPE")
    private Integer diabetesType;

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

    @Column(name = "HOUSE_ADDRESS")
    private String houseAddress;

    @Column(name = "NEXT_OF_KIN_ADDRESS")
    private String nextOfKinAddress;

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
     * @return HOS_PATIENT_KEY_ID
     */
    public Integer getHosPatientKeyId() {
        return hosPatientKeyId;
    }

    /**
     * @param hosPatientKeyId
     */
    public void setHosPatientKeyId(Integer hosPatientKeyId) {
        this.hosPatientKeyId = hosPatientKeyId;
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
     * 获取病人姓名
     *
     * @return NAME - 病人姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置病人姓名
     *
     * @param name 病人姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return ID_NO
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * @param idNo
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * @return MEDICAL_INSURANCE_CARD_NO
     */
    public String getMedicalInsuranceCardNo() {
        return medicalInsuranceCardNo;
    }

    /**
     * @param medicalInsuranceCardNo
     */
    public void setMedicalInsuranceCardNo(String medicalInsuranceCardNo) {
        this.medicalInsuranceCardNo = medicalInsuranceCardNo;
    }

    /**
     * @return SOCIAL_SECURITY_CARD_NO
     */
    public String getSocialSecurityCardNo() {
        return socialSecurityCardNo;
    }

    /**
     * @param socialSecurityCardNo
     */
    public void setSocialSecurityCardNo(String socialSecurityCardNo) {
        this.socialSecurityCardNo = socialSecurityCardNo;
    }

    /**
     * @return PASSPORT_NO
     */
    public String getPassportNo() {
        return passportNo;
    }

    /**
     * @param passportNo
     */
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    /**
     * 获取男；女；默认为NULL；
     *
     * @return SEX - 男；女；默认为NULL；
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置男；女；默认为NULL；
     *
     * @param sex 男；女；默认为NULL；
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return DATE_OF_BIRTH
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return NATION
     */
    public String getNation() {
        return nation;
    }

    /**
     * @param nation
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * 获取见字典表
     *
     * @return BLOOD_TYPE_CODE - 见字典表
     */
    public String getBloodTypeCode() {
        return bloodTypeCode;
    }

    /**
     * 设置见字典表
     *
     * @param bloodTypeCode 见字典表
     */
    public void setBloodTypeCode(String bloodTypeCode) {
        this.bloodTypeCode = bloodTypeCode;
    }

    /**
     * 获取见字典表
     *
     * @return BLOOD_TYPE_NAME - 见字典表
     */
    public String getBloodTypeName() {
        return bloodTypeName;
    }

    /**
     * 设置见字典表
     *
     * @param bloodTypeName 见字典表
     */
    public void setBloodTypeName(String bloodTypeName) {
        this.bloodTypeName = bloodTypeName;
    }

    /**
     * 获取阳性；阴性；
     *
     * @return RH_NEGATIVE - 阳性；阴性；
     */
    public String getRhNegative() {
        return rhNegative;
    }

    /**
     * 设置阳性；阴性；
     *
     * @param rhNegative 阳性；阴性；
     */
    public void setRhNegative(String rhNegative) {
        this.rhNegative = rhNegative;
    }

    /**
     * @return OCCUPATION
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return MARITAL_STATUS
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @return INSURANCE_TYPE
     */
    public String getInsuranceType() {
        return insuranceType;
    }

    /**
     * @param insuranceType
     */
    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    /**
     * @return WORK_UNIT
     */
    public String getWorkUnit() {
        return workUnit;
    }

    /**
     * @param workUnit
     */
    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    /**
     * @return PHONE_NO
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return MAILBOX
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * @param mailbox
     */
    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    /**
     * 获取病人的亲属姓名
     *
     * @return NEXT_OF_KIN - 病人的亲属姓名
     */
    public String getNextOfKin() {
        return nextOfKin;
    }

    /**
     * 设置病人的亲属姓名
     *
     * @param nextOfKin 病人的亲属姓名
     */
    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    /**
     * 获取夫妻、父子等
     *
     * @return RELATIONSHIP_NAME - 夫妻、父子等
     */
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * 设置夫妻、父子等
     *
     * @param relationshipName 夫妻、父子等
     */
    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }

    /**
     * @return NEXT_OF_KIN_PHONE
     */
    public String getNextOfKinPhone() {
        return nextOfKinPhone;
    }

    /**
     * @param nextOfKinPhone
     */
    public void setNextOfKinPhone(String nextOfKinPhone) {
        this.nextOfKinPhone = nextOfKinPhone;
    }

    /**
     * 获取0：不重要；1：重要
     *
     * @return IMPORTANT_TYPE - 0：不重要；1：重要
     */
    public Integer getImportantType() {
        return importantType;
    }

    /**
     * 设置0：不重要；1：重要
     *
     * @param importantType 0：不重要；1：重要
     */
    public void setImportantType(Integer importantType) {
        this.importantType = importantType;
    }

    /**
     * 获取0：不是高血压患者；1：高血压确诊患者；2：高血压疑似患者
     *
     * @return HYPERTENSION_TYPE - 0：不是高血压患者；1：高血压确诊患者；2：高血压疑似患者
     */
    public Integer getHypertensionType() {
        return hypertensionType;
    }

    /**
     * 设置0：不是高血压患者；1：高血压确诊患者；2：高血压疑似患者
     *
     * @param hypertensionType 0：不是高血压患者；1：高血压确诊患者；2：高血压疑似患者
     */
    public void setHypertensionType(Integer hypertensionType) {
        this.hypertensionType = hypertensionType;
    }

    /**
     * 获取0：不是糖尿病患者；1：糖尿病确诊患者；2：糖尿病疑似患者
     *
     * @return DIABETES_TYPE - 0：不是糖尿病患者；1：糖尿病确诊患者；2：糖尿病疑似患者
     */
    public Integer getDiabetesType() {
        return diabetesType;
    }

    /**
     * 设置0：不是糖尿病患者；1：糖尿病确诊患者；2：糖尿病疑似患者
     *
     * @param diabetesType 0：不是糖尿病患者；1：糖尿病确诊患者；2：糖尿病疑似患者
     */
    public void setDiabetesType(Integer diabetesType) {
        this.diabetesType = diabetesType;
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

    /**
     * @return HOUSE_ADDRESS
     */
    public String getHouseAddress() {
        return houseAddress;
    }

    /**
     * @param houseAddress
     */
    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    /**
     * @return NEXT_OF_KIN_ADDRESS
     */
    public String getNextOfKinAddress() {
        return nextOfKinAddress;
    }

    /**
     * @param nextOfKinAddress
     */
    public void setNextOfKinAddress(String nextOfKinAddress) {
        this.nextOfKinAddress = nextOfKinAddress;
    }
}