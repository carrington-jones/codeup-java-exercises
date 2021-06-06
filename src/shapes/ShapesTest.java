package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//         Rectangle box1 = new Rectangle(5,4);
//
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        //----Start of Interfaces and Abstract Classes Exercises----//

        Measurable myShape = new Rectangle(5, 10);
        Measurable myShape2 = new Square(5, 5);

        System.out.println("Your area is " + myShape.getArea());
        System.out.println("Your perimeter is " + myShape.getPerimeter());

        System.out.println("Your area is " + myShape2.getArea());
        System.out.println("Your perimeter is " + myShape2.getPerimeter());

    }
}
