package com.example.PruebaUnidad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.PruebaUnidad.models.Carta;
import  com.example.PruebaUnidad.repository.*;
import java.util.List;

@RestController
@RequestMapping("/Carta")
public class cartaController {
    @Autowired
    private cartaRepository cartarepository;

    @PostMapping
    public ResponseEntity<?> saveUsuario(@RequestBody Carta carta) {
        try {
            Carta usersave = cartarepository.save(carta);
            return new ResponseEntity<Carta>(usersave, HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<?> listarUsuario(@RequestBody Carta usuario) {
        try {

            List<Carta> usuarios = cartarepository.findAll();
            return new ResponseEntity<List<Carta>>(usuarios, HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<?> modificarUsuario(@RequestBody Carta usuario) {
        try {
            Carta usersave = cartarepository.save(usuario);
            return new ResponseEntity<Carta>(usersave, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = {"{id}"})
    public ResponseEntity<?> listarUsuario(@PathVariable("id") Integer id) {
        try {

            cartarepository.deleteById(id);
            return new ResponseEntity<String>("FUE ELIMINADO", HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
