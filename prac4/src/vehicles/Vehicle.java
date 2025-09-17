package vehicles;

import java.util.Objects;

public class Vehicle{
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private int insuranceNumber;
    protected String engineType;


    public Vehicle(String model, String license, String color, int year, String ownerName, int insuranceNumber) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }



    public int get_year(){
        return year;
    }
    public String get_model(){
        return model;
    }
    public String get_license(){
        return license;
    }
    public String get_color(){
        return color;
    }
    public String get_ownerName(){
        return ownerName;
    }
    public int get_insuranceNumber(){
        return insuranceNumber;
    }
    public String get_engineType(){
        return engineType;
    }


    public String vehicleType(Vehicle vehicle){
        if (Objects.equals(vehicle.engineType, "Electric"))
            return "Electric";
        else
            return "Combustion";
    }


    public void set_year(int year){
        this.year = year;
    }
    public void set_model(String model){
        this.model = model;
    }
    public void set_license(String license){
        this.license = license;
    }
    public void set_color(String color){
        this.color = color;
    }
    public void set_ownerName(String ownerName){
        this.ownerName = ownerName;
    }
    public void set_insuranceNumber(int insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }
    public void set_engineType(String engineType){
        this.engineType = engineType;
    }
}
