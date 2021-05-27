public class MethodsLecture {

    public static void sayHello() {
        System.out.println("Sorry I am in a rush have a good day!");
    }

    public static void sayHello(String name) {
        System.out.printf("Hi, there my name is %s! Have a great day!%n", name);
    }

    public static void sayHello(String salutation, String name) {
        System.out.printf("%s, there my name is %s! Have a great day!%n", salutation, name);
    }

    public static void sayHello(int times){
        for (int i = 1; i <= times; i++){
            System.out.println("Hello darling!");
        }
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

//    public static String helloWorld(){ THIS WILL NOT RUN. Stating a string but asking to return int.
//        return 77;
//    }

    public static void bottlesOfCoke(String beverage, int numBottles) {
        if (numBottles == 0){
            System.out.printf("No more bottles of %s on the wall%nNo more bottles of %s%nStand up now, stumble around%nAll of the bottle of %s on the wall%n", beverage, beverage, beverage);
        } else if(numBottles == 1){
            System.out.printf("1 bottle of %s on the wall%n1 bottle of %s%nTake it down pass it around%nNo more bottles of %s on the wall", beverage, beverage, beverage);
            bottlesOfCoke(beverage, numBottles -1);
        } else if (numBottles == 2){
            System.out.printf("2 bottles of %s on the wall%n2 bottles of %s%nTake it down pass it around%n1 bottle of %s on the wall%n", beverage, beverage, beverage);
            bottlesOfCoke(beverage, numBottles -1);
        } else {
            System.out.printf("%d bottles of %s on the wall%n%d bottles of %s%nTake 1 down pass it around%n%d bottles of %s on the wall%n", numBottles, beverage, numBottles, beverage, numBottles -1, beverage);
            bottlesOfCoke(beverage, numBottles -1);
        }
    }


    public static void main(String[] args) {
        sayHello();
        sayHello("Carrington");
        sayHello("Howdy", "Carrington");
        sayHello(4);
        System.out.println(multiply(5, 2));
        bottlesOfCoke("coke",10);
    }
}
