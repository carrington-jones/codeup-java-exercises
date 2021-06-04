package shapes;

public class Square extends Rectangle{

    public Square (int side){
        super(side, side);
    }
    @Override
    public int getArea(){
    return (int) (Math.pow(this.length, 2)); //this.length is inherited from Rectangle class because of extends
    }

    @Override
    public int getPerimeter(){
    return 4 * this.length;
    }

}
