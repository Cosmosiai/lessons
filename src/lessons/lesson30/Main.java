package lessons.lesson30;

public class Main {


    public static void main(String[] args) {
        SwimAble Turtle = new Turtle();
        EggAble chicken = new Turtle();

        Container container = new Container();

        SwimAble dog = new Dog();
        SwimAble shark = new Shark();
        SwimAble duck = new Duck();

        SwimAble[] swimAbles = {new Shark(), new Dog(), new Duck()};

        System.out.print(((Dog)dog));


    }

}
