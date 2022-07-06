package homework.hw2_5.hwB;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символ которым будет нарисована фигура");
        String b = sc.nextLine();
        System.out.println("Выберите фигуру: \n1. квадрат\n2. ромб\n3. плюс ");
        int c = sc.nextInt();

        if (c == 1){
            Square square = new Square(b);
            square.draw();
        }else if(c==2){
            Rhombus rhombus = new Rhombus(b);
            rhombus.draw();
        } else if (c==3) {
            Plus plus = new Plus(b);
            plus.draw();
        }
    }


}
