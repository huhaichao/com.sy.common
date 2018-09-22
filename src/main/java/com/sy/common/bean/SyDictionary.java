package com.sy.common.bean;

public class SyDictionary {
    private Integer tSyDictionaryId;

    private String tSyDictionaryType;

    private String tSyIdentifyContent;

    private String tSyConvertContent;

    private String tSyBz1;

    private String tSyBz2;

    public Integer gettSyDictionaryId() {
        return tSyDictionaryId;
    }

    public void settSyDictionaryId(Integer tSyDictionaryId) {
        this.tSyDictionaryId = tSyDictionaryId;
    }

    public String gettSyDictionaryType() {
        return tSyDictionaryType;
    }

    public void settSyDictionaryType(String tSyDictionaryType) {
        this.tSyDictionaryType = tSyDictionaryType == null ? null : tSyDictionaryType.trim();
    }

    public String gettSyIdentifyContent() {
        return tSyIdentifyContent;
    }

    public void settSyIdentifyContent(String tSyIdentifyContent) {
        this.tSyIdentifyContent = tSyIdentifyContent == null ? null : tSyIdentifyContent.trim();
    }

    public String gettSyConvertContent() {
        return tSyConvertContent;
    }

    public void settSyConvertContent(String tSyConvertContent) {
        this.tSyConvertContent = tSyConvertContent == null ? null : tSyConvertContent.trim();
    }

    public String gettSyBz1() {
        return tSyBz1;
    }

    public void settSyBz1(String tSyBz1) {
        this.tSyBz1 = tSyBz1 == null ? null : tSyBz1.trim();
    }

    public String gettSyBz2() {
        return tSyBz2;
    }

    public void settSyBz2(String tSyBz2) {
        this.tSyBz2 = tSyBz2 == null ? null : tSyBz2.trim();
    }
}