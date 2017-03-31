package cput.ac.za.Question1.Inheritance;

/**
 * Created by Mandisi on 3/28/2017.
 */
public class Car extends Vehicle {
    public Car(){}
    public Car(String name, String color, String model, int year)
    {
        super(name,color,model,year);
    }
    public String getName() {
        return "This is "+ name;
    }
}
