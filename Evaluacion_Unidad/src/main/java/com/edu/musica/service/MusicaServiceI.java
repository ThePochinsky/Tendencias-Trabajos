package com.edu.musica.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.musica.model.musica;


public interface MusicaServiceI {
	
	public List<musica> findAll();

	public musica save(musica musica);

	public void delete(Long id);

	public musica findById(Long id);

}
