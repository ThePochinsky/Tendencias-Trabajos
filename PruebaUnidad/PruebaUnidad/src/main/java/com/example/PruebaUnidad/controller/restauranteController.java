package com.example.PruebaUnidad.controller;

import com.example.PruebaUnidad.models.Plato;
import com.example.PruebaUnidad.models.Restaurante;
import com.example.PruebaUnidad.repository.platoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.PruebaUnidad.repository.*;

import java.util.List;

@RestController
@RequestMapping("/Restaurante")
public class restauranteController {
    @Autowired
    private restauranteRepository restauranterepository;

    @PostMapping
    public ResponseEntity<?> saveUsuario(@RequestBody Restaurante restaurante) {
        try {
            Restaurante usersave = restauranterepository.save(restaurante);
            return new ResponseEntity<Restaurante>(usersave, HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<?> listarUsuario(@RequestBody Restaurante restaurante) {
        try {

            List<Restaurante> usuarios = restauranterepository.findAll();
            return new ResponseEntity<List<Restaurante>>(usuarios, HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<?> modificarUsuario(@RequestBody Restaurante restaurante) {
        try {
            Restaurante usersave = restauranterepository.save(restaurante);
            return new ResponseEntity<Restaurante>(usersave, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = {"{id}"})
    public ResponseEntity<?> listarUsuario(@PathVariable("id") Integer id) {
        try {

            restauranterepository.deleteById(id);
            return new ResponseEntity<String>("FUE ELIMINADO", HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
