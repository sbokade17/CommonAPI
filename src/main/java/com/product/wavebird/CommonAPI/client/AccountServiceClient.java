package com.product.wavebird.CommonAPI.client;


import com.product.wavebird.CommonAPI.models.AccountResponseModel;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "users-account-ms", fallbackFactory = AccountServiceFallbackFactory.class)
public interface AccountServiceClient {

    @GetMapping("/account/{userId}")
    public AccountResponseModel getAccounts(@PathVariable String userId);
}

class AccountServiceClientFallback implements AccountServiceClient {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private final Throwable cause;

    public AccountServiceClientFallback(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public AccountResponseModel getAccounts(String userId) {
        logger.error(cause.getLocalizedMessage());
         return new AccountResponseModel();
    }
}

@Component
class AccountServiceFallbackFactory implements FallbackFactory<AccountServiceClient> {

    @Override
    public AccountServiceClient create(Throwable cause) {
        return new AccountServiceClientFallback(cause);
    }
}
