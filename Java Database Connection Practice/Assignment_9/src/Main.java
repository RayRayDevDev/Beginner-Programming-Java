import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost/Person";
    static final String USER = "root";
    static final String PASS = "root";


    public static void main(String[] args) {
            try {
                Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement statement = connection.createStatement();
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
//                String insertStatement = "INSERT INTO personalInformation VALUES (1, 'Gabriel', 'Conception', 25, 212551234, 5412154125845421)";
//                String insertStatement = "INSERT INTO personalInformation VALUES (2, 'Oscar', 'Lawson', 19, 895455875, 9859545121254521)";
//                statement.executeUpdate(insertStatement);
//                out.println("Insert into table completed successfully!");
//                out.println("Table successfully created!");
//                out.println("Database successfully created!");
                Scanner userInput = new Scanner(System.in);
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                int exit = 0;
                while(exit != -1) {
                        Person newPerson = new Person();
                        out.print("Welcome! Type -1 to exit. Please enter the first name of the person you want to enter: ");
                        newPerson.setFirstName(String.valueOf(sb1.append(String.format("'%s'", userInput.nextLine()))));
                        out.println(newPerson.getFirstName());
                        out.print("Now, please enter their last name: ");
                        newPerson.setLastName(String.valueOf(sb2.append(String.format("'%s'", userInput.nextLine()))));
                        out.println(newPerson.getLastName());
                        out.print("Next, enter their age: ");
                        newPerson.setAge(userInput.nextInt());
                        out.print("Now, please enter their Social Security Number (do not use anyone's real ssn!): ");
                        newPerson.setSsn(userInput.nextLong());
                        out.print("Finally, please enter their primary credit card number (do not enter anyone's real cc number!): ");
                        newPerson.setCreditCard(userInput.nextLong());
                        newPerson.insertNewPerson(newPerson);
                        out.println("Exit? Type -1 to exit, else type any number to insert another record: ");
                        exit = userInput.nextInt();
                        if (exit == -1) {
                            break;
                        }
                    }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

}
