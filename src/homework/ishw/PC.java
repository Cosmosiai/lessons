package homework.ishw;


public class PC extends Computer{

    private int diag;
    private final String whatIs = "PC";

    public String getWhatIs() {
        return whatIs;
    }

    public PC(int cost, String type, int diag) {
        super(cost, type);
        this.diag = diag;
    }


    public int getDiag() {
        return diag;
    }
}
