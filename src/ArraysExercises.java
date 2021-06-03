import java.util.Arrays;

public class ArraysExercises {

    public static Object addPerson (Person[] x, String name){
        int newLength = x.length +1;
        Person[] copy = Arrays.copyOf(x, newLength);
        System.out.println(copy.length);
        copy[copy.length-1] = new Person(name);
        System.out.println();
        for (Person name1 : copy) {
            System.out.println(name1.getName());
        }
        return Arrays.toString(copy);
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person[] people = new Person[3];

        people[0] = new Person("Greg");
        people[1] = new Person("Stephen");
        people[2] = new Person("Clark");

        for (Person name : people) {
            System.out.println(name.getName());
        }

        addPerson(people,"Steven");

    }
}

