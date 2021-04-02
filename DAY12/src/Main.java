import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Guitar Factory";
        Department GuitarFactory = new Department(name);
        System.out.println(GuitarFactory.getName());
        Department FluteStore = new Department("Flute Store");
        System.out.println(FluteStore.getName());
        Department DrumAndBooks = new Department("Drums and Books");
        System.out.println(DrumAndBooks.getName());

        GuitarFactory.addInstruments(new Strings ("Electric Guitar"));
        FluteStore.addInstruments(new Wind("Flute"));
        DrumAndBooks.addInstruments(new Percussion("Tambourine"));
        System.out.println(GuitarFactory.getNumberOfInstruments());
        System.out.println(FluteStore.getNumberOfInstruments());
        System.out.println(DrumAndBooks.getNumberOfInstruments());

        // Guessing Game with Scanner
        Scanner obj1  = new Scanner(System.in);
        System.out.println("Guess a number between 1-10");
        int guess = obj1.nextInt();
        guessGame(guess);



    }

    public static void guessGame(int guess) {

        int num = (int)(Math.random() * 11); // 0 to 10
        if (num == guess) {
            System.out.println("Correct Answer! The Answer was " + num);
        } else {
            System.out.println("Sorry! The number was " + num + " You entered " + guess);
        }


    }
}
