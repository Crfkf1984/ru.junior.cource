package lesson7and5;

public class Main {
    public static void main(String[] args) {
        int max = 0;
        int[] numb = new int[10];
        numb[0] = 1;
        numb[1] = 8;
        numb[2] = 3;
        numb[3] = 3;
        numb[4] = 5;
        numb[5] = 5;
        numb[6] = 5;
        numb[7] = 8;
        numb[8] = 8;
        numb[9] = 8;

        for (int i = 0; i < numb.length; i++) {
            int count = 0;
            for (int j = i + 1; j < numb.length; j++) {
                if (numb[i] == numb[j]) {
                    numb[count]++;
                }
            }
            
            if (numb[count] > max) {
                max = numb[count];
                System.out.println(numb[i]);
            }
        }
    }
}
