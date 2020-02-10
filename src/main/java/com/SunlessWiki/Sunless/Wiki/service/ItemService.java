package com.SunlessWiki.Sunless.Wiki.service;

import com.SunlessWiki.Sunless.Wiki.entity.Item;
import com.SunlessWiki.Sunless.Wiki.dao.ItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ItemService {
    @Autowired
    private ItemDAO itemDAO;

    public Collection<Item> getAllItems(){
        return this.itemDAO.getAllItems();
    }
    public Item getItemById(int id){
        return this.itemDAO.getItemById(id);
    }
}
