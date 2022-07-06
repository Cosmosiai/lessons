package homework.hw2_5.hwA;

public class GrandDaughter extends Daughter{

    private boolean is18;

    public GrandDaughter(int daughterCount, String status, int grandDaughter, boolean is18) {
        super(daughterCount, status, grandDaughter);
        this.is18 = is18;
    }

    public boolean isIs18() {
        return is18;
    }

    @Override
    public String toString() {
        return super.toString() + ", is18 = "+is18;
    }
}
