package lesson14and1;

public class Main {
    public static void main(String[] args) {
        String str = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String res = str.replaceAll("[., ]", " ");
        String wer = res.replaceAll("[-А-я-]+", "");
        String[] rt = wer.split(" ");
        int count = 0;
        for (String sd : rt) {
            String conv = sd.trim();
            if (!conv.equals("")) {
                int num = Integer.parseInt(conv);
                count += num;
            } else {
                continue;
            }
        }

        System.out.println(count);
    }
}
