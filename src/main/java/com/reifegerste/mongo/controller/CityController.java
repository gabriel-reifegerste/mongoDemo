package com.reifegerste.mongo.controller;

import com.reifegerste.mongo.model.City;
import com.reifegerste.mongo.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/city")
public class CityController {

    private final CityService cityService;

    @GetMapping
    public List<City> getCities() {
        return cityService.getCities();
    }

    @PostMapping
    public City save(@RequestBody City city) {
        return cityService.save(city);
    }

    @PutMapping
    public City update(@RequestBody City city) {
        return cityService.update(city);
    }

    @GetMapping("/{id}")
    public City getById(String id) {
        return cityService.getById(id);
    }
}
