package lesson6and3;

public class Main {
    public static void main(String[] args) {
        int[] numb = new int[5];
        numb[0] = 1;
        numb[1] = 2;
        numb[2] = 3;
        numb[3] = 4;
        numb[4] = 5;

        int s = 0;
        for (int i = 0; i < numb.length ; i++) {
          numb[i] = numb.length - i;
            System.out.println(numb[i]);
        }
    }
}
