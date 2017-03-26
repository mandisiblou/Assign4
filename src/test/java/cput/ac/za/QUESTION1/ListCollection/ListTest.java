package cput.ac.za.QUESTION1.ListCollection;
import org.junit.*;
/**
 * Created by Mandisi on 3/21/2017.
 */
public class ListTest {
    private ListClients client = new ListClients();

    // Question 1, List Collection
    @Before
    public void setUp() throws Exception {
        client.addClients("Terah");
        client.addClients("Sandy");
        client.addClients("Zide");
        client.addClients("Sasa");
        client.addClients("Rats");
    }

    @Test
    public void addTest() throws Exception {
        Assert.assertEquals("Sasa", client.clients.getItem(3));
    }

    @Test
    public void removeTest() throws Exception {
        client.removeClients("Sandy");
        Assert.assertEquals("Removed Sandy", "Zide", client.clients.getItem(1));
    }
}
