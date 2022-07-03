package homework.hw2_2.hwA;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAggressive(false);
        dog.setColor("yellow");
        System.out.println("dog is aggressive: "+dog.isAggressive()+".  dog's color is "+ dog.getColor());
        Cat cat = new Cat();
        cat.setAge(3);
        cat.setSort("british");
        System.out.println("cat's type is "+cat.getSort()+". it's "+ cat.getAge()+" years old");
        Fish fish = new Fish();
        fish.setSize("big");
        fish.setColor("gold");
        System.out.println(fish.getColor()+" fish's size is "+fish.getSize()+". ");
        Parrot parrot = new Parrot();
        parrot.setColor("colourful");
        parrot.setCanSpeak(true);
        System.out.println("this "+parrot.getColor()+" can speak: "+parrot.isCanSpeak());
    }
}
