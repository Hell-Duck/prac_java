public class Main {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();
        stack.push(10);
        stack.push(20);
        System.out.println("Элемент на верхушке: " + stack.top());
        stack.pop();
        System.out.println("Пустой? " + stack.empty());
        System.out.println("Элементы: " + stack.toString());
    }
}