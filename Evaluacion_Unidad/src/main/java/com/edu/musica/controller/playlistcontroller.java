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

import com.edu.musica.model.musica;
import com.edu.musica.model.playlist;
import com.edu.musica.service.musicaService;
import com.edu.musica.service.playlistService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class playlistcontroller {
	@Autowired
	private playlistService playlistservice;
	
	@GetMapping("/playlistList")
	public List<playlist> index(){
		return playlistservice.findAll();
	}
	
	@GetMapping("/playlistbuscar/{id}")
	public playlist show(@PathVariable Long id) {
		return playlistservice.findById(id);
	}
	
	@PostMapping("/playlistsave")
	@ResponseStatus(HttpStatus.CREATED)
	public playlist create(@RequestBody playlist playlist) {
		return playlistservice.save(playlist);
		
	}
	
	@PutMapping("/playlisteditar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void update(@RequestBody playlist playlist,   @PathVariable Long id) {
		playlist empleadoActual= playlistservice.findById(id);
		empleadoActual.setName(playlist.getName());
	
		
	
		
		
		playlistservice.save(empleadoActual);
		
	}
	@DeleteMapping("/playlistdelete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		playlistservice.delete(id);
	}
}
