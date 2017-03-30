package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_USER_FOCUS_RECORD")
public class CtUserFocusRecord {
    @Id
    @Column(name = "USER_FOCUS_KEY_ID")
    private Integer userFocusKeyId;

    @Column(name = "PATIENT_KEY_ID")
    private Integer patientKeyId;

    @Column(name = "USER_KEY_ID")
    private Integer userKeyId;

    @Column(name = "FOCUS_TIME")
    private Date focusTime;

    /**
     * @return USER_FOCUS_KEY_ID
     */
    public Integer getUserFocusKeyId() {
        return userFocusKeyId;
    }

    /**
     * @param userFocusKeyId
     */
    public void setUserFocusKeyId(Integer userFocusKeyId) {
        this.userFocusKeyId = userFocusKeyId;
    }

    /**
     * @return PATIENT_KEY_ID
     */
    public Integer getPatientKeyId() {
        return patientKeyId;
    }

    /**
     * @param patientKeyId
     */
    public void setPatientKeyId(Integer patientKeyId) {
        this.patientKeyId = patientKeyId;
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
     * @return FOCUS_TIME
     */
    public Date getFocusTime() {
        return focusTime;
    }

    /**
     * @param focusTime
     */
    public void setFocusTime(Date focusTime) {
        this.focusTime = focusTime;
    }
}