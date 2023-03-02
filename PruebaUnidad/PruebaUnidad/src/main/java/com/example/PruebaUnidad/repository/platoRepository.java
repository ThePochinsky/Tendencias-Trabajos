package com.example.PruebaUnidad.repository;

import com.example.PruebaUnidad.models.Cliente;
import com.example.PruebaUnidad.models.Plato;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface platoRepository extends MongoRepository<Plato,Integer> {
}
