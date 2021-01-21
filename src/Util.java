import java.io.*;
import java.util.ArrayList;

public class Util {

    public void save(ArrayList<Car> o) {
        try {
            File myFile = new File("C:\\Users\\123\\Downloads\\save.txt");
            if (!myFile.exists()) {
                myFile.createNewFile();
            } else {
                System.out.println("File already exists ");
            }

            FileOutputStream outputStream = new FileOutputStream(myFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            for (Car myObj : o) {
                objectOutputStream.writeObject(myObj);
            }

            objectOutputStream.close();
            outputStream.close();
        } catch (Exception ex) {
            System.out.println("failed to write" + ex);
        }
    }

    public void ride() throws IOException {
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
