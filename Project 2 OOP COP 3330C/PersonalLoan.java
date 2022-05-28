class PersonalLoan extends Loan {

    protected PersonalLoan(int lnNum, String LstNm, double lnmt, int lnTerm, double prmRte) {
        super(lnNum, LstNm, lnmt, lnTerm);
        currentPrimeInterestRate = Loan.percentToDecimalCalc(prmRte);
    }

    public double personalInterestRate(double currentPrimeInterestRate) {
        return personalInterestRate = 0.02 + currentPrimeInterestRate;
    }
    
    public double businessLoanTotal(double reqAmt) {
        return (reqAmt * personalInterestRate) + reqAmt;
    }

}