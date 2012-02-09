/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramon
 */
public class Teacher extends Person {
    private String subject;
    private int salary;
    
    public Teacher (String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }
    
    public Teacher (String name, String firstName, String subject, int salary) {
        this(name, firstName);
        this.subject = subject;
        this.salary = salary;
    }
}
