package com.booksLover.java.bookClub.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class BookClubController {

	
	@GetMapping("book-club")
	public ModelAndView bookClub() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/club/bookClub");
		return modelAndView;
	}

	
	@GetMapping("club-detail")
	public ModelAndView detailList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/club/clubDetail");
		return modelAndView;
	}
	
	//머즈용으로 한줄 써봄


}
