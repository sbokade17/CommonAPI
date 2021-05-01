package com.product.wavebird.CommonAPI.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ServiceDto implements Serializable {
    private static final long serialVersionUID = 14426912262813845L;

    private Long serviceId;
    private String serviceName;
    private String serviceDescription;
    private BigDecimal cost;

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }
}
