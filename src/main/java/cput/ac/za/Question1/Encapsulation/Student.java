package cput.ac.za.Question1.Encapsulation;

/**
 * Created by Mandisi on 3/28/2017.
 */
public class Student {
    private int studentNo;
    private String name;
    private int year;
    private String course;

    Student(int studentNo, String name,int year, String course){
        this.studentNo = studentNo;
        this.name = name;
        this.year = year;
        this.course = course;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}