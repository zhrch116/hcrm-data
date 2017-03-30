package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_USER_DEPT_REL")
public class CtUserDeptRel {
    @Id
    @Column(name = "USER_DEPT_REL_KEY_ID")
    private Integer userDeptRelKeyId;

    @Column(name = "USER_KEY_ID")
    private Integer userKeyId;

    @Column(name = "DEPT_ID")
    private Integer deptId;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return USER_DEPT_REL_KEY_ID
     */
    public Integer getUserDeptRelKeyId() {
        return userDeptRelKeyId;
    }

    /**
     * @param userDeptRelKeyId
     */
    public void setUserDeptRelKeyId(Integer userDeptRelKeyId) {
        this.userDeptRelKeyId = userDeptRelKeyId;
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