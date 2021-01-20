import java.io.*;
import java.util.ArrayList;

public class Util {

    public void save(ArrayList<Car> o)  {
        try {
            FileOutputStream outputStream;
            ObjectOutputStream objectOutputStream;
            outputStream = new FileOutputStream("C:\\Users\\123\\Downloads\\save.txt");
            objectOutputStream = new ObjectOutputStream(outputStream);
            for (Car obj : o) {
                objectOutputStream.writeObject(obj);
            }
            objectOutputStream.close();
            outputStream.close();
        } catch (Exception ex) {
            System.out.println("failed to write" + ex);
        }
    }

    public void ride(ArrayList<Car> carList) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\123\\Downloads\\save.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        while (true) {
            try {
                Car car = (Car) objectInputStream.readObject();
                System.out.println(car);
            } catch (Exception ex) {
                System.out.println("end of object file  ");
                break;
            }
        }
    }
}
