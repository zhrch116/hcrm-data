package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_TASK_TEMPLATE_REL")
public class CtTaskTemplateRel {
    @Id
    @Column(name = "TASK_TEMPLATE_REL_KEY_ID")
    private Integer taskTemplateRelKeyId;

    @Column(name = "FOLLOW_UP_TASK_KEY_ID")
    private Integer followUpTaskKeyId;

    @Column(name = "TEMPLATE_ID")
    private Integer templateId;

    @Column(name = "APPLICABLE_TYPE_CODE")
    private String applicableTypeCode;

    @Column(name = "APPLICABLE_TYPE_NAME")
    private String applicableTypeName;

    /**
     * 本行数据创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return TASK_TEMPLATE_REL_KEY_ID
     */
    public Integer getTaskTemplateRelKeyId() {
        return taskTemplateRelKeyId;
    }

    /**
     * @param taskTemplateRelKeyId
     */
    public void setTaskTemplateRelKeyId(Integer taskTemplateRelKeyId) {
        this.taskTemplateRelKeyId = taskTemplateRelKeyId;
    }

    /**
     * @return FOLLOW_UP_TASK_KEY_ID
     */
    public Integer getFollowUpTaskKeyId() {
        return followUpTaskKeyId;
    }

    /**
     * @param followUpTaskKeyId
     */
    public void setFollowUpTaskKeyId(Integer followUpTaskKeyId) {
        this.followUpTaskKeyId = followUpTaskKeyId;
    }

    /**
     * @return TEMPLATE_ID
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * @param templateId
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * @return APPLICABLE_TYPE_CODE
     */
    public String getApplicableTypeCode() {
        return applicableTypeCode;
    }

    /**
     * @param applicableTypeCode
     */
    public void setApplicableTypeCode(String applicableTypeCode) {
        this.applicableTypeCode = applicableTypeCode;
    }

    /**
     * @return APPLICABLE_TYPE_NAME
     */
    public String getApplicableTypeName() {
        return applicableTypeName;
    }

    /**
     * @param applicableTypeName
     */
    public void setApplicableTypeName(String applicableTypeName) {
        this.applicableTypeName = applicableTypeName;
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