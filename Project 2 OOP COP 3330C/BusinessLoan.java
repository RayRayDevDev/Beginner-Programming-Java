import static java.lang.System.out;
import Loan.java;


public class BusinessLoan extends Loan {
    static double businessTotal;
    public BusinessLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double prmRte) {
        super(lnNum, LstNm, lnmt, lnTerm);
        double finalDecimalValue = percentToDecimalCalc(prmRte);
        out.println(finalDecimalValue);
        businessInterestRate = finalDecimalValue + 0.01;
        out.println(businessInterestRate);
        businessTotal = businessLoanMath(lnmt);
        out.println(businessTotal);
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