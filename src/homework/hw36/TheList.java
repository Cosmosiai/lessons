package homework.hw36;

import java.util.*;

import static homework.hw36.Start.start;

public class TheList {
    public static List<Computer> compList = new LinkedList<>();
    public static List<Computer> searchList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    static Random rd = new Random();

    public static void randomList() {
        for (int i = 0; i < 50; i++) {
            int g = rd.nextInt(2);
            if (g % 2 == 0) {
                int f = rd.nextInt(180000) + 10000;
                int h = rd.nextInt(60) + 5;
                Computer a = new PC(f, Computer.randomType(), h);
                compList.add(a);
            } else {
                int f = rd.nextInt(97000) + 3000;
                Computer a = new Laptop(f, Computer.randomType());
                compList.add(a);
            }
        }
    }

    public static void theList() {
        System.out.println("Введите сколько компьютеров вы собираетесь добавить:");
        int a = 0;
        a = Computer.sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("Выберите 1)ноутбук или 2)компьютер");
            Computer.sc.nextLine();
            int b = Computer.sc.nextInt();
            if (b == 2) {
                System.out.println("Введите цену компьютера");

                int c = Computer.sc.nextInt();
                System.out.println("Введите марку компьютера");
                Computer.sc.nextLine();
                String d=Computer.sc.nextLine();
                System.out.println("Введите количество дюймов");
                int f = Computer.sc.nextInt();
                compList.add(new PC(c, d, f));
            } else if (b == 1) {
                System.out.println("Введите цену ноутбука");
                int c = Computer.sc.nextInt();
                System.out.println("Введите марку ноутбука");
                Computer.sc.nextLine();
                String d=Computer.sc.nextLine();
                compList.add(new Laptop(c, d));
            } else {
                System.out.println("вы ошиблись");
                i--;
            }
        }
        start();
    }

    public static int generalNewCost() {
        int a = 0;
        int b = 0;
        Laptop c = new Laptop(0, "");
        for (Object i : compList) {
            if (i.getClass().equals(c.getClass())) {
                a += ((Laptop) i).getNewCost();
                b += ((Laptop) i).getCost();
            } else {
                a += ((PC) i).getCost();
                b += ((PC) i).getCost();
            }
        }
        return a;
    }

    public static void generalCost() {
        int comps = 0;
        int b = 0;
        int d = 0;
        int laps = 0;
        Laptop c = new Laptop(0, "");
        for (Object i : compList) {
            if (i.getClass().equals(c.getClass())) {
                b += ((Laptop) i).getCost();
                d += ((Laptop) i).getNewCost();
                laps += ((Laptop) i).getNewCost();
            } else {
                b += ((PC) i).getCost();
                d += ((PC) i).getCost();
                comps += ((PC) i).getCost();
            }
        }
        System.out.println("Общая цена без скидок: " + b + "\nОбщая цена со скидками: " + d + "\nОбщая цена ноутбуков со скидками: " + laps + "\nOбщая цена компьютеров: " + comps);
        start();
    }

    public static void search() {
        searchList.clear();
        System.out.println("вводите 0 если не хотите фильтровать по определённой категории");
        System.out.println("Введите минимальную и максимальную цену за компьютер");
        int a = Computer.sc.nextInt();
        int b = Computer.sc.nextInt();
        System.out.println("Введите тип: \n1)компьютер \n2)ноутбук");
        int c = Computer.sc.nextInt();
        System.out.println("Введите марку: \n1)Dell \n2)Asus ");
        int d = Computer.sc.nextInt();
//        System.out.println("Введите приемлемые диагонали");
//        int diag1=Computer.sc.nextInt();
//        int diag2=Computer.sc.nextInt();
        for (int i = 0; i < compList.toArray().length; i++) {
            if ((compList.get(i).getCost() > a && compList.get(i).getCost() < b) || (compList.get(i).getCost() < a && compList.get(i).getCost() > b) || (a != 0 && b != 0)) {
                if (c == 1 && compList.get(i).getWhatIs().equals("PC")) {
                    lastIf(i, d);
                } else if (c == 2 && compList.get(i).getWhatIs().equals("laptop")) {
                    lastIf(i, d);
                } else if (c == 0) {
                    lastIf(i, d);
                }
            } else if (a == 0 && b == 0) {
                if (c == 1 && compList.get(i).getWhatIs().equals("PC")) {
                    lastIf(i, d);
                } else if (c == 2 && compList.get(i).getWhatIs().equals("laptop")) {
                    lastIf(i, d);
                } else if (c == 0) {
                    lastIf(i, d);
                }
            }
        }
    }

    public static void soutSearch() {
        for (int i = 0; i < searchList.toArray().length; i++) {
            if (searchList.get(i).getWhatIs().equals("PC")) {
                System.out.println("индекс: " + i + "   цена: " + searchList.get(i).getCost()+"    тип: компьютер     диагональ: "+searchList.get(i).getDiag+"  модель: "+searchList.get(i).getType());
            }else {
                System.out.println("индекс: " + i + "   цена: " + searchList.get(i).getCost()+"    тип: ноутбук     модель: "+searchList.get(i).getType());
            }
        }
    }

    public static void lastIf(int i, int d) {
        if (d == 1 && compList.get(i).getType().equals("Dell")) {
            searchList.add(compList.get(i));
        } else if (d == 2 && compList.get(i).getType().equals("Asus")) {
            searchList.add(compList.get(i));
        } else if (d == 0) {
            searchList.add(compList.get(i));
        }
    }


}
