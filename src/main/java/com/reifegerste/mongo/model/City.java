package com.reifegerste.mongo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class City extends GenericEntity {
    private String name;
    private int ddd;
    @DBRef
    private State state;
}
