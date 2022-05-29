import static java.lang.System.out;
import Loan.java;
import PersonalLoan.java;
import BusinessLoan.java;
import java.util.Scanner;

//Created with JDK-18.0.1.1
//Created by Cole Stanley (RäDev) for COP 3330C

public class CreateLoans implements LoanConstants {

    static int loanNumber = 0;
    static String loanArray[];
    public static void main(String[] args) {

       
        Scanner userInput =  new Scanner(System.in);
        out.print("Please enter your last name: ");
        String userLast = userInput.nextLine();
        out.print("Please enter the current Prime Interest Rate as a percentage ('2' for 2%, for example): ");
        double userCurrPrime = userInput.nextDouble();
        if(userCurrPrime <= 0 || userCurrPrime > 25) { 
            out.println("The interest rate cannot be that low or high. Please try again."); 
            System.exit(1); //Highest prime rate was 21.5 in the '80's. Gave some wiggle room. 
        }
        
        while(loanNumber < 6) {
        loanNumber++;
        out.print("Please enter your desired loan amount in the format xxxxx.xx: ");
        double userAmt = userInput.nextDouble();
        if(userAmt > maxLoanAmt) {
            out.println("Loans cannot be made above $50,000. Please try again with an amount less than or equal to this amount. Thank you.");
            System.exit(1);
            }
        out.print("Please enter your desired loan term using only whole numbers such as '1,' '3,' or '5.': ");
        int userTerm = userInput.nextInt();
        if(userTerm == shortTerm || userTerm == medTerm || userTerm == longTerm) { //Something went wrong and it would not stop using default term with != operators. So did this to fix it.
            out.println("Valid loan term. Proceeding...");
        }
        else {
            out.println("Invalid loan term. Using default loan term instead.");
            userTerm = shortTerm;
        }
        
        out.print("Please select either a business loan by typing the number '1,' or a personal loan by typing the number '2.' ");
        int userChoice = userInput.nextInt();

        if(userChoice == 1) {
         BusinessLoan businessLoan1 = new BusinessLoan(loanNumber, userLast, userAmt, userTerm, userCurrPrime);
         out.println(businessLoan1.toString());

        }
        else if(userChoice == 2) {
            PersonalLoan personalLoan1 = new PersonalLoan(loanNumber, userLast, userAmt, userTerm, userCurrPrime);
            out.println(personalLoan1.toString());

        }
        else {
            out.println("You did not enter a vaild choice. Please try again."); 
            break;
        }
        }
    }


}