import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
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
    }
}