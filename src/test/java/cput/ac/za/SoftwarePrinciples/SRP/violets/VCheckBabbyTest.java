package cput.ac.za.SoftwarePrinciples.SRP.violets;

import cput.ac.za.SoftwarePrinciples.SRP.Violets.VCheckBaby;
import cput.ac.za.SoftwarePrinciples.SRP.Violets.VCheckBabyImp;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class VCheckBabbyTest {
    VCheckBaby actionz = new VCheckBabyImp();
    @Test
    public void testEating() throws Exception
    {
        boolean eat = actionz.isEating() == true ;
        Assert.assertEquals(eat, true);
        boolean runn = actionz.isRunning() == true ;
        Assert.assertEquals(runn, true);
        boolean sleepin = actionz.isSleeping() == true ;
        Assert.assertEquals(sleepin, true);
    }
}
