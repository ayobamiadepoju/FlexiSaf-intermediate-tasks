package dateTimeFunc;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class MondayChecker {

    public static void checkMondays(int month){

        System.out.println("List of Mondays in " + Month.of(month).toString() + " :");
        LocalDate date = Year.now().atMonth(month).atDay(1).
                with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        while (date.getMonthValue() == month){
            System.out.println(date + " " + date.getDayOfWeek());
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
        System.out.println();
    }
}