package com.example.PruebaUnidad.controller;

import com.example.PruebaUnidad.models.Cliente;
import com.example.PruebaUnidad.models.Plato;
import com.example.PruebaUnidad.repository.clienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.PruebaUnidad.repository.*;

import java.util.List;

@RestController
@RequestMapping("/Plato")
public class platoController {
    @Autowired
    private platoRepository platorepository;

    @PostMapping
    public ResponseEntity<?> saveUsuario(@RequestBody Plato plato) {
        try {
            Plato usersave = platorepository.save(plato);
            return new ResponseEntity<Plato>(usersave, HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<?> listarUsuario(@RequestBody Plato plato) {
        try {

            List<Plato> usuarios = platorepository.findAll();
            return new ResponseEntity<List<Plato>>(usuarios, HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<?> modificarUsuario(@RequestBody Plato plato) {
        try {
            Plato usersave = platorepository.save(plato);
            return new ResponseEntity<Plato>(usersave, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = {"{id}"})
    public ResponseEntity<?> listarUsuario(@PathVariable("id") Integer id) {
        try {

            platorepository.deleteById(id);
            return new ResponseEntity<String>("FUE ELIMINADO", HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
