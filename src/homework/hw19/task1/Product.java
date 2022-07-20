package homework.hw19.task1;

public class Product {
    private String name;
    private int price;
    private String date;

    public Product(String name, int price, String date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                '}';
    }
}
