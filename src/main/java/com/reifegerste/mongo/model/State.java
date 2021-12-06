package com.reifegerste.mongo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class State extends GenericEntity {
    @Indexed(unique = true)
    private String name;
    @Indexed(unique = true)
    private String initials;
}
