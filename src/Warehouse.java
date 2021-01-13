import java.io.*;
import java.util.ArrayList;


public class Warehouse {
 public static void main(String[] args) throws IOException, ClassNotFoundException {

  ArrayList<Passenger> passengerList = new ArrayList<>();
  ArrayList<Cargo> cargoList = new ArrayList<>();
  ArrayList<Racing> racingList = new ArrayList<>();
  ArrayList<Sports> sportsList = new ArrayList<>();

 Passenger ps1 = new Passenger("Opel","Passenger",180, 5);
  Passenger ps2 = new Passenger("Bmw","Passenger",240, 5);
  Cargo cr1 = new Cargo("Maz","Cargo",120,2);
  Cargo cr2 = new Cargo("Belaz", "Cargo", 110, 2);
  Racing rc1 = new Racing("Seat","Racing",270,3,300);
  Sports sp1= new Sports("Bmw", "Sports", 400,3);

  passengerList.add(ps1);
  passengerList.add(ps2);
  cargoList.add(cr1);
  cargoList.add(cr2);
  racingList.add(rc1);
  sportsList.add(sp1);

  ArrayList<Object> a = new ArrayList<>();
  a.add(passengerList);
  a.add(cargoList);
  a.add(racingList);
  a.add(sportsList);

  FileOutputStream outputStream = new FileOutputStream("C:\\Users\\123\\Downloads\\save.txt");
  ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
  objectOutputStream.writeObject(a);

  objectOutputStream.close();

  FileInputStream fileInputStream= new FileInputStream("C:\\Users\\123\\Downloads\\save.txt");
  ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

  ArrayList< Cargo > carList  = (ArrayList) objectInputStream.readObject();

  System.out.println(carList);
 }
}

