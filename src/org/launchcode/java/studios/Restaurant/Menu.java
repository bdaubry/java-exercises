package org.launchcode.java.studios.Restaurant;

import java.util.Date;
import java.util.ArrayList;
import java.util.Objects;

public class Menu {

    private String name;
    private Date dateUpdated;
    private static ArrayList<MenuItem> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
        this.dateUpdated = new Date();
    }

    public void addDish(MenuItem dish){
        dishes.add(dish);
        dateUpdated = new Date();
    }

    public void removeDish(MenuItem dish){
        if(dishes.contains(dish)){
            dishes.remove(dish);
        }
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<MenuItem> dishes) {
        this.dishes = dishes;
    }

    public boolean isDishNew(MenuItem dish){
        return dish.isNew();
    }

    @Override
    public String toString() {

        return name + "Menu \n" + "Date Updated = " + dateUpdated +
                "\n" + dishes;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Menu)) return false;
        Menu menu = (Menu) object;
        return Objects.equals(getDateUpdated(), menu.getDateUpdated()) &&
                Objects.equals(getDishes(), menu.getDishes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDateUpdated(), getDishes());
    }
}
