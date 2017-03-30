package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_TEMPLATE_DEPT_REL")
public class CtTemplateDeptRel {
    @Id
    @Column(name = "TEMPLATE_DEPT_KEY_ID")
    private Integer templateDeptKeyId;

    @Column(name = "DEPT_ID")
    private Integer deptId;

    @Column(name = "TEMPLATE_ID")
    private Integer templateId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return TEMPLATE_DEPT_KEY_ID
     */
    public Integer getTemplateDeptKeyId() {
        return templateDeptKeyId;
    }

    /**
     * @param templateDeptKeyId
     */
    public void setTemplateDeptKeyId(Integer templateDeptKeyId) {
        this.templateDeptKeyId = templateDeptKeyId;
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
     * @return TEMPLATE_ID
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * @param templateId
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
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