package com.product.wavebird.CommonAPI.client;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class FeignErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        System.out.println(methodKey);
        switch(response.status()){
            case 400:{
                //if(methodKey.contains("getAccount")){
                return new ResponseStatusException(HttpStatus.valueOf(response.status()), "Bad Request");

            }


            case 404:{

                return new ResponseStatusException(HttpStatus.valueOf(response.status()), "Not Found");


            }


            case 500:{
                return new ResponseStatusException(HttpStatus.valueOf(response.status()), "Internal Server Error");

            }

            case 504:{
                return new ResponseStatusException(HttpStatus.valueOf(response.status()), "Service is Down");

            }


            default:
                return new Exception(response.reason());
        }
    }
}
