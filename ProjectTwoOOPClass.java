import static java.lang.System.out;

//Created with JDK-18.0.1.1
//Created by Cole Stanley (RäDev) for COP 3330C

public abstract class Loan implements LoanConstants {
    private int loanNum;
    private String lastName;
    private double loanAmt;
    private double interestRate;
    private int loanTerm;

    protected Loan(int lnNum, String LstNm, double lnmt, int lnTerm) { //"Ln" = "Loan."
        if(lnmt > 50000) out.println("Loans cannot be made above $50,000. Please try again with an amount less than or equal to this amount. Thank you.");
        if(lnTerm != 1 || lnTerm != 3 || lnTerm != 5) lnTerm = 1;
        lnNum = loanNum;
        LstNm = lastName;
        lnmt = loanAmt;
        lnTerm = loanTerm;
}

}
interface LoanConstants {
    final int shortTerm = 1;
    final int medTerm = 3;
    final int longTerm = 5;
    final String companyName = "Ye olde Loan Company (But for technology)";
    final int maxLoanAmt = 50000;
}
class BusinessLoan extends Loan {}
class PersonalLoan extends Loan {}
class CreateLoans {

    public static void main(String[] args) {

        
    }
}