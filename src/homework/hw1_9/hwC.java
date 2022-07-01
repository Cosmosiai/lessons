package homework.hw1_9;

import java.util.Scanner;

public class hwC {
    static Scanner a = new Scanner(System.in);

    public static void main(String[] args) {
        int b = a.nextInt();

        for(int i=1;i<=b+1;i++) {
            int c = i;

            int delete= 1;
            int check1=1;
            while (c!=0) {
                int check = 1;
                delete=c%10;
                c=c/10;
                if (delete==0){
                    check=0;
                    check1=check;
                    break;
                } else {
                    if (i%delete!=0){
                        check=0;
                        check1=check;
                        break;
                    }
                }
            }
            if(check1==1){
                System.out.println(i);
            }
        }
    }
}
