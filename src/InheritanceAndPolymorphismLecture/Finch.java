package InheritanceAndPolymorphismLecture;

import InheritanceAndPolymorphismLecture.Bird;

public class Finch extends Bird {
//inherits make noise from bird

    public void makeNoise() {
//        super.makeNoise();
        System.out.println(this.getName() + " goes Tweet Tweet!");
    }

    public Finch() {
        System.out.println(" A Finch just got created!");
    }


}
