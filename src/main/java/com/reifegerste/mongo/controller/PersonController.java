package com.reifegerste.mongo.controller;

import com.reifegerste.mongo.model.Person;
import com.reifegerste.mongo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @GetMapping
    public List<Person> getPeople() {
        return personService.getPeople();
    }

    @PostMapping
    public Person save(@RequestBody Person person) {
        return personService.save(person);
    }

    @PutMapping
    public Person update(@RequestBody Person person) {
        return personService.update(person);
    }

    @GetMapping("/{id}")
    public Person getById(String id) {
        return personService.getById(id);
    }
}
