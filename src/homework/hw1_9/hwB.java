package homework.hw1_9;

import java.util.Scanner;

public class hwB {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int b=a.nextInt();
        int counter=0;
        if(b==25||b==23||b==21||b==17||b==15){
            System.out.println("купите соразмерный мешок");
            counter++;
        }else {
            for (int c = 0; c <= b / 25; c++) {
                for (int d = 0; d <= b / 23; d++) {
                    for (int e = 0; e <= b / 21; e++) {
                        for (int f = 0; f <= b / 17; f++) {
                            for (int g = 0; g <= b / 15; g++) {
                                if (b == c * 25 + d * 23 + e * 21 + f * 17 + g * 15) {
                                    System.out.println("\n25кг: " + c + " мешков,\n" +
                                            "23кг: " + d + " мешков,\n" +
                                            "21кг: " + e + " мешков,\n" +
                                            "17кг: " + f + " мешков,\n" +
                                            "15кг: " + g + " мешков,\n\n");
                                    counter++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("способов: "+counter);
    }
}
