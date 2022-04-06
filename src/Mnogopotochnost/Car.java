package Mnogopotochnost;

public class Car extends Thread {
    private String name;
    private int speed;
    private double distance;
    double count =0;

    public Car() {
    }

    public Car(String name, int speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }


    public String getCarsName() {
        return name;
    }

    public void run() {
        try {
            for (int i = 1; i < distance/speed; i++) {
                count++;
                System.out.println("Car " + name +" "+i+" "+ i*speed + " meters");
                Thread.sleep(1000);


            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Car " + name + " finished");
    }
}