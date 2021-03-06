package com.SunlessWiki.Sunless.Wiki.controller;

import com.SunlessWiki.Sunless.Wiki.entity.Item;
import com.SunlessWiki.Sunless.Wiki.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;
    @GetMapping
    @ModelAttribute("itemList")
    public Iterable<Item> getAllItems(){
        return itemService.getAllItems();

    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Item> getItemById(@PathVariable("id") int id){
        return itemService.getItemById(id);
    }

}
