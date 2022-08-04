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
        System.out.println("вставка 10000 в ArrayList");
        long mlarlistst =  System.currentTimeMillis();
        ad.addInArrList(arrCat,10000,1);
        long mlarlistfin = System.currentTimeMillis();
        System.out.println(time(mlarlistst,mlarlistfin));
        System.out.println(mlarlistst);
        System.out.println(mlarlistfin);

        System.out.println("вставка 10000 в LinkedList");
        long mllinklistst =  System.currentTimeMillis();
        ad.addInLinkedList(linkCat,10000,1);
        long mllinklistfin = System.currentTimeMillis();
        System.out.println(time(mllinklistst,mllinklistfin));
        System.out.println(mllinklistst);
        System.out.println(mllinklistfin);

        System.out.println("вставка 100 в ArrayList in the center");
        long mlarliststincent =  System.currentTimeMillis();
        ad.addInArrList(arrCat,100,2);
        long mlarlistfincent = System.currentTimeMillis();
        System.out.println(time(mlarlistst,mlarlistfin));
        System.out.println(mlarliststincent);
        System.out.println(mlarlistfincent);
        System.out.println(arrCat.size());

        System.out.println("вставка 100 в LinkedList in the center");
        long mllinkliststcent =  System.currentTimeMillis();
        ad.addInLinkedList(linkCat,100,2);
        long mllinklistfincent = System.currentTimeMillis();
        System.out.println(time(mllinkliststcent,mllinklistfincent));
        System.out.println(mllinkliststcent);
        System.out.println(mllinklistfincent);
        System.out.println(linkCat.size());

        System.out.println("вставка 100 в ArrayList in the center");
        long mlarliststinbeg =  System.currentTimeMillis();
        ad.addInArrList(arrCat,100,3);
        long mlarlistfinbeg = System.currentTimeMillis();
        System.out.println(time(mlarlistst,mlarlistfin));
        System.out.println(mlarliststincent);
        System.out.println(mlarlistfincent);
        System.out.println(arrCat.size());

        System.out.println("вставка 100 в LinkedList in the center");
        long mllinkliststbeg =  System.currentTimeMillis();
        ad.addInLinkedList(linkCat,100,3);
        long mllinklistfingeg = System.currentTimeMillis();
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
