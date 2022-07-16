import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private long ssn;
    private long creditCard;

    Person() {
    }

    Person(String firstName, String lastName, int age, long ssn, long creditCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.creditCard = creditCard;
    }

//    int i;

    private static final String DB_URL = "jdbc:mysql://localhost/Person";
    private static final String USER = "root";
    private static final String PASS = "root";

    protected void insertPerson(Person person) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String insertStatement = "INSERT INTO personalInformation (first, last, age, ssn, creditCard) VALUES (" + person.firstName + "," + person.lastName + "," + person.age + "," + person.ssn + "," + person.creditCard + ")";
            statement.executeUpdate(insertStatement);
            out.println("Insert into table completed successfully!");
        } catch (SQLException | InputMismatchException e) {
            out.println("Uh oh! Something went wrong!");
            e.printStackTrace();
        }
    }


}
