package checkers;

public class CheckPalindrome implements Check<Integer> {
    @Override
    public boolean test(Integer z) {
        String s = z.toString();
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
