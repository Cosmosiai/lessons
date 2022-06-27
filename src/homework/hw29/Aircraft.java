package homework.hw29;

public abstract class Aircraft {
    private static int id;
    private String model;
    boolean type;

    public Aircraft(int id, String model, boolean type) {
        this.id = id;
        this.model = model;
        this.type = type;
        id++;
    }

    public static int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public boolean isType() {
        return type;
    }
}
