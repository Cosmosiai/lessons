package homework.hw2_1.oop.hwB;

public class DaughterClass extends MotherClass {
    private static int sisterCount=0;
    private boolean hasMom=true;

    public DaughterClass(String motherName, String family, String daughter) {
        super(motherName, family, daughter);
        sisterCount+=1;
    }



    @Override
    public String toString() {
        return "Daughter{" +
                "motherName='" + getMotherName() + '\'' +
                ", family='" + getFamily() + '\'' +
                ", daughter='" + getDaughter() + '\'' +
                ", sisters=" + sisterCount +
                ", hasMom=" + hasMom +
                '}';
    }
}
