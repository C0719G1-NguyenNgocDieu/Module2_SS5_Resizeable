public class TestResizeable {
    public static void main(String[] args) {
        int random = (int) Math.floor(Math.random() * 101);

        Shape shape1 = new Circle(3);
        Shape shape2 = new Rectangle("red", false, 3, 4);
        Shape shape3 = new Square("yellow", true, 2);
        Shape[] shapes = new Shape[]{shape1, shape2, shape3};
        for (Shape sh : shapes) {
            System.out.println(sh);
        }

        System.out.println("--------------------------");

        Circle circle = (Circle) shape1;
        circle.resize(random);
        Rectangle rectangle = (Rectangle) shape2;
        rectangle.resize(random);
        Square square = (Square) shape3;
        square.resize(random);
        for (Shape sh : shapes) {
            System.out.println(sh);
        }
    }
}
