package homework.hw2_5.hwB;

public class Rhombus extends Shape{
    public Rhombus(String symbol) {
        super(symbol);
    }

    @Override
    public void draw(){
        System.out.println("   "+getSymbol()+"\n  "+getSymbol()+" "+getSymbol()+"\n"+getSymbol()+"     "+getSymbol()+"\n  "+getSymbol()+" "+getSymbol()+"\n   "+getSymbol());
    }
}
