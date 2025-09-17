import java.util.*;

public class Main {
    public static void main(String[] args) {
        double side1, side2, side3;
        String color;
        boolean filled;
        GeometricObject[] mas = new GeometricObject[5];
        mas[0] = new Square(2, "red", true);
        mas[1] = new Square(3, "black", true);
        mas[2] = new Square(4, "red", false);
        mas[3] = new Square(7, "yellow", true);
        mas[4] = new Square(10, "orange", false);

        for (int i = 0; i < mas.length; i++) {
            System.out.println(i + 1 + " square");
            System.out.println("Area: " + (mas[i]).getArea());
            if (mas[i].isFilled())
                ((Colorable)mas[i]).howToColor();
            System.out.println();
        }

    }
}