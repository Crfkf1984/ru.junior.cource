package lesson5and3;

public class Main {
    public static void main(String[] args) {
        for (int i = 200; i <= 210; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 220; i <= 250; i++) {
            System.out.println(i);
        }

        for (int i = 200; i <= 250; i++) {
            if (i <= 210 || i >= 220)
            System.out.println(i);
        }
    }
}
