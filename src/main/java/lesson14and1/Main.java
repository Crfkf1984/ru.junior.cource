package lesson14and1;

public class Main {
    public static void main(String[] args) {
        String str = "Вася заработал -500 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        str = str.replaceAll("[., ]", " ");
        str = str.replaceAll("[А-я]+", "");
            String[] rt = str.split(" ");
            int count = 0;
            for (String sd : rt) {
                String conv = sd.trim();
                if ((!conv.equals("")) && (!conv.equals("-"))) {
                    int num = Integer.parseInt(conv);
                    count += num;
                } else {
                    continue;
                }
            }
            System.out.println(count);
        }
    }
