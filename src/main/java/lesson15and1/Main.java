package lesson15and1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        collectBirthDays(1984, 9, 3);
    }

    public static void collectBirthDays(int year, int month, int day) {
        DateTimeFormatter pattern =  DateTimeFormatter.ofPattern("dd.MM.yyyy");
        int numb = 0;
        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(year, month, day);

       while (!date.isAfter(today)) {
           int count = 0;
            count ++;
           System.out.println("" + numb + " - " + date.format(pattern) + " - " + date.getDayOfWeek());
           date = date.plusYears(count);
           numb++;
       }
    }
}
