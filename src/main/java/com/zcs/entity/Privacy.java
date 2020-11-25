package com.zcs.entity;

public class Privacy {
    private Integer pId;

    private String uPhone;

    private String pName;

    private String pSex;

    private String pAddress;

    private Integer pAge;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpSex() {
        return pSex;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex == null ? null : pSex.trim();
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress == null ? null : pAddress.trim();
    }

    public Integer getpAge() {
        return pAge;
    }

    public void setpAge(Integer pAge) {
        this.pAge = pAge;
    }
}