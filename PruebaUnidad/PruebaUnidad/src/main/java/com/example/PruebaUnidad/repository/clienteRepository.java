package com.example.PruebaUnidad.repository;

import com.example.PruebaUnidad.models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface clienteRepository extends MongoRepository<Cliente,Integer> {
}
