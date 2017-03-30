package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_EXCEL_LAB_DETAIL_INFO")
public class CtExcelLabDetailInfo {
    @Id
    @Column(name = "LAB_DETAIL_KEY_ID")
    private Integer labDetailKeyId;

    @Column(name = "LAB_KEY_ID")
    private Integer labKeyId;

    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "PATIENT_SOURCE")
    private String patientSource;

    @Column(name = "LAB_NO")
    private String labNo;

    @Column(name = "ITEM_CODE")
    private String itemCode;

    @Column(name = "ITEM_NAME")
    private String itemName;

    @Column(name = "RESULT")
    private String result;

    @Column(name = "UNITS")
    private String units;

    @Column(name = "REFERENCE_RANGE")
    private String referenceRange;

    /**
     * 0：未归档；1：已归档；
     */
    @Column(name = "IS_FILED")
    private Integer isFiled;

    @Column(name = "CREATOR_ID")
    private Integer creatorId;

    /**
     * 本行数据创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "EDITOR_ID")
    private Integer editorId;

    /**
     * 本行数据最后更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 标记该条记录是否可用，0：不可用；1：可用；
     */
    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    @Column(name = "CLIN_DIAG")
    private String clinDiag;

    /**
     * @return LAB_DETAIL_KEY_ID
     */
    public Integer getLabDetailKeyId() {
        return labDetailKeyId;
    }

    /**
     * @param labDetailKeyId
     */
    public void setLabDetailKeyId(Integer labDetailKeyId) {
        this.labDetailKeyId = labDetailKeyId;
    }

    /**
     * @return LAB_KEY_ID
     */
    public Integer getLabKeyId() {
        return labKeyId;
    }

    /**
     * @param labKeyId
     */
    public void setLabKeyId(Integer labKeyId) {
        this.labKeyId = labKeyId;
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
     * @return PATIENT_SOURCE
     */
    public String getPatientSource() {
        return patientSource;
    }

    /**
     * @param patientSource
     */
    public void setPatientSource(String patientSource) {
        this.patientSource = patientSource;
    }

    /**
     * @return LAB_NO
     */
    public String getLabNo() {
        return labNo;
    }

    /**
     * @param labNo
     */
    public void setLabNo(String labNo) {
        this.labNo = labNo;
    }

    /**
     * @return ITEM_CODE
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return ITEM_NAME
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return RESULT
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return UNITS
     */
    public String getUnits() {
        return units;
    }

    /**
     * @param units
     */
    public void setUnits(String units) {
        this.units = units;
    }

    /**
     * @return REFERENCE_RANGE
     */
    public String getReferenceRange() {
        return referenceRange;
    }

    /**
     * @param referenceRange
     */
    public void setReferenceRange(String referenceRange) {
        this.referenceRange = referenceRange;
    }

    /**
     * 获取0：未归档；1：已归档；
     *
     * @return IS_FILED - 0：未归档；1：已归档；
     */
    public Integer getIsFiled() {
        return isFiled;
    }

    /**
     * 设置0：未归档；1：已归档；
     *
     * @param isFiled 0：未归档；1：已归档；
     */
    public void setIsFiled(Integer isFiled) {
        this.isFiled = isFiled;
    }

    /**
     * @return CREATOR_ID
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * @param creatorId
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
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
     * @return EDITOR_ID
     */
    public Integer getEditorId() {
        return editorId;
    }

    /**
     * @param editorId
     */
    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
    }

    /**
     * 获取本行数据最后更新时间
     *
     * @return UPDATE_TIME - 本行数据最后更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置本行数据最后更新时间
     *
     * @param updateTime 本行数据最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
     * @return CLIN_DIAG
     */
    public String getClinDiag() {
        return clinDiag;
    }

    /**
     * @param clinDiag
     */
    public void setClinDiag(String clinDiag) {
        this.clinDiag = clinDiag;
    }
}