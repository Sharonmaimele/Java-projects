package Vehicle;
import java.util.Scanner;
class Car{
private String model;
private int year;
private double price;
{
System.out.println("Initializing");

}
public Car(String model, int year, double price){  //creating a parametirized constructor
   this.model = model;
   this.year = year;
   this.price = price;
}
public void displayDetails(){

  System.out.println("Car model: " + model);
  System.out.println("Year purchased: " + year);
  System.out.println("Price: " + price);
}

public static void main(String[] args){
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter car model:");
   String model = sc.nextLine();
   System.out.println("Enter car year:");
   int year = Integer.parseInt(sc.nextLine());  //casting
   System.out.println("Enter car price:");
   double price = Double.parseDouble(sc.nextLine());
   Car c1 = new Car(model, year, price);
   c1.displayDetails();
   sc.close();
   
}

}