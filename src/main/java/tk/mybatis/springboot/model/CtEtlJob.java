package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_ETL_JOB")
public class CtEtlJob {
    @Id
    @Column(name = "JOB_CODE")
    private String jobCode;

    @Column(name = "JOB_NAME")
    private String jobName;

    @Column(name = "JOB_DESCRPITON")
    private String jobDescrpiton;

    /**
     * 0-不需要在云上执行；1-需要在云上执行；
     */
    @Column(name = "IS_CLOUD_EXECUTED")
    private Boolean isCloudExecuted;

    /**
     * 0-不需要在端上执行；1-需要在端上执行；
     */
    @Column(name = "IS_HOSPITAL_EXECUTED")
    private Boolean isHospitalExecuted;

    /**
     * ETL任务在云资源库中的路径
     */
    @Column(name = "IS_CLOUD_DIRECTORY")
    private String isCloudDirectory;

    /**
     * ETL任务在端资源库中的路径
     */
    @Column(name = "IS_HOSPITAL_DIRECTORY")
    private String isHospitalDirectory;

    @Column(name = "CLOUD_DEFAULT_TIMING_HOUR")
    private Integer cloudDefaultTimingHour;

    @Column(name = "CLOUD_DEFAULT_TIMING_MINUTE")
    private Integer cloudDefaultTimingMinute;

    @Column(name = "LOCAL_DEFAULT_TIMING_HOUR")
    private Integer localDefaultTimingHour;

    @Column(name = "LOCAL_DEFAULT_TIMING_MINUTE")
    private Integer localDefaultTimingMinute;

    /**
     * 值为“HIS”表示需要去HIS中导数据的ETL；值为“CLOUD”表示只在云服务器上执行的ETL
     */
    @Column(name = "ETL_TYPE")
    private String etlType;

    @Column(name = "SHOW_ORDER")
    private Integer showOrder;

    @Column(name = "LIMIT_HOS_CONFIG_CODE")
    private String limitHosConfigCode;

    @Column(name = "LIMIT_HOS_CONFIG_VALUE")
    private String limitHosConfigValue;

    @Column(name = "IS_UPDATE_LOCAL_STATUS")
    private Boolean isUpdateLocalStatus;

    /**
     * 0-不可用；1-可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return JOB_CODE
     */
    public String getJobCode() {
        return jobCode;
    }

    /**
     * @param jobCode
     */
    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    /**
     * @return JOB_NAME
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * @return JOB_DESCRPITON
     */
    public String getJobDescrpiton() {
        return jobDescrpiton;
    }

    /**
     * @param jobDescrpiton
     */
    public void setJobDescrpiton(String jobDescrpiton) {
        this.jobDescrpiton = jobDescrpiton;
    }

    /**
     * 获取0-不需要在云上执行；1-需要在云上执行；
     *
     * @return IS_CLOUD_EXECUTED - 0-不需要在云上执行；1-需要在云上执行；
     */
    public Boolean getIsCloudExecuted() {
        return isCloudExecuted;
    }

    /**
     * 设置0-不需要在云上执行；1-需要在云上执行；
     *
     * @param isCloudExecuted 0-不需要在云上执行；1-需要在云上执行；
     */
    public void setIsCloudExecuted(Boolean isCloudExecuted) {
        this.isCloudExecuted = isCloudExecuted;
    }

    /**
     * 获取0-不需要在端上执行；1-需要在端上执行；
     *
     * @return IS_HOSPITAL_EXECUTED - 0-不需要在端上执行；1-需要在端上执行；
     */
    public Boolean getIsHospitalExecuted() {
        return isHospitalExecuted;
    }

    /**
     * 设置0-不需要在端上执行；1-需要在端上执行；
     *
     * @param isHospitalExecuted 0-不需要在端上执行；1-需要在端上执行；
     */
    public void setIsHospitalExecuted(Boolean isHospitalExecuted) {
        this.isHospitalExecuted = isHospitalExecuted;
    }

    /**
     * 获取ETL任务在云资源库中的路径
     *
     * @return IS_CLOUD_DIRECTORY - ETL任务在云资源库中的路径
     */
    public String getIsCloudDirectory() {
        return isCloudDirectory;
    }

    /**
     * 设置ETL任务在云资源库中的路径
     *
     * @param isCloudDirectory ETL任务在云资源库中的路径
     */
    public void setIsCloudDirectory(String isCloudDirectory) {
        this.isCloudDirectory = isCloudDirectory;
    }

