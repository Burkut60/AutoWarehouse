import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse {

    static ArrayList<Car> carList1 = new ArrayList<>();
    static Util util = new Util();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        menu();
    }

    public static void menu() throws IOException, ClassNotFoundException {

        util.ride(carList1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("add auto enter 1, view the list enter 2, to delete auto index enter1 3 ");
        int warehouseActivities = scanner.nextInt();

        if (warehouseActivities == 1) {
            car();
        }

        if (warehouseActivities == 2) {
            util.ride(carList1);
        }

        menu();

        if (warehouseActivities == 3) {
            System.out.println("\n" +
                    "Enter the index of the object to be deleted");
            int ind = scanner.nextInt();
            carList1.remove(ind);
            menu();
        }
    }

    public static void car() throws IOException, ClassNotFoundException {
        ArrayList<Car> carList = new ArrayList<>();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the car category" + "\n " + "Passenger , Cargo, Racing, Sports");
        String auto_category = scanner1.nextLine();
        System.out.println("Enter car brand");
        String brand = scanner1.nextLine();
        System.out.println("Enter type ");
        String type = scanner1.nextLine();
        System.out.println("Enter max speed ");
        int maxSpeed = scanner1.nextInt();

        if (auto_category.equals("Passenger")) {
            System.out.println("Enter passengers max ");
            int passengersMax = scanner1.nextInt();
            Passenger newPassenger = new Passenger(brand, type, maxSpeed, passengersMax);
            carList.add(newPassenger);
        }
        if (auto_category.equals("Cargo")) {
            System.out.println("Enter luggage ");
            int cargoTon = scanner1.nextInt();
            Cargo newCargo = new Cargo(brand, type, maxSpeed, cargoTon);
            carList.add(newCargo);
        }
        if (auto_category.equals("Racing")) {
            System.out.println("Enter accelerationToOneHundred");
            int accelerationToOneHundred = scanner1.nextInt();
            System.out.println("Enter power");
            int power = scanner1.nextInt();
            Racing newRacing = new Racing(brand, type, maxSpeed, accelerationToOneHundred, power);
            carList.add(newRacing);
        }
        if (auto_category.equals("Sports")) {
            System.out.println("Enter accelerationToOneHundred");
            int acceleration = scanner1.nextInt();
            Sports newSports = new Sports(brand, type, maxSpeed, acceleration);
            carList.add(newSports);
        }

        for (Car a : carList) {
            carList1.add(a);
            util.save(carList1);
        }

        menu();
    }
}