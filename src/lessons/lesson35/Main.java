package lessons.lesson35;

import java.io.StringReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] b = a.split(" +");
        if(b.length==2){
            System.out.println(b[0]+" "+b[1].charAt(0)+".");
        }
        else {
            if (b[1].equalsIgnoreCase("улуу") || b[1].equalsIgnoreCase("кызы")) {
                System.out.println(b[0] + " " + b[1].charAt(0) + ". " + b[2]);
            }else {
                System.out.println(b[1].charAt(0)+". "+b[2].charAt(0)+". "+b[0]);
            }
        }
    }
}