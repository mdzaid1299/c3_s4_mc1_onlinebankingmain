package data;

public abstract class Account {
    private long accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private String accountStatus;
    private String account_OpeningDate;
    private String modeOfOperation;
    public boolean internet_Banking;

    public Account(long accountNumber, String accountHolderName, double accountBalance, String accountStatus, String account_OpeningDate, String modeOfOperation, boolean internet_Banking) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountStatus = accountStatus;
        this.account_OpeningDate = account_OpeningDate;
        this.modeOfOperation = modeOfOperation;
        this.internet_Banking = internet_Banking;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccount_OpeningDate() {
        return account_OpeningDate;
    }

    public void setAccount_OpeningDate(String account_OpeningDate) {
        this.account_OpeningDate = account_OpeningDate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public boolean isInternet_Banking() {
        return internet_Banking;
    }

    public void setInternet_Banking(boolean internet_Banking) {
        this.internet_Banking = internet_Banking;
    }

    public abstract double calculateInterest();
}