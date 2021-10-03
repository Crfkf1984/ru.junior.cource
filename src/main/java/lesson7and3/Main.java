package lesson7and3;

public class Main {
    public static void main(String[] args) {
        int[] numb = new int[10];
        numb[0] = 1;
        numb[1] = 2;
        numb[2] = 3;
        numb[3] = 4;
        numb[4] = 5;
        numb[5] = 6;
        numb[6] = 7;
        numb[7] = 8;
        numb[8] = 9;
        numb[9] = 10;

        int count = 0;
        for (int i = 0; i < numb.length; i++) {
            count += numb[i];
        }
        System.out.println(count);
    }
}
