package Task2;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private int age;
    private boolean hasTail;

    private String voice;

    public Animal(String aName, int aAge, boolean aHasTail, String aVoice){
        this.name = aName;
        this.age = aAge;
        this.hasTail = aHasTail;
        this.voice = aVoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Our Cat has Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasTail=" + hasTail +
                ", voice='" + voice + '\'' +
                '}';
    }
}
