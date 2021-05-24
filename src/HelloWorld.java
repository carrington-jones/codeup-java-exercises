public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.print(", World!");

        //1.
        int myFavNum = 21;
        System.out.println(myFavNum);
        //2.
        String myString = "This is my string";
        System.out.println(myString);
        //3.
//        char myString = 'c';
        //4.
        //myString = (int) 3.14159;
        //5.
        long myNumber;
//        System.out.println(myNumber);
        //6.
//        myNumber = 3.14;
        //7.
        myNumber = 123L;
        //8.
        myNumber = 123;
        //9.
        float myNumber = (float) 3.14F;
        //10.
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        int y = 5;
        System.out.println(++y);
        System.out.println(y);
        //11.
        //Cannot name because it is reserved
        //12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        //13.
        int a = 4;
        a += 5;

        int x2 = 3;
        int y2 = 4;
        y2 *= x2;

        int x3 = 10;
        int y3 = 2;
        x3 /= y3;
        y3 -= x3;

        //14.
        int longNumber = Integer.MAX_VALUE;
        System.out.println(longNumber);
    }
}
