package data;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(long accountNumber, String accountHolderName, double accountBalance, String accountStatus, String account_OpeningDate, String modeOfOperation, boolean internet_Banking, double interestRate) {
        super(accountNumber, accountHolderName, accountBalance, accountStatus, account_OpeningDate, modeOfOperation, internet_Banking);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double checkBalance(){
        return getAccountBalance();
    }
    public double creditBalance(double creditAmount){
        return getAccountBalance()+ creditAmount;
    }
    public double debitBalance(double debitAmount){
        return getAccountBalance() - debitAmount;
    }


    @Override
    public double calculateInterest() {
        double interestGain  = 0;
        interestGain = getAccountBalance() * getInterestRate() / 100;
        return interestGain;
    }
}