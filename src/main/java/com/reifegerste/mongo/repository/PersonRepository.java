package com.reifegerste.mongo.repository;

import com.reifegerste.mongo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface PersonRepository extends MongoRepository<Person, String> {
    Person getByFirstName(String firstname);
}
