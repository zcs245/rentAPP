package com.zcs.entity;

public class Orders {
    private Integer oId;

    private Integer cId;

    private String uPhone;

    private Integer oNumber;

    private Integer oPrice;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public Integer getoNumber() {
        return oNumber;
    }

    public void setoNumber(Integer oNumber) {
        this.oNumber = oNumber;
    }

    public Integer getoPrice() {
        return oPrice;
    }

    public void setoPrice(Integer oPrice) {
        this.oPrice = oPrice;
    }
}