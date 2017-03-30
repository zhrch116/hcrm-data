package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_DOCTOR_DEPT_REL")
public class CtDoctorDeptRel {
    @Id
    @Column(name = "DOCTOR_DEPT_REL_KEY_ID")
    private Integer doctorDeptRelKeyId;

    @Column(name = "DEPT_ID")
    private Integer deptId;

    @Column(name = "DOCTOR_KEY_ID")
    private Integer doctorKeyId;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return DOCTOR_DEPT_REL_KEY_ID
     */
    public Integer getDoctorDeptRelKeyId() {
        return doctorDeptRelKeyId;
    }

    /**
     * @param doctorDeptRelKeyId
     */
    public void setDoctorDeptRelKeyId(Integer doctorDeptRelKeyId) {
        this.doctorDeptRelKeyId = doctorDeptRelKeyId;
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
     * @return DOCTOR_KEY_ID
     */
    public Integer getDoctorKeyId() {
        return doctorKeyId;
    }

    /**
     * @param doctorKeyId
     */
    public void setDoctorKeyId(Integer doctorKeyId) {
        this.doctorKeyId = doctorKeyId;
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