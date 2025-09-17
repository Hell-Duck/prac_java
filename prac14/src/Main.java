public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea:");
        tea.prepare();
        System.out.println();
        System.out.println("Making coffee:");
        coffee.prepare();
    }
}