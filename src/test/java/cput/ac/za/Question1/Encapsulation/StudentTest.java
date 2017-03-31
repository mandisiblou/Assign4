package cput.ac.za.Question1.Encapsulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mandisi on 3/28/2017.
 */
public class StudentTest {
    private Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student(2000, "Rasta", 1996,"ND: I.T");
    }
    @Test
    public void studNoTest() throws Exception {
        Assert.assertEquals(2000, student.getStudentNo());
    }
}
