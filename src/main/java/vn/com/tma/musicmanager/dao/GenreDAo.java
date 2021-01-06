package vn.com.tma.musicmanager.dao;

import java.util.List;

import vn.com.tma.musicmanager.model.GenreModel;

public interface GenreDAo {
	public List<GenreModel> getNumberSongByGenre();
}
