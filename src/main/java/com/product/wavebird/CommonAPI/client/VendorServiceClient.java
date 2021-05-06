package com.product.wavebird.CommonAPI.client;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="vendor-service-ms", fallbackFactory = VendorServiceFallbackFactory.class)
public interface VendorServiceClient {
}

class VendorServiceFallbackFactory implements FallbackFactory<VendorServiceClient> {

    @Override
    public VendorServiceClient create(Throwable throwable) {
        return new VendorServiceClientFallback(throwable);
    }
}

class VendorServiceClientFallback implements  VendorServiceClient{

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private final Throwable cause;

    public VendorServiceClientFallback(Throwable throwable) {
        cause=throwable;
    }
}