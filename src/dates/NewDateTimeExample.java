package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class NewDateTimeExample {

    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2000,04,21);

        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getDayOfYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getYear());
        System.out.println(date1.get(ChronoField.DAY_OF_MONTH));

        //Modifying
    }
}
