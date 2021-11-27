package com.adoptapp.solicitud_ms.controllers;

import com.adoptapp.solicitud_ms.exceptions.PetNotFoundException;
import com.adoptapp.solicitud_ms.models.Pet;
import com.adoptapp.solicitud_ms.models.RequestPet;
import com.adoptapp.solicitud_ms.repositories.PetRepository;
import com.adoptapp.solicitud_ms.repositories.RequestPetRepository;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@RestController

public class RequestPetController {
    private final PetRepository petRepository;
    private final RequestPetRepository requestPetRepository;

    public RequestPetController(PetRepository petRepository, RequestPetRepository requestPetRepository) {
        this.petRepository = petRepository;
        this.requestPetRepository = requestPetRepository;
    }

    private Date generateDate() {
        Date today = new Date();
        LocalDateTime ldt = LocalDateTime.ofInstant(today.toInstant(),
                ZoneId.systemDefault());
        return Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
    }

    @PostMapping("/requestPet")
    RequestPet newRequestPet(@RequestBody RequestPet requestPet){
        requestPet.setCreated_at(generateDate());
        return requestPetRepository.insert(requestPet);
    }

    @GetMapping("/requestPet/details/{userId}")
    List<RequestPet> getRequestPets(@PathVariable String userId){
        List<RequestPet> userRequestPets = requestPetRepository.findByUser(userId);
        if (userRequestPets.size()==0){
            throw new PetNotFoundException("No se encontraron mascotas entregadas por este usuario");
        }
        return userRequestPets;
    }

}
