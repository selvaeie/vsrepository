package com.vs.menu.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vs.menu.models.Menu;
@Repository
public interface MenuRepository extends CrudRepository<Menu, Integer>{
   Menu findByItemNo(int itemNo);
   List<Menu> findAll();
}
