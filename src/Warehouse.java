import org.omg.CORBA.Environment;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse {

    static ArrayList<Car> carList1 = new ArrayList<>();
    static Util util = new Util();
    static ArrayList<Car> carList = new ArrayList<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        start();
    }

    public static void start() throws IOException, ClassNotFoundException {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("\n" + "select 1 - enter the menu, 2 - exit the program");
        int a = scanner2.nextInt();
        if (a == 1) {
            menu();
        } else {
            System.exit(0);
        }
    }

    public static void menu() throws IOException, ClassNotFoundException {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("add auto enter 1, view the list enter 2, to delete auto index enter 3, \n" +
                "if 4 to main menu1 ");
        int warehouseActivities = scanner1.nextInt();

        if (warehouseActivities == 1) {
            car();
        }

        if (warehouseActivities == 2) {
            util.ride();
            start();
        }

        if (warehouseActivities == 3) {
            System.out.println("\n" +
                    "Enter the index of the object to be deleted");
            int ind = scanner1.nextInt();
            carList1.remove(ind);
            start();
        }
        if (warehouseActivities == 4) {
            start();
        }
    }


    public static void car() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the car category" + "\n " + "Passenger , Cargo, Racing, Sports");
        String auto_category = scanner.nextLine();
        System.out.println("Enter car brand");
        String brand = scanner.nextLine();
        System.out.println("Enter type ");
        String type = scanner.nextLine();
        System.out.println("Enter max speed ");
        int maxSpeed = scanner.nextInt();

        if (auto_category.equals("Passenger")) {
            System.out.println("Enter passengers max ");
            int passengersMax = scanner.nextInt();
            Passenger newPassenger = new Passenger(brand, type, maxSpeed, passengersMax);
            carList.add(newPassenger);
        }
        if (auto_category.equals("Cargo")) {
            System.out.println("Enter luggage ");
            int cargoTon = scanner.nextInt();
            Cargo newCargo = new Cargo(brand, type, maxSpeed, cargoTon);
            carList.add(newCargo);
        }
        if (auto_category.equals("Racing")) {
            System.out.println("Enter accelerationToOneHundred");
            int accelerationToOneHundred = scanner.nextInt();
            System.out.println("Enter power");
            int power = scanner.nextInt();
            Racing newRacing = new Racing(brand, type, maxSpeed, accelerationToOneHundred, power);
            carList.add(newRacing);
        }
        if (auto_category.equals("Sports")) {
            System.out.println("Enter accelerationToOneHundred");
            int acceleration = scanner.nextInt();
            Sports newSports = new Sports(brand, type, maxSpeed, acceleration);
            carList.add(newSports);
        }

        for (Car a : carList) {
            carList1.add(a);
        }
        util.save(carList1);

        menu();
    }
}