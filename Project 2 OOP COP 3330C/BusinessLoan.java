class BusinessLoan extends Loan {

    protected BusinessLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double prmRte) {
        super(lnNum, LstNm, lnmt, lnTerm);
        double finalDecimalValue = Loan.percentToDecimalCalc(prmRte);
        out.println(finalDecimalValue);
        businessInterestRate = finalDecimalValue + 0.01;
        out.println(businessInterestRate);
        double businessTotal = businessLoanTotal(lnmt);
        out.println(businessTotal);
    }



    public double businessLoanTotal(double reqAmt) {
        return (reqAmt * businessInterestRate) + reqAmt;
    }



}