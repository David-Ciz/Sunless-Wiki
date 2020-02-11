package com.SunlessWiki.Sunless.Wiki.service;

import com.SunlessWiki.Sunless.Wiki.repository.ItemRepository;
import com.SunlessWiki.Sunless.Wiki.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Iterable<Item> getAllItems(){
        return itemRepository.findAll();
    }
    public Optional<Item> getItemById(int id){
        return itemRepository.findById(id);
    }
}
