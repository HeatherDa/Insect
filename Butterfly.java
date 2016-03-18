package com.Heather;

/**
 * Created by iv2070fj on 3/17/2016.
 */
public class Butterfly extends Insect {
    private String color;
    private String flower;

    Butterfly (String name, String color, int wings, String flower){
        this.flower=flower;
        this.color=color;
        this.name=name;
        this.wings=wings;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getColor() {
        return color;
    }

    public String getFlower() {
        return flower;
    }

    public void printSpeciesData(){
        System.out.println("A "+this.name+" butterfly has "+Insect.getLegs()+" legs, "+this.wings+" wings, "+this.color+", and likes a plant called "+this.flower);
    }
}
