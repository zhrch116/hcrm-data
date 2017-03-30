package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ETL_JOB_LOG")
public class CtEtlJobLog {
    /**
     * 日志ID
     */
    @Id
    @Column(name = "LOG_ID")
    private Integer logId;

    /**
     * 医院代码
     */
    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "JOB_CODE")
    private String jobCode;

    /**
     * 作业名称
     */
    @Column(name = "JOB_NAME")
    private String jobName;

    /**
     * ONCE：手动执行，只执行一次；DAILY：定时执行
     */
    @Column(name = "EXECUTE_TYPE")
    private String executeType;

    /**
     * 开始时间
     */
    @Column(name = "START_TIME")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "END_TIME")
    private Date endTime;

    @Column(name = "LOG_STATUS")
    private String logStatus;

    /**
     * 运行结果"SUCCESS""FAILED"
     */
    @Column(name = "RESULT")
    private String result;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 错误信息
     */
    @Column(name = "ERROR_INFO")
    private String errorInfo;

    /**
     * 获取日志ID
     *
     * @return LOG_ID - 日志ID
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * 设置日志ID
     *
     * @param logId 日志ID
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * 获取医院代码
     *
     * @return HOSPITAL_ID - 医院代码
     */
    public Integer getHospitalId() {
        return hospitalId;
    }

    /**
     * 设置医院代码
     *
     * @param hospitalId 医院代码
     */
    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

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
     * 获取作业名称
     *
     * @return JOB_NAME - 作业名称
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 设置作业名称
     *
     * @param jobName 作业名称
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * 获取ONCE：手动执行，只执行一次；DAILY：定时执行
     *
     * @return EXECUTE_TYPE - ONCE：手动执行，只执行一次；DAILY：定时执行
     */
    public String getExecuteType() {
        return executeType;
    }

    /**
     * 设置ONCE：手动执行，只执行一次；DAILY：定时执行
     *
     * @param executeType ONCE：手动执行，只执行一次；DAILY：定时执行
     */
    public void setExecuteType(String executeType) {
        this.executeType = executeType;
    }

    /**
     * 获取开始时间
     *
     * @return START_TIME - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return END_TIME - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return LOG_STATUS
     */
    public String getLogStatus() {
        return logStatus;
    }

    /**
     * @param logStatus
     */
    public void setLogStatus(String logStatus) {
        this.logStatus = logStatus;
    }

    /**
     * 获取运行结果"SUCCESS""FAILED"
     *
     * @return RESULT - 运行结果"SUCCESS""FAILED"
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置运行结果"SUCCESS""FAILED"
     *
     * @param result 运行结果"SUCCESS""FAILED"
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取错误信息
     *
     * @return ERROR_INFO - 错误信息
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    /**
     * 设置错误信息
     *
     * @param errorInfo 错误信息
     */
    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }
}