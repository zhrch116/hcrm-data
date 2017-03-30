package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_DEPT")
public class CtDept {
    @Id
    @Column(name = "DEPT_ID")
    private Integer deptId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "DEPT_CODE")
    private String deptCode;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "DEPT_SHORT_SPELL")
    private String deptShortSpell;

    @Column(name = "DEPT_ALIASES")
    private String deptAliases;

    @Column(name = "DEPT_PHONE")
    private String deptPhone;

    @Column(name = "PARENT_DEPT_ID")
    private String parentDeptId;

    @Column(name = "PARENT_DEPT_CODE")
    private String parentDeptCode;

    /**
     * 见字典表
     */
    @Column(name = "DEPT_TYPE_CODE")
    private String deptTypeCode;

    /**
     * 见字典表
     */
    @Column(name = "DEPT_TYPE_NAME")
    private String deptTypeName;

    @Column(name = "IS_ONLINE")
    private Boolean isOnline;

    /**
     * ETL导入新增数据时插入该字段的值
     */
    @Column(name = "ETL_IMPORT_INSERT_TIME")
    private Date etlImportInsertTime;

    /**
     * ETL导入更新数据时更新该字段的值
     */
    @Column(name = "ETL_IMPORT_UPDATE_TIME")
    private Date etlImportUpdateTime;

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

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    @Column(name = "REMARK")
    private String remark;

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
     * @return DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * @param deptCode
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
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
     * @return DEPT_SHORT_SPELL
     */
    public String getDeptShortSpell() {
        return deptShortSpell;
    }

    /**
     * @param deptShortSpell
     */
    public void setDeptShortSpell(String deptShortSpell) {
        this.deptShortSpell = deptShortSpell;
    }

    /**
     * @return DEPT_ALIASES
     */
    public String getDeptAliases() {
        return deptAliases;
    }

    /**
     * @param deptAliases
     */
    public void setDeptAliases(String deptAliases) {
        this.deptAliases = deptAliases;
    }

    /**
     * @return DEPT_PHONE
     */
    public String getDeptPhone() {
        return deptPhone;
    }

    /**
     * @param deptPhone
     */
    public void setDeptPhone(String deptPhone) {
        this.deptPhone = deptPhone;
    }

    /**
     * @return PARENT_DEPT_ID
     */
    public String getParentDeptId() {
        return parentDeptId;
    }

    /**
     * @param parentDeptId
     */
    public void setParentDeptId(String parentDeptId) {
        this.parentDeptId = parentDeptId;
    }

    /**
     * @return PARENT_DEPT_CODE
     */
    public String getParentDeptCode() {
        return parentDeptCode;
    }

    /**
     * @param parentDeptCode
     */
    public void setParentDeptCode(String parentDeptCode) {
        this.parentDeptCode = parentDeptCode;
    }

    /**
     * 获取见字典表
     *
     * @return DEPT_TYPE_CODE - 见字典表
     */
    public String getDeptTypeCode() {
        return deptTypeCode;
    }

    /**
     * 设置见字典表
     *
     * @param deptTypeCode 见字典表
     */
    public void setDeptTypeCode(String deptTypeCode) {
        this.deptTypeCode = deptTypeCode;
    }

    /**
     * 获取见字典表
     *
     * @return DEPT_TYPE_NAME - 见字典表
     */
    public String getDeptTypeName() {
        return deptTypeName;
    }

    /**
     * 设置见字典表
     *
     * @param deptTypeName 见字典表
     */
    public void setDeptTypeName(String deptTypeName) {
        this.deptTypeName = deptTypeName;
    }

    /**
     * @return IS_ONLINE
     */
    public Boolean getIsOnline() {
        return isOnline;
    }

    /**
     * @param isOnline
     */
    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    /**
     * 获取ETL导入新增数据时插入该字段的值
     *
     * @return ETL_IMPORT_INSERT_TIME - ETL导入新增数据时插入该字段的值
     */
    public Date getEtlImportInsertTime() {
        return etlImportInsertTime;
    }

    /**
     * 设置ETL导入新增数据时插入该字段的值
     *
     * @param etlImportInsertTime ETL导入新增数据时插入该字段的值
     */
    public void setEtlImportInsertTime(Date etlImportInsertTime) {
        this.etlImportInsertTime = etlImportInsertTime;
    }

    /**
     * 获取ETL导入更新数据时更新该字段的值
     *
     * @return ETL_IMPORT_UPDATE_TIME - ETL导入更新数据时更新该字段的值
     */
    public Date getEtlImportUpdateTime() {
        return etlImportUpdateTime;
    }

    /**
     * 设置ETL导入更新数据时更新该字段的值
     *
     * @param etlImportUpdateTime ETL导入更新数据时更新该字段的值
     */
    public void setEtlImportUpdateTime(Date etlImportUpdateTime) {
        this.etlImportUpdateTime = etlImportUpdateTime;
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

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}