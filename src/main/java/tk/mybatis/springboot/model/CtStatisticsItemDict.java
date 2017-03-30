package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_STATISTICS_ITEM_DICT")
public class CtStatisticsItemDict {
    @Id
    @Column(name = "STATISTICS_ITEM_CODE")
    private String statisticsItemCode;

    @Column(name = "STATISTICS_ITEM_NAME")
    private String statisticsItemName;

    @Column(name = "STATISTICS_ITEM_DESCRIPTION")
    private String statisticsItemDescription;

    @Column(name = "UNIT")
    private String unit;

    /**
     * 0：不是累积指标；1：是累积指标；
     */
    @Column(name = "IS_ACCUMULATE")
    private Integer isAccumulate;

    /**
     * 0：不可用；1：可用；默认为1。
     */
    @Column(name = "IS_ENABLE")
    private Byte isEnable;

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
     * @return STATISTICS_ITEM_NAME
     */
    public String getStatisticsItemName() {
        return statisticsItemName;
    }

    /**
     * @param statisticsItemName
     */
    public void setStatisticsItemName(String statisticsItemName) {
        this.statisticsItemName = statisticsItemName;
    }

    /**
     * @return STATISTICS_ITEM_DESCRIPTION
     */
    public String getStatisticsItemDescription() {
        return statisticsItemDescription;
    }

    /**
     * @param statisticsItemDescription
     */
    public void setStatisticsItemDescription(String statisticsItemDescription) {
        this.statisticsItemDescription = statisticsItemDescription;
    }

    /**
     * @return UNIT
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取0：不是累积指标；1：是累积指标；
     *
     * @return IS_ACCUMULATE - 0：不是累积指标；1：是累积指标；
     */
    public Integer getIsAccumulate() {
        return isAccumulate;
    }

    /**
     * 设置0：不是累积指标；1：是累积指标；
     *
     * @param isAccumulate 0：不是累积指标；1：是累积指标；
     */
    public void setIsAccumulate(Integer isAccumulate) {
        this.isAccumulate = isAccumulate;
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