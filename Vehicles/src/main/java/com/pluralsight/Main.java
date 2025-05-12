package com.pluralsight;

public class Main {
    public static void main(String[] args) {
//        Moped slowRide = new Moped();
//        slowRide.setColor("Red");
//        slowRide.setFuelCapacity(5);
//        slowRide.setNumberOfPassengers(1);
//        slowRide.setCargoCapacity(10);
//
//
//         Car sedan = new Car();
//        sedan.setColor("Blue");
//        sedan.setFuelCapacity(50);
//        sedan.setNumberOfPassengers(5);
//        sedan.setCargoCapacity(200);
//
//        SemiTruck bigRig = new SemiTruck();
//        bigRig.setColor("Black");
//        bigRig.setFuelCapacity(300);
//        bigRig.setNumberOfPassengers(2);
//        bigRig.setCargoCapacity(20000);
//
//
//        Hovercraft futureRide = new Hovercraft();
//        futureRide.setColor("Silver");
//        futureRide.setFuelCapacity(100);
//        futureRide.setNumberOfPassengers(4);
//        futureRide.setCargoCapacity(500);

        Moped slowRide = new Moped("Red", 1, 10, 5);
        Car sedan = new Car("Blue", 5, 200, 50);
        SemiTruck bigRig = new SemiTruck("Black", 2, 20000, 300);
        Hovercraft futureRide = new Hovercraft("Silver", 4, 500, 100);

        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Moped passenger: " + slowRide.getNumberOfPassengers());
        System.out.println("Car passenger capacity: " + sedan.getNumberOfPassengers());
        System.out.println("SemiTruck cargo capacity: " + bigRig.getCargoCapacity());
        System.out.println("Hovercraft fuel capacity: " + futureRide.getFuelCapacity());
    }
}
