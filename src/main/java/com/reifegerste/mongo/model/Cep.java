package com.reifegerste.mongo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Cep extends GenericEntity {
    @Indexed(unique = true)
    private Long number;
    private boolean enabled = true;
}
