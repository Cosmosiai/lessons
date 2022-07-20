package homework.hw19.task2;

import homework.hw19.task2.product.Milk;
//import homework.hw19.task2.product.Tea;

public class Main {
    public static void main(String[] args) {
        Milk a = new Milk("творог", 1);
        System.out.println(a.toString());
    }
//    Tea b = new Tea();


//При создании объекта класса чай произошла ошибка. Поскольку класс чай находится в папке "продукты", а модификатор доступа default, то класс "чай" недоступен за пределами этой папки.
}
