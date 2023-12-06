package Task2;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Animal Cat = new Animal("Cat", 3, true, "meow");
        String storage = "/Users/alexandrzhidkov/Documents/УчебаJava/Курс/JavaAdvanced/Lesson7/HW7/HomeWork7Adv/src/InfoTask2/ForSer.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(storage);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {
            outputStream.writeObject(Cat);
        }

        fileOutputStream.close();
        System.out.println("Serialization has done");
        FileInputStream inStr =  new FileInputStream(storage);
        try(ObjectInputStream obs = new ObjectInputStream(inStr)){
            Animal DesAnimal = (Animal) obs.readObject();
            System.out.println("Deserialization");
            System.out.println(DesAnimal);
        }
        inStr.close();

    }
}