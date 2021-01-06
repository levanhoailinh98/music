package vn.com.tma.musicmanager.model;

import java.util.Date;

public class SongModel {

	private long id;
	private String songName;
	private Date releaseTime;
	private String genreName;
	private String musicianName;
	private String singerName;
	private int myPlaylist;

	
	
	public SongModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public SongModel(String songName, Date releaseTime, String genreName, String musicianName, String singerName) {
		super();
		this.songName = songName;
		this.releaseTime = releaseTime;
		this.genreName = genreName;
		this.musicianName = musicianName;
		this.singerName = singerName;
	}



	public SongModel(long id, String songName, Date releaseTime, String genreName, String musicianName,
			String singerName, int myPlaylist) {
		super();
		this.id = id;
		this.songName = songName;
		this.releaseTime = releaseTime;
		this.genreName = genreName;
		this.musicianName = musicianName;
		this.singerName = singerName;
		this.myPlaylist = myPlaylist;
	}



	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	public String getMusicianName() {
		return musicianName;
	}

	public void setMusicianName(String musicianName) {
		this.musicianName = musicianName;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

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

	public int getMyPlaylist() {
		return myPlaylist;
	}

	public void setMyPlaylist(int myPlaylist) {
		this.myPlaylist = myPlaylist;
	}

}
