package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_TASK_DEFAULT_DEPT_RECORD")
public class CtTaskDefaultDeptRecord {
    @Id
    @Column(name = "DEFAULT_RECORD_KEY_ID")
    private Integer defaultRecordKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "APPLICABLE_TYPE_CODE")
    private String applicableTypeCode;

    @Column(name = "APPLICABLE_TYPE_NAME")
    private String applicableTypeName;

    @Column(name = "SOURCE_DEPT_ID")
    private Integer sourceDeptId;

    @Column(name = "TARGET_DEPT_ID")
    private Integer targetDeptId;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return DEFAULT_RECORD_KEY_ID
     */
    public Integer getDefaultRecordKeyId() {
        return defaultRecordKeyId;
    }

    /**
     * @param defaultRecordKeyId
     */
    public void setDefaultRecordKeyId(Integer defaultRecordKeyId) {
        this.defaultRecordKeyId = defaultRecordKeyId;
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
     * @return APPLICABLE_TYPE_CODE
     */
    public String getApplicableTypeCode() {
        return applicableTypeCode;
    }

    /**
     * @param applicableTypeCode
     */
    public void setApplicableTypeCode(String applicableTypeCode) {
        this.applicableTypeCode = applicableTypeCode;
    }

    /**
     * @return APPLICABLE_TYPE_NAME
     */
    public String getApplicableTypeName() {
        return applicableTypeName;
    }

    /**
     * @param applicableTypeName
     */
    public void setApplicableTypeName(String applicableTypeName) {
        this.applicableTypeName = applicableTypeName;
    }

    /**
     * @return SOURCE_DEPT_ID
     */
    public Integer getSourceDeptId() {
        return sourceDeptId;
    }

    /**
     * @param sourceDeptId
     */
    public void setSourceDeptId(Integer sourceDeptId) {
        this.sourceDeptId = sourceDeptId;
    }

    /**
     * @return TARGET_DEPT_ID
     */
    public Integer getTargetDeptId() {
        return targetDeptId;
    }

    /**
     * @param targetDeptId
     */
    public void setTargetDeptId(Integer targetDeptId) {
        this.targetDeptId = targetDeptId;
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