package com.edu.musica.service;

import java.util.List;

import com.edu.musica.model.musica;
import com.edu.musica.model.playlist;


public interface playlistServiceI {
	public List<playlist> findAll();

	public playlist save(playlist playlist);

	public void delete(Long id);

	public playlist findById(Long id);

}
