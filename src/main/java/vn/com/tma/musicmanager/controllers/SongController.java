package vn.com.tma.musicmanager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.tma.musicmanager.dao.SongDAO;
import vn.com.tma.musicmanager.entities.Song;

@Controller
public class SongController {
	
	@Autowired
	private SongDAO songDao;

	@RequestMapping("/")
	public String getLangdingpage(Model model) {
		List<Song> listSong = songDao.getAllSong();
		model.addAttribute("songs",listSong);
		return "landingPage";
	}
}
