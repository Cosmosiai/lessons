package homework.hw2_5.hwB;

public class Plus extends Shape{
    public Plus(String symbol) {
        super(symbol);
    }

    @Override
    public void draw() {
        System.out.println("      "+getSymbol()+"\n      "+getSymbol()+"\n      "+getSymbol()+"\n"+getSymbol()+" "+getSymbol()+" "+getSymbol()+" "+getSymbol()+" "+getSymbol()+" "+getSymbol()+" "+getSymbol()+" "+getSymbol()+"\n      "+getSymbol()+"\n      "+getSymbol()+"\n      "+getSymbol());
    }
}
