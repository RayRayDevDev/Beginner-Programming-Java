import java.sql.SQLException;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {
//    static final String DB_URL = "jdbc:mysql://localhost/Person";
//    static final String USER = "root";
//    static final String PASS = "root";


    public static void main(String[] args) throws SQLException {
//        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
//        Statement statement = connection.createStatement();
//                String createDB = "CREATE DATABASE Person";
//                statement.executeUpdate(createDB);
//                String createTable = "CREATE TABLE personalInformation" +
//                        "(id INTEGER not NULL, " +
//                        " first VARCHAR(255), " +
//                        " last VARCHAR(255), " +
//                        " age INTEGER, " +
//                        " ssn BigInt, " +
//                        " creditCard BigInt, " +
//                        " PRIMARY KEY ( id ))";
//                statement.executeUpdate(createTable);
        Scanner userInput = new Scanner(System.in);
        out.println("Please enter the corresponding number to select the desired action:\n1. Insert a new Person into the database.\n2. Select and display a particular record by first name. ");
        out.print("Please make your selection: ");
        int userSelection = userInput.nextInt();
        switch (userSelection) {
            case 1:
                UserInputs.insertPersonUI();
                break;
            case 2:
                Person newPerson = new Person();
                UserInputs.selectPersonUI(newPerson);
                break;
        }

    }
}
