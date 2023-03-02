package com.example.PruebaUnidad.repository;

import com.example.PruebaUnidad.models.Cliente;
import com.example.PruebaUnidad.models.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface restauranteRepository extends MongoRepository<Restaurante,Integer> {


}
