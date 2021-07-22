import java.sql.*;
public class Main {
    public static void main(String[] args) {
        //Test to see if the connection to DB works.
        Connections one = new Connections();

        one.test();
        //Initial setup of the the database
        one.addData(1,"Beyonce", "Green light");
        one.addData(2,"The Weeknd", "Starboy");
        one.addData(3, "Whitney Huston", "Million Dollar Bill");
        one.addData(4, "Doja Cat", "Say So");
        one.printData();

        //Put the new title first then the old title it is replacing
        one.updateData( "XO",1);
        one.updateData("Party Monster", 2);
        one.updateData("Boss B", 4);
        one.printData();

        //Using by ID for time convience
        one.deleteData(1);
        one.deleteData(2);
        one.deleteData(3);
        one.deleteData(4);
        one.printData();


        one.disconnect();


    }
}
