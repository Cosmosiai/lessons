package lessons.lesson36;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner a = new Scanner(System.in);
//        Week b = Week.valueOf(a.nextLine());
//        System.out.println(GetDay(b));

        Cat cat1 = new Cat("чукча");
        Cat cat2 = new Cat("чукча");
        System.out.println(cat1.getName().equals(cat2.getName()));

        Set<String>a = new HashSet<String>();
        List<Integer> integ = new ArrayList<>();
        Set<Integer> integers = new HashSet<>();

        for(int i=0;i<4;i++){
            for (int j = 1; j<=100;j++){
                integ.add(j);
                integers.add(j);
            }
        }

        for (Integer i : integ){
            System.out.println(i);
        }
        System.out.println("________________________________________________________________________");
        for(Integer i : integers){
            System.out.println(i);
        }
    }
    public static String GetDay(Week week){
        switch (week){
            case СУББОТА:
                return week.getRusDay()+", выходной";
            case ВОСКРЕСЕНИЕ:
                return week.getRusDay()+", выходной";
            default:
                return week.getRusDay()+", рабочий день";
        }
    }
}
