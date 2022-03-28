import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class DateTest {
    public static void main(String[] args) {

        Object result = LocalDate
                .of(2022, Month.MARCH, 27)
                .with(TemporalAdjusters.next(DayOfWeek.FRIDAY))

//                .getDayOfWeek()
                ;
        System.out.println("result " + result);
    }
}
