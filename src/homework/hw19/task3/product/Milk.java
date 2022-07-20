package homework.hw19.task3.product;

import java.util.Arrays;

public class Milk extends Product{
    private String type;
    private int kg;
    private String date;

    public Milk(String name, int price, Compound[] compound, String type, int kg, String date) {
        super(name, price, compound);
        this.type = type;
        this.kg = kg;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "type='" + type + '\'' +
                ", kg=" + kg +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", compound=" + getCompound(compound) +
                ", date="+date+
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

