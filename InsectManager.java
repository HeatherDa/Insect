package com.Heather;

import java.util.LinkedList;

public class InsectManager {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Insect> bugs=new LinkedList<>();

        Butterfly a=new Butterfly("Monarch", "black and orange", 4, "Milkweed");
        bugs.add(a);
        Butterfly b=new Butterfly("Common Yellow Swallowtail", "yellow and black", 4, "Milk Parsley");
        bugs.add(b);
        Bee c=new Bee("Honey bee", 4, "yellow and black", true, "Jasmine");
        bugs.add(c);
        Bee d=new Bee("Bumble bee", 4, "yellow, black, and white", true, "clover");
        bugs.add(d);

        for (Insect bug:bugs){
            bug.printSpeciesData();
        }

    }
}
