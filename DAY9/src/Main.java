import javax.sql.XAConnectionBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayLists of Books
        ArrayList<Book> userBooksOut = new ArrayList<>();
        ArrayList<Book> userBooksOut2 = new ArrayList<>();
        ArrayList<Book> empBooksOut = new ArrayList<>();
        ArrayList<Book> empBooksOut2 = new ArrayList<>();

        //Books for List 1
        Book TWoS = new Book("The Way of Shadows", "Brent Weeks", 452);
        Book SE = new Book("Shadow's Edge", "Brent Weeks", 642);
        Book BtS = new Book("Beyond the Shadows", "Brent Weeks", 942);

        //Books for List 2
        Book TO = new Book("The Outsiders", "S.E Hinton", 192);
        Book TTTN = new Book("That was Then, This is Now", "S.E Hinton", 159);

        // Books for List 3
        Book NEB = new Book("Not Even Bones", "Rebecca Schaeffer", 384);
        Book OAR = new Book("Only Ashes Remain", "Rebecca Schaeffer", 448);
        Book WVR = new Book("When Villans Rise", "Rebecca Schaeffer", 384);

        // Books for List 4
        Book TG = new Book("The Giver", "Lois Lowry", 208);
        Book TS = new Book("The Son", "Lois Lowry", 393);

        //Assigns Books to specific User / Emp
        userBooksOut.add(TWoS);
        userBooksOut.add(SE);
        userBooksOut.add(BtS);

        empBooksOut.add(TO);
        empBooksOut.add(TTTN);

        userBooksOut2.add(NEB);
        userBooksOut2.add(OAR);
        userBooksOut2.add(WVR);

        empBooksOut2.add(TG);
        empBooksOut2.add(TS);


        //Creates Users
        User Brent = new User("Brent", "Weeks",
                "brentweeks@genericemail.com", 99825123, userBooksOut, 5.00 );
        User Xavier = new User("Xavier", "Camcho",
                "brentweeks@genericemail.com", 99823310, empBooksOut2, 5.00 );


        // Creates Employees
        Employee Willow = new Employee("Willow", "Lutalo",
                "tootiredforthis@generic.com", 99416629, empBooksOut, 6.00,
                65, "WilLutalo", "99hf;3359!e" );
        Employee Barbara = new Employee("Barbara", "Gordon",
                "sibyl@generic.com", 99415123, userBooksOut2, 6.00,
                70, "BarGordon", "8404AC13!;" );




        /* Making a new arraylist to add specifically to a library object. This is to grab all of those books regardless
        * if checked out or not. */
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

        // Setting up the Library with all of the arrays listed together.
        Library StCharlesLib = new Library("St. Charles Library", SCLbooks, SCLEmployees, SCLUsers);


        System.out.println("Books owned in " + StCharlesLib.getName() + " are as listed as followed: \n");
        //Running for loops to list all of objects in specified array with their specified
        for (int i = 0; i < SCLbooks.size(); i++) {
            System.out.println(SCLbooks.get(i).getTitle());
        }
        System.out.println("\nThe current Employees working at " + StCharlesLib.getName() + "are: \n");
        for (int i = 0; i < SCLEmployees.size(); i++) {
            System.out.println(SCLEmployees.get(i).getFirstName() + " " + SCLEmployees.get(i).getLastName());
        }

        System.out.println("\nCurrent Readers of the Month are: \n");
        for (int i = 0; i < SCLUsers.size(); i++) {
            System.out.println(SCLUsers.get(i).getFirstName() + " " + SCLUsers.get(i).getLastName());
        }

        /* Overdue payments check to see how many days overdue the books are, multiplies those days by .10 if youre an
         * employee and .50 if you're a normal User */
        Barbara.overduePayments(5);
        Xavier.overduePayments(5);


    }
}
