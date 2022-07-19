package homework.hw2_1.oop.hwA;

public class Main {
    public static void main(String[] args) {
        Student a = new Student("Акылбек", 19,2,"INAI.KG");
        Student b = new Student("Michael Wazowski", 18,1,"Monster University");
        Student c = new Student("James P. Sullivan", 21,3,"Monster University");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}
