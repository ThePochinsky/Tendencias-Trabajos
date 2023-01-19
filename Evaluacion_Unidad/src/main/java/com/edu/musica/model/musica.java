package com.edu.musica.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="musica")
public class musica implements Serializable {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name="title")
	    private String title;

	    @Column(name = "artist")
	    private String artist;

	    @Column(name = "album")
	    private String album;
	    
	    @Column(name = "year")
	    private String year;

	    @ManyToMany(mappedBy = "musica")
	    private List<playlist> playlists;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public String getAlbum() {
			return album;
		}

		public void setAlbum(String album) {
			this.album = album;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public List<playlist> getPlaylists() {
			return playlists;
		}

		public void setPlaylists(List<playlist> playlists) {
			this.playlists = playlists;
		}
	    
	    
}
