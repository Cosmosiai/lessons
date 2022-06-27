package homework.hw36;

public class Laptop extends Computer{

    private int newCost;
    private final String whatIs = "laptop";

    public String getWhatIs() {
        return whatIs;
    }

    public Laptop(int cost, String type) {
        super(cost, type);
        this.newCost = campaign(20);
    }

    public int getNewCost() {
        return newCost;
    }
}
