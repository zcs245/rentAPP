package com.zcs.entity;

import java.util.ArrayList;
import java.util.List;

public class House {

    private Integer hId;

    private String hIntroduction;

    private String hImg;

    private String hType;

    private String hAddress;

    private String hLayout;

    private String hMeasure;

    private String hFloor;

    private String hOrientation;

    private String hElevator;

    private String hMetro;

    private String hBalcony;

    private String hRenovation;

    private Integer hRent;

    private List<String>hImgList;

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String gethIntroduction() {
        return hIntroduction;
    }

    public void sethIntroduction(String hIntroduction) {
        this.hIntroduction = hIntroduction == null ? null : hIntroduction.trim();
    }

    public String gethImg() {
        return hImg;
    }

    public void sethImg(String hImg) {
        this.hImg = hImg == null ? null : hImg.trim();
    }

    public String gethType() {
        return hType;
    }

    public void sethType(String hType) {
        this.hType = hType == null ? null : hType.trim();
    }

    public String gethAddress() {
        return hAddress;
    }

    public void sethAddress(String hAddress) {
        this.hAddress = hAddress == null ? null : hAddress.trim();
    }

    public String gethLayout() {
        return hLayout;
    }

    public void sethLayout(String hLayout) {
        this.hLayout = hLayout == null ? null : hLayout.trim();
    }

    public String gethMeasure() {
        return hMeasure;
    }

    public void sethMeasure(String hMeasure) {
        this.hMeasure = hMeasure == null ? null : hMeasure.trim();
    }

    public String gethFloor() {
        return hFloor;
    }

    public void sethFloor(String hFloor) {
        this.hFloor = hFloor == null ? null : hFloor.trim();
    }

    public String gethOrientation() {
        return hOrientation;
    }

    public void sethOrientation(String hOrientation) {
        this.hOrientation = hOrientation == null ? null : hOrientation.trim();
    }

    public String gethElevator() {
        return hElevator;
    }

    public void sethElevator(String hElevator) {
        this.hElevator = hElevator == null ? null : hElevator.trim();
    }

    public String gethMetro() {
        return hMetro;
    }

    public void sethMetro(String hMetro) {
        this.hMetro = hMetro == null ? null : hMetro.trim();
    }

    public String gethBalcony() {
        return hBalcony;
    }

    public void sethBalcony(String hBalcony) {
        this.hBalcony = hBalcony == null ? null : hBalcony.trim();
    }

    public String gethRenovation() {
        return hRenovation;
    }

    public void sethRenovation(String hRenovation) {
        this.hRenovation = hRenovation == null ? null : hRenovation.trim();
    }

    public Integer gethRent() {
        return hRent;
    }

    public void sethRent(Integer hRent) {
        this.hRent = hRent;
    }

    public List<String> gethImgList() {
        List<String> strings = new ArrayList<>();
        String[] split = hImg.split(",");
        for (int i=0;i<split.length;i++){
            strings.add(split[i]);
        }
        return strings;
    }
}