import java.sql.*;


public class Connections {

    public static final String DB_NAME = "MusicDB.db";
    //Cannot figure another way to fix this issue, Stay tuned.
    public static final String DB_PATH = "jdbc:sqlite:/Users/(ENTER_USER)/" + DB_NAME;
    public static final  String TABLE_SONGS = "songs";
    public static final String COLUMN_SONGS_ID = "_id";
    public static final String COLUMN_SONGS_TITLE = "title";
    public static final String COLUMN_SONGS_ARTIST = "artist";
    public static final int INDEX_SONGS_TITLE = 1;
    public static final int INDEX_SONGS_ARTIST = 2;

    /* For future reference i will leave these here
    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;
    */



    private static Connection connection;

    public void test() {
        try {
            connection = DriverManager.getConnection(DB_PATH);
            System.out.println("Test Complete, connection established.");
        } catch (SQLException e) {
            System.out.println("Error connecting to db: " + e.getMessage());
            e.printStackTrace();

        }
    }
    public void disconnect() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Connection is now Closed");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: Could not close DB: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void addData( int ID,String name, String song) {
        try (Statement statement = connection.createStatement()){
            statement.execute("INSERT INTO " + TABLE_SONGS +" (_id,artist,title)" +  " VALUES ('" + ID + "' , '"
                    + name + "' ,"+ "'" +song+ "'" + ");");
            System.out.println("Data Added.");

        } catch (SQLException e) {
            System.out.println("SQL Exception when creating artist: " + e.getMessage());
            e.printStackTrace();
        }
    }

   // public void addSong(String song) {
  //      try (Statement statement = connection.createStatement()) {
    //        statement.execute("INSERT INTO " + TABLE_SONGS + "(" + COLUMN_SONGS_TITLE + ")" + "VALUES (\"" + song + "\")");
      //  } catch (SQLException e) {
        //    System.out.println("Song addition failed: " + e.getMessage());
          //  e.printStackTrace();
        //}
    //}
    public void updateData(String title, int id) {
        try (Statement statement = connection.createStatement()) {
            statement.execute("UPDATE " + TABLE_SONGS + " SET " + COLUMN_SONGS_TITLE + "= '"
                    + title + "' WHERE "+ COLUMN_SONGS_ID + " = " + id );
            System.out.println("Update Complete!");
        } catch (SQLException e) {
            System.out.println("Update Failed: " + e.getMessage());
        }


    }

    public void deleteData(int ID) {
        try (Statement statement = connection.createStatement()) {
            statement.execute("DELETE FROM " + TABLE_SONGS + " WHERE " + COLUMN_SONGS_ID + " = '" + ID +"';");
            System.out.println("Deletion Attempt Success");
        } catch (SQLException e) {
            System.out.println("Deletion Attempt Failed: " + e.getMessage());
        }

    }

    public void printData() {
        //StringBuilder sb = new StringBuilder("SELECT * FROM");




        try (Statement statement = connection.createStatement()) {
          ResultSet rs = statement.executeQuery("SELECT * FROM " + TABLE_SONGS);
            System.out.println("ID TITLE ARTIST");
            while (rs.next()) {
                int id = rs.getInt("_id");
                String title = rs.getString("title");
                String artist = rs.getString("artist");
                System.out.println(id+ "    "+title
                        + "    " +artist);
            }

        } catch (SQLException e) {
            System.out.println("Print Attempt Failed: " + e.getMessage());
        }


    }

}
