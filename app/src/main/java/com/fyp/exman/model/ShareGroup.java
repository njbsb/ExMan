package com.fyp.exman.model;

import java.util.ArrayList;

public class ShareGroup {
    private String sharegroupID;
    private String code;
    private ArrayList<User> tenantsList;

    public ShareGroup(String code, ArrayList<User> tenantsList) {
        this.code = code;
        this.tenantsList = tenantsList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSharegroupID() {
        return sharegroupID;
    }

    public void setSharegroupID(String sharegroupID) {
        this.sharegroupID = sharegroupID;
    }

    public ArrayList<User> getTenantsList() {
        return tenantsList;
    }

    public void setTenantsList(ArrayList<User> tenantsList) {
        this.tenantsList = tenantsList;
    }

    public int getGroupSize() {
        return tenantsList.size();
    }
}
