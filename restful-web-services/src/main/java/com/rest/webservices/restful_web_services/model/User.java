package com.rest.webservices.restful_web_services.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user_details")
@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonFilter("someFilter")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private LocalDate birthDate;

}
