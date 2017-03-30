package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_STATISTICS")
public class CtStatistics {
    @Id
    @Column(name = "STATISTICS_ID")
    private Integer statisticsId;

    @Column(name = "STATISTICS_ITEM_CODE")
    private String statisticsItemCode;

    /**
     * 统计的数据的时间
     */
    @Column(name = "DATA_TIME")
    private Date dataTime;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;

    @Column(name = "DEPT_ID")
    private String deptId;

    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 存储的值为：患者ID/医生ID/客服ID
     */
    @Column(name = "TARGET_ID")
    private String targetId;

    @Column(name = "TARGET_NAME")
    private String targetName;

    /**
     * 统计专病新增患者时，存储具体的专病类型编码，见字典表014 等等
     */
    @Column(name = "BELONG_TYPE_CODE")
    private String belongTypeCode;

    @Column(name = "BELONG_TYPE_NAME")
    private String belongTypeName;

    @Column(name = "STATISTICS_ITEM_VALUE")
    private Double statisticsItemValue;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 0：不可用；1：可用；默认为1。
     */
    @Column(name = "IS_ENABLE")
    private Byte isEnable;

    /**
     * @return STATISTICS_ID
     */
    public Integer getStatisticsId() {
        return statisticsId;
    }

    /**
     * @param statisticsId
     */
    public void setStatisticsId(Integer statisticsId) {
        this.statisticsId = statisticsId;
    }

    /**
     * @return STATISTICS_ITEM_CODE
     */
    public String getStatisticsItemCode() {
        return statisticsItemCode;
    }

    /**
     * @param statisticsItemCode
     */
    public void setStatisticsItemCode(String statisticsItemCode) {
        this.statisticsItemCode = statisticsItemCode;
    }

    /**
     * 获取统计的数据的时间
     *
     * @return DATA_TIME - 统计的数据的时间
     */
    public Date getDataTime() {
        return dataTime;
    }

    /**
     * 设置统计的数据的时间
     *
     * @param dataTime 统计的数据的时间
     */
    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    /**
     * @return HOSPITAL_ID
     */
    public Integer getHospitalId() {
        return hospitalId;
    }

    /**
     * @param hospitalId
     */
    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    /**
     * @return HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * @param hospitalName
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * @return DEPT_ID
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * @param deptId
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    /**
     * @return DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * 获取存储的值为：患者ID/医生ID/客服ID
     *
     * @return TARGET_ID - 存储的值为：患者ID/医生ID/客服ID
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * 设置存储的值为：患者ID/医生ID/客服ID
     *
     * @param targetId 存储的值为：患者ID/医生ID/客服ID
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * @return TARGET_NAME
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * @param targetName
     */
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * 获取统计专病新增患者时，存储具体的专病类型编码，见字典表014 等等
     *
     * @return BELONG_TYPE_CODE - 统计专病新增患者时，存储具体的专病类型编码，见字典表014 等等
     */
    public String getBelongTypeCode() {
        return belongTypeCode;
    }

    /**
     * 设置统计专病新增患者时，存储具体的专病类型编码，见字典表014 等等
     *
     * @param belongTypeCode 统计专病新增患者时，存储具体的专病类型编码，见字典表014 等等
     */
    public void setBelongTypeCode(String belongTypeCode) {
        this.belongTypeCode = belongTypeCode;
    }

    /**
     * @return BELONG_TYPE_NAME
     */
    public String getBelongTypeName() {
        return belongTypeName;
    }

    /**
     * @param belongTypeName
     */
    public void setBelongTypeName(String belongTypeName) {
        this.belongTypeName = belongTypeName;
    }

    /**
     * @return STATISTICS_ITEM_VALUE
     */
    public Double getStatisticsItemValue() {
        return statisticsItemValue;
    }

    /**
     * @param statisticsItemValue
     */
    public void setStatisticsItemValue(Double statisticsItemValue) {
        this.statisticsItemValue = statisticsItemValue;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取0：不可用；1：可用；默认为1。
     *
     * @return IS_ENABLE - 0：不可用；1：可用；默认为1。
     */
    public Byte getIsEnable() {
        return isEnable;
    }

    /**
     * 设置0：不可用；1：可用；默认为1。
     *
     * @param isEnable 0：不可用；1：可用；默认为1。
     */
    public void setIsEnable(Byte isEnable) {
        this.isEnable = isEnable;
    }
}