package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_PATIENT_IN_HOSPITAL_INFO")
public class CtPatientInHospitalInfo {
    @Id
    @Column(name = "PATIENT_IN_HOSPITAL_KEY_ID")
    private Integer patientInHospitalKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "HOSPITAL_PATIENT_ID")
    private String hospitalPatientId;

    @Column(name = "VISIT_ID")
    private String visitId;

    @Column(name = "INHOSPITAL_NO")
    private String inhospitalNo;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;

    /**
     * 病人住院所属病房的代码
     */
    @Column(name = "WARD_CODE")
    private String wardCode;

    /**
     * 病房的正式名称
     */
    @Column(name = "WARD_NAME")
    private String wardName;

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

    @Column(name = "BED_NO")
    private String bedNo;

    @Column(name = "ADMISSION_DATE_TIME")
    private Date admissionDateTime;

    @Column(name = "DISCHARGE_DATE_TIME")
    private Date dischargeDateTime;

    @Column(name = "MAIN_ICD_CODE")
    private String mainIcdCode;

    @Column(name = "MAIN_ICD_NAME")
    private String mainIcdName;

    @Column(name = "ICD_CODE")
    private String icdCode;

    @Column(name = "ICD_NAME")
    private String icdName;

    @Column(name = "DOCTOR_CODE")
    private String doctorCode;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    @Column(name = "DOCTOR_IN_CHARGE_CODE")
    private String doctorInChargeCode;

    @Column(name = "DOCTOR_IN_CHARGE_NAME")
    private String doctorInChargeName;

    @Column(name = "DIRECTOR_CODE")
    private String directorCode;

    @Column(name = "DIRECTOR_NAME")
    private String directorName;

    @Column(name = "PHARMACIST")
    private String pharmacist;

    @Column(name = "IS_OUT")
    private Integer isOut;

    @Column(name = "DISCHARGE_STATUS")
    private String dischargeStatus;

    /**
     * 默认为1。当该患者被拉黑后，导入的来院数据不需要生成任务，值置为0。
     */
    @Column(name = "IS_NEED_GENERATE_TASK")
    private Integer isNeedGenerateTask;

    /**
     * 该来院次数据生成任务后置1
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
     * 获取病人住院所属病房的代码
     *
     * @return WARD_CODE - 病人住院所属病房的代码
     */
    public String getWardCode() {
        return wardCode;
    }

    /**
     * 设置病人住院所属病房的代码
     *
     * @param wardCode 病人住院所属病房的代码
     */
    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    /**
     * 获取病房的正式名称
     *
     * @return WARD_NAME - 病房的正式名称
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * 设置病房的正式名称
     *
     * @param wardName 病房的正式名称
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
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
     * @return BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * @param bedNo
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * @return ADMISSION_DATE_TIME
     */
    public Date getAdmissionDateTime() {
        return admissionDateTime;
    }

    /**
     * @param admissionDateTime
     */
    public void setAdmissionDateTime(Date admissionDateTime) {
        this.admissionDateTime = admissionDateTime;
    }

    /**
     * @return DISCHARGE_DATE_TIME
     */
    public Date getDischargeDateTime() {
        return dischargeDateTime;
    }

    /**
     * @param dischargeDateTime
     */
    public void setDischargeDateTime(Date dischargeDateTime) {
        this.dischargeDateTime = dischargeDateTime;
    }

    /**
     * @return MAIN_ICD_CODE
     */
    public String getMainIcdCode() {
        return mainIcdCode;
    }

    /**
     * @param mainIcdCode
     */
    public void setMainIcdCode(String mainIcdCode) {
        this.mainIcdCode = mainIcdCode;
    }

    /**
     * @return MAIN_ICD_NAME
     */
    public String getMainIcdName() {
        return mainIcdName;
    }

    /**
     * @param mainIcdName
     */
    public void setMainIcdName(String mainIcdName) {
        this.mainIcdName = mainIcdName;
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
     * @return DOCTOR_IN_CHARGE_CODE
     */
    public String getDoctorInChargeCode() {
        return doctorInChargeCode;
    }

    /**
     * @param doctorInChargeCode
     */
    public void setDoctorInChargeCode(String doctorInChargeCode) {
        this.doctorInChargeCode = doctorInChargeCode;
    }

    /**
     * @return DOCTOR_IN_CHARGE_NAME
     */
    public String getDoctorInChargeName() {
        return doctorInChargeName;
    }

    /**
     * @param doctorInChargeName
     */
    public void setDoctorInChargeName(String doctorInChargeName) {
        this.doctorInChargeName = doctorInChargeName;
    }

    /**
     * @return DIRECTOR_CODE
     */
    public String getDirectorCode() {
        return directorCode;
    }

    /**
     * @param directorCode
     */
    public void setDirectorCode(String directorCode) {
        this.directorCode = directorCode;
    }

    /**
     * @return DIRECTOR_NAME
     */
    public String getDirectorName() {
        return directorName;
    }

    /**
     * @param directorName
     */
    public void setDirectorName(String directorName) {
        this.directorName = directorName;
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
     * @return IS_OUT
     */
    public Integer getIsOut() {
        return isOut;
    }

    /**
     * @param isOut
     */
    public void setIsOut(Integer isOut) {
        this.isOut = isOut;
    }

    /**
     * @return DISCHARGE_STATUS
     */
    public String getDischargeStatus() {
        return dischargeStatus;
    }

    /**
     * @param dischargeStatus
     */
    public void setDischargeStatus(String dischargeStatus) {
        this.dischargeStatus = dischargeStatus;
    }

    /**
     * 获取默认为1。当该患者被拉黑后，导入的来院数据不需要生成任务，值置为0。
     *
     * @return IS_NEED_GENERATE_TASK - 默认为1。当该患者被拉黑后，导入的来院数据不需要生成任务，值置为0。
     */
    public Integer getIsNeedGenerateTask() {
        return isNeedGenerateTask;
    }

    /**
     * 设置默认为1。当该患者被拉黑后，导入的来院数据不需要生成任务，值置为0。
     *
     * @param isNeedGenerateTask 默认为1。当该患者被拉黑后，导入的来院数据不需要生成任务，值置为0。
     */
    public void setIsNeedGenerateTask(Integer isNeedGenerateTask) {
        this.isNeedGenerateTask = isNeedGenerateTask;
    }

    /**
     * 获取该来院次数据生成任务后置1
     *
     * @return IS_TASK_GENERATED - 该来院次数据生成任务后置1
     */
    public Integer getIsTaskGenerated() {
        return isTaskGenerated;
    }

    /**
     * 设置该来院次数据生成任务后置1
     *
     * @param isTaskGenerated 该来院次数据生成任务后置1
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