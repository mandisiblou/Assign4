package cput.ac.za;

import cput.ac.za.Account;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 3/18/2017.
 */
public class IntegerTests {
    private Account account;

    @Before
    public void setUp() throws Exception {
        account = new Account(1234,200,"check", "1202733");
    }
    @Test
    public void intergerTest() throws Exception {
        Assert.assertEquals(200, account.getBalance());
    }
}
