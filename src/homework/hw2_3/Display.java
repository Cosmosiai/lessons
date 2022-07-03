package homework.hw2_3;

public class Display {
    private int diagonal;
    private String type;
    private String manufacturer;

    public Display(int diagonal, String type, String manufacturer) {
        this.diagonal = diagonal;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
