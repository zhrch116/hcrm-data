package tk.mybatis.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CT_HOSPITAL")
public class CtHospital {
    @Id
    @Column(name = "HOSPITAL_ID")
    private Integer hospitalId;

    @Column(name = "JZYH_HOSPITAL_ID")
    private String jzyhHospitalId;

    @Column(name = "QUYI_HOSPITAL_CODE")
    private String quyiHospitalCode;

    @Column(name = "HOSPITAL_CODE")
    private String hospitalCode;

    @Column(name = "MEDICAL_CLOUD_HOSPITAL_ID")
    private String medicalCloudHospitalId;

    @Column(name = "ADMINISTRATIVE_AREA_ID")
    private String administrativeAreaId;

    @Column(name = "PARENT_HOSPITAL_CODE")
    private String parentHospitalCode;

    @Column(name = "PROVINCE_CODE")
    private String provinceCode;

    @Column(name = "PROVINCE_NAME")
    private String provinceName;

    @Column(name = "CITY_CODE")
    private String cityCode;

    @Column(name = "CITY_NAME")
    private String cityName;

    @Column(name = "COUNTY_CODE")
    private String countyCode;

    @Column(name = "COUNTY_NAME")
    private String countyName;

    @Column(name = "HOSPITAL_NAME")
    private String hospitalName;

    /**
     * 见字典表
     */
    @Column(name = "HOSPITAL_LEVEL_CODE")
    private String hospitalLevelCode;

    /**
     * 见字典表
     */
    @Column(name = "HOSPITAL_LEVEL_NAME")
    private String hospitalLevelName;

    @Column(name = "HOSPITAL_ADDRESS")
    private String hospitalAddress;

    @Column(name = "POSTCODE")
    private String postcode;

    @Column(name = "HOSPITAL_ICD_VERSION")
    private String hospitalIcdVersion;

    @Column(name = "HOSPITAL_CONTACTS")
    private String hospitalContacts;

    @Column(name = "HOSPITAL_CONTACTS_PHONE")
    private String hospitalContactsPhone;

    @Column(name = "LONGITUDE")
    private Double longitude;

    @Column(name = "LATITUDE")
    private Double latitude;

    /**
     * http://140.206.48.238:8082/hcrmlocal/
     */
    @Column(name = "HCRM_LOCAL_URL")
    private String hcrmLocalUrl;

    @Column(name = "SERVICES_DEADLINE")
    private Date servicesDeadline;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

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
     * @return JZYH_HOSPITAL_ID
     */
    public String getJzyhHospitalId() {
        return jzyhHospitalId;
    }

    /**
     * @param jzyhHospitalId
     */
    public void setJzyhHospitalId(String jzyhHospitalId) {
        this.jzyhHospitalId = jzyhHospitalId;
    }

    /**
     * @return QUYI_HOSPITAL_CODE
     */
    public String getQuyiHospitalCode() {
        return quyiHospitalCode;
    }

    /**
     * @param quyiHospitalCode
     */
    public void setQuyiHospitalCode(String quyiHospitalCode) {
        this.quyiHospitalCode = quyiHospitalCode;
    }

    /**
     * @return HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * @param hospitalCode
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * @return MEDICAL_CLOUD_HOSPITAL_ID
     */
    public String getMedicalCloudHospitalId() {
        return medicalCloudHospitalId;
    }

    /**
     * @param medicalCloudHospitalId
     */
    public void setMedicalCloudHospitalId(String medicalCloudHospitalId) {
        this.medicalCloudHospitalId = medicalCloudHospitalId;
    }

    /**
     * @return ADMINISTRATIVE_AREA_ID
     */
    public String getAdministrativeAreaId() {
        return administrativeAreaId;
    }

    /**
     * @param administrativeAreaId
     */
    public void setAdministrativeAreaId(String administrativeAreaId) {
        this.administrativeAreaId = administrativeAreaId;
    }

