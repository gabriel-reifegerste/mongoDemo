package com.reifegerste.mongo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class Person extends GenericEntity {
    private String firstName;
    private String lastName;
    private String phone;
    private LocalDate birthdate;
    private Address address;
}
