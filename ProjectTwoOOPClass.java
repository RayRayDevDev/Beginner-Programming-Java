import static java.lang.System.out;

//Created with JDK-18.0.1.1
//Created by Cole Stanley (RäDev) for COP 3330C

public abstract class Loan implements LoanConstants {
    protected int loanNum;
    protected String lastName;
    protected double loanAmt;
    protected double interestRate;
    protected int loanTerm;
    protected double currentPrimeRate;

    protected Loan(int lnNum, String LstNm, double lnmt, int lnTerm, double intRate, double currPrmRt) { //"Ln" = "Loan."
        if(lnmt > maxLoanAmt) out.println("Loans cannot be made above $50,000. Please try again with an amount less than or equal to this amount. Thank you.");
        if(lnTerm != shortTerm || lnTerm != medTerm || lnTerm != longTerm) lnTerm = shortTerm;
        lnNum = loanNum;
        LstNm = lastName;
        lnmt = loanAmt;
        lnTerm = loanTerm;
        intRate = interestRate;
        currPrmRt = currentPrimeRate;
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

    protected BusinessLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double intRate, double currPrmRt) {
        super(lnNum, LstNm, lnmt, lnTerm, intRate, currPrmRt);
        interestRate = 0.01 + currentPrimeRate;

    }



}
class PersonalLoan extends Loan {

    protected PersonalLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double intRate, double currPrmRt) {
        super(lnNum, LstNm, lnmt, lnTerm, intRate, currPrmRt);
        interestRate = 0.02 + currentPrimeRate;

    }

}
class CreateLoans {

    public static void main(String[] args) {

        
    }


}