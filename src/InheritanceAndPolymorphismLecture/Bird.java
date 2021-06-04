package InheritanceAndPolymorphismLecture;

//InheritanceAndPolymorphismLecture.Bird is the superclass

public class Bird {
    // can it fly
    private boolean canFly;

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    //what kind of bird?
    //The protected access modifier is like private, but not just for the class this instance variable is in also for all its subclasses. Only the class it's in or subclasses of the class it's in can access this variable.
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise() {


        System.out.print(this.getName() + " goes ");

    }

    public Bird() {
        System.out.println(" A Bird just got created!");
    }

    public void move() {
        System.out.println("Flap Flap");
    }
}
