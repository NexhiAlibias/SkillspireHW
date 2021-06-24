import java.util.ArrayList;

public class Employee extends User {
    int ptoDays;
    private String username;
    private String password;

    public Employee(String firstName, String lastName, String email, int userId, ArrayList<Book> booksOut, double balanceUnpaid, int ptoDays, String username, String password) {
        super(firstName, lastName, email, userId, booksOut, balanceUnpaid);
        this.ptoDays = ptoDays;
        this.username = username;
        this.password = password;
    }

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public void overduePayments(double daysOverdue){
        daysOverdue *= .10;
        daysOverdue += getBalanceUnpaid();





        System.out.println(getFirstName() + " " + getLastName() + " has "
                + daysOverdue + " indebted to the library.");

    }
}
