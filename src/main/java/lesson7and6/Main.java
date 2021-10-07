package lesson7and6;

public class Main {
    public static void main(String[] args) {
        double[] numb = new double[5];
        numb[0] = 1;
        numb[1] = 2;
        numb[2] = 3;
        numb[3] = 4;
        numb[4] = 5;

        for (int i = 0; i < numb.length; i++) {
            if (numb[i] < 2.5) {
                System.out.println("id " + i + " исключен, так как оценка составляет < 2.5");
            }
        }
    }
}
