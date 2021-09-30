package lesson6and3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numb = new int[10];
        numb[0] = 11;
        numb[1] = 12;
        numb[2] = 13;
        numb[3] = 14;
        numb[4] = 15;
        numb[5] = 16;
        numb[6] = 17;
        numb[7] = 18;
        numb[8] = 19;
        numb[9] = 20;

        int s = 0;
        int r = 0;
        for (int i = 0; i < numb.length / 2; i++) {
             s =  numb[i];
             numb[i] = numb[numb.length - i - 1];
            numb[numb.length - i - 1] = s;
        }

        Arrays.stream(numb).forEach(System.out::println);

    }
}
