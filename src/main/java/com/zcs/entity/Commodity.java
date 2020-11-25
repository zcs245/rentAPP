package com.zcs.entity;

import java.util.ArrayList;
import java.util.List;

public class Commodity {
    private Integer cId;

    private String cName;

    private String cImg;

    private String cClassification;

    private Integer cPrice;

    private Integer cStock;

    private List<String> cImgList;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcImg() {
        return cImg;
    }

    public void setcImg(String cImg) {
        this.cImg = cImg == null ? null : cImg.trim();
    }

    public String getcClassification() {
        return cClassification;
    }

    public void setcClassification(String cClassification) {
        this.cClassification = cClassification == null ? null : cClassification.trim();
    }

    public Integer getcPrice() {
        return cPrice;
    }

    public void setcPrice(Integer cPrice) {
        this.cPrice = cPrice;
    }

    public Integer getcStock() {
        return cStock;
    }

    public void setcStock(Integer cStock) {
        this.cStock = cStock;
    }

    public List<String> getcImgList() {
        List<String> strings = new ArrayList<>();
        String[] split = cImg.split(",");
        for (int i=0;i<split.length;i++){
            strings.add(split[i]);
        }

        return strings;
    }

}