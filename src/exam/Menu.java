package exam;

public class Menu {
    public void menu(){
        Connect connect = new Connect();
        System.out.println("what do you want to do? \n" +
                "1. write new news\n" +
                "2. delete news\n" +
                "3. change news\n" +
                "4. show news");
        int a = connect.scan.nextInt();
        switch (a) {
            case 1:
                connect.newNews();
                break;
            case 2:
                connect.deleteByID();
                break;
            case 3:
                connect.changeNews();
                break;
            case 4:
                connect.showByID();
                break;
            default:
                break;
        }
    }
}
