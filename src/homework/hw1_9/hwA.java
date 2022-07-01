package homework.hw1_9;

public class hwA {
    public static void main(String[] args) {
        for (int i=1;i<11;i++){
            for (int j=1;j<11;j++){
                if (j==1){
                    System.out.println();
                }
                if (i*j/10!=0){
                    System.out.print(i*j+"  ");
                }else {
                    System.out.print(i*j+"   ");
                }
            }
        }
    }
}
