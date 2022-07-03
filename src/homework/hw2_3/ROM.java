package homework.hw2_3;

public class ROM {
    private int value;
    private String manufacture;

    public ROM(int value, String manufacture) {
        this.value = value;
        this.manufacture = manufacture;
    }

    public int getValue() {
        return value;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
