import static java.lang.System.out;

import java.util.Scanner;

//Created with JDK-18.0.1.1
//Created by Cole Stanley (RäDev) for COP 3330C

class CreateLoans {

    public static void main(String[] args) {
        Scanner userInput =  new Scanner(System.in);
        out.print("Please enter your last name: ");
        String userLast = userInput.nextLine();
        out.print("Please enter your desired loan amount in the format xxxxx.xx: ");
        double userAmt = userInput.nextDouble();
        out.print("Please enter the current Prime Interest Rate: ");
        double userCurrPrime = userInput.nextDouble();
        if(userCurrPrime <= 0 || userCurrPrime > 25) out.println("The interest rate cannot be that low or high. Please try again."); //Highest prime rate was 21.5 in the '80's. Gave some wiggle room. 
        out.print("Please enter your desired loan term using only whole numbers such as '1,' '3,' or '5.': ");
        int userTerm = userInput.nextInt();
        out.print("Please select either a business loan by typing the number '1,' or a personal loan by typing the number '2.' ");
        int userChoice = userInput.nextInt();
        int loanNum = 1;
        if(userChoice == 1) {
         BusinessLoan businessLoan1 = new BusinessLoan(loanNum, userLast, userAmt, userTerm, userCurrPrime);

        }
        else if(userChoice == 2) {
            PersonalLoan personalLoan1 = new PersonalLoan(loanNum, userLast, userAmt, userTerm, userCurrPrime);
        }
    }


}