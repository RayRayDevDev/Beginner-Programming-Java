import static java.lang.System.out;


public abstract class Loan implements LoanConstants {
    int loanNumber = 0;  //Loan Number
    String lastName = null;  //Customer's Last Name
    double loanAmt = 0;  //Requested Loan Amount
    double personalInterestRate = 0;  //Personal Loan Combined Interest Rate in decimal form
    double businessInterestRate = 0;  //Business Loan Combined Interest Rate in decimal form
    double interestRateArray[];
    int loanTerm;  //Requested Loan Term

    public Loan(int lnNum, String LstNm, double lnmt, int lnTerm) { //"Ln" = "Loan."
        loanNumber = lnNum ;
        lastName= LstNm;
        loanAmt = lnmt;
        loanTerm = lnTerm;
}
    
    public static double percentToDecimalCalc(double userInputtedPercentage) {
        double finalDecimalValue = userInputtedPercentage / 100;
        return finalDecimalValue;
    }
    public String toString() {
        String loanInfo = "Loan Number: " + loanNumber + ".\n" + "Last Name: " + lastName + ".\n" + "Requested Loan Amount: " + loanAmt + ".\n" + "Interest Rate(s): " + interestRateArray + ".\n" + "Loan Term: " + loanTerm + ".\n";
        return loanInfo;
    }

}