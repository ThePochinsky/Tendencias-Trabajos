package com.example.PruebaUnidad.repository;

import com.example.PruebaUnidad.models.Carta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface cartaRepository extends MongoRepository<Carta,Integer> {


}
