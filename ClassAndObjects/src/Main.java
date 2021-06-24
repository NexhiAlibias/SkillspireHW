import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Elijah", "Berry", "NexhiAlibias", "iambatman1");
        User user2 = new User("Edward", "Elric", "FullMetal", "3oct11");
        User user3 = new User();

        System.out.println(user1.getFirstName() + " " + user1.getLastName() + " "
                + user1.getUserName() + " " + user1.getPassword());
        System.out.println(user2.getFirstName() + " " + user2.getLastName() + " "
                + user2.getUserName() + " " + user2.getPassword());
        System.out.println(user3.getFirstName() + " " + user3.getLastName() + " "
                + user3.getUserName() + " " + user3.getPassword());
    }

}
