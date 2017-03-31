package cput.ac.za.SoftwarePrinciples.OCP.violets;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length *rectangle.width;
    }
    public double calculateCircleArea(Circle circle){
        return (22/7)*circle.radius*circle.radius;
    }
}
