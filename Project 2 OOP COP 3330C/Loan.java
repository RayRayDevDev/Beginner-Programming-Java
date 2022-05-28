abstract class Loan implements LoanConstants {
    protected int loanNum = 0;  //Loan Number
    protected String lastName = null;  //Customer's Last Name
    protected double loanAmt = 0;  //Requested Loan Amount
    protected double currentPrimeInterestRate = 0;  //Prime Interest Rate in percentage form
    protected double personalInterestRate = 0;  //Personal Loan Combined Interest Rate in decimal form
    protected double businessInterestRate = 0;  //Business Loan Combined Interest Rate in decimal form
    protected int loanTerm = 0;  //Requested Loan Term

    protected Loan(int lnNum, String LstNm, double lnmt, int lnTerm) { //"Ln" = "Loan."
        if(lnmt > maxLoanAmt) {
        out.println("Loans cannot be made above $50,000. Please try again with an amount less than or equal to this amount. Thank you.");
        System.exit(1);
        }
        if(lnTerm != LoanConstants.shortTerm || lnTerm != LoanConstants.medTerm || lnTerm != LoanConstants.longTerm) {
        out.println("Invalid Loan Term. Using Default Loan Term Instead.");
        lnTerm = shortTerm;
    }
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