package com.reifegerste.mongo.repository;

import com.reifegerste.mongo.model.City;
import com.reifegerste.mongo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CityRepository extends MongoRepository<City, String> {
    City getById(String id);
}
