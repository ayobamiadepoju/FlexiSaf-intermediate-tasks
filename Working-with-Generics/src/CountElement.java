import checkers.Check;

import java.util.Collection;

public class CountElement {
    public static <T> int count(Collection<T> collection, Check check){
        int count = 0;
        for (T element : collection) {
            if (check.test(element)) {
                count++;
            }
        }
        return count;
    }
}
