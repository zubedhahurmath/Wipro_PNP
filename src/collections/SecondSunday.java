package collections;


import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class SecondSunday {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now().plusMonths(1).withDayOfMonth(1);

        LocalDate secondSunday = date
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY))
                .plusWeeks(1);

        System.out.println(secondSunday);
    }
}