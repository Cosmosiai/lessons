package lessons.lesson30;

public class Turtle implements EggAble, SwimAble,ShieldAble{


    @Override
    public String Egg() {
        return "I'm egg maker";
    }

    @Override
    public String sound() {
        return null;
    }

    @Override
    public String shield() {
        return "I have Shield";
    }
}
