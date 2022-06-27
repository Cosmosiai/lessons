package lessons.lesson30;

public interface SwimAble {

    boolean isSwim = true;

    double maxDeep = 11000;


    String sound();
    default String swim(){
        return "I can swim!";
    };
}
