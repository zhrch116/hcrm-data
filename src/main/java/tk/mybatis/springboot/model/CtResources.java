package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_RESOURCES")
public class CtResources {
    @Id
    @Column(name = "RESOURCE_ID")
    private Integer resourceId;

    @Column(name = "RESOURCE_CODE")
    private String resourceCode;

    @Column(name = "RESOURCE_NAME")
    private String resourceName;

    @Column(name = "RESOURCE_DESC")
    private String resourceDesc;

    /**
     * 资源类型(1:菜单,2:按钮)
     */
    @Column(name = "RESOURCE_TYPE")
    private Integer resourceType;

    @Column(name = "RESOURCE_PATH")
    private String resourcePath;

    @Column(name = "RESOURCE_ORDER")
    private Boolean resourceOrder;

    @Column(name = "RESOURCE_DEEP")
    private Boolean resourceDeep;

    @Column(name = "PARENT_RESOURCE_CODE")
    private String parentResourceCode;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return RESOURCE_ID
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * @param resourceId
     */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * @return RESOURCE_CODE
     */
    public String getResourceCode() {
        return resourceCode;
    }

    /**
     * @param resourceCode
     */
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    /**
     * @return RESOURCE_NAME
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * @return RESOURCE_DESC
     */
    public String getResourceDesc() {
        return resourceDesc;
    }

    /**
     * @param resourceDesc
     */
    public void setResourceDesc(String resourceDesc) {
        this.resourceDesc = resourceDesc;
    }

    /**
     * 获取资源类型(1:菜单,2:按钮)
     *
     * @return RESOURCE_TYPE - 资源类型(1:菜单,2:按钮)
     */
    public Integer getResourceType() {
        return resourceType;
    }

    /**
     * 设置资源类型(1:菜单,2:按钮)
     *
     * @param resourceType 资源类型(1:菜单,2:按钮)
     */
    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * @return RESOURCE_PATH
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * @param resourcePath
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * @return RESOURCE_ORDER
     */
    public Boolean getResourceOrder() {
        return resourceOrder;
    }

    /**
     * @param resourceOrder
     */
    public void setResourceOrder(Boolean resourceOrder) {
        this.resourceOrder = resourceOrder;
    }

    /**
     * @return RESOURCE_DEEP
     */
    public Boolean getResourceDeep() {
        return resourceDeep;
    }

    /**
     * @param resourceDeep
     */
    public void setResourceDeep(Boolean resourceDeep) {
        this.resourceDeep = resourceDeep;
    }

    /**
     * @return PARENT_RESOURCE_CODE
     */
    public String getParentResourceCode() {
        return parentResourceCode;
    }

    /**
     * @param parentResourceCode
     */
    public void setParentResourceCode(String parentResourceCode) {
        this.parentResourceCode = parentResourceCode;
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