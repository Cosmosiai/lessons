package homework.hw1_8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Введите размер массива");

        int b = a.nextInt();

        int[] c = new int[b];
        String[] d = new String[b];
        for (int i=0; i<b;i++){
            c[i]=r.nextInt(12)+1;
            switch (c[i]){
                case 1:
                    d[i]="январь";
                    break;
                case 2:
                    d[i]="февраль";
                    break;
                case 3:
                    d[i]="март";
                    break;
                case 4:
                    d[i]="апрель";
                    break;
                case 5:
                    d[i]="май";
                    break;
                case 6:
                    d[i]="июнь";
                    break;
                case 7:
                    d[i]="июль";
                    break;
                case 8:
                    d[i]="август";
                    break;
                case 9:
                    d[i]="сентябрь";
                    break;
                case 10:
                    d[i]="октябрь";
                    break;
                case 11:
                    d[i]="ноябрь";
                    break;
                case 12:
                    d[i]="декабрь";
                    break;
            }
        }
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
    }
}
