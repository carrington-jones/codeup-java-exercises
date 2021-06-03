package InheritanceAndPolymorphismLecture;

import InheritanceAndPolymorphismLecture.Bird;

public class BirdLover {
    public void takeBirdToVet(Bird ouchyBird) {
        BirdVet drCarrington = new BirdVet();
        drCarrington.careForBird(ouchyBird);
    }
}
