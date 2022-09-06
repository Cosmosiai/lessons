package homework.hw36.hwA;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Adding ad = new Adding();
        LinkedList<Cat> linkCat = new LinkedList<>();
        ArrayList<Cat> arrCat= new ArrayList<>();
        long mlarlistst =  System.currentTimeMillis();
        ad.addInArrList(arrCat,10000,1);
        long mlarlistfin = System.currentTimeMillis();


        long mllinklistst =  System.currentTimeMillis();
        ad.addInLinkedList(linkCat,10000,1);
        long mllinklistfin = System.currentTimeMillis();


        long mlarliststincent =  System.currentTimeMillis();
        ad.addInArrList(arrCat,100,2);
        long mlarlistfincent = System.currentTimeMillis();


        long mllinkliststcent =  System.currentTimeMillis();
        ad.addInLinkedList(linkCat,100,2);
        long mllinklistfincent = System.currentTimeMillis();


        long mlarliststinbeg =  System.currentTimeMillis();
        ad.addInArrList(arrCat,100,3);
        long mlarlistfinbeg = System.currentTimeMillis();


        long mllinkliststbeg =  System.currentTimeMillis();
        ad.addInLinkedList(linkCat,100,3);
        long mllinklistfingeg = System.currentTimeMillis();


        long mlarliststinbeg11=  System.currentTimeMillis();
        ad.deleteByIdarr(arrCat,100,1);
        long mlarlistfinbeg11 = System.currentTimeMillis();


        long mllinkliststbeg1 =  System.currentTimeMillis();
        ad.deleteByIdLink(linkCat,100,1);
        long mllinklistfingeg1 = System.currentTimeMillis();


        long mlarliststinbeg111=  System.currentTimeMillis();
        ad.deleteByIdarr(arrCat,100,2);
        long mlarlistfinbeg111 = System.currentTimeMillis();


        long mllinkliststbeg11 =  System.currentTimeMillis();
        ad.deleteByIdLink(linkCat,100,2);
        long mllinklistfingeg11 = System.currentTimeMillis();


        long mlarliststinst1=  System.currentTimeMillis();
        System.out.println(arrCat.get(arrCat.size()/2).getName());
        long mlarlistfinfin1 = System.currentTimeMillis();


        long mllinklistst1 =  System.currentTimeMillis();
        System.out.println(linkCat.get(linkCat.size()/2).getName())   ;
        long mllinklistfin1 = System.currentTimeMillis();


        System.out.println("add in ArrayList 10000");
        System.out.println(time(mlarlistst,mlarlistfin));
        System.out.println(mlarlistst);
        System.out.println(mlarlistfin);

        System.out.println("вставка 10000 в LinkedList");
        System.out.println(time(mllinklistst,mllinklistfin));
        System.out.println(mllinklistst);
        System.out.println(mllinklistfin);

        System.out.println("add 100 in ArrayList in the center");
        System.out.println(time(mlarlistst,mlarlistfin));
        System.out.println(mlarliststincent);
        System.out.println(mlarlistfincent);
        System.out.println(arrCat.size());

        System.out.println("вставка 100 в LinkedList in the center");
        System.out.println(time(mllinkliststcent,mllinklistfincent));
        System.out.println(mllinkliststcent);
        System.out.println(mllinklistfincent);
        System.out.println(linkCat.size());

        System.out.println("вставка 100 в ArrayList в начало");
        System.out.println(time(mlarlistst,mlarlistfin));
        System.out.println(mlarliststincent);
        System.out.println(mlarlistfincent);
        System.out.println(arrCat.size());

        System.out.println("вставка 100 в LinkedList в начало");
        System.out.println(time(mllinkliststcent,mllinklistfincent));
        System.out.println(mllinkliststcent);
        System.out.println(mllinklistfincent);
        System.out.println(linkCat.size());

        System.out.println("удаление 100 в ArrayList");
        System.out.println(time(mlarliststinbeg11,mlarlistfinbeg11));
        System.out.println(mlarlistfinbeg11);
        System.out.println(mlarlistfinbeg11);
        System.out.println(arrCat.size());

        System.out.println("удалить 100 в LinkedList");
        System.out.println(time(mllinkliststcent,mllinklistfincent));
        System.out.println(mllinkliststcent);
        System.out.println(mllinklistfincent);
        System.out.println(linkCat.size());

        System.out.println("удаление 100 в ArrayList in the center");
        System.out.println(time(mlarliststinbeg11,mlarlistfinbeg11));
        System.out.println(mlarlistfinbeg11);
        System.out.println(mlarlistfinbeg11);
        System.out.println(arrCat.size());

        System.out.println("удалить 100 в LinkedList in the center");
        System.out.println(time(mllinkliststcent,mllinklistfincent));
        System.out.println(mllinkliststcent);
        System.out.println(mllinklistfincent);
        System.out.println(linkCat.size());

        System.out.println("удаление 100 в ArrayList in the center");
        System.out.println(time(mlarliststinbeg11,mlarlistfinbeg11));
        System.out.println(mlarlistfinbeg11);
        System.out.println(mlarlistfinbeg11);
        System.out.println(arrCat.size());

        System.out.println("get in LinkedList in the center");
        System.out.println(time(mllinkliststcent,mllinklistfincent));
        System.out.println(mllinkliststcent);
        System.out.println(mllinklistfincent);
        System.out.println(linkCat.size());
    }
    static String time(long st, long fin){
        long gen=fin-st;
        long hours = gen/3600000;
        long min = (gen%3600000)/60000;
        long sec = ((gen%3600000)%60000)/1000;
        long ms = ((gen%3600000)%60000)%1000;
        return "hours = "+hours+"\nmin = "+min+"\nsec = "+sec+"\nmillisecond = "+ms;


    }
}
