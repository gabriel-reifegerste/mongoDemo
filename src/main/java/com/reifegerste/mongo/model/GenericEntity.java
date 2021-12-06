package com.reifegerste.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class GenericEntity {
    @Id
    private String id;
}