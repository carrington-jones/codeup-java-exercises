import shapes.Square;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        ArrayList<Integer> collectionsOfNums = new ArrayList<>();
        collectionsOfNums.add(16);
        collectionsOfNums.add(44);
        collectionsOfNums.add(32);
        collectionsOfNums.add(1, 24); //Index is first argument and number element is second argument.

        for(int i = 0; i < collectionsOfNums.size(); i++){    //Notice .size and NOT .length
            System.out.println(collectionsOfNums.get(i));
        }

        System.out.println(collectionsOfNums);//Prints an array

        System.out.println(collectionsOfNums.contains(44));//Returns boolean of true
        System.out.println(collectionsOfNums.indexOf(44)); //Returns 2 which is the index 44
        System.out.println(collectionsOfNums.lastIndexOf(44));//Returns 2
        ArrayList<String> studentNames = new ArrayList<>();
        if (studentNames.isEmpty()) {
            System.out.println("Let's fill in the list of student names!");
        }
        System.out.println(collectionsOfNums);
        collectionsOfNums.remove((Integer) 44);//Removes the instance of 44
        System.out.println(collectionsOfNums);

        ArrayList stuff = new ArrayList();
        stuff.add("Beatrice");
        stuff.add(13);
        stuff.add(new Square(4, 5)); //Will not work

        for (Object thing : stuff){
            System.out.println(thing); //This is how you iterate through array with 2 different data types.
        }

        //-----HashMaps-----//

        HashMap<Character, Square> squares = new HashMap<>();//1st argument is key 2nd is the value
        squares.put('A', new Square(5,5));
        squares.put('B', new Square(10,10));
        Square sq = new Square(3, 3);

        System.out.println(squares.get('A').getArea());
        System.out.println(squares.getOrDefault('B', new Square(0,0)).getArea());
        System.out.println(squares.containsKey('B'));
        System.out.println(squares.containsValue(new Square(5,5)));//Comes out to false
        System.out.println(squares.containsValue(sq));
        //Replace and remove skip if they key has not been defined yet.//
        //squares.clear() will clear hashmap//
        //HashMap.entry is how you iterate through HashMaps//
    }
}
