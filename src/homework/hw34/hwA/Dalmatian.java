package homework.hw34.hwA;

public class Dalmatian {
    private String name;
    private int weight;
    private int age;
    private String ownerNumber;

    public Dalmatian(String name, int weight, int age, String ownerNumber) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.ownerNumber = ownerNumber;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public void readCollar(){
        System.out.println("My name is "+getName()+".\nMy weight is "+getWeight()+".\nMy age is "+ getAge()+".\nIf you found me, pleace, call to "+getOwnerNumber());
    }
}
