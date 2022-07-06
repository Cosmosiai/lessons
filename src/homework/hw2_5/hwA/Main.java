package homework.hw2_5.hwA;

public class Main {
    public static void main(String[] args) {
        MotherClass motherClass = new MotherClass(2,"not abstract");
        Daughter daughter = new Daughter(1, "not abstract", 1);
        GrandDaughter grandDaughter= new GrandDaughter(0, "not abstract", 0,false);

        System.out.println(motherClass.toString());
        System.out.println(daughter.toString());
        System.out.println(grandDaughter.toString());
    }
}
