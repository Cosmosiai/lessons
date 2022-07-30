package homework.hw34.hwA;

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
    }
}
