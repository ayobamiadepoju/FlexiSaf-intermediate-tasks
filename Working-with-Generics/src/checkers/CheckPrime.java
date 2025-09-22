package checkers;

public class CheckPrime implements Check<Integer> {
    @Override
    public boolean test(Integer y) {
        if (y < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(y); i++){
            if (y % i == 0)
                return false;
        }
        return true;
    }
}
