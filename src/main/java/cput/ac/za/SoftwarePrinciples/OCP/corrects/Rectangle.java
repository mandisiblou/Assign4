package cput.ac.za.SoftwarePrinciples.OCP.corrects;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class Rectangle implements Shape{
    double length = 1;
    double width = 1;
    public double calculateArea(){
        return length * width;
    }
}
