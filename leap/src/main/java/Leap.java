import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

class Leap {

    boolean isLeapYear(int year) {
        //return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        return LocalDate.of(year, Month.FEBRUARY, 28).plusDays(1).getDayOfMonth() == 29;
        //return Year.isLeap(year);
    }
}
