package homework.hw2_5.hwA;

public class Daughter extends MotherClass{
private int grandDaughter;

    public Daughter(int daughterCount, String status, int grandDaughter) {
        super(daughterCount, status);
        this.grandDaughter = grandDaughter;
    }

    @Override
    public String toString() {
        return super.toString()+", grandDaughter = "+grandDaughter;
    }
}
