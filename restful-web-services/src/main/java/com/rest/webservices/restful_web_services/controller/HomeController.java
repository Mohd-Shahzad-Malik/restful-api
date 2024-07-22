package com.rest.webservices.restful_web_services.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.rest.webservices.restful_web_services.model.User;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.i18n.LocaleContextResolver;

import java.time.LocalDate;
import java.util.Locale;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class HomeController {

    @Autowired
    private MessageSource messageSource;


    @GetMapping(path = "/v1/message")
    public MappingJacksonValue helloWorld(){
//        Locale locale = LocaleContextHolder.getLocale();
//        return messageSource.getMessage("good.morning.message", null, "good Morning.....", locale);
        User user  =new User(1, "Shahzad", LocalDate.now());
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(user);

        SimpleBeanPropertyFilter filter =  SimpleBeanPropertyFilter.filterOutAllExcept("id");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("someFilter", filter);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }

    @GetMapping(path = "/v2/message")
    public EntityModel<User> helloWorldV2(){
        User user  =new User(1, "Shahzad", LocalDate.now());
        EntityModel<User> stringEntityModel = EntityModel.of(user);
        WebMvcLinkBuilder webMvcLinkBuilder = linkTo(methodOn(this.getClass()).helloWorldV2());
        stringEntityModel.add(webMvcLinkBuilder.withRel("all-users"));
        return stringEntityModel;
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
