package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_ETL_VERSION_RECORD")
public class CtEtlVersionRecord {
    @Id
    @Column(name = "ETL_VERSION_ID")
    private Integer etlVersionId;

    /**
     * 值为“云”/“端”，分别表示这是云的ETL资源库版本信息，还是端的ETL资源库版本信息
     */
    @Column(name = "VERSION_TYPE")
    private String versionType;

    @Column(name = "VERSION_FILE_NAME")
    private String versionFileName;

    @Column(name = "SQL_SCRIPT_DESCRIPTION")
    private String sqlScriptDescription;

    @Column(name = "VERSION")
    private String version;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 0：不可用；1：可用
     */
    @Column(name = "IS_ENABLE")
    private Integer isEnable;

    /**
     * @return ETL_VERSION_ID
     */
    public Integer getEtlVersionId() {
        return etlVersionId;
    }

    /**
     * @param etlVersionId
     */
    public void setEtlVersionId(Integer etlVersionId) {
        this.etlVersionId = etlVersionId;
    }

    /**
     * 获取值为“云”/“端”，分别表示这是云的ETL资源库版本信息，还是端的ETL资源库版本信息
     *
     * @return VERSION_TYPE - 值为“云”/“端”，分别表示这是云的ETL资源库版本信息，还是端的ETL资源库版本信息
     */
    public String getVersionType() {
        return versionType;
    }

    /**
     * 设置值为“云”/“端”，分别表示这是云的ETL资源库版本信息，还是端的ETL资源库版本信息
     *
     * @param versionType 值为“云”/“端”，分别表示这是云的ETL资源库版本信息，还是端的ETL资源库版本信息
     */
    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }

    /**
     * @return VERSION_FILE_NAME
     */
    public String getVersionFileName() {
        return versionFileName;
    }

    /**
     * @param versionFileName
     */
    public void setVersionFileName(String versionFileName) {
        this.versionFileName = versionFileName;
    }

    /**
     * @return SQL_SCRIPT_DESCRIPTION
     */
    public String getSqlScriptDescription() {
        return sqlScriptDescription;
    }

    /**
     * @param sqlScriptDescription
     */
    public void setSqlScriptDescription(String sqlScriptDescription) {
        this.sqlScriptDescription = sqlScriptDescription;
    }

    /**
     * @return VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
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
     * 获取0：不可用；1：可用
     *
     * @return IS_ENABLE - 0：不可用；1：可用
     */
    public Integer getIsEnable() {
        return isEnable;
    }

    /**
     * 设置0：不可用；1：可用
     *
     * @param isEnable 0：不可用；1：可用
     */
    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }
}