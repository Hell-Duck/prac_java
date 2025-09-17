package app;

import java.util.Scanner;
import vehicles.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на авторынок)");
        Scanner input = new Scanner(System.in);
        String owner, model, license, color;
        int choice, year, number, exit, batteryCapacity;
        Car car = null;
        ElectricCar electricCar = null;
        int flag = 0;
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
                System.out.println("Какую машину продаете?\n1. Нормальную;\n2. Электричку.");
                choice = input.nextInt();
                if (choice == 1)
                {
                    flag = 1;
                    car = new Car(model, license, color, year, owner, number);
                    car.output();
                }
                else
                {
                    flag = 2;
                    System.out.println("Введите емкость аккумулятора: ");
                    batteryCapacity = input.nextInt();
                    electricCar = new ElectricCar(model, license, color, year, owner, number, batteryCapacity);
                    electricCar.output();
                }
                System.out.println("The manager made a mistake and entered incorrect data, correct it:");
                if (flag == 1)
                {
                    System.out.println("Change production years:");
                    year = input.nextInt();
                    car.set_year(year);
                    System.out.println("Change owner name:");
                    owner = input.next();
                    car.set_ownerName(owner);
                    System.out.println("Change your insurance number:");
                    number = input.nextInt();
                    car.set_insuranceNumber(number);
                }
                else {
                    System.out.println("Change production years:");
                    year = input.nextInt();
                    electricCar.set_year(year);
                    System.out.println("Change owner name:");
                    owner = input.next();
                    electricCar.set_ownerName(owner);
                    System.out.println("Change your insurance number:");
                    number = input.nextInt();
                    electricCar.set_insuranceNumber(number);
                }
            }
        }while (exit != 2);
    }
}

