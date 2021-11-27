package com.adoptapp.solicitud_ms.repositories;

import com.adoptapp.solicitud_ms.models.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PetRepository extends MongoRepository <Pet, String> {

}
