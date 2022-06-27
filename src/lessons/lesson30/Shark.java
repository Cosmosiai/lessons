package lessons.lesson30;

public class Shark implements SwimAble{
    @Override
    public String sound() {
        return null;
    }

    @Override
    public String swim() {
        return SwimAble.super.swim();
    }

    public String hunt(){
        return "I'm Killer";
    }
}
