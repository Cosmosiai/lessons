package lessons.lesson30;

public class Dog implements SwimAble{
    @Override
    public String sound() {
        return null;
    }

    @Override
    public String swim() {
        return SwimAble.super.swim();
    }

    public String print(){
        return "Guf guf";
    }
}
