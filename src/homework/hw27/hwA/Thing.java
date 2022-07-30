package homework.hw27.hwA;

public interface Thing {
    default void action(){
        System.out.println("hello");
    };
}
