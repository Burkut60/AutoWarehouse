import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Warehouse {
 public static void main(String[] args) throws IOException {
ArrayList<Car> listCar = new ArrayList<Car >();

 Passenger ps1 = new Passenger("Opel","Passenger",180, 5);
  Passenger ps2 = new Passenger("Bmw","Passenger",240, 5);
  Cargo cr1 = new Cargo("Maz","Cargo",120,2);
  Cargo cr2 = new Cargo("Belaz", "Cargo", 110, 2);
  Racing rc1 = new Racing("Seat","Racing",270,3,300);
  Sports sp1= new Sports("Bmw", "Sports", 400,3);

  listCar.add(ps1);
  listCar.add(ps2);
  listCar.add(cr1);
  listCar.add(cr2);
  listCar.add(rc1);
  listCar.add(sp1);

  listCar.remove(1);


for (Car a :listCar){
    System.out.println(a.type);

    FileWriter fileWriter = new FileWriter("ListCar.txt");
    for (Car car: listCar){
     String model = car.model;
     String tip = car.type;
     int maxSpeed = car.maxSpeed;
fileWriter.close();


    }

}
 }
}

