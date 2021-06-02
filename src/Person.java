public class Person {
    private String personName;

    public String getName() {
//TODO: return the person's name
        return this.personName;
    }

    public void setName(String name) {
//TODO: change the name property to the passed value
        personName = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello from " + personName);
    }

    //TODO: The class should have a constructor that accepts a `String` value and sets
    //the person's name to the passed string.
    public Person (String name){
        this.personName = name;
    }

    public static void main(String[] args) {
        //THIS IS TESTING CONSTRUCTOR
        Person p = new Person("Rudy");
        System.out.println(p.getName());
        p.setName("Rudolph");
        System.out.println(p.getName());
        p.sayHello();
    }
}
