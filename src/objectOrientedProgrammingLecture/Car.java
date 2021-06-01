package objectOrientedProgrammingLecture;

import java.util.Scanner;

public class Car {
    public static Scanner scanner = new Scanner(System.in);
    public String model;
    public int year;
    public String color;

    public void run() {
        System.out.println("The car is running");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);

        car1.color = "Black";
        car1.year = 2008;
        car1.model = "Toyota Camry";

        System.out.println(car1.color);
        System.out.println(car1.year);
        System.out.println(car1.model);

        Car car2 = new Car();

        car2.color = "Red";
        car2.year = 2019;
        car2.model = "Tesla Model 3";
        car2.run();

        System.out.println(car2.color);
        System.out.println(car2.year);
        System.out.println(car2.model);
    }
}
