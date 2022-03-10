public class EWallet {
    public double balance;

    public EWallet(double balance) {
        this.balance = balance;
    }

    public double getWalletBalance(){
        return balance;
    }

    public double addBalance(double amount)
    {
        balance= balance+amount;
        return balance;
    }
    public double deductBalance(double deductAmount)
    {
        if(balance> deductAmount){
            balance=balance-deductAmount;
            return balance;
        }
        else
            System.out.println("Insufficient Balance");
        return 0;
    }
}
