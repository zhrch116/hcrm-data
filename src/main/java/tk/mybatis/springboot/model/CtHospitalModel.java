package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_HOSPITAL_MODEL")
public class CtHospitalModel {
    @Id
    @Column(name = "HOSPITAL_MODEL_ID")
    private Integer hospitalModelId;

    /**
     * 外部系统医院模式的编码
     */
    @Column(name = "HOSPITAL_MODEL_CODE")
    private String hospitalModelCode;

    @Column(name = "HOSPITAL_MODEL_NAME")
    private String hospitalModelName;

    /**
     * 系统用于区分医院模式的编码（HOSPITAL:医院,CLINIC:诊所）
     */
    @Column(name = "SYS_HOSPITAL_MODEL_CODE")
    private String sysHospitalModelCode;

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
     * 获取外部系统医院模式的编码
     *
     * @return HOSPITAL_MODEL_CODE - 外部系统医院模式的编码
     */
    public String getHospitalModelCode() {
        return hospitalModelCode;
    }

    /**
     * 设置外部系统医院模式的编码
     *
     * @param hospitalModelCode 外部系统医院模式的编码
     */
    public void setHospitalModelCode(String hospitalModelCode) {
        this.hospitalModelCode = hospitalModelCode;
    }

    /**
     * @return HOSPITAL_MODEL_NAME
     */
    public String getHospitalModelName() {
        return hospitalModelName;
    }

    /**
     * @param hospitalModelName
     */
    public void setHospitalModelName(String hospitalModelName) {
        this.hospitalModelName = hospitalModelName;
    }

    /**
     * 获取系统用于区分医院模式的编码（HOSPITAL:医院,CLINIC:诊所）
     *
     * @return SYS_HOSPITAL_MODEL_CODE - 系统用于区分医院模式的编码（HOSPITAL:医院,CLINIC:诊所）
     */
    public String getSysHospitalModelCode() {
        return sysHospitalModelCode;
    }

    /**
     * 设置系统用于区分医院模式的编码（HOSPITAL:医院,CLINIC:诊所）
     *
     * @param sysHospitalModelCode 系统用于区分医院模式的编码（HOSPITAL:医院,CLINIC:诊所）
     */
    public void setSysHospitalModelCode(String sysHospitalModelCode) {
        this.sysHospitalModelCode = sysHospitalModelCode;
    }
}