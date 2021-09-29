package lesson6and2;

public class Main {
    public static void main(String[] args) {
        int[] numb = new int[5];
        numb[0] = 1;
        numb[1] = 2;
        numb[2] = 3;
        numb[3] = 4;
        numb[4] = 5;

        for (int i = numb.length -1; i >= 0 ; i--) {
            System.out.println(numb[i]);
        }
    }
}


