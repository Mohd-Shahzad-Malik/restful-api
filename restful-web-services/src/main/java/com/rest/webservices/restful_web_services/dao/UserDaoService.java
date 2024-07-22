package com.rest.webservices.restful_web_services.dao;

import com.rest.webservices.restful_web_services.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDaoService extends CrudRepository<User, Long> {
}
