package homework.hw2_3;

public class Computer {
    private String color;
    private String brand;
    private Display display;
    private HardDisk hardDisk;
    private Keyboard keyboard;
    private ROM rom;
    private USB usb;

    public Computer(String color, String brand, Display display, HardDisk hardDisk, Keyboard keyboard, ROM rom, USB usb) {
        this.color = color;
        this.brand = brand;
        this.display = display;
        this.hardDisk = hardDisk;
        this.keyboard = keyboard;
        this.rom = rom;
        this.usb = usb;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public Display getDisplay() {
        return display;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public ROM getRom() {
        return rom;
    }

    public USB getUsb() {
        return usb;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setRom(ROM rom) {
        this.rom = rom;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    @Override
    public String toString() {
        return "Computer" +
                "\ncolor=" + color + "" +
                "\nbrand='" + brand + '\'' +
                "\ndisplay:\n" + "~diagonal = "+display.getDiagonal() +"\n~type = "+display.getType()+"\n~manufacture = "+display.getManufacturer()+
                "\nhardDisk:\n~memory = " + hardDisk.getMemory() + "\n~part = " + hardDisk.getPart()+
                "\nkeyboard:\n~is there backlight = " + keyboard.isBacklights() +"\n~is there additional digits = "+keyboard.isExtraKeys()+
                "\nrom:\n~value = " + rom.getValue() +"\n~manufacture = "+rom.getManufacture()+
                "\nusb:\n~type = " + usb.getVersion() +"\n~USB ID = "+usb.getId()+"\n";
    }
}
