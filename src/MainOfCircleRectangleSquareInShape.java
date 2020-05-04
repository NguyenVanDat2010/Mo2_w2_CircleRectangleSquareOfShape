public class MainOfCircleRectangleSquareInShape {
    public static void main(String[] args) {
        //Shape------------------------------------------------------
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("Red", false);
        System.out.println(shape);

        //Circle------------------------------------------------------
        Circle circle=new Circle();
        System.out.println(circle);

        circle=new Circle(5,"Blue",false);
        System.out.println(circle);

        //Rectangle------------------------------------------------------
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);

        rectangle=new Rectangle(8,9,"Brown",false);
        System.out.println(rectangle);

        //Square------------------------------------------------------
        Square square=new Square();
        System.out.println(square);

        square=new Square(7,"Yellow",false);
        System.out.println(square);
    }
}
