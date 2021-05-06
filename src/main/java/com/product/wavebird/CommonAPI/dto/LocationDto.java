package com.product.wavebird.CommonAPI.dto;

import java.io.Serializable;

public class LocationDto implements Serializable {
    private static final long serialVersionUID = -2820781170034498522L;
    private String latitude;
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
