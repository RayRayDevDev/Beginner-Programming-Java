import static java.lang.System.out;


public abstract class Loan implements LoanConstants {
    int loanNumber = 0;
    String lastName = null;  //Customer's Last Name
    double loanAmt = 0;  //Requested Loan Amount
    static double personalInterestRate = 0;  //Personal Loan Combined Interest Rate in decimal form
    static double businessInterestRate = 0;  //Business Loan Combined Interest Rate in decimal form
    int loanTerm;  //Requested Loan Term
    static String isBusiness = null;
    public Loan(int lnNum, String LstNm, double lnmt, int lnTerm) { //"Ln" = "Loan."
        lnNum += 1;
        loanNumber = lnNum;
        lastName= LstNm;
        loanAmt = lnmt;
        loanTerm = lnTerm;
}
    
    public static double percentToDecimalCalc(double userInputtedPercentage) {
        double finalDecimalValue = userInputtedPercentage / 100;
        return finalDecimalValue;
    }
    public static void personalOrBusiness(int userChoice) {
         if(CreateLoans.getUserChoice() == 1) {
            businessInterestRate = BusinessLoan.getBusinessInterestRate();
        }
        else if(CreateLoans.getUserChoice() == 2) {
            personalInterestRate = PersonalLoan.getPersonalInterestRate();
        }
        else out.println("I dunno how you're seeing this.");
    }

    public String toString() {
        String loanInfo = "Loan Number: " + loanNumber + ".\n" + 
        "Last Name: " + lastName + ".\n" + 
        "Requested Loan Amount: $" + loanAmt + ".\n" + 
        "Combined Business Interest Rate: " + businessInterestRate + ".\n" + 
        "Combined Personal Interest Rate: " + personalInterestRate + ".\n" +
        "Loan Term: " + loanTerm + " years.\n" +
        "Total amount owed at loan maturity: $" + Math.round(BusinessLoan.getBusinessTotal())  + ".\n";
        return loanInfo;
    }

}