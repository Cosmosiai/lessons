package homework.hw21;

import java.util.ArrayList;

public class Minibus {
    private int number;
    private static int money=0;
    static ArrayList<Passenger> fill = new ArrayList<Passenger>(32);

    public Minibus(int number) {
        this.number = number;
    }

    public static int getMoney() {
        return money;
    }

    public static void fillBus(String name, int id, boolean pensioner){
        Passenger newPass = new Passenger(name, id, pensioner);
        fill.add(newPass);
        money = money+newPass.getPayment();
    }


}