    /**
     * 获取ETL任务在端资源库中的路径
     *
     * @return IS_HOSPITAL_DIRECTORY - ETL任务在端资源库中的路径
     */
    public String getIsHospitalDirectory() {
        return isHospitalDirectory;
    }

    /**
     * 设置ETL任务在端资源库中的路径
     *
     * @param isHospitalDirectory ETL任务在端资源库中的路径
     */
    public void setIsHospitalDirectory(String isHospitalDirectory) {
        this.isHospitalDirectory = isHospitalDirectory;
    }

    /**
     * @return CLOUD_DEFAULT_TIMING_HOUR
     */
    public Integer getCloudDefaultTimingHour() {
        return cloudDefaultTimingHour;
    }

    /**
     * @param cloudDefaultTimingHour
     */
    public void setCloudDefaultTimingHour(Integer cloudDefaultTimingHour) {
        this.cloudDefaultTimingHour = cloudDefaultTimingHour;
    }

    /**
     * @return CLOUD_DEFAULT_TIMING_MINUTE
     */
    public Integer getCloudDefaultTimingMinute() {
        return cloudDefaultTimingMinute;
    }

    /**
     * @param cloudDefaultTimingMinute
     */
    public void setCloudDefaultTimingMinute(Integer cloudDefaultTimingMinute) {
        this.cloudDefaultTimingMinute = cloudDefaultTimingMinute;
    }

    /**
     * @return LOCAL_DEFAULT_TIMING_HOUR
     */
    public Integer getLocalDefaultTimingHour() {
        return localDefaultTimingHour;
    }

    /**
     * @param localDefaultTimingHour
     */
    public void setLocalDefaultTimingHour(Integer localDefaultTimingHour) {
        this.localDefaultTimingHour = localDefaultTimingHour;
    }

    /**
     * @return LOCAL_DEFAULT_TIMING_MINUTE
     */
    public Integer getLocalDefaultTimingMinute() {
        return localDefaultTimingMinute;
    }

    /**
     * @param localDefaultTimingMinute
     */
    public void setLocalDefaultTimingMinute(Integer localDefaultTimingMinute) {
        this.localDefaultTimingMinute = localDefaultTimingMinute;
    }

    /**
     * 获取值为“HIS”表示需要去HIS中导数据的ETL；值为“CLOUD”表示只在云服务器上执行的ETL
     *
     * @return ETL_TYPE - 值为“HIS”表示需要去HIS中导数据的ETL；值为“CLOUD”表示只在云服务器上执行的ETL
     */
    public String getEtlType() {
        return etlType;
    }

    /**
     * 设置值为“HIS”表示需要去HIS中导数据的ETL；值为“CLOUD”表示只在云服务器上执行的ETL
     *
     * @param etlType 值为“HIS”表示需要去HIS中导数据的ETL；值为“CLOUD”表示只在云服务器上执行的ETL
     */
    public void setEtlType(String etlType) {
        this.etlType = etlType;
    }

    /**
     * @return SHOW_ORDER
     */
    public Integer getShowOrder() {
        return showOrder;
    }

    /**
     * @param showOrder
     */
    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    /**
     * @return LIMIT_HOS_CONFIG_CODE
     */
    public String getLimitHosConfigCode() {
        return limitHosConfigCode;
    }

    /**
     * @param limitHosConfigCode
     */
    public void setLimitHosConfigCode(String limitHosConfigCode) {
        this.limitHosConfigCode = limitHosConfigCode;
    }

    /**
     * @return LIMIT_HOS_CONFIG_VALUE
     */
    public String getLimitHosConfigValue() {
        return limitHosConfigValue;
    }

    /**
     * @param limitHosConfigValue
     */
    public void setLimitHosConfigValue(String limitHosConfigValue) {
        this.limitHosConfigValue = limitHosConfigValue;
    }

    /**
     * @return IS_UPDATE_LOCAL_STATUS
     */
    public Boolean getIsUpdateLocalStatus() {
        return isUpdateLocalStatus;
    }

    /**
     * @param isUpdateLocalStatus
     */
    public void setIsUpdateLocalStatus(Boolean isUpdateLocalStatus) {
        this.isUpdateLocalStatus = isUpdateLocalStatus;
    }

    /**
     * 获取0-不可用；1-可用；
     *
     * @return IS_ENABLE - 0-不可用；1-可用；
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * 设置0-不可用；1-可用；
     *
     * @param isEnable 0-不可用；1-可用；
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }
}