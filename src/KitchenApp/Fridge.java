package KitchenApp;

import java.util.Scanner;

public class Fridge extends Appliance{

    private boolean hasIce;

    public boolean isHasIce() {
        return hasIce;
    }

    public void setHasIce(boolean hasIce) {
        this.hasIce = hasIce;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setbrandName(String brandName){
        this.brandName=brandName;
    }

    public Fridge(String type, String brandName, boolean hasIce){
        super(type, brandName);
        this.hasIce = hasIce;
    }

    public void keepFresh(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Would you like to put something in the fridge? Y/N");
        String userChoice = scanner.nextLine();
        while(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")){
            System.out.println("What would you like to keep in the fridge?");
            String item = scanner.nextLine();
            System.out.printf("Sounds good! I will keep your %s cold for you!\n", item);
            System.out.println("Would you like to put anything else in the fridge? Y/N");
            userChoice = scanner.nextLine();
        }
        System.out.println("Okay stay cool!");
    }

}
