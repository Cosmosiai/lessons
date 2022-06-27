package lessons.lesson34;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.LinkedList;

public class CatArrays {
    public static void main(String[] args) {
        ArrayList<Cat> Cats = new ArrayList<>();
        Cat cat1 = new Cat("Маша", 2);
        Cats.add(cat1);
        Cat cat2 = new Cat("саша", 1);
        Cats.add(cat2);
Cats.add(null);

        Cat cat3 = getByNameAge(Cats, "Маша",2);
        if (cat3!=null){
            System.out.println("кот по имени "+cat3.getName()+" cуществует "+Cats.indexOf(cat3));
        }

        Cat[] catsAr = getCatArrays(Cats);

        LinkedList<Animal> animals = new LinkedList<Animal>();
        for (int i = 1; i<51; i++){
            Animal cat = new Animal("cat"+i, "cat", i);
            Animal dog = new Animal("dog"+i, "dog", i);
            animals.add(cat);
            animals.add(dog);
        }
    }

    public static void deliteAni(LinkedList<Animal> animals){
        for (int i=0;i<50;i++){
            Animal cat = animals.get(i);
            if (cat.getAge()%5==0&&cat.getType().equals("cat")){
                animals.remove(i);
            }
        }
    }

    public static void putMouse(LinkedList<Animal>animals){
        Animal newList = new Animal("","sgr",43);
        for(int i = 0; i<50; i++){
            Animal dog = animals.get(i);
            if (dog.getAge()%3==0 && dog.getType().equals("dog")){
                Animal mouse = new Animal("mouse"+i, "mouse", i);
                animals.add(mouse);
//                if
            }
        }
    }

    public static void catMouse(LinkedList<Animal>animals){
        for(int i = 0; i<50; i++){
//            Animal animal
        }
    }
    public static Cat getByNameAge(ArrayList<Cat> Cats, String name, Integer age) {
        for (Cat c : Cats) {
            if (c!=null&&c.getName().equals(name) && c.getAge().equals(age)) {
                return c;
            }
        }
        return null;
    }

    public static Cat[] getCatArrays(ArrayList<Cat> cats){
        Cat[] catsArray =  cats.toArray(new Cat[cats.size()]);
        return catsArray;
    }


}