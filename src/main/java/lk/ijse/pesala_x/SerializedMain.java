package lk.ijse.pesala_x;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedMain {
    public static void main(String[] args) {
        Person person =new Person("Sumane", 55,"Galle");

        try (FileOutputStream fileOutputStream = new FileOutputStream("person.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(person);
            System.out.println("Serialized data is saved in person.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
