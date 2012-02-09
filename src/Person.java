/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramon
 */
public class Person {
    protected String name;
    protected String firstName;
    
    public Person() {
        
    }
    
    public Person(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public void print() {
        
    }
}
