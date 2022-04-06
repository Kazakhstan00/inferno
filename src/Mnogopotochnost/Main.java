package Mnogopotochnost;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> Cars = new ArrayList<>();
        Cars.add(new Car("Ferrari", 300, 1000));
        Cars.add(new Car("Ferrari1", 290, 1000));
        Cars.add(new Car("Ferrari2", 240, 1000));


        for (int i = 0; i < Cars.size(); i++) {
            Cars.get(i).start();
        }
        try {
            System.out.println("Cars is start");
            for (int i = 0; i < Cars.size(); i++) {
                Cars.get(i).join();
                Car temp;
                if (Cars.get(i).count > Cars.get(i + 1).count) {
                    temp = Cars.get(i);
                    Cars.set(i, Cars.get(i + 1));
                    Cars.set(i + 1, temp);


                }
            }

        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }
        for (int i = 0; i < Cars.size(); i++) {
            System.out.println("Car " + Cars.get(i).getCarsName() + " " + Cars.get(i).count + " second Finish" + Cars.get(i).isAlive());

            System.out.println("All Cars finished");
        }
    }
}