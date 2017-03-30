package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_EXCEL_EXAM_INFO")
public class CtExcelExamInfo {
    @Id
    @Column(name = "EXAM_KEY_ID")
    private Integer examKeyId;

    /**
     * 当本条记录就诊类别为「住院」时，存储的是病人档案住院记录表的对应数据的主键ID；当本条记录就诊类别为「门诊」时，存储的是病人档案门诊记录表的对应数据的主键ID；
     */
    @Column(name = "VISIT_RECORD_KEY_ID")
    private Integer visitRecordKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    /**
     * 直接存储汉字，值为「住院」/「门诊」
     */
    @Column(name = "PATIENT_SOURCE")
    private String patientSource;

    @Column(name = "EXAM_NO")
    private String examNo;

    @Column(name = "EXAM_NAME")
    private String examName;

    @Column(name = "EXAM_TYPE")
    private String examType;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "EXAM_DATE")
    private Date examDate;

    /**
     * 0：未归档；1：已归档；
     */
    @Column(name = "IS_FILED")
    private Integer isFiled;

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
     * @return EXAM_KEY_ID
     */
    public Integer getExamKeyId() {
        return examKeyId;
    }

    /**
     * @param examKeyId
     */
    public void setExamKeyId(Integer examKeyId) {
        this.examKeyId = examKeyId;
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
     * @return EXAM_NO
     */
    public String getExamNo() {
        return examNo;
    }

    /**
     * @param examNo
     */
    public void setExamNo(String examNo) {
        this.examNo = examNo;
    }

    /**
     * @return EXAM_NAME
     */
    public String getExamName() {
        return examName;
    }

    /**
     * @param examName
     */
    public void setExamName(String examName) {
        this.examName = examName;
    }

    /**
     * @return EXAM_TYPE
     */
    public String getExamType() {
        return examType;
    }

    /**
     * @param examType
     */
    public void setExamType(String examType) {
        this.examType = examType;
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
     * @return EXAM_DATE
     */
    public Date getExamDate() {
        return examDate;
    }

    /**
     * @param examDate
     */
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
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