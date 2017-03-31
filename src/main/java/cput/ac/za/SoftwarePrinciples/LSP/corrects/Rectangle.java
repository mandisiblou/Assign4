package cput.ac.za.SoftwarePrinciples.LSP.corrects;

/**
 * Created by Mandisi on 3/31/2017.
 */
public class Rectangle {
    private Square graph2d = new Square();
    public void area(int x, int y, int z){
        graph2d.area(x, y);
        int ares = x +y + z;
        System.out.println("Area of Rectangle is : "+ares);
    }
}
