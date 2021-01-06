package vn.com.tma.musicmanager.model;

public class GenreModel {
	private long numberSong;
	private String nameSong;
	public long getNumberSong() {
		return numberSong;
	}
	public void setNumberSong(long numberSong) {
		this.numberSong = numberSong;
	}
	public String getNameSong() {
		return nameSong;
	}
	public void setNameSong(String nameSong) {
		this.nameSong = nameSong;
	}
	public GenreModel(long numberSong, String nameSong) {
		super();
		this.numberSong = numberSong;
		this.nameSong = nameSong;
	}
	public GenreModel() {
		super();
	}
	
}
