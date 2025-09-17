import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12: ");
        try {
            int num = input.nextInt();
            if (num == 2) {
                System.out.println("Enter year: ");
                try {
                    int year = input.nextInt();
                    System.out.println(months[num - 1]);
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        System.out.println(29);
                    } else {
                        System.out.println(dom[num - 1]);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println(months[num - 1]);
                System.out.println(dom[num - 1]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}