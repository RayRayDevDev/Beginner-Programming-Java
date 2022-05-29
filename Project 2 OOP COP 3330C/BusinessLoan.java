import static java.lang.System.out;
import Loan.java;


public class BusinessLoan extends Loan {

    protected BusinessLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double prmRte) {
        super(lnNum, LstNm, lnmt, lnTerm);
        double finalDecimalValue = Loan.percentToDecimalCalc(prmRte);
        out.println(finalDecimalValue);
        businessInterestRate = finalDecimalValue + 0.01;
        out.println(businessInterestRate);
        double businessTotal = businessLoanMath(lnmt);
        out.println(businessTotal);
    }



    public double businessLoanMath(double reqAmt) {
        return (reqAmt * businessInterestRate) + reqAmt;
    }



}