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
    private String name;

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
