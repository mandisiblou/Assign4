package cput.ac.za.Question1.Encapsulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 3/28/2017.
 */
public class EmployeeTest {

    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = new Employee(2000, "Rasta", 1996);
    }
    @Test
    public void staffNoTest() throws Exception {
        Assert.assertEquals(2000, employee.getStaffNo());
    }
}

