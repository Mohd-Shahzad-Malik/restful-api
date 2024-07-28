package com.rest.webservices.restful_web_services.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
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

    public User(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Post> post;

}
