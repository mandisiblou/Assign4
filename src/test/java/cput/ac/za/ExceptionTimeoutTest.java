package cput.ac.za;

import org.junit.*;
import org.junit.rules.Timeout;

/**
 * Created by Mandisi on 3/18/2017.
 */
public class ExceptionTimeoutTest {
    private Account acc;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    @Before
    public void setUp() throws Exception {
        acc = new Account(20,200,"savings","08456789");

    }

    @Test
    public void long_running_method_test() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test
    public void testExceptions() {
        Assert.assertNotEquals(1, acc.method1(acc.getBalance()));
    }
}
