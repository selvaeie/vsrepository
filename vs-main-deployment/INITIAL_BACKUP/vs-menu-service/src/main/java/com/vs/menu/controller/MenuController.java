package com.vs.menu.controller;

import java.util.List;

import javax.ws.rs.core.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vs.menu.models.Menu;
import com.vs.menu.service.MenuService;

@RestController
@RequestMapping(value="/menu")
public class MenuController {
	@Autowired
	MenuService menuservice;
	
	@RequestMapping(value="/addmenu")
	public @ResponseBody List<Menu> addMenuItems(@RequestBody Menu menu)
	{
		System.out.println("----------->Inside add method<------------");
		
		menuservice.addMenuService(menu);
				
		List<Menu> menuList=menuservice.getMenuService();
		
		return menuList;
	}
	
	
	@RequestMapping(value="/getmenu", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Menu getMenuItems(@RequestParam("itemNo") Integer itemNo)
	{
		System.out.println("----------->Inside get method<------------");
		
		Menu menuList=menuservice.getMenuService(itemNo);
				
		return menuList;
	}
	
	
	@RequestMapping(value="/getallmenu", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Menu> getAllMenuItems()
	{
		System.out.println("----------->Inside get method<------------");
		
		List<Menu> menuList=menuservice.getMenuService();
				
		return menuList;
	}
	
	@RequestMapping(value="/updatemenu")
	public String modifyMenu()
	{
		System.out.println("----------->Inside update method<------------");
		//menuservice.updateMenuService();
		
		return "Successfully menu updated!!!";
	}
	

	
	@RequestMapping(value="/removemenu")
	public String removeMenuItems()
	{
		System.out.println("----------->Inside remove method<------------");
		//menuservice.removeMenuService();
	
		return "Successfully menu removed!!!";
	}
	
	


}
