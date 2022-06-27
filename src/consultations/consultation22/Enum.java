package consultations.consultation22;

public enum Enum {
    Monday(1,"понедельник"),
    ;

    private int dayInt;
    private String ru;

    Enum(int dayInt, String ru) {
        this.dayInt = dayInt;
        this.ru = ru;
    }

    public int getDayInt() {
        return dayInt;
    }

    public String getRu() {
        return ru;
    }
}
