package com.product.wavebird.CommonAPI.utils;

import org.springframework.security.core.context.SecurityContextHolder;


public class PetCommonUtil {

    public static String getLoggedInUserId(){
        return (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}