package homework.ishw;

import static homework.ishw.TheList.*;

public class Start {
    public static void start(){
        System.out.println("Здравствуйте\n1)хочу создать новый слад с ноутбуками и компьютерами\n2)мне нужно найти определённый гаджет\n3)вывести общую сумму всех товаров\n0)выход");
        int a = Computer.sc.nextInt();
        if (a==1){
            System.out.println("вы хотите создать склад автоматически? он будет создан с рандомными гаджетми и рандомными значениями в количестве 50 шт\n1)да \n2)нет");
            int b = Computer.sc.nextInt();
            if (b==1){
                randomList();
                System.out.println("закончили");
                start();
            }else {
                theList();
            }
        }else if(a==2){
            search();
            soutSearch();
        } else if (a==3) {
            generalCost();
        }
    }
}
