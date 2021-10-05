package testautomation.learningcollections;

import java.util.*;

public class Main {

    /**
     * Collections Framework
     *
     * Set - Unordered unique elements, cannot contain duplicates
     *
     * List - Ordered elements which can be accessed at any position
     *
     * Queue - Ordered elements for processing. Access in the order
     *         elements were added. FIFO (First In, First Out)
     *
     * Map - Not a true collection (Doesn't inherit Collections interface) but contains collection-like
     *       operations allowing it to be used as collections.
     *       Unordered unqiue key-value pairs
     *
     */

    public static void main(String[] args) {

        Set<String> superheroes = new HashSet();
        superheroes.add("Batman");
        superheroes.add("Superman");
        superheroes.add("Spiderman");
        superheroes.add("Wonder Woman");

        List<String> villians = new ArrayList();
        villians.add("Joker");
        villians.add("Venom");
        villians.add("Dr. Doom");
        villians.add("Lex Luthor");

        System.out.println(superheroes.size()); //size of 4
        System.out.println(superheroes);
        System.out.println(villians.get(2));

        //Common implementations are LinkedLists and PriorityQueue
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("peach");

        System.out.println(fruits.size()); //4
        System.out.println(fruits); //[apple, banana, orange, peach]

        fruits.remove(); //[banana, orange, peach] removes the first element
        System.out.println(fruits.peek()); //banana, returns the head of the queue

        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17); //since it already exits map will update the first entry

        System.out.println(fruitCalories.size()); //4
        System.out.println(fruitCalories.get("lemon")); //returns its value of 17
        System.out.println(fruitCalories.entrySet()); // returns the maps entries
        System.out.println(fruitCalories.keySet()); // returns the keys in the map
        System.out.println(fruitCalories.values()); //returns the values of map

        //using the list of method makes the list immutable (cannot be changed)
        //of method returns an immutable list containing three elements
        List unchangeableList = List.of("apple juice", "lemonade", "smoothie");
        //unchangeableList.add("orange juice"); //throws error UnsupportedOperationException

        //var keyword allows local variable type inference. Means the type for the
        //local variable will be inferred by the compiler so no need to declare it
        var i = superheroes.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        for (String villian : villians){
            System.out.println(villian);
        }

        //working with lambda <-- accepted as Comparator type
        //fruits.forEach(x -> System.out.println(x) );
        fruits.forEach(System.out::println); //works the same as ^^^ but more clean

        for (var entry : fruitCalories.entrySet()){
            System.out.println(entry.getValue()); //gets values of map
        }

        fruitCalories.forEach(
                (k ,v) -> System.out.println("Fruit: " + k + " Calories: " + v)
        );




    }
}
