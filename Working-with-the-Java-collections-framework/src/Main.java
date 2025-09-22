import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- ArrayList with Iterator ---");
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("grape");
        words.add("orange");
        words.add("pear");
        words.add("kiwi");

        System.out.println("Original list: " + words);
        System.out.println("Size of array after additions: " + words.size());
        System.out.println();

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.length() < 5) {
                iterator.remove();
            }
        }
        System.out.println("After removing short words (<5 letters): " + words);
        System.out.println("Size of array after deletions: " + words.size());
        System.out.println();

        List<String> modified = new ArrayList<>();
        iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            String updatedWord = word.replace("a", "");
            modified.add(updatedWord);
        }
        System.out.println("After removing 'a' from words: " + modified);
        System.out.println();


        ListIterator<String> lt = words.listIterator();
        while (lt.hasNext()){
            String element = lt.next();
            lt.set(element + " fruit");
        }
        System.out.print("Modified contents of words: ");

        iterator = words.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + ", ");
        }
        System.out.println();

        System.out.print("Modified list backwards: ");
        while(lt.hasPrevious()) {
            String element = lt.previous();
            System.out.print(element + ", ");
        }
        System.out.println();

        // LINKEDLIST with Iterator
        System.out.println("\n--- LinkedList with Iterator ---");

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("mango");
        fruits.add("pineapple");
        fruits.add("strawberry");
        fruits.add("papaya");

        System.out.println("Original LinkedList: " + fruits);

        Iterator<String> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            if (fruit.contains("p")) {   // remove fruits with 'p'
                fruitIterator.remove();
            }
        }
        System.out.println("After removing fruits with 'p': " + fruits);


        // HASHSET with Iterator
        System.out.println("\n--- HashSet with Iterator ---");

        Set<Integer> numbersSet = new HashSet<>();
        numbersSet.add(10);
        numbersSet.add(20);
        numbersSet.add(25);
        numbersSet.add(30);
        numbersSet.add(40);

        System.out.println("Original Set: " + numbersSet);

        Iterator<Integer> setIterator = numbersSet.iterator();
        while (setIterator.hasNext()) {
            int num = setIterator.next();
            if (num % 20 == 0) {   // remove multiples of 20
                setIterator.remove();
            }
        }
        System.out.println("After removing multiples of 20: " + numbersSet);


        // HASHMAP with Iterator
        System.out.println("\n--- HashMap with Iterator ---");

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        students.put(4, "Diana");

        System.out.println("Original Map: " + students);

// Iterate over entries
        Iterator<Map.Entry<Integer, String>> mapIterator = students.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, String> entry = mapIterator.next();
            if (entry.getKey() % 2 == 0) {   // remove students with even IDs
                mapIterator.remove();
            }
        }
        System.out.println("After removing even IDs: " + students);

    }
}