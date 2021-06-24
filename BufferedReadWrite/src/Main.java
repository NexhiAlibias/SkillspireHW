import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        writeFile();
        readTVShows();

    }
    public static void writeFile() {
        try {//This allows me to edit the file that i am also making in this line
            //Initiating the Scanner Input for later
            Scanner type = new Scanner(System.in);
            while (true) {
                System.out.println("Name a TV you binged in 2020:");
                String tvshow = type.nextLine();
                BufferedWriter TVFile = new BufferedWriter(new FileWriter("TVSHOW.txt"));

                TVFile.write( tvshow + "\n"  );
                TVFile.close();
            }

        } catch (IOException e) {
            System.out.println("An Error Occured.");
            e.printStackTrace();
        }


    }
    public static void readTVShows() {
        try {
            BufferedReader TVFile = new BufferedReader(new FileReader("TVSHOW.txt"));
            String read;
                while ((read = TVFile.readLine()) != null) {
                System.out.println(read);
            }

        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
            /*
            Scanner readFile = new Scanner(TVFile);
            while (TVFile.hasNextLine()) {
                String reader = TVFile.nextLine();
                System.out.println(reader);

            }
            readFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }*/ // applies to io.*File*
    }
}
