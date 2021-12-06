package com.reifegerste.mongo.controller;

import com.reifegerste.mongo.model.State;
import com.reifegerste.mongo.service.StateService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/state")
public class StateController {

    private final StateService stateService;

    @GetMapping
    public List<State> getPeople() {
        return stateService.getStates();
    }

    @PostMapping
    public State save(@RequestBody @Validated State state) {
        return stateService.save(state);
    }

    @PutMapping
    public State update(@RequestBody State state) {
        return stateService.update(state);
    }

    @GetMapping("/{id}")
    public State getById(String id) {
        return stateService.getById(id);
    }
}
