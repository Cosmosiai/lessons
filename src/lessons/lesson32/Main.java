package lessons.lesson32;

public class Main {
    public static void main(String[] args) {
        Cat cat[] = new Cat[4];

        cat[0] = new Cat("name1");
        cat[1] = new Cat("name2");
        cat[2] = null;
        cat[3] = new Cat("name3");

        for (int i = 0; i < 6; i++) {
            try {
                System.out.println(cat[i].getName());
            } catch (NullPointerException e) {
                System.out.println(e.getMessage() + " I am here Exception");
            } catch (Exception e) {
                System.out.println("stop");
            }
        }
    }
}

