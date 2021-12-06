package com.reifegerste.mongo.service;

import com.reifegerste.mongo.model.State;
import com.reifegerste.mongo.repository.StateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StateService {
    private final StateRepository stateRepository;

    public List<State> getStates() {
        return this.stateRepository.findAll();
    }

    public State save(State state) {
        return stateRepository.save(state);
    }

    public State update(State state) {
        return stateRepository.insert(state);
    }

    public State getById(String id) {
        return stateRepository.getById(id);
    }
}
