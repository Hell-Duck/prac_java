public class Main {
    public static void main(String[] args) {
        Order order1 = new Order.OrderBuilder()
                .set_mainDish("Стейк")
                .set_Garnish("Картофельное пюре")
                .set_Drink("Красное вино")
                .set_Dessert("Тирамису")
                .build();

        Order order2 = new Order.OrderBuilder()
                .set_mainDish("Курица гриль")
                .set_Garnish("Салат Цезарь")
                .set_Drink("Минеральная вода")
                .build();

        Order order3 = new Order.OrderBuilder()
                .set_mainDish("Паста")
                .set_Garnish("Овощи на гриле")
                .set_Drink("Пиво")
                .set_Dessert("Чизкейк")
                .build();

        printOrderDetails(order1);
        printOrderDetails(order2);
        printOrderDetails(order3);
    }

    private static void printOrderDetails(Order order) {
        System.out.println("Заказ:");
        System.out.println("Основное блюдо: " + order.getMainDish());
        System.out.println("Гарнир: " + order.getGarnish());
        System.out.println("Напиток: " + order.getDrink());
        System.out.println("Десерт: " + order.getDessert());
        System.out.println("-----------------------");
    }
}
