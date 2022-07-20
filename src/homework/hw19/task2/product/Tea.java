package homework.hw19.task2.product;

class Tea {
    private String type;
    private int gr;

    public Tea(String type, int gr) {
        this.type = type;
        this.gr = gr;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "type='" + type + '\'' +
                ", gr=" + gr +
                '}';
    }
}
