import dateTimeFunc.Friday13thChecker;
import dateTimeFunc.MondayChecker;
import dateTimeFunc.MonthLengthChecker;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    MonthLengthChecker.checkMonthLength(2024);
    MonthLengthChecker.checkMonthLength(2025);
    MondayChecker.checkMondays(10);
    MondayChecker.checkMondays(12);
    Friday13thChecker.checkFriday13th(LocalDate.of(2025, 10, 13));
    Friday13thChecker.checkFriday13th(LocalDate.of(2025,6,13));
    }
}