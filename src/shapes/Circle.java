package shapes;

public class Circle {

 private int radius;

    public Circle(double radius){

    }

    public double getArea(){
        double area;
        return area = (Math.PI * (radius * radius));
    }

    public double getCircumference(){
        double circumference;
        return circumference = (2 * Math.PI * radius);
    }

}
