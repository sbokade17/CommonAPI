package com.product.wavebird.CommonAPI.dto;

import java.io.Serializable;

public class OtpDto implements Serializable {

    private static final long serialVersionUID = 8244564815769724412L;
    private String email;
    private String mobile;
    private String otp;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}
