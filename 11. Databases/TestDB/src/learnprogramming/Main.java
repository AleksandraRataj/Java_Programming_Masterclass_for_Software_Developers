package learnprogramming;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\Aleksandra\\Desktop\\Java " +
            "Programming Masterclass\\TestDB\\" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

//        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Aleksandra\\Desktop\\Java " +
//                "Programming Masterclass\\TestDB\\testjava.db");
//             Statement statement = conn.createStatement()) {
//            conn.setAutoCommit(false);

        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text " + ")");

            insertContact(statement,"Tim", 123456, "Tim@gmail.com");
            insertContact(statement,"Joe", 124566, "joe@gmail.com");
            insertContact(statement,"Jane", 1345346, "jane@gmail.com");
            insertContact(statement,"Fido", 9999, "doggo@gmail.com");

//            statement.execute("INSERT INTO " + TABLE_CONTACTS +
//                    "(" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL + ")" +
//                    "VALUES('Joe', 19395945, 'joe@gmail.com')");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET "
                    + COLUMN_PHONE + "=55555" +
                    " WHERE " + COLUMN_NAME + "='Jane'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + "='Joe'");

//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Joe', 3876543, 'joe@gmail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Jane', 1234567, 'jane123@gmail.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email) VALUES('Fido', 11223344, 'dog@gmail.com')");
//            statement.execute("UPDATE contacts SET phone=9988776655 WHERE name='Jane'");
//            statement.execute("DELETE FROM contacts WHERE name='Joe'");
//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }
            results.close();

            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                "(" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL + ")" +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}
