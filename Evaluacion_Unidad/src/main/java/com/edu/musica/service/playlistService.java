package com.edu.musica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.musica.model.musica;
import com.edu.musica.model.playlist;
import com.edu.musica.repository.musicarepository;
import com.edu.musica.repository.playlistrepository;

@Service
public class playlistService implements playlistServiceI {

	@Autowired
	private playlistrepository musicarepository;

	@Override
	@Transactional(readOnly = true)
	public List<playlist> findAll() {
		return (List<playlist>)musicarepository.findAll();
	}

	@Override
	@Transactional
	public playlist save(playlist playlist) {
		return musicarepository.save(playlist);
	}

	

	@Override
	@Transactional
	public void delete(Long id) {
		musicarepository.deleteById(id);;		
	}

	
	@Override
	@Transactional(readOnly = true)
	public playlist findById(Long id) {
		return musicarepository.findById(id).orElse(null);
	}

}
