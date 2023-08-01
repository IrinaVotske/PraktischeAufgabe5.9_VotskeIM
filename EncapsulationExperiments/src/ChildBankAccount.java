public class ChildBankAccount {
    private double balance;
    private double maxBalance;

    public ChildBankAccount(double maxBalance) {
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney(double value) {
        if (value > 0) {
            if ((balance + value) <= maxBalance) {
                balance = balance + value;
                return true;
            }
        }
        return false;
    }

    public boolean debitMoney(double value) {
        if (value > 0) {
            if ((balance - value) >= 0) {
                balance = balance - value;
                return true;
            }
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }


}






