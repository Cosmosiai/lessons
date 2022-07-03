package homework.hw2_4;

public class HardDisk {
    private int memory;
    private int part;

    public HardDisk(int memory, int part) {
        this.memory = memory;
        this.part = part;
    }

    public int getMemory() {
        return memory;
    }

    public int getPart() {
        return part;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setPart(int part) {
        this.part = part;
    }
}
