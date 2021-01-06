package vn.com.tma.musicmanager.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "song")
public class Song {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "song_name")
	private String songName;

	@Column(name = "release_time")
	private Date releaseTime;

	@ManyToOne
	@JoinColumn(name = "id_genre")
	private Genre genre;

	@ManyToOne
	@JoinColumn(name = "id_musician")
	private Musician musician;

	@ManyToOne
	@JoinColumn(name = "id_singer")
	private Singer singer;

	@Column(name = "my_play_list")
	private int myPlaylist;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Date getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Musician getMusician() {
		return musician;
	}

	public void setMusician(Musician musician) {
		this.musician = musician;
	}

	public Singer getSinger() {
		return singer;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}

	public int getMyPlaylist() {
		return myPlaylist;
	}

	public void setMyPlaylist(int myPlaylist) {
		this.myPlaylist = myPlaylist;
	}
}
