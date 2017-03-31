package cput.ac.za.SoftwarePrinciples.OCP.violets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class VioletsAreaTest {
    AreaCalculator areaCalculator = new AreaCalculator();
    Rectangle rectangle = new Rectangle();
    Circle cirs = new Circle();
    @Test
    public void testArea() throws Exception
    {
        System.out.println("The area for Circle shape is: "+areaCalculator.calculateCircleArea(cirs));
        System.out.println("The area for Rectangle shape is: "+areaCalculator.calculateRectangleArea(rectangle));
        Assert.assertNotNull(areaCalculator);
    }
}
