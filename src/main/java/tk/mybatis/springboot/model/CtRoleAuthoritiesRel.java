package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ROLE_AUTHORITIES_REL")
public class CtRoleAuthoritiesRel {
    @Id
    @Column(name = "ROLE_AUTHORITIES_REL_KEY_ID")
    private Integer roleAuthoritiesRelKeyId;

    @Column(name = "AUTHORITIES_KEY_ID")
    private Integer authoritiesKeyId;

    @Column(name = "ROLE_KEY_ID")
    private Integer roleKeyId;

    @Column(name = "CREATOR_ID")
    private Integer creatorId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * @return ROLE_AUTHORITIES_REL_KEY_ID
     */
    public Integer getRoleAuthoritiesRelKeyId() {
        return roleAuthoritiesRelKeyId;
    }

    /**
     * @param roleAuthoritiesRelKeyId
     */
    public void setRoleAuthoritiesRelKeyId(Integer roleAuthoritiesRelKeyId) {
        this.roleAuthoritiesRelKeyId = roleAuthoritiesRelKeyId;
    }

    /**
     * @return AUTHORITIES_KEY_ID
     */
    public Integer getAuthoritiesKeyId() {
        return authoritiesKeyId;
    }

    /**
     * @param authoritiesKeyId
     */
    public void setAuthoritiesKeyId(Integer authoritiesKeyId) {
        this.authoritiesKeyId = authoritiesKeyId;
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