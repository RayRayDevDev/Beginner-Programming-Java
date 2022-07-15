import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.System.out;

public class Person {
    String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    String lastName;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    long ssn;

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public long getSsn() {
        return ssn;
    }

    long creditCard;

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    public long getCreditCard() {
        return creditCard;
    }

    int i;


    Person() {
    }

    static final String DB_URL = "jdbc:mysql://localhost/Person";
    static final String USER = "root";
    static final String PASS = "root";

    public void insertNewPerson(Person person) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            final String insertStatement = "INSERT INTO personalInformation VALUES (" + i + "," + person.getFirstName() + "," + person.getLastName() + "," + person.getAge() + "," + person.getSsn() + "," + person.getCreditCard() + ")";
            statement.executeUpdate(insertStatement);
            out.println("Insert into table completed successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
