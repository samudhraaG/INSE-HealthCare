package com.inse.com.model;

import java.util.List;

/**
 * Created by ssamudhraa on 4/7/2017.
 */
public class Bundle {
    int bundleNo;
    List<Integer> requestList; // maybe can be a set
    double cost;

    public Bundle(int bundleNo, List<Integer> requestList, double v){
    }

    public Bundle(int bundleNo, List<Integer> requestList, Float cost){
        this.bundleNo = bundleNo;
        this.requestList = requestList;
        this.cost = cost;
    }

    public int getBundleNo() {
        return bundleNo;
    }

    public void setBundleNo(int bundleNo) {
        this.bundleNo = bundleNo;
    }

    public List<Integer> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<Integer> requestList) {
        this.requestList = requestList;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }


}
