package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_DICT_TYPE")
public class CtDictType {
    @Id
    @Column(name = "DICT_TYPE_CODE")
    private String dictTypeCode;

    @Column(name = "DICT_TYPE_NAME")
    private String dictTypeName;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return DICT_TYPE_CODE
     */
    public String getDictTypeCode() {
        return dictTypeCode;
    }

    /**
     * @param dictTypeCode
     */
    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode;
    }

    /**
     * @return DICT_TYPE_NAME
     */
    public String getDictTypeName() {
        return dictTypeName;
    }

    /**
     * @param dictTypeName
     */
    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName;
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