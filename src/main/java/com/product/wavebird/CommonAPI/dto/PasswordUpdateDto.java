package com.product.wavebird.CommonAPI.dto;

import java.io.Serializable;

public class PasswordUpdateDto implements Serializable {

    private static final long serialVersionUID = -8537678407774893677L;

    private String userId;
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
