package homework.hw2_5.hwA;

public class MotherClass {
    private int daughterCount;
    private String Status;

    public MotherClass(int daughterCount, String status) {
        this.daughterCount = daughterCount;
        this.Status = status;
    }

    @Override
    public String toString() {
        return "daughterCount=" + daughterCount +
                ", Status='" + Status;
    }
}
