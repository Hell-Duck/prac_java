public abstract class Beverage {
    final void prepare() {//не оченб понимаю зачем это нужно
        boil_water();
        add_main_ingredient();
        pour_water();
        add_additional_ingredient();
    }
    void boil_water() { System.out.println("Boil water"); }
    abstract void pour_water();
    abstract void add_main_ingredient();
    abstract void add_additional_ingredient();
}
