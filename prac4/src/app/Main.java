package app;

import java.util.Scanner;
import vehicles.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на авторынок)");
        Scanner input = new Scanner(System.in);
        String owner, model, license, color;
        int choice, year, number, exit, batteryCapacity;
        Car car;
        ElectricCar electricCar;
        do{
            System.out.println("Продадим машину?\n1. да;\n2. нет.");
            exit = input.nextInt();
            if (exit == 1)
            {
                System.out.println("Введите модель: ");
                model = input.next();
                System.out.println("Введите номер лицензии: ");
                license = input.next();
                System.out.println("Введите цвет машины: ");
                color = input.next();
                System.out.println("Введите год выпуска: ");
                year = input.nextInt();
                System.out.println("Введите имя покупателя: ");
                owner = input.next();
                System.out.println("Введите номер страховки: ");
                number = input.nextInt();
                System.out.println("Какую машину покупает?\n1. Нормальную;\n2. Электричку.");
                choice = input.nextInt();
                if (choice == 1)
                {
                    car = new Car(model, license, color, year, owner, number);
                    car.set_engineType("ДВС");
                    car.output(car);
                }
                else
                {
                    System.out.println("Введите емкость аккумулятора: ");
                    batteryCapacity = input.nextInt();
                    electricCar = new ElectricCar(model, license, color, year, owner, number, batteryCapacity);
                    electricCar.output(electricCar);
                }
            }
        }while (exit != 2);
    }
}

