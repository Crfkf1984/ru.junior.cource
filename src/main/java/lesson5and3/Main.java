package lesson5and3;

public class Main {
    public static void main(String[] args) {
        for (int i = 200; i <= 210; i++) {
            System.out.println(i);
        }

        System.out.println();

        int i = 200;
        while (i <= 210) {
            System.out.println(i);
            i++;
        }

        System.out.println();

        for (int w = 220; w <= 250; w++) {
            System.out.println(w);
        }

        System.out.println();

        int j = 220;
        while (j <= 250) {
            System.out.println(j);
            j++;
        }

        System.out.println();

        for (int s = 200; s <= 250; s++) {
            System.out.println(s);
            if (s == 210) {
                s = 220;
                System.out.println(s);

            }

        }

        System.out.println();

        int a = 200;
        while (a <= 250) {
            System.out.println(a);
            a++;
            if (a == 210) {
                System.out.println(a);
                a = 220;
            }

        }
    }
}
