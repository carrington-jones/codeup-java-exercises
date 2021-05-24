public class SyntaxTypesVarsLecture {
    public static void main(String[] args) {
        System.out.println("Hello, Douglas");
        {
            System.out.println("Look at me!");
            System.out.println("I'm in brackets!");
        }
        System.out.println("But I'm not...:-(");

        byte smallNumber = 34;
        System.out.println(smallNumber);

        short notAsSmallNumber = 30000;

        int num = 45000000;

        long largeNumber = 14;

        System.out.println(largeNumber);

        float decimal = 1.5F;

        double bigDecimal = 45;
        System.out.println(bigDecimal);

        char singleLetter = 'g';

        boolean amILearningJava = true;

        String message = "How's it going?\nEverything \"alright?\" Java isn't that scary is it?";
        System.out.println(message);

        int sum = 4 + 5;
        System.out.println(sum);

        int difference = 72 - 19;
        System.out.println(difference);

        int product = 11 * 9;
        System.out.println(product);

        int quotient = product / sum;
        System.out.println(quotient);

        int remainder = difference % sum;
        System.out.println(remainder);

//        CASTING
        int iAmAnInt = 44;
        long iAmALong = iAmAnInt;
        System.out.println(iAmALong);

        iAmALong = 99;
        iAmAnInt = (int) iAmALong;
        System.out.println(iAmAnInt);

        iAmAnInt = 27;
        double iAmADouble = iAmAnInt;
        System.out.println(iAmADouble); //Returns 27.0

        iAmADouble = 3.141598;
        iAmAnInt = (int) iAmADouble;
        System.out.println(iAmAnInt);


    }
}
