package lk.ijse.pesala_x;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedMain {
    public static void main(String[] args) {
        Person person = null;

        try (FileInputStream fileInputStream = new FileInputStream("person.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            person = (Person) objectInputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Person class not found");
            c.printStackTrace();
        }

        System.out.println("Deserialized Person...");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("City: " + person.getCity());
    }
}
