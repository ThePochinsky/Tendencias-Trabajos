package com.edu.musica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.edu.musica.model.*;

import com.edu.musica.service.musicaService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class musicacontroller {
	@Autowired
	private musicaService musicaservice;
	
	@GetMapping("/musicalist")
	public List<musica> index(){
		return musicaservice.findAll();
	}
	
	@GetMapping("/musicabuscar/{id}")
	public musica show(@PathVariable Long id) {
		return musicaservice.findById(id);
	}
	
	@PostMapping("/musicasave")
	@ResponseStatus(HttpStatus.CREATED)
	public musica create(@RequestBody musica musica) {
		return musicaservice.save(musica);
		
	}
	
	@PutMapping("/musicaeditar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void update(@RequestBody musica musica,   @PathVariable Long id) {
		musica empleadoActual= musicaservice.findById(id);
		empleadoActual.setTitle(musica.getTitle());
		empleadoActual.setArtist(musica.getArtist());
		empleadoActual.setAlbum(musica.getAlbum());
		empleadoActual.setYear(musica.getYear());
		
		
		musicaservice.save(empleadoActual);
		
	}
	@DeleteMapping("/musicadelete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		musicaservice.delete(id);
	}
}

