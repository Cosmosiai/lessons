package homework.hw2_5.hwB;

public class Square extends Shape{
    public Square(String symbol) {
        super(symbol);
    }

    @Override
    public void draw() {
        System.out.println(getSymbol()+getSymbol()+getSymbol()+getSymbol()+getSymbol()+getSymbol()+"\n"
        +getSymbol()+"    "+getSymbol()+"\n"
        +getSymbol()+getSymbol()+getSymbol()+getSymbol()+getSymbol()+getSymbol());
    }
}
