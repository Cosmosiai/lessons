package homework.hw29;

public abstract class Aircraft {
    private static int counter=0;
    private int id;
    private String model;
    private boolean type;

    public Aircraft(String model, boolean type) {
        this.counter++;
        this.model = model;
        this.type = type;
        this.id=counter;
    }

    public  int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public boolean isType() {
        return type;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "model='" + model + '\'' +
                ", type=" + type +
                '}';
    }
}
