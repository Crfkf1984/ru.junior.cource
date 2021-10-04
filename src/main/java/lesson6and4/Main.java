package lesson6and4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] pazient = new double[10];
        double min = 32;
        double max = 40;
        int count = 0;
        double cons = 1e-0;
        for (int i = 0; i < pazient.length; i++) {
            pazient[i] = Math.round(Math.random() * ((max - min) + 1) + min);

            if (((Math.abs(pazient[i]) - 36.2) >= cons) && ((Math.abs(pazient[i]) - 36.9)  <= cons)) {
                count++;
            }

            System.out.print(pazient[i] + " ");
        }
        System.out.println();
        double sredneeZnachenieTemperatur = Arrays.stream(pazient).sum() / pazient.length;
        System.out.println("средняя температура " + (double) Math.round(sredneeZnachenieTemperatur * 100) / 100);
        System.out.println("Количество здоровых пациентов " + count);
    }
}
