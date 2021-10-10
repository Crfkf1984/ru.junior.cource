package lesson13and1;

public class Main {
    public static void main(String[] args) {
        String str = "ABCDEFGHIKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < str.length(); i++) {
            char n = str.charAt(i);
            char f = str.toLowerCase().charAt(i);
            int rt = (int) f;
            int res = (int) n;
            System.out.println("буква " + n + " ее код " + res + "\n"
                               + "буква " + f + " ее код " + rt);
        }
    }
}
