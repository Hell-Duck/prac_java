public class Order{
    private String mainDish;
    private String Garnish;
    private String Drink;
    private String Dessert;

    public Order(OrderBuilder orderBuilder){
        mainDish = orderBuilder.mainDish;
        Garnish = orderBuilder.Garnish;
        Drink = orderBuilder.Drink;
        Dessert = orderBuilder.Dessert;
    }

    public String getMainDish() {
        return mainDish;
    }

    public String getGarnish() {
        return Garnish;
    }

    public String getDrink() {
        return Drink;
    }

    public String getDessert() {
        return Dessert;
    }

    public static class OrderBuilder{
        private String mainDish;
        private String Garnish;
        private String Drink;
        private String Dessert;

        public OrderBuilder set_mainDish(String mainDish){
            this.mainDish = mainDish;
            return this;
        }
        public OrderBuilder set_Garnish(String Garnish){
            this.Garnish = Garnish;
            return this;
        }
        public OrderBuilder set_Drink(String Drink){
            this.Drink = Drink;
            return this;
        }
        public OrderBuilder set_Dessert(String Dessert){
            this.Dessert = Dessert;
            return this;
        }
        public Order build(){
            return new Order(this);
        }

    }
}