import static java.lang.System.out;


public class PersonalLoan extends Loan {
    static double personalTotal;
    protected PersonalLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double prmRte) {
        super(lnNum, LstNm, lnmt, lnTerm);
        double finalDecimalValue = percentToDecimalCalc(prmRte);
        personalInterestRate = finalDecimalValue + 0.02;
        personalTotal = personalLoanMath(lnmt);
    }

    public static double getPersonalInterestRate() {
        return personalInterestRate;
    }
    
    public static double getPersonalTotal() {
        return personalTotal;
    }

    public double personalLoanMath(double reqAmt) {
        return (reqAmt * personalInterestRate) + reqAmt;
    }

}