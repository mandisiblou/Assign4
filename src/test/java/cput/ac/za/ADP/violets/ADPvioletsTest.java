package cput.ac.za.ADP.violets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class ADPvioletsTest {
    Shapes shap = new ShapesImp();

    @Test
    public void testShape() throws Exception
    {
        Assert.assertEquals("Rhombus", shap.shaped());
    }
}
