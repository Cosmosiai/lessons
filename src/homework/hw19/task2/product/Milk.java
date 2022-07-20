package homework.hw19.task2.product;

public class Milk {
    private String milkProduct;
    private int valueKg;

    public Milk(String milkProduct, int value) {
        this.milkProduct = milkProduct;
        this.valueKg = value;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "milkProduct='" + milkProduct + '\'' +
                ", valueKg=" + valueKg +
                '}';
    }
}