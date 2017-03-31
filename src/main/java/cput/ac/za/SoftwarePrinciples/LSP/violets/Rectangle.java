package cput.ac.za.SoftwarePrinciples.LSP.violets;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class Rectangle extends Square{
    public void area(int x, int y, int z){
        int ares = x + y + z;
        System.out.println("Area of Rectangle is : "+ares);
    }
}
