import java.util.*;

public class Main {
    public static void main(String[] args) {
        double side1, side2, side3;
        String color;
        boolean filled;
        Triangle triangle;
        Scanner input = new Scanner(System.in);

        System.out.println("Create the first triangle: ");
        System.out.print("Enter the side1: ");//как отлавливать некорректный ввод? с помощью try?
        side1 = input.nextDouble();
        System.out.print("Enter the side2: ");
        side2 = input.nextDouble();
        System.out.print("Enter the side3: ");
        side3 = input.nextDouble();
        System.out.print("Triangle color: ");
        color = input.next();
        System.out.print("Filled: ");
        filled = input.nextBoolean();
        triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println("Create the second triangle: ");
        Triangle triangle_2;
        System.out.print("Enter the side1: ");
        side1 = input.nextDouble();
        System.out.print("Enter the side2: ");
        side2 = input.nextDouble();
        System.out.print("Enter the side3: ");
        side3 = input.nextDouble();
        System.out.print("Triangle color: ");
        color = input.next();
        System.out.print("Filled: ");
        filled = input.nextBoolean();
        triangle_2 = new Triangle(side1, side2, side3, color, filled);

        System.out.println("Largest triangle: " + GeometricObject.max(triangle, triangle_2).toString());
    }
}
