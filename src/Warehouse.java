import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Warehouse {
 public static void main(String[] args) throws IOException, ClassNotFoundException {

     ArrayList<Passenger> passengerList = new ArrayList<>();
     ArrayList<Cargo> cargoList = new ArrayList<>();
     ArrayList<Racing> racingList = new ArrayList<>();
     ArrayList<Sports> sportsList = new ArrayList<>();

     System.out.println("Enter the car category " +"    " + "Passenger, Cargo, Racing, Sports ");
     Scanner scanner = new Scanner(System.in);
     String auto_category = scanner.nextLine();
     System.out.println(auto_category);
     System.out.println("Enter car brand");
     String brand = scanner.nextLine();
     System.out.println("Enter type ");
     String type = scanner.nextLine();
     System.out.println("Enter max speed ");
     int maxSpeed = scanner.nextInt();


     if (auto_category.equals("Passenger")){
         System.out.println("Enter passengers max ");
         int passengersMax = scanner.nextInt();
         Passenger newPassenger = new Passenger(brand,type,maxSpeed,passengersMax);
         passengerList.add(newPassenger);
     }
     if (auto_category.equals("Cargo")){
         System.out.println("Enter luggage ");
         int cargoTon = scanner.nextInt();
         Cargo newCargo = new Cargo(brand,type,maxSpeed,cargoTon);
         cargoList.add(newCargo);
     }
     if( auto_category.equals("Racing")){
         System.out.println("Enter accelerationToOneHundred");
         int accelerationToOneHundred = scanner.nextInt();
         System.out.println("Enter power");
         int power = scanner.nextInt();
         Racing newRacing = new Racing(brand,type,maxSpeed,accelerationToOneHundred ,power);
         racingList.add(newRacing);
     }
     if ( auto_category.equals("Sports")){
         System.out.println("Enter accelerationToOneHundred");
         int acceleration = scanner.nextInt();
         Sports newSports = new Sports(brand,type,maxSpeed,acceleration);
         sportsList.add(newSports);
     }

     ArrayList<Object> a = new ArrayList<>();
     a.add(passengerList);
     a.add(cargoList);
     a.add(racingList);
     a.add(sportsList);

     Util util = new Util();
     util.save(a);
     util.ride();
 }



 }


