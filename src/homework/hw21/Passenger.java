package homework.hw21;

public class Passenger {
    private String name;
    private int id;
    private boolean pensioner;
    private int payment;

    public Passenger(String name, int id, boolean pensioner) {
        this.name = name;
        this.id = id;
        this.pensioner = pensioner;
        if (pensioner == true) {
            payment = 5;
        } else {
            payment = 15;
        }
    }

    public int getPayment() {
        return payment;
    }
}
