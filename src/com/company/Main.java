package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animals[] animals = {new Shark(), new Turtle(), new Eage()};

        Shark[] sharks ={};
        Turtle[] turtles ={};
        Eage[] eages={};


        for (Animals animal:animals) {
            System.out.println(animal.getClass());
            if(animal instanceof Shark){
               sharks = new Shark[]{(Shark) animal};

            }else if(animal instanceof Turtle){
                turtles = new Turtle[]{(Turtle) animal};
            }else {
                eages = new Eage[]{(Eage) animal};
            }
        }

        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eages));





    }
}
