package com.Heather;

/**
 * Created by iv2070fj on 3/17/2016.
 */
public class Bee extends Insect{
    private String color;
    private boolean honey;
    private String flower;

    Bee(String name, int wings, String color, boolean honey, String flower){
        this.name=name;
        this.wings=wings;
        this.color=color;
        this.honey=honey;
        this.flower=flower;
    }
    public void printSpeciesData(){
        String makehoney;
        if (honey==true){
            makehoney="  This bee makes honey.";
        }else{
            makehoney="  This bee does not make honey.";
        }
        System.out.println("A "+this.name+" bee has "+Insect.getLegs()+" legs, "+this.wings+" wings, is "+this.color+", and likes "+this.flower+" flowers."+makehoney);
    }
}
