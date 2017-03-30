package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_PATIENT_CLINIC_INFO")
public class CtPatientClinicInfo {
    @Id
    @Column(name = "PATIENT_CLINIC_ID")
    private Integer patientClinicId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "HOSPITAL_PATIENT_ID")
    private String hospitalPatientId;

    @Column(name = "CLINIC_NO")
    private String clinicNo;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;

    @Column(name = "DEPT_ID")
    private Integer deptId;

    /**
     * 病人住院所属科室的代码
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 科室的正式名称
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "VISIT_DATE_TIME")
    private Date visitDateTime;

    @Column(name = "HOS_ICD_CODE")
    private String hosIcdCode;

    @Column(name = "HOS_ICD_NAME")
    private String hosIcdName;

    @Column(name = "ICD_CODE")
    private String icdCode;

    @Column(name = "ICD_NAME")
    private String icdName;

    @Column(name = "DOCTOR_CODE")
    private String doctorCode;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    @Column(name = "PHARMACIST")
    private String pharmacist;

    /**
     * 门诊患者目前都不需要生成任务
     */
    @Column(name = "IS_NEED_GENERATE_TASK")
    private Integer isNeedGenerateTask;

    /**
     * 该来院次生成任务后置1
     */
    @Column(name = "IS_TASK_GENERATED")
    private Integer isTaskGenerated;

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

    /**
     * @return PATIENT_CLINIC_ID
     */
    public Integer getPatientClinicId() {
        return patientClinicId;
    }

    /**
     * @param patientClinicId
     */
    public void setPatientClinicId(Integer patientClinicId) {
        this.patientClinicId = patientClinicId;
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
     * @return CLINIC_NO
     */
    public String getClinicNo() {
        return clinicNo;
    }

    /**
     * @param clinicNo
     */
    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
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
     * @return HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * @param hospitalName
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * @return DEPT_ID
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * @param deptId
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取病人住院所属科室的代码
     *
     * @return DEPT_CODE - 病人住院所属科室的代码
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置病人住院所属科室的代码
     *
     * @param deptCode 病人住院所属科室的代码
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
     * @return VISIT_DATE_TIME
     */
    public Date getVisitDateTime() {
        return visitDateTime;
    }

    /**
     * @param visitDateTime
     */
    public void setVisitDateTime(Date visitDateTime) {
        this.visitDateTime = visitDateTime;
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
     * @return DOCTOR_CODE
     */
    public String getDoctorCode() {
        return doctorCode;
    }

    /**
     * @param doctorCode
     */
    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    /**
     * @return DOCTOR_NAME
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * @param doctorName
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    /**
     * @return PHARMACIST
     */
    public String getPharmacist() {
        return pharmacist;
    }

    /**
     * @param pharmacist
     */
    public void setPharmacist(String pharmacist) {
        this.pharmacist = pharmacist;
    }

    /**
     * 获取门诊患者目前都不需要生成任务
     *
     * @return IS_NEED_GENERATE_TASK - 门诊患者目前都不需要生成任务
     */
    public Integer getIsNeedGenerateTask() {
        return isNeedGenerateTask;
    }

    /**
     * 设置门诊患者目前都不需要生成任务
     *
     * @param isNeedGenerateTask 门诊患者目前都不需要生成任务
     */
    public void setIsNeedGenerateTask(Integer isNeedGenerateTask) {
        this.isNeedGenerateTask = isNeedGenerateTask;
    }

    /**
     * 获取该来院次生成任务后置1
     *
     * @return IS_TASK_GENERATED - 该来院次生成任务后置1
     */
    public Integer getIsTaskGenerated() {
        return isTaskGenerated;
    }

    /**
     * 设置该来院次生成任务后置1
     *
     * @param isTaskGenerated 该来院次生成任务后置1
     */
    public void setIsTaskGenerated(Integer isTaskGenerated) {
        this.isTaskGenerated = isTaskGenerated;
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
}