package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_HOSPITAL_DISEASE_DEPT_REL")
public class CtHospitalDiseaseDeptRel {
    @Id
    @Column(name = "HOSPITAL_DISEASE_DEPT_REL")
    private Integer hospitalDiseaseDeptRel;

    @Column(name = "DEPT_ID")
    private Integer deptId;

    @Column(name = "HOSPITAL_DISEASE_KEY_ID")
    private Integer hospitalDiseaseKeyId;

    /**
     * @return HOSPITAL_DISEASE_DEPT_REL
     */
    public Integer getHospitalDiseaseDeptRel() {
        return hospitalDiseaseDeptRel;
    }

    /**
     * @param hospitalDiseaseDeptRel
     */
    public void setHospitalDiseaseDeptRel(Integer hospitalDiseaseDeptRel) {
        this.hospitalDiseaseDeptRel = hospitalDiseaseDeptRel;
    }

    /**
     * @return DEPT_ID
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * @param deptId
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * @return HOSPITAL_DISEASE_KEY_ID
     */
    public Integer getHospitalDiseaseKeyId() {
        return hospitalDiseaseKeyId;
    }

    /**
     * @param hospitalDiseaseKeyId
     */
    public void setHospitalDiseaseKeyId(Integer hospitalDiseaseKeyId) {
        this.hospitalDiseaseKeyId = hospitalDiseaseKeyId;
    }
}