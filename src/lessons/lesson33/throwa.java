package lessons.lesson33;

public class throwa {
    public static void main(String[] args) {

        try {
            int a=0;
            int b=10/a;
            System.out.println("text");
        }catch (Exception x){
            System.out.println(x);
        }

    }

}
