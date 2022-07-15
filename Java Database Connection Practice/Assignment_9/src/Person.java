import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;

import static java.lang.System.out;

public class Person {
    String firstName = null;
    String lastName = null;
    int age = 0;
    long ssn = 0;
    long creditCard = 0;

    Person(String firstName, String lastName, int age, long ssn, long creditCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.creditCard = creditCard;
    }

//    int i;

    static final String DB_URL = "jdbc:mysql://localhost/Person";
    static final String USER = "root";
    static final String PASS = "root";

    public void insertPerson(Person person) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String insertStatement = "INSERT INTO personalInformation (first, last, age, ssn, creditCard) VALUES (" + firstName + "," + lastName + "," + age + "," + ssn + "," + creditCard + ")";
            statement.executeUpdate(insertStatement);
            out.println("Insert into table completed successfully!");
        } catch (SQLException | InputMismatchException e) {
            out.println("Uh oh! Something went wrong!");
            e.printStackTrace();
        }
    }
}
