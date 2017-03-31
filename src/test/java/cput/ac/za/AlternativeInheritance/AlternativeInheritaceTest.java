package cput.ac.za.AlternativeInheritance;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 3/30/2017.
 */
public class AlternativeInheritaceTest {
    private Vehicle carz = new Car();
    private Vehicle trucks = new Truck();

    @Before
    public void setUp() throws Exception {

    }
    @Test
    public void ownerTest() throws Exception {
        System.out.println(carz.getName());
        System.out.println(trucks.getName());
    }
}
