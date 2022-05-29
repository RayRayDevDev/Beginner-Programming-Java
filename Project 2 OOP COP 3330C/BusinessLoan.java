import static java.lang.System.out;
import Loan.java;


public class BusinessLoan extends Loan {
    static double businessTotal;
    public BusinessLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double prmRte) {
        super(lnNum, LstNm, lnmt, lnTerm);
        double finalDecimalValue = percentToDecimalCalc(prmRte);
        out.println(finalDecimalValue);
        businessInterestRate = finalDecimalValue + 0.01;
        out.println("The combined Business Interest rate is: " + (businessInterestRate * 100) + "%.");
        businessTotal = businessLoanMath(lnmt);
        out.println("The total amount due at the loan's maturity: $" + businessTotal);
    }

    public static double getBusinessInterestRate() {
        return businessInterestRate;
    }

    public static double getBusinessTotal() {
        return businessTotal;
    }

    public double businessLoanMath(double reqAmt) {
        return (reqAmt * businessInterestRate) + reqAmt;
    }



}