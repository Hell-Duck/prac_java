package vehicles;

public class Car extends Vehicle {
    public Car(String model, String license, String color, int year, String ownerName, int insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber);
        set_engineType("Combustion");
    }

    public void output(Car car) {
        System.out.println();
        System.out.println("Паспорт машины:");
        System.out.println("Model: " + car.get_model());
        System.out.println("License: " + car.get_license());
        System.out.println("Color: " + car.get_color());
        System.out.println("Year: " + car.get_year());
        System.out.println("Owner: " + car.get_ownerName());
        System.out.println("Insurance Number: " + car.get_insuranceNumber());
        System.out.println("Engine Type: " + car.get_engineType());
        System.out.println();
    }

}




