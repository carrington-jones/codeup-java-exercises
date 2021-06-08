package Annotations;
@SuppressWarnings("all") //Tells everything to shutup
public class Fruit implements Food{
    private String flavor;

    @Deprecated
    private boolean hasFlesh;

    private boolean eatableSeeds;

    @Override
    public String taste(){
        return this.flavor;
    }

    public static void main(String[] args) {
        Fruit lime = new Fruit();
        lime.hasFlesh = true;
        lime.flavor = "Sour";
        System.out.println(lime.taste());

    }


}
