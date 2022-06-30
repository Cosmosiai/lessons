package homework.hw1_8;

import java.util.Arrays;
import java.util.Random;

public class MainA {
    public static void main(String[] args) {
        int[] a = new int[5];
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            a[i] = r.nextInt(5);
        }

        int counter = 0;
        int check = 0;
        for (int i = 0; i < 5; i++) {
            if (i != 0 && i != 4 && check != a[i] && ((a[i] == a[i - 1]) || a[i] == a[i + 1])) {
                counter++;
                check = a[i];
            }
        }
        if (counter != 0) {
            System.out.println("Есть " + check);
        } else {
            System.out.println("нет");
        }
        System.out.println(Arrays.toString(a));
    }
}
