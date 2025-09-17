interface Colorable{
    public void howToColor();
}

public class Square extends GeometricObject implements Colorable{
    private double side = 0;

    public Square() {}

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public void howToColor(){
        System.out.println("Color all four sides");
    }

    public double getArea(){
        return side * side;
    }
}
