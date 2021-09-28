package lesson5;

public class Main {
    public static void main(String[] args) {
        int milk = 900;
        int muka = 700;
        int egge = 600;
        int sugar = 500;
        int oil = 300;
        int apple = 900;
        boolean flag = false;

        if (muka>= 400 && sugar >= 10 && milk >= 1 && oil >= 30) {
            System.out.println("Можно приготовить pancakes!");
            flag = true;
        }

        if (milk >= 300 && egge >= 5 && muka >= 5) {
            System.out.println("Можно приготовить omelette!");
            flag = true;
        }

        if (apple >= 3 && milk >= 100 && muka >= 300 && egge >= 4) {
            System.out.println("Можно приготовить Apple pie!");
            flag = true;
        }

        if (!flag) {
            System.out.println("Облом нужно идти в магазин!");
        }


    }
}
