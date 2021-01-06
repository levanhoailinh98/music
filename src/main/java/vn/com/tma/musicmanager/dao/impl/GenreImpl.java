package vn.com.tma.musicmanager.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.tma.musicmanager.dao.GenreDAo;
import vn.com.tma.musicmanager.model.GenreModel;

@Service
public class GenreImpl implements GenreDAo {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<GenreModel> getNumberSongByGenre() {
		String query = "select new vn.com.tma.musicmanager.model.GenreModel(count(s.id), g.name) "
				+ "from Song as s join Genre as g on s.genre.id = g.id group by g.name";
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<GenreModel> listSong = session.createQuery(query, GenreModel.class).getResultList();
		session.getTransaction().commit();
		session.close();
		return listSong;
	}

}
