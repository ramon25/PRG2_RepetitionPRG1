package School;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramon
 */
public class Student extends Person {
    private int studentNumber;
    private String course;
    private static int number = 999;
    
    public Student (String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
        this.number++;
        this.studentNumber = number;
    }
    
    public Student (String name, String firstName, String course) {
        this(name,firstName);
        this.course = course;
    }
    
    public void setCourse (String course) {
        this.course = course;
    }
    
    public String getCourse () {
        return this.course;
    }
    
    public int getNumber() {
        return studentNumber;
    }
    
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Vorname: " + this.firstName);
        System.out.println("ID: " + this.studentNumber);
        System.out.println("Course: " + this.course);
        System.out.println("");
    }
}
