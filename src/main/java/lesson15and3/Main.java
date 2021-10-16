package lesson15and3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        collectBirthDays(1984, 9, 3);
    }

    public static void collectBirthDays(int year, int month, int day) {
        Calendar calendar = new GregorianCalendar(year, Calendar.SEPTEMBER, day);
        Calendar now = Calendar.getInstance();
        SimpleDateFormat pattern = new SimpleDateFormat("dd.MM.yyyy - EE", Locale.US);

        int count = 0;
        while (!calendar.after(now)) {
            int numb = 1;
            System.out.println("" + count++ + " - " + pattern.format(calendar.getTime()));
            calendar.add(Calendar.YEAR, numb++);
        }

    }
}
