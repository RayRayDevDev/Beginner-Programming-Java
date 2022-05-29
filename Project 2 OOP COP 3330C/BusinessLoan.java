import static java.lang.System.out;
import Loan.java;


public class BusinessLoan extends Loan {

    protected BusinessLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double prmRte) {
        super(lnNum, LstNm, lnmt, lnTerm);
        double finalDecimalValue = Loan.percentToDecimalCalc(prmRte);
        businessInterestRate = finalDecimalValue + 0.01;
        double businessTotal = businessLoanMath(lnmt);
    }



    public double businessLoanMath(double reqAmt) {
        return (reqAmt * businessInterestRate) + reqAmt;
    }



}