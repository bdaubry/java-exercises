package org.launchcode.java.studios.Restaurant;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date dateAdded;

    public MenuItem(double price, String description, boolean isNew, Date dateAdded){
        this.price = price;
        this.description = description;
        this.isNew = isNew;
        this.dateAdded = dateAdded;
    }

    public MenuItem(double price, String description){
        this.price = price;
        this.description = description;
        this.isNew = true;
        this.dateAdded = new Date();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
