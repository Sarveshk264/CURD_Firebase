package com.example.curdfirebase;

public class DataClass {
    private String dataTitle;
    private String dataDesc;
    private String DataLang;
    private String DataImage;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private String key;

    public DataClass(String dataTitle, String dataDesc, String dataLang, String dataImage) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.DataLang = dataLang;
        this.DataImage = dataImage;

    }

    public String getDataTitle() {
        return dataTitle;
    }

    public void setDataTitle(String dataTitle) {

        this.dataTitle = dataTitle;
    }

    public String getDataDesc() {

        return dataDesc;
    }

    public void setDataDesc(String dataDesc) {

        this.dataDesc = dataDesc;
    }

    public String getDataLang() {

        return DataLang;
    }

    public void setDataLang(String dataLang) {

        DataLang = dataLang;
    }

    public String getDataImage() {

        return DataImage;
    }

    public void setDataImage(String dataImage) {

        DataImage = dataImage;
    }

    public DataClass(){

    }

}
