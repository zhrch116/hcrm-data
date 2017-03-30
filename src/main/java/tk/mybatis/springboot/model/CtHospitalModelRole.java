package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_HOSPITAL_MODEL_ROLE")
public class CtHospitalModelRole {
    @Id
    @Column(name = "HOSPITAL_MODEL_ROLE_ID")
    private Integer hospitalModelRoleId;

    @Column(name = "HOSPITAL_MODEL_ID")
    private Integer hospitalModelId;

    @Column(name = "ROLE_KEY_ID")
    private Integer roleKeyId;

    /**
     * DOCTOR:医生,NURSE:护士,CUSTOMER:客服,CUSTOMER_TEAM_LEADER:客服组长
     */
    @Column(name = "INIT_ROLE_CODE")
    private String initRoleCode;

    /**
     * @return HOSPITAL_MODEL_ROLE_ID
     */
    public Integer getHospitalModelRoleId() {
        return hospitalModelRoleId;
    }

    /**
     * @param hospitalModelRoleId
     */
    public void setHospitalModelRoleId(Integer hospitalModelRoleId) {
        this.hospitalModelRoleId = hospitalModelRoleId;
    }

    /**
     * @return HOSPITAL_MODEL_ID
     */
    public Integer getHospitalModelId() {
        return hospitalModelId;
    }

    /**
     * @param hospitalModelId
     */
    public void setHospitalModelId(Integer hospitalModelId) {
        this.hospitalModelId = hospitalModelId;
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
     * 获取DOCTOR:医生,NURSE:护士,CUSTOMER:客服,CUSTOMER_TEAM_LEADER:客服组长
     *
     * @return INIT_ROLE_CODE - DOCTOR:医生,NURSE:护士,CUSTOMER:客服,CUSTOMER_TEAM_LEADER:客服组长
     */
    public String getInitRoleCode() {
        return initRoleCode;
    }

    /**
     * 设置DOCTOR:医生,NURSE:护士,CUSTOMER:客服,CUSTOMER_TEAM_LEADER:客服组长
     *
     * @param initRoleCode DOCTOR:医生,NURSE:护士,CUSTOMER:客服,CUSTOMER_TEAM_LEADER:客服组长
     */
    public void setInitRoleCode(String initRoleCode) {
        this.initRoleCode = initRoleCode;
    }
}