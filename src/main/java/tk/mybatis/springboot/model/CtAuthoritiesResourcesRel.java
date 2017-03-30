package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_AUTHORITIES_RESOURCES_REL")
public class CtAuthoritiesResourcesRel {
    @Id
    @Column(name = "AUTHORITIES_KEY_ID")
    private Integer authoritiesKeyId;

    @Id
    @Column(name = "RESOURCE_ID")
    private Integer resourceId;

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
}