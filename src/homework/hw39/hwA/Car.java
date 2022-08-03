package homework.hw39.hwA;

public class Car {
    private String name;
    private int price;
    private String engine;

    public Car(String name, int price, String engine) {
        this.name = name;
        this.price = price;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", engine='" + engine + '\'' +
                '}';
    }
}
