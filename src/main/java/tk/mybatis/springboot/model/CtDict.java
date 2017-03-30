package tk.mybatis.springboot.model;

import javax.persistence.*;

@Table(name = "CT_DICT")
public class CtDict {
    @Id
    @Column(name = "DICT_VALUE_CODE")
    private String dictValueCode;

    @Column(name = "DICT_TYPE_CODE")
    private String dictTypeCode;

    @Column(name = "DICT_VALUE_NAME")
    private String dictValueName;

    @Column(name = "DICT_VALUE_SEQ")
    private Boolean dictValueSeq;

    @Column(name = "IS_ENABLE")
    private Boolean isEnable;

    /**
     * @return DICT_VALUE_CODE
     */
    public String getDictValueCode() {
        return dictValueCode;
    }

    /**
     * @param dictValueCode
     */
    public void setDictValueCode(String dictValueCode) {
        this.dictValueCode = dictValueCode;
    }

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
     * @return DICT_VALUE_NAME
     */
    public String getDictValueName() {
        return dictValueName;
    }

    /**
     * @param dictValueName
     */
    public void setDictValueName(String dictValueName) {
        this.dictValueName = dictValueName;
    }

    /**
     * @return DICT_VALUE_SEQ
     */
    public Boolean getDictValueSeq() {
        return dictValueSeq;
    }

    /**
     * @param dictValueSeq
     */
    public void setDictValueSeq(Boolean dictValueSeq) {
        this.dictValueSeq = dictValueSeq;
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