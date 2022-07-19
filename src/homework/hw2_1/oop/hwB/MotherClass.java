package homework.hw2_1.oop.hwB;

public class MotherClass {
    private String motherName;
    private String family;
    private String daughter;

    public MotherClass(String motherName, String family, String daughter) {
        this.motherName = motherName;
        this.family = family;
        this.daughter = daughter;
    }

    public MotherClass(String motherName, String family) {
        this.motherName = motherName;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Mother{" +
                "motherName='" + motherName + '\'' +
                ", family='" + family + '\'' +
                '}';
    }

    public String getMotherName() {
        return motherName;
    }

    public String getFamily() {
        return family;
    }

    public String getDaughter() {
        return daughter;
    }

}
