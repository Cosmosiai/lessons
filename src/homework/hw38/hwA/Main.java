package homework.hw38.hwA;

import homework.hw34.hwA.Dalmatian;
import homework.hw34.hwA.SetSet;

import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        HashSet<Dalmatian> a = new HashSet<>();
        SetSet.setSet(a);
        int counter = 1;
        for (Dalmatian d : a){
            System.out.print(counter+") ");
            d.readCollar();
            counter++;
        }
        System.out.println("hello");
    }

}
