package com.adoptapp.solicitud_ms.repositories;

import com.adoptapp.solicitud_ms.models.RequestPet;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RequestPetRepository extends MongoRepository<RequestPet, String> {
    List<RequestPet> findByUser (String userId);
}
