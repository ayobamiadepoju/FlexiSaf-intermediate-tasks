package checkers;

public class CheckOdd implements Check<Integer> {

    @Override
    public boolean test(Integer x) {
        if (x % 2 != 0){
            return true;
        }
        return false;
    }
}
