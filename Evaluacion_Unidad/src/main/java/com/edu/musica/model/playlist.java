package com.edu.musica.model;

import java.util.List;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.*;

@Entity
@Table(name = "playlists")
public class playlist {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String name;

	    @ManyToMany
	    @JoinTable(name = "playlist_songs",
	            joinColumns = @JoinColumn(name = "playlist_id"),
	            inverseJoinColumns = @JoinColumn(name = "musica_id"))
	    
	    private List<musica> songs;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<musica> getSongs() {
			return songs;
		}

		public void setSongs(List<musica> songs) {
			this.songs = songs;
		}

	    
	    
}
