
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main implements Runnable {
    public static void main(String[] args) {
        runBackgroundCheck();
       /* Main tObj = new Main();
        Thread thread = new Thread(tObj);
        thread.start();
        System.out.println("Test1");*/

    }

    public static void runBackgroundCheck(){
        Main readOBJ = new Main();
        Thread thread1 = new Thread(readOBJ);
        Thread thread2 = new Thread(readOBJ);
        thread1.start();

        try {
            File BGC  = new File("King County Court.txt");
            Scanner readFile = new Scanner(BGC);
            while (readFile.hasNextLine()){
                String data = readFile.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error! File not Found.");
            e.printStackTrace();

        }
        thread2.run();

    }
    public void run(){
        try {
            File BGC  = new File("DoJ.txt");
            Scanner readFile = new Scanner(BGC);
            while (readFile.hasNextLine()){
                String data = readFile.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error! File not Found.");
            e.printStackTrace();

        }
    }

}
