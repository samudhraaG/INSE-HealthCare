package com.inse.com.model;

import java.util.List;

public class Nurse {
    String nurseId;
    List<Integer> bundlesToVist;
    Float cost;
    String type;

    public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = nurseId;
    }

    public List<Integer> getBundlesToVist() {
        return bundlesToVist;
    }

    public void setBundlesToVist(List<Integer> bundlesToVist) {
        this.bundlesToVist = bundlesToVist;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




}
