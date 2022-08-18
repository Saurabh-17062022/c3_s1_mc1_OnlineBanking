public class SavingAccount {
    long accountNumber;
    String accountHolderName;
    String accountStatus;
    double accountBalance;

    public long generateAccountNumber() {
        return (long) (Math.random() * (1000000000000L) - 999999999999L) + 1000000000000L;
    }
    public double withDrawCash(){
        return 0.0;
    }
    public double checkBalance(){
        return 0.0;
    }
    public int depositCash(){
        return 0;
    }
    public int transferFunds(){
        return 0;
    }
}
