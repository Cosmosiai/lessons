package homework.ishw;


import java.util.Random;
import java.util.Scanner;

public abstract class Computer {
    private int cost;
    private String type;
    private String whatIs;

    public String getWhatIs() {
        return whatIs;
    }

    public static Scanner sc = new Scanner(System.in);

    public Computer(int cost, String type) {
        this.cost = cost;
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    public int campaign(int percentage){
        return (getCost())/100*(100-percentage);
    }

    public static String randomType(){
        Random a = new Random();
        int r = a.nextInt(2);
        if (r==0){
            return "Dell";
        }
        else {
            return "Asus";
        }
    }

}
