import java.sql.SQLException;
import java.util.InputMismatchException;
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
        userSelection();

    }

    public static void userSelection() {

        int userSelection = 0;
        while (userSelection != -1) {
            Scanner userInput = new Scanner(System.in);
            Person newPerson = new Person();
            out.println("\nPlease enter the corresponding number to select the desired action (-1 to exit):\n1. Insert a new Person into the database.\n2. Select and display a particular record by first and last names.\n3. Select and display the entire database.");
            out.print("Please make your selection: ");
            try {
                userSelection = userInput.nextInt();
                switch (userSelection) {
                    case -1:
                        break;
                    case 1:
                        UserInputs.insertPersonUI();
                        break;
                    case 2:
                        UserInputs.selectPersonUI(newPerson);
                        break;
                    case 3:
                        UserInputs.findAllPeopleUI();
                        break;
                    default:
                        out.println("\nYou did not select a correct option. Please try again!");
                        continue;
                }
            } catch (InputMismatchException e) {
                out.println(e.getMessage());
                userSelection = 0;
                continue;
            }
        }
    }
}
