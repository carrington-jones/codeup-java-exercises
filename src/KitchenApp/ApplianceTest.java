package KitchenApp;

//Abstract class
//Can serve as a superclass, but we can't directly instantiate an abstract class

public class ApplianceTest {
    public static void main(String[] args) {
        //Will get an error by trying to directly instantiate an abstract class
//        Appliance app1 = new Appliance();

//        Appliance app1 = new Fridge("two door", "LG");

        Fridge app1 = new Fridge("two door", "LG", true);

//        System.out.println(app1.brandName);
//        System.out.println(app1.type);
//        System.out.println(app1.isHasIce());
//        app1.sayHello();
//        app1.keepFresh();

        IceChest ichest = new IceChest();

        ichest.keepFresh();

    }
}
