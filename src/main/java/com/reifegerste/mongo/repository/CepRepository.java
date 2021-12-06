package com.reifegerste.mongo.repository;

import com.reifegerste.mongo.model.Cep;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CepRepository extends MongoRepository<Cep, String> {
    Cep getById(String id);
}