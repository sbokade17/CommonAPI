package com.product.wavebird.CommonAPI.dto;

import java.io.Serializable;

public class UserServicesDto implements Serializable {
    private static final long serialVersionUID = -6924032363203719560L;

    private String spId;
    private String spName;
    private double spRating;
    private long spTripsCount;

    public UserServicesDto(String spId, String spName, double spRating, long spTripsCount) {
        this.spId = spId;
        this.spName = spName;
        this.spRating = spRating;
        this.spTripsCount = spTripsCount;
    }

    public UserServicesDto() {
    }

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public double getSpRating() {
        return spRating;
    }

    public void setSpRating(double spRating) {
        this.spRating = spRating;
    }

    public long getSpTripsCount() {
        return spTripsCount;
    }

    public void setSpTripsCount(long spTripsCount) {
        this.spTripsCount = spTripsCount;
    }
}
