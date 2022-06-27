package lessons.lesson30;

import java.util.Random;

public class Duck implements SwimAble{
    @Override
    public String sound() {
        return null;
    }

    @Override
    public String swim() {
        return SwimAble.super.swim();
    }

    public String eggs(){
        Random r = new Random();
        int a = r.nextInt(4)+1;
        return "i made "+ a+ " eggs";
    }
}
