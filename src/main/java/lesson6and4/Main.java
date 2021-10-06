package lesson6and4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] pazient = new double[10];
        double min = 32;
        double max = 40;
        int count = 0;
        for (int i = 0; i < pazient.length; i++) {
            pazient[i] = Math.random() * ((max - min) + 1) + min;

            if ((pazient[i] >= 36.2) && (pazient[i]  <= 36.9)) {
                count++;
            }

            System.out.printf(" %.2f",pazient[i]);
        }
        System.out.println();
        double sredneeZnachenieTemperatur = Arrays.stream(pazient).sum() / pazient.length;
        System.out.printf(" Количество здоровых пациентов " + count
                + " средняя температура %.2f",sredneeZnachenieTemperatur);
    }
}
