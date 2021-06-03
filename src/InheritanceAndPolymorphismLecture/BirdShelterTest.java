package InheritanceAndPolymorphismLecture;

import InheritanceAndPolymorphismLecture.Bird;
import InheritanceAndPolymorphismLecture.BirdLover;
import InheritanceAndPolymorphismLecture.BirdShelter;

public class BirdShelterTest {
    public static void main(String[] args) {
        //polymorphic array
        //polymorphic means many shapes
        Bird[] birds = new Bird[3];
        birds[0] = new Finch();
        birds[0].setName("Finch");
        birds[1] = new Duck();
        birds[1].setName("Mallard");
        birds[2] = new Penguin();
        birds[2].setName("Emperor Penguin");

//        for (int i = 0; i < birds.length; i++){
//            birds[i].makeNoise();
//        }
        BirdShelter healingWings = new BirdShelter();
        healingWings.shelterSounds(birds);

        BirdLover Bob = new BirdLover();
        Bob.takeBirdToVet(birds[1]);

    }
}