    /**
     * @return PARENT_HOSPITAL_CODE
     */
    public String getParentHospitalCode() {
        return parentHospitalCode;
    }

    /**
     * @param parentHospitalCode
     */
    public void setParentHospitalCode(String parentHospitalCode) {
        this.parentHospitalCode = parentHospitalCode;
    }

    /**
     * @return PROVINCE_CODE
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * @param provinceCode
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * @return PROVINCE_NAME
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * @param provinceName
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * @return CITY_CODE
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * @param cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * @return CITY_NAME
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return COUNTY_CODE
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * @param countyCode
     */
    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    /**
     * @return COUNTY_NAME
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * @param countyName
     */
    public void setCountyName(String countyName) {
        this.countyName = countyName;
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
     * 获取见字典表
     *
     * @return HOSPITAL_LEVEL_CODE - 见字典表
     */
    public String getHospitalLevelCode() {
        return hospitalLevelCode;
    }

    /**
     * 设置见字典表
     *
     * @param hospitalLevelCode 见字典表
     */
    public void setHospitalLevelCode(String hospitalLevelCode) {
        this.hospitalLevelCode = hospitalLevelCode;
    }

    /**
     * 获取见字典表
     *
     * @return HOSPITAL_LEVEL_NAME - 见字典表
     */
    public String getHospitalLevelName() {
        return hospitalLevelName;
    }

    /**
     * 设置见字典表
     *
     * @param hospitalLevelName 见字典表
     */
    public void setHospitalLevelName(String hospitalLevelName) {
        this.hospitalLevelName = hospitalLevelName;
    }

    /**
     * @return HOSPITAL_ADDRESS
     */
    public String getHospitalAddress() {
        return hospitalAddress;
    }

    /**
     * @param hospitalAddress
     */
    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    /**
     * @return POSTCODE
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * @return HOSPITAL_ICD_VERSION
     */
    public String getHospitalIcdVersion() {
        return hospitalIcdVersion;
    }

    /**
     * @param hospitalIcdVersion
     */
    public void setHospitalIcdVersion(String hospitalIcdVersion) {
        this.hospitalIcdVersion = hospitalIcdVersion;
    }

    /**
     * @return HOSPITAL_CONTACTS
     */
    public String getHospitalContacts() {
        return hospitalContacts;
    }

    /**
     * @param hospitalContacts
     */
    public void setHospitalContacts(String hospitalContacts) {
        this.hospitalContacts = hospitalContacts;
    }

    /**
     * @return HOSPITAL_CONTACTS_PHONE
     */
    public String getHospitalContactsPhone() {
        return hospitalContactsPhone;
    }

    /**
     * @param hospitalContactsPhone
     */
    public void setHospitalContactsPhone(String hospitalContactsPhone) {
        this.hospitalContactsPhone = hospitalContactsPhone;
    }

    /**
     * @return LONGITUDE
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return LATITUDE
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取http://140.206.48.238:8082/hcrmlocal/
     *
     * @return HCRM_LOCAL_URL - http://140.206.48.238:8082/hcrmlocal/
     */
    public String getHcrmLocalUrl() {
        return hcrmLocalUrl;
    }

    /**
     * 设置http://140.206.48.238:8082/hcrmlocal/
     *
     * @param hcrmLocalUrl http://140.206.48.238:8082/hcrmlocal/
     */
    public void setHcrmLocalUrl(String hcrmLocalUrl) {
        this.hcrmLocalUrl = hcrmLocalUrl;
    }

    /**
     * @return SERVICES_DEADLINE
     */
    public Date getServicesDeadline() {
        return servicesDeadline;
    }

    /**
     * @param servicesDeadline
     */
    public void setServicesDeadline(Date servicesDeadline) {
        this.servicesDeadline = servicesDeadline;
    }

    /**
     * @return IS_ENABLE
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * @param isEnable
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }
}