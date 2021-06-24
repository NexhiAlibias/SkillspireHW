import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;
    private ArrayList<Employee> employee;
    private ArrayList<User> user;

    public Library(String name, ArrayList<Book> books, ArrayList<Employee> employee, ArrayList<User> user) {
        this.name = name;
        this.books = books;
        this.employee = employee;
        this.user = user;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

}
