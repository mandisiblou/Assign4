package cput.ac.za.ADP.corrects;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class ADPcorrectTest {
    Shapes shape1 = new Shapes();
    Shapes1 shape2 = new Shapes1();
    Shapes2 shape3 = new Shapes2();

    @Test
    public void testShape() throws Exception
    {
        Assert.assertEquals("Rectangle",shape1.shapeSquare());
        Assert.assertEquals("Traingle",shape2.shapeTraingle());
        Assert.assertEquals("Hexagon",shape3.shapeHexagon());
    }
}