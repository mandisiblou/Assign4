package cput.ac.za.SoftwarePrinciples.OCP.corrects;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class CalculateAreaTest {
    Shape rect = new Rectangle();
    Shape cir = new Circle();
    AreaCalculator cirs = new AreaCalculator();
    @Test
    public void testShape() throws Exception
    {
        System.out.println("The area for Circle shape is: "+cirs.calculateShapeArea(cir));
        System.out.println("The area for Rectangle shape is: "+cirs.calculateShapeArea(rect));
        Assert.assertNotNull(rect);
        // System.out.println(The area for Rectangle shape is: "rect.calculateArea());
    }
}
