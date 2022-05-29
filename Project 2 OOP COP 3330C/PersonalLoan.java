import static java.lang.System.out;


public class PersonalLoan extends Loan {

    protected PersonalLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double prmRte) {
        super(lnNum, LstNm, lnmt, lnTerm);
        double finalDecimalValue = Loan.percentToDecimalCalc(prmRte);
        out.println("Decimal value of the prime rate: " + finalDecimalValue);
        personalInterestRate = finalDecimalValue + 0.02;
        out.println("Combined decimal value of the personal interest rate: " + personalInterestRate);
        double personalTotal = personalLoanMath(lnmt);
        out.println("Loan total over term: $" + personalTotal);
    }

    public double personalLoanMath(double reqAmt) {
        return (reqAmt * personalInterestRate) + reqAmt;
    }

}