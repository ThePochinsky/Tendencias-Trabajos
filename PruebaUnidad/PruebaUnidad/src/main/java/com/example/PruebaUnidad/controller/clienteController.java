package com.example.PruebaUnidad.controller;

import com.example.PruebaUnidad.models.Carta;
import com.example.PruebaUnidad.repository.cartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.PruebaUnidad.repository.*;
import com.example.PruebaUnidad.models.*;

import java.util.List;

@RestController
@RequestMapping("/Cliente")
public class clienteController {
    @Autowired
    private clienteRepository clienterepository;

    @PostMapping
    public ResponseEntity<?> saveUsuario(@RequestBody Cliente cliente) {
        try {
            Cliente usersave = clienterepository.save(cliente);
            return new ResponseEntity<Cliente>(usersave, HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<?> listarUsuario(@RequestBody Cliente cliente) {
        try {

            List<Cliente> usuarios = clienterepository.findAll();
            return new ResponseEntity<List<Cliente>>(usuarios, HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<?> modificarUsuario(@RequestBody Cliente usuario) {
        try {
            Cliente usersave = clienterepository.save(usuario);
            return new ResponseEntity<Cliente>(usersave, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = {"{id}"})
    public ResponseEntity<?> listarUsuario(@PathVariable("id") Integer id) {
        try {

            clienterepository.deleteById(id);
            return new ResponseEntity<String>("FUE ELIMINADO", HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
