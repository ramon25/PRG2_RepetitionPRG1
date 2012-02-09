
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramon
 */
public class School {
    private String name;

    private HashMap<Integer,Student> studentList = new HashMap<Integer,Student>();
    
    public School(String name) {
        this.name= name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void enrolStudent(String name, String firstName, String course) {
        Student myStudent = new Student(name,firstName,course);
        studentList.put(myStudent.getNumber(), myStudent);
    }
    
    public void printStudents() {
        Iterator itStud = studentList.entrySet().iterator();
        
        while (itStud.hasNext()) {
            Map.Entry myMap = (Map.Entry)itStud.next();
            Student myStudent = (Student)myMap.getValue();
            myStudent.print();
        }
    }
    
    public static void main(String[] args) {
        School hslu = new School("HSLU");
        hslu.enrolStudent("Rainer","Ramon","IT");
        hslu.enrolStudent("Müller","Lukas","IT");
        
        hslu.printStudents();
    }
}
