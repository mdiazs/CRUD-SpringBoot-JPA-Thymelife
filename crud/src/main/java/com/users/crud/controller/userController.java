package com.users.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.users.crud.domain.User;
import com.users.crud.services.UserService;

@Controller
public class userController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String saludo(){
		return "index";
	}
	
	@RequestMapping(value="/users", method = RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("users", userService.listAllUsers());
		return "users";
	}
	
	@RequestMapping("user/{id}")
	public String showUser(@PathVariable int id, Model model){
		model.addAttribute("user", userService.getUserById(id));
		return "userShow";
	}
	
	@RequestMapping("user/edit/{id}")
	public String edit(@PathVariable int id, Model model){
		model.addAttribute("user", userService.getUserById(id));
		return "userForm";
	}
	
	@RequestMapping("user/new")
	public String newUser(Model model){
		model.addAttribute("user", new User());
		return "userForm";
	}
	
	@RequestMapping(value="user",method = RequestMethod.POST)
	public String saveUser(User user){
		userService.saveUser(user);
		return "redirect:/user/" + user.getId();
	}
	
	@RequestMapping("user/delete/{id}")
	public String delete(@PathVariable int id){
		userService.deleteUser(id);
		return "redirect:/users";
	}
}
