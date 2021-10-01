package lesson6and4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int pazient = 10;
        double min = 32;
        double max = 40;
        double res = Math.random() * ((max - min) + 1) + min;
        double temperatura = 0;
        int count = 0;
        for (int i = 0; i < pazient; i++) {
            double numb = Math.round(Math.random() * ((max - min) + 1) + min);
            temperatura = (double) Math.round(res * 100) / 100;

            if ((Math.abs(temperatura - 36.2) >= 1e-7) && (Math.abs(temperatura - 36.9)  >= 1e-7)) {
                count++;
            }

            temperatura += temperatura;
            System.out.print((double) Math.round(res * 100) / 100 + " ");
        }
        System.out.println();
        double sredneeZnachenieTemperatur = temperatura / pazient;
        System.out.println("средняя температура " + (double) Math.round(sredneeZnachenieTemperatur * 100) / 100);
        System.out.println("Количество здоровых пациентов " + count);
    }
}
