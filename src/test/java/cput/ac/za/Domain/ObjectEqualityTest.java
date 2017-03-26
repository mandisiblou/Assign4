package cput.ac.za.Domain;

import cput.ac.za.Domains.Account;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 3/18/2017.
 */
public class ObjectEqualityTest {
    private Account account;
    private Account accounts;

    @Before
    public void setUp() throws Exception {
        account = new Account(1234,200,"check", "1202733");
        accounts = new Account(1234,200,"check", "1202733");
    }

    @Test
    public void objectTest() throws Exception {
        Assert.assertEquals(account,account);
    }
}
