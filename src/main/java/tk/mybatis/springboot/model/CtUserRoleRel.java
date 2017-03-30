package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_USER_ROLE_REL")
public class CtUserRoleRel {
    @Id
    @Column(name = "USER_ROLE_REL_KEY_ID")
    private Integer userRoleRelKeyId;

    @Column(name = "USER_KEY_ID")
    private Integer userKeyId;

    @Column(name = "ROLE_KEY_ID")
    private Integer roleKeyId;

    @Column(name = "CREATOR_ID")
    private Integer creatorId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * @return USER_ROLE_REL_KEY_ID
     */
    public Integer getUserRoleRelKeyId() {
        return userRoleRelKeyId;
    }

    /**
     * @param userRoleRelKeyId
     */
    public void setUserRoleRelKeyId(Integer userRoleRelKeyId) {
        this.userRoleRelKeyId = userRoleRelKeyId;
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
     * @return ROLE_KEY_ID
     */
    public Integer getRoleKeyId() {
        return roleKeyId;
    }

    /**
     * @param roleKeyId
     */
    public void setRoleKeyId(Integer roleKeyId) {
        this.roleKeyId = roleKeyId;
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
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}