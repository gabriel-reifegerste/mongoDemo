package com.reifegerste.mongo.controller;

import com.reifegerste.mongo.model.Cep;
import com.reifegerste.mongo.service.CepService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cep")
public class CepController {

    private final CepService cepService;

    @GetMapping
    public List<Cep> getPeople() {
        return cepService.getCeps();
    }

    @PostMapping
    public Cep save(@RequestBody Cep cep) {
        return cepService.save(cep);
    }

    @PutMapping
    public Cep update(@RequestBody Cep cep) {
        return cepService.update(cep);
    }

    @GetMapping("/{id}")
    public Cep getById(String id) {
        return cepService.getById(id);
    }
}
