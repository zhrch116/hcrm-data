package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_DOCTOR_USER_REL")
public class CtDoctorUserRel {
    @Id
    @Column(name = "DOCTOR_USER_REL_KEY_ID")
    private Integer doctorUserRelKeyId;

    @Column(name = "USER_KEY_ID")
    private Integer userKeyId;

    @Column(name = "DOCTOR_KEY_ID")
    private Integer doctorKeyId;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return DOCTOR_USER_REL_KEY_ID
     */
    public Integer getDoctorUserRelKeyId() {
        return doctorUserRelKeyId;
    }

    /**
     * @param doctorUserRelKeyId
     */
    public void setDoctorUserRelKeyId(Integer doctorUserRelKeyId) {
        this.doctorUserRelKeyId = doctorUserRelKeyId;
    }

    /**
     * @return USER_KEY_ID
     */
    public Integer getUserKeyId() {
        return userKeyId;
    }

    /**
     * @param userKeyId
     */
    public void setUserKeyId(Integer userKeyId) {
        this.userKeyId = userKeyId;
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