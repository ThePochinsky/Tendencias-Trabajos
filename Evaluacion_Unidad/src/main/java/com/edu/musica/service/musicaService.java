package com.edu.musica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.musica.model.musica;
import com.edu.musica.repository.musicarepository;


@Service
public class musicaService implements MusicaServiceI{
	
	@Autowired
	private musicarepository musicarepository;

	@Override
	@Transactional(readOnly = true)
	public List<musica> findAll() {
		return (List<musica>)musicarepository.findAll();
	}

	@Override
	@Transactional
	public musica save(musica musica) {
		return musicarepository.save(musica);
	}

	

	@Override
	@Transactional
	public void delete(Long id) {
		musicarepository.deleteById(id);;		
	}

	
	@Override
	@Transactional(readOnly = true)
	public musica findById(Long id) {
		return musicarepository.findById(id).orElse(null);
	}

	




}
