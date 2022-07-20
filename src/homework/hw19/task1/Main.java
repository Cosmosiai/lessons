package homework.hw19.task1;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product("milk",49,"12.01.2022");
        Product tea = new Product("tea", 241,"01.01.2021");

        System.out.println(milk.toString());
        System.out.println(tea.toString());
    }
}
