package cput.ac.za.Question1.Inheritance;

/**
 * Created by Mandisi on 3/28/2017.
 */
public class Vehicle
{
    public String name;
    public String color;
    public String model;
    public int year;

    public Vehicle(){}
    public Vehicle(String name, String color, String model,int year)
    {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
}
