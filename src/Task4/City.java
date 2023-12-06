package Task4;


import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class City {

    private String cityName;
    private String streetName;
    private int buildingNumber;
    private String size;

    public City(String cityName, String streetName, int buildingNumber, String size) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.size = size;
    }


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public static void main(String[] args) {

        Gson gson = new Gson();

        City city = new City("Kiev", "Instytutska", 3, "big");
        String path = "/Users/alexandrzhidkov/Documents/УчебаJava/Курс/JavaAdvanced/Lesson7/HW7/HomeWork7Adv/src/InfoTask4/city2.json";


        try {
            gson.toJson(city, new FileWriter(path));
            String jsonInString = gson.toJson(city);
            System.out.println(jsonInString);
            System.out.println("ok");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
