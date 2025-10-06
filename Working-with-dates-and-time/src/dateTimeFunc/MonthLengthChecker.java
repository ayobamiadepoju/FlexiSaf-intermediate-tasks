package dateTimeFunc;

import java.time.Month;
import java.time.YearMonth;

public class MonthLengthChecker {

    public static void checkMonthLength(int year){

        System.out.println("Month lengths for year " + year + ":");
        for (Month month : Month.values()){
            YearMonth ym = YearMonth.of(year, month);
            System.out.printf("%s: %d %n", month , ym.lengthOfMonth());
        }
        System.out.println();
    }
}
