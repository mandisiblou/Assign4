package cput.ac.za.SoftwarePrinciples.SRP.corrects;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class CheckBabyTest {
    CheckBaby actionz = new CheckBabyImp();
    @Test
    public void testEating() throws Exception
    {
        boolean eat = actionz.isEating() == true ;
        Assert.assertEquals(eat, true);
    }
}
