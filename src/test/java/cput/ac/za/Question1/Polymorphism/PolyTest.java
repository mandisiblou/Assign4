package cput.ac.za.Question1.Polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 3/29/2017.
 */
public class PolyTest {
    BankAcc easyAcc,savingAcc,checkAcc;

    @Before
    public void setUp() throws Exception {
        easyAcc = new EasyAccount(200,100,10);
        savingAcc = new SavingsAcc(200,100,10);
        checkAcc = new CheckAcc(200,100,10);

    }
    @Test
    public void BalanceTest() throws Exception {
        Assert.assertNotNull(easyAcc);
        System.out.println("Easy Account Interest    : "+easyAcc.getInterest());
        System.out.println("Cheque Account Interest  : "+checkAcc.getInterest());
        System.out.println("Savings Account Interest : "+savingAcc.getInterest());
    }
}

