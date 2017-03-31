package cput.ac.za.Question1.Polymorphism;

/**
 * Created by Mandisi on 3/29/2017.
 */
public class BankAcc {
    private int balance;
    private int interest;
    private int deposit,withdraw;

    public BankAcc() {}
    public BankAcc(int balance,int deposit,int withdraw)
    {
        this.balance = balance;
        this.interest = interest;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }
    float getInterest(){return 0;}

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setDeposit(int amount)
    {
        balance = balance + amount;
    }
    public int getDeposit() {
        return deposit;
    }

    public void setWithdraw(int amount)
    {
        balance = balance - amount;
    }
    public int getWithdraw() {
        return withdraw;
    }
}
