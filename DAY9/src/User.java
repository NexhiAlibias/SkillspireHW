import java.util.ArrayList;

public class User {
  private String firstName;
  private String lastName;
  private  String email;
  private  int userId;
  private  ArrayList<Book> booksOut;
  private  double balanceUnpaid;

    public User(String firstName, String lastName, String email, int userId, ArrayList<Book> booksOut, double balanceUnpaid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userId = userId;
        this.booksOut = booksOut;
        this.balanceUnpaid = balanceUnpaid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<Book> getBooksOut() {
        return booksOut;
    }

    public void setBooksOut(ArrayList<Book> booksOut) {
        this.booksOut = booksOut;
    }

    public double getBalanceUnpaid() {
        return balanceUnpaid;
    }

    public void setBalanceUnpaid(double balanceUnpaid) {
        this.balanceUnpaid = balanceUnpaid;
    }

    public void overduePayments(double daysOverdue){
        daysOverdue *= .50;
        daysOverdue += balanceUnpaid;





        System.out.println(getFirstName() + " " + getLastName() + " has "
                + daysOverdue + " indebted to the library.");

    }
}


