package InheritanceAndPolymorphismLecture;

import InheritanceAndPolymorphismLecture.Bird;

public class BirdTest {
    public static void main(String[] args) {
//    InheritanceAndPolymorphismLecture.Bird cardinal = new InheritanceAndPolymorphismLecture.Bird();
//    cardinal.setName("Cardinal");
//    cardinal.setCanFly(true);
//    cardinal.makeNoise();
//    cardinal.move();

        Duck mallard = new Duck();
        mallard.setName("Mallard");
        mallard.makeNoise();

        Finch lesserGoldFinch = new Finch();
        lesserGoldFinch.setName("InheritanceAndPolymorphismLecture.Finch");
        lesserGoldFinch.makeNoise();

        Penguin penguin = new Penguin();
        penguin.setName("Emperor InheritanceAndPolymorphismLecture.Penguin");
        penguin.setCanFly(false);
        penguin.move();
        penguin.makeNoise();

        //Polymorphism allows us to have different reference and object types
        Bird myPenguin = new Penguin();


        Finch houseFinch = new Finch();
    }
}
