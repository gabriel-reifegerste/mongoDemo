package com.reifegerste.mongo.service;

import com.reifegerste.mongo.model.City;
import com.reifegerste.mongo.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CityService {
    private final CityRepository cityRepository;

    public List<City> getCities() {
        return this.cityRepository.findAll();
    }

    public City save(City city) {
        return cityRepository.save(city);
    }

    public City update(City city) {
        return cityRepository.insert(city);
    }

    public City getById(String id) {
        return cityRepository.getById(id);
    }
}
