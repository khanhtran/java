import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class HashCodeTest {
    public static void main(String[] args) {
        final String SPECIAL_STRING = "polygenelubricants";
        final int M = 1000;
//        int hash = Math.abs(SPECIAL_STRING.hashCode());
        int hash = SPECIAL_STRING.hashCode() & 0x7fffffff;
        System.out.println("hash code: " + SPECIAL_STRING.hashCode());
        System.out.println("positive hash code: " + (SPECIAL_STRING.hashCode() & 0x7fffffff));
        System.out.println("hashIndex: " + hash % M);
    }
}
