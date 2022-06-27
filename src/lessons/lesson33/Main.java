package lessons.lesson33;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("test.txt");

        FileReader fileReader = new FileReader("test2.txt");
        Scanner sc = new Scanner(fileReader);
        int counter = 1;
        while(sc.hasNextLine()){
            if (counter==2) {
                System.out.println(counter + ": " + sc.nextLine());
                fileWriter.write(sc.nextLine()+"\n");
                counter=1;
            }else {
                System.out.println(counter + ": " + sc.nextLine());
                counter++;
            }
        }
        fileWriter.close();
        FileReader fileReader1 = new FileReader("test.txt");
        Scanner sc1 = new Scanner(fileReader1);
        while(sc1.hasNextLine()) {
            System.out.println(sc1.nextLine());
        }
    }
}
