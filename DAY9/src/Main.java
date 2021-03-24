import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> booksOut = new ArrayList<>();
        ArrayList<Book> booksOut1 = new ArrayList<>();
        Book TWoS = new Book("The Way of Shadows", "Brent Weeks", 452);
        Book SE = new Book("Shadow's Edge", "Brent Weeks", 642);
        Book BtS = new Book("Beyond the Shadows", "Brent Weeks", 942);

        booksOut.add(TWoS);
        booksOut.add(SE);
        booksOut.add(BtS);


        Book TO = new Book("The Outsiders", "S.E Hinton", 192);
        Book TTTN = new Book("That was Then, This is Now", "S.E Hinton", 159);

        booksOut1.add(TO);
        booksOut1.add(TTTN);


        User Brent = new User("Brent", "Weeks",
                "brentweeks@genericemail.com", 99825123, booksOut, 5.00 );
        Employee Willow = new Employee("Willow", "Lutalo",
                "tootiredforthis@generic.com", 99416629, booksOut1, 6.00,
                65, "WilLutalo", "99hf;3359!e" );

        ArrayList<Book> booksOut3 = new ArrayList<>();
        ArrayList<Book> booksOut4 = new ArrayList<>();

        Book NEB = new Book("Not Even Bones", "Rebecca Schaeffer", 384);
        Book OAR = new Book("Only Ashes Remain", "Rebecca Schaeffer", 448);
        Book WAR = new Book("When Villans Rise", "Rebecca Schaeffer", 384);

        booksOut3.add(NEB);
        booksOut3.add(OAR);
        booksOut3.add(WAR);

        Book TG = new Book("The Giver", "Lois Lowry", 208);
        Book TS = new Book("The Son", "Lois Lowry", 393);

        booksOut4.add(TG);
        booksOut4.add(TS);


        User Xavier = new User("Xavier", "Camcho",
                "brentweeks@genericemail.com", 99823310, booksOut4, 5.00 );

        Employee Barbara = new Employee("Barbara", "Gordon",
                "sibyl@generic.com", 99415123, booksOut3, 6.00,
                70, "BarGordon", "8404AC13!;" );
        Barbara.overduePayments(5);
        Xavier.overduePayments(5);


        ArrayList<Book> SCLbooks = new ArrayList<>();
        SCLbooks.add(TWoS);
        SCLbooks.add(SE);
        SCLbooks.add(BtS);
        SCLbooks.add(TO);
        SCLbooks.add(TTTN);

        ArrayList<User> SCLUsers = new ArrayList<>();
        SCLUsers.add(Brent);

        ArrayList<Employee> SCLEmployees = new ArrayList<>();
        SCLEmployees.add(Willow);


        Library StCharlesLib = new Library("St. Charles Library", SCLbooks, SCLEmployees, SCLUsers);


        ArrayList<Book> FFLbooks = new ArrayList<>();
        FFLbooks.add(NEB);
        FFLbooks.add(OAR);
        FFLbooks.add(WAR);
        FFLbooks.add(TG);
        FFLbooks.add(TS);

        ArrayList<User> FFLUsers = new ArrayList<>();
        FFLUsers.add(Xavier);

        ArrayList<Employee> FFLEmployees = new ArrayList<>();
        FFLEmployees.add(Barbara);


        Library FairFaxLib = new Library("Fairfax County Library", SCLbooks, SCLEmployees, SCLUsers);




    }
}
