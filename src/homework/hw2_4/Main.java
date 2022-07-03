package homework.hw2_4;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("red", "samsung", new Display(50,"AMOLED","samsung"),new HardDisk(256,1),new Keyboard(new String[]{"й", "ц", "у", "к", "е", "н", "г", "ш", "щ", "з", "х", "ф", "ы", "в", "а", "п", "р", "о", "л", "д", "ж", "э", "я", "ч", "с", "м", "и", "т", "ь", "б", "ю", "ъ", "ё"},true, true),new ROM(16,"samsung"),new USB("3.1",2516), new User("Jim K. Kim", "jim12", "2000",-22,false));

        System.out.println(computer.toString());

        computer.getDisplay().setDiagonal(142);
        computer.getDisplay().setType("Super AMOLED");
        computer.getUsb().setId(24587);
        computer.setRom(new ROM(32,"SanDisk"));

        System.out.println(computer.toString());
    }
}
