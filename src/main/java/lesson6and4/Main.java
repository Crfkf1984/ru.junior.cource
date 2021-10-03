package lesson6and4;

public class Main {
    public static void main(String[] args) {
        int[] pazient = new int[10];
        double min = 32;
        double max = 40;
        int count = 0;
        int tempsum = 0;
        double cons = 1e-0;
        for (int i = 0; i < pazient.length; i++) {
            double numbTemp = Math.round(Math.random() * ((max - min) + 1) + min);

            if ((Math.abs(numbTemp - 36.2) <= cons) && (Math.abs(numbTemp - 36.9)  <= cons)) {
                count++;
            }

             tempsum += numbTemp;

            System.out.print(numbTemp + " ");
        }
        System.out.println();
        double sredneeZnachenieTemperatur = tempsum / pazient.length;
        System.out.println("средняя температура " + (double) Math.round(sredneeZnachenieTemperatur * 100) / 100);
        System.out.println("Количество здоровых пациентов " + count);
    }
}
