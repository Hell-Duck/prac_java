package vehicles;

interface ElectricVehicle{
    int get_batteryCapacity();

    void set_batteryCapacity(int batteryCapacity);
}

public class ElectricCar extends Car implements ElectricVehicle{
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


    public void output() {
        System.out.println();
        System.out.println("Model: " + this.get_model());
        System.out.println("License: " + this.get_license());
        System.out.println("Color: " + this.get_color());
        System.out.println("Year: " + this.get_year());
        System.out.println("Owner: " + this.get_ownerName());
        System.out.println("Insurance Number: " + this.get_insuranceNumber());
        System.out.println("Engine Type: " + this.get_engineType());
        System.out.println("Battery Capacity: " + this.get_batteryCapacity());
        System.out.println();
    }
}
