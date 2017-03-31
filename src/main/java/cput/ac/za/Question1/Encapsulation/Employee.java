package cput.ac.za.Question1.Encapsulation;

/**
 * Created by Mandisi on 3/28/2017.
 */
public class Employee {
    private int staffNo;
    private String name;
    private int year;

    Employee(int staffNo, String name, int year){
        this.staffNo = staffNo;
        this.name = name;
        this.year = year;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(int staffNo) {
        this.staffNo = staffNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
