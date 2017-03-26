package cput.ac.za.QUESTION2.WithoutSpringramework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 3/22/2017.
 */
public class BalancesTest {
    private AccountsInterface calc = new AccountsInterfaceImp();
    int result = 0;

    @Before
    public void setUp() throws Exception {
        result = calc.balance(10);
    }
    @Test
    public void balanceTest() throws Exception {
        Assert.assertEquals("Subtract 30 - 20", 10, result);
    }
}