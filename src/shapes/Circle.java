package shapes;

public class Circle {

 private double radius;

    public Circle(double radius1){
        this.radius = radius1;
    }

    public void setRadius(double radius1){
        radius = radius1;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return (Math.PI * (radius * radius));
    }

    public double getCircumference(){
        return (2 * Math.PI * radius);
    }

}
