package vehicles;

public class ElectricCar extends Car{
    int batteryCapacity;

    public ElectricCar(String model, String license, String color, int year, String ownerName, int insuranceNumber, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber);
        set_engineType("Electric");
        this.batteryCapacity = batteryCapacity;
    }


    public int get_batteryCapacity() {
        return batteryCapacity;
    }


    public void set_batteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }


    public void output(ElectricCar car) {
        System.out.println();
        System.out.println("Model: " + car.get_model());
        System.out.println("License: " + car.get_license());
        System.out.println("Color: " + car.get_color());
        System.out.println("Year: " + car.get_year());
        System.out.println("Owner: " + car.get_ownerName());
        System.out.println("Insurance Number: " + car.get_insuranceNumber());
        System.out.println("Engine Type: " + car.get_engineType());
        System.out.println("Battery Capacity: " + car.get_batteryCapacity());
        System.out.println();
    }
}
