package com.vs.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vs.menu.models.Menu;
import com.vs.menu.repo.MenuRepository;

@Service
public class MenuService {
	@Autowired
	MenuRepository menurepo;
	
	public void addMenuService(Menu menu)
	{
		menurepo.save(menu);
	}
	
	public Menu getMenuService(int itemNo)	{
		 
		return menurepo.findByItemNo(itemNo);
	}
	
	public List<Menu> getMenuService()	{
		 
		return menurepo.findAll();
	}
	
	public Menu updateMenuService(int itemNo)	{
		 
		return menurepo.findByItemNo(itemNo);
		
	}
	
	public Menu removeMenuService(int itemNo)	{
		 
		return menurepo.findByItemNo(itemNo);
		
	}

}
