package homework.hw36.hwB;

import homework.hw36.hwA.Cat;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public abstract class CreateAnimal {
    Random r = new Random();
    Scanner scan = new Scanner(System.in);
    private String name;
    private int age;
    private String type;

    public CreateAnimal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    CreateAnimal createAn() {
        return null;
    }

}
