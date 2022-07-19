package homework.hw2_1.oop.hwB;

public class Main {
    public static void main(String[] args) {

        MotherClass mom = new MotherClass("BigMOM","Smiths");
        DaughterClass a = new DaughterClass("BigMOM", "Smiths", "Pasifica");
        DaughterClass b = new DaughterClass("BigMOM", "Smiths", "Veronika");
        DaughterClass c = new DaughterClass("BigMOM", "Smiths", "Lilit");

        System.out.println(mom.toString());
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}
