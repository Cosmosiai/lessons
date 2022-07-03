package homework.hw2_4;

import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    private String fullName;
    private String login;
    private String password;
    private int age;
    private boolean isBlocked;

    public User(String fullName, String login, String password, int age, boolean isBlocked) {
        if (age < 0) {
            while (age<0) {
                System.out.println("there is error. try it second time. age must be more than 0");
                age = sc.nextInt();
            }
        }
        this.age = age;
        this.fullName = fullName;
        this.login = login;
        this.password = password;
        this.isBlocked = isBlocked;

    }

    public String getFullName() {
        return fullName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public boolean isBlocked() {
        return isBlocked;
    }
}
