package com.reifegerste.mongo.service;

import com.reifegerste.mongo.model.Cep;
import com.reifegerste.mongo.repository.CepRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CepService {
    private final CepRepository cepRepository;

    public List<Cep> getCeps() {
        return this.cepRepository.findAll();
    }

    public Cep save(Cep cep) {
        return cepRepository.save(cep);
    }

    public Cep update(Cep cep) {
        return cepRepository.insert(cep);
    }

    public Cep getById(String id) {
        return cepRepository.getById(id);
    }
}
