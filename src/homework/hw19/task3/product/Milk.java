package homework.hw19.task3.product;

import java.util.Arrays;

public class Milk extends Product{
    private String type;
    private int kg;

    public Milk(String name, int price, Compound[] compound, String type, int kg) {
        super(name, price, compound);
        this.type = type;
        this.kg = kg;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "type='" + type + '\'' +
                ", kg=" + kg +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", compound=" + getCompound(compound) +
                '}';
    }

    private String getCompound(Compound[] a){
        String c = "";
        for (Compound b : a){
            if (b.equals(a[a.length-1])){
                c= ""+c+b.getCompound();
            }else {
                c = c + b.getCompound() + ", ";
            }
        }
        return "["+c+"]";
    }
}

