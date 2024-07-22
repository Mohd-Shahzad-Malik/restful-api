package com.rest.webservices.restful_web_services.impl;

import com.rest.webservices.restful_web_services.dao.UserDaoService;
import com.rest.webservices.restful_web_services.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Component
@Slf4j
@NoArgsConstructor
public class UserDaoServiceImpl {

    public static List<User> user = new LinkedList<>();
    static{

        user.add(new User(1, "Shahzad", LocalDate.now().minusYears(29)));
        user.add(new User(2, "Zeba", LocalDate.now().minusYears(31)));
        user.add(new User(3, "Shahbaz", LocalDate.now().minusYears(33)));
    }


}
