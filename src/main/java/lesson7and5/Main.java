package lesson7and5;

public class Main {
    public static void main(String[] args) {
        int count2 = 0;
        int pupular1 = 0;
        int popular2 = 0;
        int[] numb = new int[10];
        numb[0] = 1;
        numb[1] = 8;
        numb[2] = 3;
        numb[3] = 3;
        numb[4] = 5;
        numb[5] = 5;
        numb[6] = 5;
        numb[7] = 5;
        numb[8] = 8;
        numb[9] = 8;

        for (int i = 0; i < numb.length; i++) {
            pupular1 = numb[i];
            int count1 = 1;
            for (int j = i + 1; j < numb.length; j++) {
                if (pupular1 == numb[j]) {
                    count1++;
                }
                if (count1 > count2) {
                    popular2 = pupular1;
                    count2 = count1;
                } else if (count1 == count2) {
                    popular2 = Math.max(popular2, pupular1);
                }

            }

        }

        System.out.println(popular2);
    }
}
