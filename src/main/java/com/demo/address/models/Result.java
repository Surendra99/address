package com.demo.address.models;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private String createdEpoch;
    private String enumerationType;
    private String lastUpdatedEpoch;
    private String number;
    private List<Address> addresses = new ArrayList<Address>();
    private List<PracticeLocation> practiceLocations = new ArrayList<PracticeLocation>();
    private Basic basic;
    private List<Taxonomy> taxonomies = new ArrayList<Taxonomy>();
    private List<Object> identifiers = new ArrayList<Object>();
    private List<Object> endpoints = new ArrayList<Object>();
    private List<OtherName> otherNames = new ArrayList<OtherName>();
    public String getCreatedEpoch() {
        return createdEpoch;
    }
    public void setCreatedEpoch(String createdEpoch) {
        this.createdEpoch = createdEpoch;
    }
    public String getEnumerationType() {
        return enumerationType;
    }
    public void setEnumerationType(String enumerationType) {
        this.enumerationType = enumerationType;
    }
    public String getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }
    public void setLastUpdatedEpoch(String lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public List<Address> getAddresses() {
        return addresses;
    }
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    public List<PracticeLocation> getPracticeLocations() {
        return practiceLocations;
    }
    public void setPracticeLocations(List<PracticeLocation> practiceLocations) {
        this.practiceLocations = practiceLocations;
    }
    public Basic getBasic() {
        return basic;
    }
    public void setBasic(Basic basic) {
        this.basic = basic;
    }
    public List<Taxonomy> getTaxonomies() {
        return taxonomies;
    }
    public void setTaxonomies(List<Taxonomy> taxonomies) {
        this.taxonomies = taxonomies;
    }
    public List<Object> getIdentifiers() {
        return identifiers;
    }
    public void setIdentifiers(List<Object> identifiers) {
        this.identifiers = identifiers;
    }
    public List<Object> getEndpoints() {
        return endpoints;
    }
    public void setEndpoints(List<Object> endpoints) {
        this.endpoints = endpoints;
    }
    public List<OtherName> getOtherNames() {
        return otherNames;
    }
    public void setOtherNames(List<OtherName> otherNames) {
        this.otherNames = otherNames;
    }
}