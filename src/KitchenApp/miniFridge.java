package KitchenApp;

public class miniFridge extends Fridge implements StoreFood{
    public miniFridge(String type, String brandName, boolean hasIce){
        super(type, brandName, hasIce);
    }

    public void keepFresh(){
        System.out.println("I'm a fridge but I am smol");
    }

}
