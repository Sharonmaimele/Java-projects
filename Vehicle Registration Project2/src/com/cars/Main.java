package com.cars;
import java.awt.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
//import com.cars.Car;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<Car> cars = new ArrayList<>();
        System.out.println("WELCOME TO THE CAR APPLICATION*****");
        System.out.println("(1) Capture vehicle details\n" +
                "(2) View vehicle report\n" +
                "(3) Exit app.");
        int menuOption = sc.nextInt();
        Duration d = Duration.between(LocalTime.now( ), LocalTime.now());

        while (menuOption == 1) {

            Car carObj = new Car();
            int year;
            int millage;
            String make;
            String model;
            String plateNum = "";
            String vinNum;

            System.out.println("Enter make: ");
            make = sc.next();

            System.out.println("Enter model: ");
            model = sc.next();

            System.out.println("Enter vin: ");
            vinNum = sc.next();

            while (!(vinNum.length() == 3)) {
                System.out.println("Enter vin and ensure its 17 characters long");
                vinNum = sc.next();
            }

            System.out.println("Please enter (1) for old format license plate number, and (2) for the current one: ");
            int plateChoice = sc.nextInt();
            if (plateChoice == 1) {
                System.out.println("Enter plate number e.g. AAA555GP");
                plateNum = sc.next();
            } else if (plateChoice == 2) {
                System.out.println("Enter plate number e.g. AA66BBGP");
                plateNum = sc.next();
            }
            System.out.println("Enter millage: ");
            millage = sc.nextInt();

            System.out.println("Enter year: ");
            year = sc.nextInt();

            carObj.setMake(make);
            carObj.setModel(model);
            carObj.setPlateNumber(plateNum);
            carObj.setVin(vinNum);
            carObj.setYear(year);
            carObj.setMillage(millage);

            cars.add(carObj);
            System.out.println("Car make: " + make + " and car model: " + model + " has been captured in the system.");

        if (!cars.isEmpty()) {
            System.out.println();
            System.out.println("(1) Add another vehicle details to your list\n" +
                    "(2) View all vehicle reports\n" +
                    "(3) View a specific vehicle report\n" +
                    "(4) Exit app.");
            menuOption = sc.nextInt();
            if (menuOption == 2) {
                while (menuOption == 2) {
                    int counterA = 0;
                    for (Car obcar : cars) {
                        counterA++;
                        System.out.println(" \n" +
                                "VEHICLE " + counterA + "\n" +
                                "*************************************");
                        System.out.println("MAKE: " + obcar.getMake());
                        System.out.println("MODEL: " + obcar.getModel());
                        System.out.println("PLATE NUMBER: " + obcar.getPlateNumber());
                        System.out.println("VIN NUMBER: " + obcar.getVin());
                        System.out.println("CAR YEAR: " + obcar.getYear());
                        System.out.println("CAR MILLAGE: " + obcar.getMillage());
                    }
                    System.out.println();
                    System.out.println("(1) Add another vehicle details to your list\n" +
                            "(2) View all vehicle reports\n" +
                            "(3) View a specific vehicle report\n" +
                            "(4) Exit app.");
                    menuOption = sc.nextInt();
                    if (menuOption == 3) {
                        displaySpeceficCars(sc, menuOption, cars);
                    }
                }
            } else if (menuOption == 3) {
                displaySpeceficCars(sc, menuOption, cars);
            }
        } else {
            System.out.println();
            System.out.println("There are no cars captured in the system.");
            System.out.println("(1) Please capture vehicle details\n" +
                    "(3) Exit app.");
            menuOption = sc.nextInt();
        }
    }

        System.out.println("THANKS FOR USING THE CAR APPLICATION!!!");
}

    public static void displaySpeceficCars(Scanner sc, int menuOption, Collection<Car> cars){
        while (menuOption == 3) {
            int selectedCarOption = 0;
            int counter = 0;
            for (Car obcar : cars) {
                counter++;
                System.out.println("Choose the vehicle that you want to see its details below::::");
                System.out.println("("+counter+") Vehicle " + counter + ","+obcar.getMake()+ "-"+obcar.getModel());
            }
            selectedCarOption = sc.nextInt();

            int carscounter = 0;
            for(Car obcar : cars){
                carscounter++;
                if(carscounter == selectedCarOption){
                    System.out.println("***************************\n" +
                            "VEHICLE " + carscounter + "\n" +
                            "*************************************");
                    System.out.println("MAKE: " + obcar.getMake());
                    System.out.println("MODEL: " + obcar.getModel());
                    System.out.println("PLATE NUMBER: " + obcar.getPlateNumber());
                    System.out.println("VIN NUMBER: " + obcar.getVin());
                    System.out.println("CAR YEAR: " + obcar.getYear());
                    System.out.println("CAR MILLAGE: " + obcar.getMillage());
                }
            }

            System.out.println();
            System.out.println("(1) Add another vehicle details to your list\n" +
                    "(2) View all vehicle reports\n" +
                    "(3) View a specific vehicle report\n" +
                    "(4) Exit app.");
            menuOption = sc.nextInt();
        }
    }
}
