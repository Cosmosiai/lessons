package homework.hw1_8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainC {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Введите размер массива");

        int b = a.nextInt();

        int[] c = new int[b];
        int d = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        int general1=0;
        int general2=0;
        int general3=0;

        for (int i=0; i<b;i++){
            c[i]=r.nextInt(100)+1;
            if (c[i]>=1&&c[i]<31){
                counter1++;
                general1+=c[i];
            } else if (c[i]>=31&&c[i]<61) {
                counter2++;
                general2+=c[i];
            }else {
                counter3++;
                general3+=c[i];
            }
        }
        System.out.println("ваш массив: "+Arrays.toString(c));
        System.out.println("от 1 до 30 => "+((double)general1/counter1)+", количество "+counter1+"\n" +
                "от 31 до 60 => "+((double)general2/counter2)+", количество "+counter2+"\n" +
                "от 61 до 100 => "+((double)general3/counter3)+", количество "+counter3+"\n");

    }
}
