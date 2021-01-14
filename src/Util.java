import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Util {

    public void save(Object o) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\123\\Downloads\\save.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(o);
        objectOutputStream.close();
    }

    public void ride () throws IOException {
        FileInputStream fileInputStream= new FileInputStream("C:\\Users\\123\\Downloads\\save.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream);
    }

    public void save() {
    }
}
