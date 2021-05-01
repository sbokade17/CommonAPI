package com.product.wavebird.CommonAPI.dto;

import java.util.Set;

public class VendorServiceDto {

    private Set<ServiceDto> services;

    public Set<ServiceDto> getServices() {
        return services;
    }

    public void setServices(Set<ServiceDto> services) {
        this.services = services;
    }
}
