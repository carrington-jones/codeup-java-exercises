package shapes;

public class Square extends Quadrilateral{
    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    public double getArea(){
        return length * length;
    }

    public double getPerimeter(){
        return 4 * length;
    }


    //---OLD EXERCISE---//
//    public Square (int side){
//        super(side, side);
//    }
//    @Override
//    public int getArea(){
//    return (int) (Math.pow(this.length, 2)); //this.length is inherited from Rectangle class because of extends
//    }
//
//    @Override
//    public int getPerimeter(){
//    return 4 * this.length;
//    }

    //----Start of Interfaces and Abstract Classes Exercises----//


}
