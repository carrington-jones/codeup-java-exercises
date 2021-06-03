package InheritanceAndPolymorphismLecture;

public class Duck extends Bird {
//InheritanceAndPolymorphismLecture.Duck inherits InheritanceAndPolymorphismLecture.Bird here
//InheritanceAndPolymorphismLecture.Duck is the subclass of the InheritanceAndPolymorphismLecture.Bird superclass
//Overrides make noise from InheritanceAndPolymorphismLecture.Bird

    //When overriding you have to fulfill the protocol
    //The arguments must be the same, and return types compatible
    //If
    public void makeNoise() {
//        super.makeNoise();
        System.out.println(this.getName() + " goes Quack Quack!");
    }

}
