import static java.lang.System.out;

public class PersonalLoan extends Loan {
    static double personalTotal;
    protected PersonalLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double prmRte) {
        super(lnNum, LstNm, lnmt, lnTerm);
        double finalDecimalValue = percentToDecimalCalc(prmRte);
        personalInterestRate = finalDecimalValue + 0.02;
        out.println("The combined Personal Interest rate is: " + (personalInterestRate * 100) + "%.");
        personalTotal = personalLoanMath(lnmt);
        out.println("The total amount due at the loan's maturity: $" + personalTotal);

    }

    public static double getPersonalInterestRate() {
        return personalInterestRate;
    }

    public static double getPersonalTotal() {
        return personalTotal;
    }

    public static boolean isPersonal() {
        if(CreateLoans.userChoice == 2) return true;
        else return false;
    }

    public double personalLoanMath(double reqAmt) {
        return (reqAmt * personalInterestRate) + reqAmt;
    }

}