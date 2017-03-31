package cput.ac.za.Question1.Polymorphism;

/**
 * Created by Mandisi on 3/29/2017.
 */
public class CheckAcc extends BankAcc{

    public CheckAcc(){}
    public CheckAcc(int balance,int deposit,int withdraw)
    {
        super(balance,deposit,withdraw);
    }

    float getInterest(){return 15.3f;}
}


