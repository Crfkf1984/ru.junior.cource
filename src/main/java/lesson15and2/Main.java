package lesson15and2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        collectBirthDays(1984, 9, 3);
    }

    public static void collectBirthDays(int year, int month, int day) {
        SimpleDateFormat pattern = new SimpleDateFormat("dd.MM.yyyy - EE", Locale.US);
        int numb = 0;
        int today = new Date().getYear() + 1900;

        for (int i = year; i < today; i++) {

            System.out.println("" + numb + " - " + pattern.format(new Date(i - 1900, month - 1, day)));
        }

    }
}


