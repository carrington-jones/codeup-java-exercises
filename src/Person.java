public class Person {
    private String personName;

    public Person(String name) {
        personName = name;
    }

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


    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
