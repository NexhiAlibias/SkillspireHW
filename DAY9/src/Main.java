import javax.sql.XAConnectionBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 2 seperate booksOut one for the Employee and User.
        ArrayList<Book> userBooksOut = new ArrayList<>();

        ArrayList<Book> empBooksOut = new ArrayList<>();

        Book TWoS = new Book("The Way of Shadows", "Brent Weeks", 452);
        Book SE = new Book("Shadow's Edge", "Brent Weeks", 642);
        Book BtS = new Book("Beyond the Shadows", "Brent Weeks", 942);

        // Adds the first three Book Objects into the booksOut Array List
        userBooksOut.add(TWoS);
        userBooksOut.add(SE);
        userBooksOut.add(BtS);

        //Books objects to add to the Employee Arraylist
        Book TO = new Book("The Outsiders", "S.E Hinton", 192);
        Book TTTN = new Book("That was Then, This is Now", "S.E Hinton", 159);

        empBooksOut.add(TO);
        empBooksOut.add(TTTN);


        User Brent = new User("Brent", "Weeks",
                "brentweeks@genericemail.com", 99825123, userBooksOut, 5.00 );


        Employee Willow = new Employee("Willow", "Lutalo",
                "tootiredforthis@generic.com", 99416629, empBooksOut, 6.00,
                65, "WilLutalo", "99hf;3359!e" );



        // New Arraylists for the second Library.
        ArrayList<Book> userBooksOut2 = new ArrayList<>();
        ArrayList<Book> empBooksOut2 = new ArrayList<>();

        Book NEB = new Book("Not Even Bones", "Rebecca Schaeffer", 384);
        Book OAR = new Book("Only Ashes Remain", "Rebecca Schaeffer", 448);
        Book WVR = new Book("When Villans Rise", "Rebecca Schaeffer", 384);

        userBooksOut2.add(NEB);
        userBooksOut2.add(OAR);
        userBooksOut2.add(WVR);

        Book TG = new Book("The Giver", "Lois Lowry", 208);
        Book TS = new Book("The Son", "Lois Lowry", 393);

        empBooksOut2.add(TG);
        empBooksOut2.add(TS);


        User Xavier = new User("Xavier", "Camcho",
                "brentweeks@genericemail.com", 99823310, empBooksOut2, 5.00 );

        Employee Barbara = new Employee("Barbara", "Gordon",
                "sibyl@generic.com", 99415123, userBooksOut2, 6.00,
                70, "BarGordon", "8404AC13!;" );

        /* Overdue payments check to see how many days overdue the books are, multiplies those days by .10 if youre an
        * employee and .50 if you're a normal User */
        Barbara.overduePayments(5);
        Xavier.overduePayments(5);



        /* Making a new arraylist to add specifically to a library object. This is to grab all of those books regardless if
        *  checked out or not. Book Acronyms come from lines 15-17 23-24  */
        ArrayList<Book> SCLbooks = new ArrayList<>();
        SCLbooks.add(TWoS);
        SCLbooks.add(SE);
        SCLbooks.add(BtS);
        SCLbooks.add(TO);
        SCLbooks.add(TTTN);
        SCLbooks.add(NEB);
        SCLbooks.add(OAR);
        SCLbooks.add(WVR);
        SCLbooks.add(TG);
        SCLbooks.add(TS);
        // Adds the User class
        ArrayList<User> SCLUsers = new ArrayList<>();
        SCLUsers.add(Brent);
        SCLUsers.add(Xavier);

        ArrayList<Employee> SCLEmployees = new ArrayList<>();
        SCLEmployees.add(Willow);
        SCLEmployees.add(Barbara);

        // Setting up the first Library with all of the arrays listed together.
        Library StCharlesLib = new Library("St. Charles Library", SCLbooks, SCLEmployees, SCLUsers);
        for (int i = 0; i < SCLbooks.toArray().length; i++)
        {
            System.out.println(SCLbooks.get(i).toString());
        }

    }
}
