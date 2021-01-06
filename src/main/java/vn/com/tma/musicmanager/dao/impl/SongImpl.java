package vn.com.tma.musicmanager.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.tma.musicmanager.dao.SongDAO;
import vn.com.tma.musicmanager.entities.Song;
import vn.com.tma.musicmanager.model.SongModel;

@Service
public class SongImpl implements SongDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

//	@Override
//	public List<SongModel> getAllSong() {
//		String query = "select new vn.com.tma.musicmanager.model.SongModel(s.songName, s.releaseTime, g.name, mu.name, si.name) "
//				+ " FROM Song as s JOIN Genre as g ON s.genre.id = g.id"
//				+ " JOIN Musician as mu ON s.musician.id = mu.id "
//				+ " JOIN Singer as si ON s.singer.id = si.id";
//		Session session = sessionFactory.getCurrentSession();
//		session.beginTransaction();
//		List<SongModel> listSong = session.createQuery(query, SongModel.class).getResultList();
//		session.getTransaction().commit();
//		session.close();
//		return listSong;
//	}
	
	@Override
	public List<Song> getAllSong() {
		String query = "select s "
				+ " FROM Song as s";
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<Song> listSong = session.createQuery(query, Song.class).getResultList();
		session.getTransaction().commit();
		session.close();
		return listSong;
	}

}
