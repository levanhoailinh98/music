package vn.com.tma.musicmanager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.tma.musicmanager.dao.GenreDAo;
import vn.com.tma.musicmanager.model.GenreModel;

@Controller
public class GenreController {

	@Autowired
	private GenreDAo genreDao;
	
	@RequestMapping("/genre")
	public String getPageGenre(Model model) {
		List<GenreModel> listGenre = genreDao.getNumberSongByGenre();
		model.addAttribute("genres", listGenre);
		return "genre";
	}
}
