package homework.hw2_2.hwB;

import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
    private String birthDate;
    private String name;
    private String Surname;
    private boolean isMale;
    private int age;

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("вы ошиблись введите ещё раз возраст");
            int a = sc.nextInt();
            setAge(a);
        }else {
            this.age = age;
        }
    }
}
