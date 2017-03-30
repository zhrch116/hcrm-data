package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ROLE")
public class CtRole {
    @Id
    @Column(name = "ROLE_KEY_ID")
    private Integer roleKeyId;

    @Column(name = "JZYH_ROLE_ID")
    private String jzyhRoleId;

    @Column(name = "ROLE_CODE")
    private String roleCode;

    @Column(name = "ROLE_NAME")
    private String roleName;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "CREATOR_ID")
    private Integer creatorId;

    @Column(name = "CREATOR_NAME")
    private String creatorName;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "EDITOR_ID")
    private Integer editorId;

    @Column(name = "EDITOR_NAME")
    private String editorName;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

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
     * @return JZYH_ROLE_ID
     */
    public String getJzyhRoleId() {
        return jzyhRoleId;
    }

    /**
     * @param jzyhRoleId
     */
    public void setJzyhRoleId(String jzyhRoleId) {
        this.jzyhRoleId = jzyhRoleId;
    }

    /**
     * @return ROLE_CODE
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * @param roleCode
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    /**
     * @return ROLE_NAME
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
     * @return CREATOR_NAME
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * @param creatorName
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
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
     * @return EDITOR_NAME
     */
    public String getEditorName() {
        return editorName;
    }

    /**
     * @param editorName
     */
    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return IS_ENABLE
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * @param isEnable
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }
}