package homework.hw37;

public abstract class TheLIvingPlace {
    private int family;
    private int payment;
    private String address;

    public TheLIvingPlace(int family, int payment, String address) {
        this.family = family;
        this.payment = payment;
        this.address = address;
    }

    public int getFamily() {
        return family;
    }

    public int getPayment() {
        return payment;
    }

    public String getAddress() {
        return address;
    }
}
