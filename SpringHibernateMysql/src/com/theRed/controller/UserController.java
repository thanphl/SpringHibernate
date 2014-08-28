package com.theRed.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.theRed.hibernate.DAO.UserDAOImpl;
import com.theRed.hibernate.persistence.User;

public class UserController extends MultiActionController {
	private UserDAOImpl userDAO;
	private User user;

	public void setUserDAO(UserDAOImpl userDAO) {
		this.userDAO = userDAO;
	}

	public ModelAndView add(HttpServletRequest arg0, HttpServletResponse arg1,
			User user) throws Exception {
		ModelAndView modelAndView = new ModelAndView("redirect:list.htm");
		if (user != null && user.getNickname().length() > 0
				&& user.getNickname().length() < 30) {
			userDAO.save(user);
		}else{
			modelAndView.addObject("error", "please enter valid nickname under 30 characters");
		}
		return modelAndView;
	}

	public ModelAndView list(HttpServletRequest arg0, HttpServletResponse arg1) {
		ModelMap map = new ModelMap();
		System.out.println(arg0);
		System.out.println(arg1);
		map.addAttribute("userinfo", userDAO.users());
		map.addAttribute("user", new User());
		return new ModelAndView("index", map);
	}
}
