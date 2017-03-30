package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_HOSPITAL_CONFIG_GROUP")
public class CtHospitalConfigGroup {
    @Id
    @Column(name = "GROUP_CODE")
    private String groupCode;

    @Column(name = "GROUP_NAME")
    private String groupName;

    @Column(name = "MODULE_CODE")
    private String moduleCode;

    @Column(name = "MODULE_NAME")
    private String moduleName;

    @Column(name = "MODULE_NO")
    private Integer moduleNo;

    @Column(name = "GROUP_DESC")
    private String groupDesc;

    @Column(name = "GROUP_NO")
    private Integer groupNo;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return GROUP_CODE
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * @param groupCode
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    /**
     * @return GROUP_NAME
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @return MODULE_CODE
     */
    public String getModuleCode() {
        return moduleCode;
    }

    /**
     * @param moduleCode
     */
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    /**
     * @return MODULE_NAME
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * @param moduleName
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * @return MODULE_NO
     */
    public Integer getModuleNo() {
        return moduleNo;
    }

    /**
     * @param moduleNo
     */
    public void setModuleNo(Integer moduleNo) {
        this.moduleNo = moduleNo;
    }

    /**
     * @return GROUP_DESC
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * @param groupDesc
     */
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    /**
     * @return GROUP_NO
     */
    public Integer getGroupNo() {
        return groupNo;
    }

    /**
     * @param groupNo
     */
    public void setGroupNo(Integer groupNo) {
        this.groupNo = groupNo;
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