public class ExceptionsStudyTest {
    public static void main(String[] args) {

//        try{
//            ExceptionsStudy study = new ExceptionsStudy();
//            System.out.println(Integer.parseInt(study.maybeAnInteger));//This runs because the string is "42" hence maybeAnInteger
//            System.out.println(Integer.parseInt(study.definitelyNotAnInteger)); //Error because this is for sure a string
//        } catch(NumberFormatException e){
//            e.printStackTrace(); //More details on error
//        System.out.println("Oh no!! That did not work!"); //runs because in line 7 there is an error.
//        }
        ExceptionsStudy study = new ExceptionsStudy();
//        study.askForAnInteger();
//        study.aMoreComplexAskForInteger();
        try {
            study.echoWord();
        } catch (IllegalArgumentException iae) {
            System.out.println("Rude!");
        }
    }
}

