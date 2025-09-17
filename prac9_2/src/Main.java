import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenericStack stack = new GenericStack();
        System.out.println("Enter first string: ");
        String s = input.nextLine();
        stack.push(s);
        System.out.println("Enter second string: ");
        s = input.nextLine();
        stack.push(s);
        System.out.println("Enter third string: ");
        s = input.nextLine();
        stack.push(s);
        System.out.println("Enter fourth string: ");
        s = input.nextLine();
        stack.push(s);
        System.out.println("Enter fifth string: ");
        s = input.nextLine();
        stack.push(s);
        for(int i = stack.getSize() - 1; i >= 0; i--)
            System.out.println(stack.pop());

    }
}