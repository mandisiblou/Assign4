package cput.ac.za.Question1.Polymorphism;

/**
 * Created by Mandisi on 3/29/2017.
 */
public class EasyAccount extends BankAcc {

    public EasyAccount() {}
    public EasyAccount(int balance,int deposit,int withdraw) {
        super(balance,deposit, withdraw);
    }
    float getInterest(){return 10.1f;}
}