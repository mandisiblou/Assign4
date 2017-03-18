package cput.ac.za;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 3/18/2017.
 */
public class ObjectIdentityTest {
    private Account account;
    private Clients clients;

    @Before
    public void setUp() throws Exception {
        account = new Account(1234,200,"check", "1202733");
        clients = new Clients(1234,"mandisi","blou",21,"Kwezi Park","0793286258");
    }

    @Test
    public void objectIdentityTest() throws Exception {
        Assert.assertNotSame(account,clients);
    }
}
