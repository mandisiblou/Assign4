package cput.ac.za.SoftwarePrinciples.OCP.corrects;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class Circle implements Shape{
    public double radius = 1;
    public double calculateArea(){
        return (22/7)*radius*radius;
    }
}
