package com.reifegerste.mongo.service;

import com.reifegerste.mongo.model.Person;
import com.reifegerste.mongo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> getPeople() {
        return this.personRepository.findAll();
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Person update(Person person) {
        return personRepository.insert(person);
    }

    public Person getById(String id) {
        return personRepository.getByFirstName(id);
    }
}
