import java.sql.*;
import java.util.InputMismatchException;

import static java.lang.System.out;

public class Person {

    @Override
    public String toString() {
        return "Person:" + "\nFirst Name: " +  getFirstName() + "\nLast Name: " + getLastName() + "\nAge: " + getAge() + "\nSocial Security Number: " + getSsn() + "\nCredit Card Number: " + getCreditCard();
    }

    private String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    private String lastName;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private long ssn;

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public long getSsn() {
        return ssn;
    }

    private long creditCard;

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    public long getCreditCard() {
        return creditCard;
    }

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

    protected static void insertPerson(Person person) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            String insertStatement = "INSERT INTO personalInformation (first, last, age, ssn, creditCard) VALUES (" + person.firstName + "," + person.lastName + "," + person.age + "," + person.ssn + "," + person.creditCard + ")";
            statement.executeUpdate(insertStatement);
            out.println("Insert into table completed successfully!");
            statement.close();
            connection.close();
        } catch (SQLException | InputMismatchException e) {
            out.println("Uh oh! Something went wrong!");
            e.printStackTrace();
        }
    }
    protected Person selectPerson(Person person) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM personalInformation WHERE first= " + "'Gabriel'" + ";");
            while (set.next()) {
                person.setFirstName(set.getString("first"));
                person.setLastName(set.getString("last"));
                person.setAge(set.getInt("age"));
                person.setSsn(set.getLong("ssn"));
                person.setCreditCard(set.getLong("creditCard"));
            }
            set.close();
            statement.close();
            connection.close();
            out.println("'Gabriel'" + " returned successfully!");


        }catch (SQLException e) {
            e.printStackTrace();
            person = null;
        }
        return person;
    }
}
