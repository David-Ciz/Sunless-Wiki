package com.SunlessWiki.Sunless.Wiki.dao;

import com.SunlessWiki.Sunless.Wiki.entity.Item;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ItemDAO {

    private static Map<Integer, Item> items;

    static {
        items = new HashMap<Integer, Item>(){
            {
                put(1, new Item(1, "Supplies",0,0));
                put(2, new Item(2, "Fuel",0,0));
            }
        };
    }

    public Collection<Item> getAllItems(){
        return this.items.values();
    }

    public Item getItemById(int id){
        return this.items.get(id);
    }
}
