import java.util.Scanner;

import static java.lang.System.out;

public class UserInputs extends Person {
    public static void userInputInsertPerson() {
        int exit = 0;
        while (exit != -1) {
            try {
                Scanner userInput = new Scanner(System.in);
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                out.print("Welcome! Type -1 to exit.\nPlease enter the person's first name: ");
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
                newPerson.insertPerson(newPerson);
                out.print("All done? Type -1 to exit, else type any number to insert another record: ");
                exit = userInput.nextInt();
                if(exit == -1) {
                    break;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
