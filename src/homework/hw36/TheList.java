package homework.hw36;

import java.util.*;

import static homework.hw36.Start.start;

public class TheList {
//    создаём список компьютеров
    public static List<Computer> compList = new LinkedList<>();
//    создаём список результатов
    public static List<Computer> searchList = new LinkedList<>();
//    для получения рандомных значений
    static Random rd = new Random();
//    список рандомных комьютеров с рандомными значениями
    public static void randomList() {
//        сздаём цикл для создания рандомных компьютеров на 50 шт
        for (int i = 0; i < 50; i++) {
//            рандомная переменная для создания компьютера или ноутбука
            int g = rd.nextInt(2);
//            что будет если мы создадим комп
            if (g % 2 == 0) {
//                рандомная цена
                int f = rd.nextInt(180000) + 10000;
//                рандомная диагональ
                int h = rd.nextInt(60) + 5;
//                создание объекта комп через конструктор из класса РС. за тип мы используем специальный радомайзер
                Computer a = new PC(f, Computer.randomType(), h);
//                добавление в список
                compList.add(a);
            }
            //            что будет если мы создадим ноут
            else {
//                рандомная цена
                int f = rd.nextInt(97000) + 3000;
//                создание объекта через конструктор из класса Laptop
                Computer a = new Laptop(f, Computer.randomType());
//                добавление в список
                compList.add(a);
            }
        }
    }

//    метод создания списка вручную
    public static void theList() {
        System.out.println("Введите сколько компьютеров вы собираетесь добавить:");
        int a = Computer.sc.nextInt();
//        цикл создания объекта. через число а мы указывем сколько раз цикл отработает
        for (int i = 0; i < a; i++) {
            System.out.println("Выберите 1)ноутбук или 2)компьютер");
//            "закрываем" прошлый ввод и начинаем следующий
            Computer.sc.nextLine();
            int b = Computer.sc.nextInt();
//            процесс создания компьютера
            if (b == 2) {
                System.out.println("Введите цену компьютера");

                int c = Computer.sc.nextInt();
                System.out.println("Введите марку компьютера");
                //            "закрываем" прошлый ввод и начинаем следующий
                Computer.sc.nextLine();
                String d=Computer.sc.nextLine();
                System.out.println("Введите количество дюймов");
                int f = Computer.sc.nextInt();
//                создаём объект пк
                compList.add(new PC(c, d, f));
            }
//            процесс создания ноутбука
            else if (b == 1) {
                System.out.println("Введите цену ноутбука");
                int c = Computer.sc.nextInt();
                System.out.println("Введите марку ноутбука");
//            "закрываем" прошлый ввод и начинаем следующий
                Computer.sc.nextLine();
                String d=Computer.sc.nextLine();
//                создаём объект ноут
                compList.add(new Laptop(c, d));
            }
//            на случай если пользователь введёт что-то не то
            else {
                System.out.println("вы ошиблись");
                i--;
            }
        }
//      выход в главное меню
        start();
    }

//    получение общей инормации о ценах
    public static void generalCost() {
//        цена компьютеров - счётчик
        int comps = 0;
//        общая цена без скидок - счётчик
        int b = 0;
//        общая цена со скидками - счётчик
        int d = 0;
//        цена ноутов со скидками - счётчик
        int laps = 0;
//        for each для поиска
        for (Computer i : compList) {
//            находим тип "ноутбук"
            if (i.getWhatIs().equals("laptop")) {
//                прибавление к нужным счётчикам
                b += (i).getCost();
                d += ((Laptop) i).getNewCost();
                laps += ((Laptop) i).getNewCost();
            }
//            тк оставшиеся объекты всё равно будут ПК, не имеет значения пропиывать условия
            else {
//                прибавление к нужным счётчикам
                b +=  i.getCost();
                d +=  i.getCost();
                comps += ((PC) i).getCost();
            }
        }
//        вывод инфы
        System.out.println("Общая цена без скидок: " + b + "\nОбщая цена со скидками: " + d + "\nОбщая цена ноутбуков со скидками: " + laps + "\nOбщая цена компьютеров: " + comps);
//        выход в главное меню
        start();
    }

    public static void search() {
//        очищаем список результатов
        searchList.clear();
        System.out.println("вводите 0 если не хотите фильтровать по определённой категории");
        System.out.println("Введите минимальную и максимальную цену за компьютер");
//        прописываем максимум и минимум в любом порядке
        int a = Computer.sc.nextInt();
        int b = Computer.sc.nextInt();
        System.out.println("Введите тип: \n1)компьютер \n2)ноутбук");
        int c = Computer.sc.nextInt();
        System.out.println("Введите марку: \n1)Dell \n2)Asus ");
        int d = Computer.sc.nextInt();

//        цикл для фильтрации объектов и добавления их в список результатов поиска.
        for (Computer i : compList) {
//            проверка на соответствие по цене
            if ((i.getCost() > a && i.getCost() < b) || (i.getCost() < a && i.getCost() > b) && (a != 0 && b != 0)) {
//                фильтр типа "с": 1 -комп, 2 - ноут, 3 - игнорирование фильра
                if (c == 1 && i.getWhatIs().equals("PC")) {
//                    вызов метода фильтрации по компании производителя и добавление резуьтата в список результатов
                    lastIf(i, d);
                } else if (c == 2 && i.getWhatIs().equals("laptop")) {
//                    вызов метода фильтрации по компании производителя и добавление резуьтата в список результатов
                    lastIf(i, d);
                } else if (c == 0) {
//                    вызов метода фильтрации по компании производителя и добавление резуьтата в список результатов
                    lastIf(i, d);
                }
            }
//            ингнорирование фильтра цены
            else if (a == 0 && b == 0) {
//                фильтр типа комп
                if (c == 1 && i.getWhatIs().equals("PC")) {
//                    вызов метода фильтрации по компании производителя и добавление резуьтата в список результатов
                    lastIf(i, d);
//                фильтр типа ноут
                } else if (c == 2 && i.getWhatIs().equals("laptop")) {
//                    вызов метода фильтрации по компании производителя и добавление резуьтата в список результатов
                    lastIf(i, d);
//                    игнорирование фильтра типа
                } else if (c == 0) {
                    lastIf(i, d);
                }
            }
        }
    }

//    метод для вывода результата
    public static void soutSearch() {
//        цикл для просмотра каждого объекта
        for (int i = 0; i < searchList.toArray().length; i++) {
//            специальное условие если будем выводить информацию о компьютере
            if (searchList.get(i).getWhatIs().equals("PC")) {
                System.out.println("индекс: " + i + "   цена: " + searchList.get(i).getCost()+"    тип: компьютер     диагональ: "+ ((PC) searchList.get(i)).getDiag() +"  модель: "+searchList.get(i).getType());
            }
//            специальное условие если будем выводить информацию о ноутбуке
            else {
                System.out.println("индекс: " + i + "   цена: " + searchList.get(i).getCost()+"    тип: ноутбук     модель: "+searchList.get(i).getType());
            }
        }
    }

//    метод для филтрации по типу объекта и его доавление в список результатов
    public static void lastIf(Computer i, int d) {
        if (d == 1 && i.getType().equals("Dell")) {
            searchList.add(i);
        } else if (d == 2 && i.getType().equals("Asus")) {
            searchList.add(i);
        } else if (d == 0) {
            searchList.add(i);
        }
    }


}
