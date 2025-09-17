package vehicles;

public class Car extends Vehicle {
    public Car(String model, String license, String color, int year, String ownerName, int insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber);
        set_engineType("Combustion");
    }

    public void output() {
        System.out.println();
        System.out.println("Паспорт машины:");
        System.out.println("Model: " + this.get_model());
        System.out.println("License: " + this.get_license());
        System.out.println("Color: " + this.get_color());
        System.out.println("Year: " + this.get_year());
        System.out.println("Owner: " + this.get_ownerName());
        System.out.println("Insurance Number: " + this.get_insuranceNumber());
        System.out.println("Engine Type: " + this.get_engineType());
        System.out.println();
    }

}




