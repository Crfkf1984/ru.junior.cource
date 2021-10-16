package lesson15and3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
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
