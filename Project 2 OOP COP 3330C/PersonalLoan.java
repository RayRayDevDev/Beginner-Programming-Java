import static java.lang.System.out;


public class PersonalLoan extends Loan {

    protected PersonalLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double prmRte) {
        super(lnNum, LstNm, lnmt, lnTerm);
        double finalDecimalValue = Loan.percentToDecimalCalc(prmRte);
        personalInterestRate = finalDecimalValue + 0.02;
        double personalTotal = personalLoanMath(lnmt);
    }

    public double personalLoanMath(double reqAmt) {
        return (reqAmt * personalInterestRate) + reqAmt;
    }

}