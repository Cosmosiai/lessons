package homework.hw39.hwA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class HashInfo {
    public static void putInMap(HashMap thisMap) {
        Scanner a = new Scanner(System.in);
        System.out.println("Сколько автомобилей вы хотите добавить в список? ");
        int b=a.nextInt();

        for (int i = 0; i<b; i++){
            a.nextLine();
            System.out.println("вставьте имя машины");
            String name = a.nextLine();
            System.out.println("введите цену");;
            int price = a.nextInt();
            a.nextLine();
            System.out.println("введите название двигателя");
            String engine = a.nextLine();
            Car c = new Car(name,price,engine);
            thisMap.put(i,c);
        }
    }

    public static void sout(HashMap thisMap) {
        System.out.println(Arrays.asList(thisMap));
        for(Object entry:thisMap.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }
    }
}
