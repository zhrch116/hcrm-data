package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_HEALTH_GUIDANCE_RECORD")
public class CtHealthGuidanceRecord {
    @Id
    @Column(name = "HEALTH_GUIDANCE_KEY_ID")
    private Integer healthGuidanceKeyId;

    @Column(name = "FOLLOW_UP_TASK_KEY_ID")
    private Integer followUpTaskKeyId;

    @Column(name = "HEALTH_GUIDANCE_USER_ID")
    private Integer healthGuidanceUserId;

    @Column(name = "HEALTH_GUIDANCE_TIME")
    private Date healthGuidanceTime;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    @Column(name = "HEALTH_GUIDANCE_CONTENT")
    private String healthGuidanceContent;

    /**
     * @return HEALTH_GUIDANCE_KEY_ID
     */
    public Integer getHealthGuidanceKeyId() {
        return healthGuidanceKeyId;
    }

    /**
     * @param healthGuidanceKeyId
     */
    public void setHealthGuidanceKeyId(Integer healthGuidanceKeyId) {
        this.healthGuidanceKeyId = healthGuidanceKeyId;
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
     * @return HEALTH_GUIDANCE_USER_ID
     */
    public Integer getHealthGuidanceUserId() {
        return healthGuidanceUserId;
    }

    /**
     * @param healthGuidanceUserId
     */
    public void setHealthGuidanceUserId(Integer healthGuidanceUserId) {
        this.healthGuidanceUserId = healthGuidanceUserId;
    }

    /**
     * @return HEALTH_GUIDANCE_TIME
     */
    public Date getHealthGuidanceTime() {
        return healthGuidanceTime;
    }

    /**
     * @param healthGuidanceTime
     */
    public void setHealthGuidanceTime(Date healthGuidanceTime) {
        this.healthGuidanceTime = healthGuidanceTime;
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

    /**
     * @return HEALTH_GUIDANCE_CONTENT
     */
    public String getHealthGuidanceContent() {
        return healthGuidanceContent;
    }

    /**
     * @param healthGuidanceContent
     */
    public void setHealthGuidanceContent(String healthGuidanceContent) {
        this.healthGuidanceContent = healthGuidanceContent;
    }
}