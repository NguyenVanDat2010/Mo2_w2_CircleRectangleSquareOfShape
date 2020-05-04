public class Square extends Rectangle {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
//        super.setWidth(width); //Sai
        setSide(width);
    }

    @Override
    public void setLength(double length) {
//        super.setLength(length); //Sai
        setSide(length);
    }

    @Override
    public String toString() {
        return "A square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}
