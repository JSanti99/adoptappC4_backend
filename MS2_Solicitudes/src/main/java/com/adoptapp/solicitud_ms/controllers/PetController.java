package com.adoptapp.solicitud_ms.controllers;

import com.adoptapp.solicitud_ms.exceptions.PetNotFoundException;
import com.adoptapp.solicitud_ms.models.Pet;
import com.adoptapp.solicitud_ms.repositories.PetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PetController {
    private final PetRepository petRepository;

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @PostMapping("/pet")
    Pet newPet(@RequestBody Pet pet){
        return petRepository.insert(pet);
    }

    @GetMapping("/pet/details")
    List<Pet> getPets(){
        List<Pet> pets = petRepository.findAll();
        if (pets.size()==0){
            throw new PetNotFoundException("No se encontraron mascotas");
        }
        return pets;
    }

    @GetMapping("/pet/detail/{petId}")
    Pet getPet(@PathVariable String petId){
        return petRepository.findById(petId)
                .orElseThrow(() -> new PetNotFoundException("No se encontró una mascota con el id " + petId));
    }

    @PutMapping("/pet/update/{petId}")
    Pet putPet(@PathVariable String petId, @RequestBody Pet pet){
        Pet petFound = petRepository.findById(petId)
                .orElseThrow(() -> new PetNotFoundException("No se encontró una mascota con el id " + petId));
        pet.setId(petId);
        return petRepository.save(pet);
    }

}
