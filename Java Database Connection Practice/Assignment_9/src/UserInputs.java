import java.util.Scanner;

import static java.lang.System.out;

//UI portion of database modification. Not required, but I found it easier.
public class UserInputs extends Person {
    static int exit = 0;

    public static void insertPersonUI() {
        while (exit != -1) {
            try {
                Scanner userInput = new Scanner(System.in);
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                out.print("Please enter the person's first name: ");
                String firstName = String.valueOf(sb1.append(String.format("'%s'", userInput.next())));
                out.println(firstName);
                out.print("Now, please enter their last name: ");
                String lastName = String.valueOf(sb2.append(String.format("'%s'", userInput.next())));
                out.println(lastName);
                out.print("Next, enter their age: ");
                int age = userInput.nextInt();
                out.print("Now, please enter their Social Security Number (do not use anyone's real ssn!): ");
                long ssn = userInput.nextLong();
                out.print("Finally, please enter their primary credit card number (do not enter anyone's real cc number!): ");
                long creditCard = userInput.nextLong();
                Person newPerson = new Person(firstName, lastName, age, ssn, creditCard);
                insertPerson(newPerson);
                out.print("All done? Type '-1' to exit, else type any other number to insert another record: ");
                exit = userInput.nextInt();
                if(exit == -1) {
                    break;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void selectPersonUI(Person person) {
        while (exit != -1) {
            Scanner userInput = new Scanner(System.in);
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            out.print("Please enter the first name of the person you want more information about: ");
            String firstName = String.valueOf(sb1.append(String.format("'%s'", userInput.next())));
            out.print("Next, please enter the last name of the person you want more information about: ");
            String lastName = String.valueOf(sb2.append(String.format("'%s'", userInput.next())));
            out.println(person.selectPerson(firstName, lastName));
            out.print("\n\nAll done? Type '-1' to exit, else type any other number to lookup another record: ");
            exit = userInput.nextInt();
            if(exit == -1) {
                break;
            }
        }
    }

    public static void findAllPeopleUI() {
        out.println(findAllPeople());
        Scanner userInput = new Scanner(System.in);
        out.print("\n\nAll done? Type -1 to exit, else type any other number to go back to the main menu: ");
        exit = userInput.nextInt();
        if (exit == -1) {
            System.exit(0);
        }
    }
}
