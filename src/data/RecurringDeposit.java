package data;

public class RecurringDeposit extends Account{
    private double monthly_investedAmount;
    private double maturityAmount;
    private int tenure;
    private  double roi;

    public RecurringDeposit(long accountNumber, String accountHolderName, double accountBalance, String accountStatus, String account_OpeningDate, String modeOfOperation, boolean internet_Banking, double monthly_investedAmount, double maturityAmount, int tenure, double roi) {
        super(accountNumber, accountHolderName, accountBalance, accountStatus, account_OpeningDate, modeOfOperation, internet_Banking);
        this.monthly_investedAmount = monthly_investedAmount;
        this.maturityAmount = maturityAmount;
        this.tenure = tenure;
        this.roi = roi;
    }

    public double getMonthly_investedAmount() {
        return monthly_investedAmount;
    }

    public void setMonthly_investedAmount(double monthly_investedAmount) {
        this.monthly_investedAmount = monthly_investedAmount;
    }

    public double getMaturityAmount() {
        return maturityAmount;
    }

    public void setMaturityAmount(double maturityAmount) {
        this.maturityAmount = maturityAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double calculateInterest(){
        return  (getMonthly_investedAmount() * getTenure() *  getRoi() )/ 100;
    }
}