package cput.ac.za.SoftwarePrinciples.PLK;

import cput.ac.za.SoftwarePrinciples.PLK.corrects.LecturerF;
import cput.ac.za.SoftwarePrinciples.PLK.corrects.LecturerID;
import cput.ac.za.SoftwarePrinciples.PLK.corrects.LecturerLName;
import org.junit.Test;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class PLKtest {
    LecturerF lecturer = new LecturerF();
    LecturerLName lecturer1 = new LecturerLName();
    LecturerID lecturer2 = new LecturerID();

    @Test
    public void testLecturer() throws Exception
    {
        org.junit.Assert.assertEquals("Gwaza", lecturer.lectureName());
    }
}
