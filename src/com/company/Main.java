package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animals[] animals = {new Shark(), new Turtle(), new Eage()};

        String[] sharks ={};
        String[] turtles ={};
        String[] eages={};


        for (Animals animal:animals) {
            System.out.println(animal.getClass());
            if(animal instanceof Shark){
                sharks =new String[] {animal.getClass().getName()};

            }else if(animal instanceof Turtle){
                turtles = new String[]{animal.getClass().getName()};
            }else {
                eages = new String[]{animal.getClass().getName()};
            }
        }
        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eages));





    }
}
