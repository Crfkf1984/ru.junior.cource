package lesson6and3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numb = new int[5];
        numb[0] = 11;
        numb[1] = 12;
        numb[2] = 13;
        numb[3] = 14;
        numb[4] = 15;

        int s = 0;
        int r = 0;
        for (int i = 0; i < numb.length; i++) {
             s =  numb[i];
             numb[i] = numb[numb.length - i - 1];
            numb[numb.length - i - 1] = s;
            //System.out.println(numb[i]);
            if(i == 2)
                break;
        }

        Arrays.stream(numb).forEach(System.out::println);

    }
}
