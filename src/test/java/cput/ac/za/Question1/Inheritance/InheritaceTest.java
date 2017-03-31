package cput.ac.za.Question1.Inheritance;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 3/28/2017.
 */
public class InheritaceTest {
    private Vehicle carz = new Car();

    @Before
    public void setUp() throws Exception {
       carz = new Car("Mandisi","Blue","RSV",1916);
    }
    @Test
    public void ownerTest() throws Exception {
        System.out.println(carz.getName()+"'s Car");
    }
}
