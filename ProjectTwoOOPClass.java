import static java.lang.System.out;

import java.util.Scanner;

//Created with JDK-18.0.1.1
//Created by Cole Stanley (RäDev) for COP 3330C

abstract class Loan implements LoanConstants {
    protected int loanNum = 0;  //Loan Number
    protected String lastName = null;  //Customer's Last Name
    protected double loanAmt = 0;  //Requested Loan Amount
    protected double currentPrimeInterestRate = 0;  //Prime Interest Rate in percentage form
    protected double personalInterestRate = 0;  //Personal Loan Combined Interest Rate in decimal form
    protected double businessInterestRate = 0;  //Business Loan Combined Interest Rate in decimal form
    protected int loanTerm = 0;  //Requested Loan Term

    protected Loan(){}

    protected Loan(int lnNum, String LstNm, double lnmt, int lnTerm) { //"Ln" = "Loan."
        if(lnmt > maxLoanAmt) {
        out.println("Loans cannot be made above $50,000. Please try again with an amount less than or equal to this amount. Thank you.");
        System.exit(1);
        }
        if(lnTerm != LoanConstants.shortTerm || lnTerm != LoanConstants.medTerm || lnTerm != LoanConstants.longTerm) out.println("Invalid Loan Term. Using Default Loan Term Instead."); lnTerm = shortTerm;
        loanNum = lnNum ;
        lastName= LstNm;
        loanAmt = lnmt;
        loanTerm = lnTerm;
}
    public static double percentToDecimalCalc(double userInputtedPercentage) {
        double finalDecimalValue = userInputtedPercentage / 100;
        return finalDecimalValue;
    }
    public String toString() {
        String loanInfo = "Loan Number: " + loanNum + ".\n" + "Last Name: " + lastName + ".\n" + "Requested Loan Amount: " + loanAmt + ".\n" + "Interest Rate: " + currentPrimeInterestRate + ".\n" + "Loan Term: " + loanTerm + ".\n";
        return loanInfo;
    }

}
interface LoanConstants {
    final int shortTerm = 1;
    final int medTerm = 3;
    final int longTerm = 5;
    final String companyName = "Loans 'R Us!";
    final int maxLoanAmt = 50000;
}
class BusinessLoan extends Loan {

    protected BusinessLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double prmRte) {
        super(lnNum, LstNm, lnmt, lnTerm);
        double finalDecimalValue = Loan.percentToDecimalCalc(prmRte);
        businessInterestRate = finalDecimalValue + 0.01;
        double businessTotal = businessLoanTotal(lnmt);
    }

    public double businessLoanTotal(double reqAmt) {
        return (reqAmt * businessInterestRate) + reqAmt;
    }



}
class PersonalLoan extends Loan {

    protected PersonalLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double prmRte) {
        super(lnNum, LstNm, lnmt, lnTerm);
        currentPrimeInterestRate = Loan.percentToDecimalCalc(prmRte);
    }

    public double personalInterestRate(double currentPrimeInterestRate) {
        return personalInterestRate = 0.02 + currentPrimeInterestRate;
    }
    
    public double businessLoanTotal(double reqAmt) {
        return (reqAmt * personalInterestRate) + reqAmt;
    }

}
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
         BusinessLoan BusinessLoan1 = new BusinessLoan(loanNum, userLast, userAmt, userTerm, userCurrPrime);

        }
    }


}