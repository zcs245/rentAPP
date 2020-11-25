package com.zcs.entity;

import javax.validation.constraints.Pattern;

public class Users {
    @Pattern(regexp = "0?(13|14|15|18|17)[0-9]{9}", message = "请输入正确的手机格式")
    private String uPhone;

    @Pattern(regexp = "^[a-zA-Z0-9_-]{6,16}$",message = "必须是6-16位数字和字母的组合")
    private String uPwd;

    private String uPic;

    private Integer uStatus;

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public String getuPic() {
        return uPic;
    }

    public void setuPic(String uPic) {
        this.uPic = uPic == null ? null : uPic.trim();
    }

    public Integer getuStatus() {
        return uStatus;
    }

    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }
}