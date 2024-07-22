package com.rest.webservices.restful_web_services.controller;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.i18n.LocaleContextResolver;

import java.util.Locale;

@RestController
public class HomeController {

    @Autowired
    private MessageSource messageSource;


    @GetMapping(path = "/v1/message")
    public String helloWorld(){
        Locale locale = LocaleContextHolder.getLocale();
//        return messageSource.getMessage("good.morning.message", null, "good Morning.....", locale);
        return "Hello world from V1";
    }

    @GetMapping(path = "/v2/message")
    public String helloWorldV2(){
        return "Hello world from v2";
    }

    @GetMapping(path = "/message", params = "version=1")
    public String helloWorldParam1(){
        return "Hello world from params V1";
    }

    @GetMapping(path = "/message", params = "version=2")
    public String helloWorldV2Param2(){
        return "Hello world from params v2";
    }

    @GetMapping(path = "/message", headers = "X-API-VERSION=1")
    public String helloWorldHeader1(){
        return "Hello world from Header V1";
    }

    @GetMapping(path = "/message", headers = "X-API-VERSION=2")
    public String helloWorldV2Header2(){
        return "Hello world from Header v2";
    }

    @GetMapping(path = "/message", produces = "application/vnd.company.app-v1+json")
    public String helloWorldAccept1(){
        return "Hello world from Accept V1";
    }

    @GetMapping(path = "/message", produces = "application/vnd.company.app-v2+json")
    public String helloWorldV2Accept2(){
        return "Hello world from Accept v2";
    }






}
