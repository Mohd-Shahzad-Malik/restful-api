package com.rest.webservices.restful_web_services.dao;

import com.rest.webservices.restful_web_services.model.Post;
import com.rest.webservices.restful_web_services.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDaoService extends JpaRepository<Post, Integer> {
}
