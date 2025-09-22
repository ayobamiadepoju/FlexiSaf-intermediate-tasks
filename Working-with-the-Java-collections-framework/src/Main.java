import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.length() < 5) {
                iterator.remove();
            }
        }

        System.out.println("After removing short words (<5 letters): " + words);

        List<String> modified = new ArrayList<>();
        iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            String updatedWord = word.replace("a", "");
            modified.add(updatedWord);
        }

        System.out.println("After removing 'a' from words: " + modified);
    }
}