package com.example.shelter.service;

import com.example.shelter.entity.Shelter;
import com.example.shelter.repository.ShelterRepository;
import com.example.shelter.shelter.ShelterType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * This class implements working with a database to receive or receive the necessary information
 */
@Slf4j
@Service
public class ShelterService {
    private final ShelterRepository shelterRepository;

    public ShelterService(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }

    /**
     * Method for obtaining information about the nursery, depending on the selected type
     *
     * @param type - Shelter type
     */
    public String getInfo(ShelterType type) {
        Optional<Shelter> shelter = shelterRepository.findFirstByType(type);
        if (shelter.isPresent()) {
            return shelter.get().getDescription();
        }
        log.info("в базе данных нет питомников с таким животным");
        return "Тут пока что пусто :(";
    }
    /**
     * Method for obtaining information about the instruction, depending on the selected type
     * @param type - Shelter type
     */
    public String getInstruction(ShelterType type) {
        Optional<Shelter> shelter = shelterRepository.findFirstByType(type);
        if (shelter.isPresent()) {
            return shelter.get().getInstruction();
        }
        log.info("в базе данных нет питомников с таким животным");
        return "Тут пока что пусто :(";
    }
}