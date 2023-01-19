package com.edu.musica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.edu.musica.model.playlist;

public interface playlistrepository extends CrudRepository<playlist,Long> {

}
