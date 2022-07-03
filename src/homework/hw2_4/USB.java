package homework.hw2_4;

public class USB {
    private String version;
    private int id;

    public USB(String version, int id) {
        this.version = version;
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public int getId() {
        return id;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setId(int id) {
        this.id = id;
    }
}
