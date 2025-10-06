package dateTimeFunc;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

public class Friday13thChecker implements TemporalQuery<Boolean> {

    @Override
    public Boolean queryFrom(TemporalAccessor date) {
        return (date.get(ChronoField.DAY_OF_MONTH) == 13) &&
                (date.get(ChronoField.DAY_OF_WEEK) == 5);
    }

    public static boolean isFriday13th(LocalDate date){
        return date.query(new Friday13thChecker());
    }

    public static void checkFriday13th(LocalDate date){
        Friday13thChecker checker = new Friday13thChecker();
        boolean isFriday13th = date.query(checker);

        System.out.println(date + " " + date.getDayOfWeek());
        String answer = isFriday13th ? "YES!" : "No";
        System.out.println("Does the date occur on Friday the 13th? " + answer);
        System.out.println();
    }
}