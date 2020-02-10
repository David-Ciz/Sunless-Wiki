package com.SunlessWiki.Sunless.Wiki.entity;

import lombok.Getter;

@Getter
public class Item {

    private int id;
    private String Name;
    private int buyPrice;
    private int sellPrice;

    public Item(int id, String name, int buyPrice, int sellPrice) {
        this.id = id;
        Name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
