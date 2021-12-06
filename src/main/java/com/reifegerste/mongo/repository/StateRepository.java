package com.reifegerste.mongo.repository;

import com.reifegerste.mongo.model.State;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends MongoRepository<State, String> {
    State getById(String id);
}
