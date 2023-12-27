package com.demo.address.models;

public class Taxonomy {
    private String code;
    private String taxonomyGroup;
    private String desc;
    private String state;
    private String license;
    private Boolean primary;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getTaxonomyGroup() {
        return taxonomyGroup;
    }
    public void setTaxonomyGroup(String taxonomyGroup) {
        this.taxonomyGroup = taxonomyGroup;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public Boolean getPrimary() {
        return primary;
    }
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }
}