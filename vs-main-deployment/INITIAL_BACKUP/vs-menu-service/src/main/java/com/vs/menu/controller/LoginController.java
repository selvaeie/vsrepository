package com.vs.menu.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vs.menu.models.User;

@RestController
@RequestMapping(value="/login")
public class LoginController {
	
	@RequestMapping(value="vslogin")
	public boolean login(@RequestBody User user )
	{
		boolean validuser=false;
		if(user.getUsername().equalsIgnoreCase("admin"))		
		return validuser;
		
		return validuser;
	}
	

}
