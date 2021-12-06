package com.reifegerste.mongo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class Address extends GenericEntity {
    private String street;
    private int number;
    @DBRef
    private City city;
    @DBRef
    private Cep cep;
}
