package cput.ac.za.Question1.Polymorphism;

/**
 * Created by Mandisi on 3/29/2017.
 */
public class SavingsAcc extends BankAcc{

    public SavingsAcc() {}
    public SavingsAcc(int balance,int deposit,int withdraw)
    {
        super(balance,deposit,withdraw);
    }
    float getInterest(){return 20.0f;}
}

