package homework.hw19.task3;

import homework.hw19.task3.product.Compound;
import homework.hw19.task3.product.Milk;

public class Main {
    public static void main(String[] args) {

        Milk a = new Milk("Mozzarella",245, new Compound[]{new Compound("yeast"),new Compound("Milk")},"cheese",245);

        System.out.println(a.toString());
    }
}
