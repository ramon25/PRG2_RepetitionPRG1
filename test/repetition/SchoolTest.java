/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repetition;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author ramon
 */
public class SchoolTest {
    
    public SchoolTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class School.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        School instance = new School("Test");
       
        String expResult = "Test";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class School.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Tester";
        School instance = new School("Test");
        instance.setName(name);
    }

    /**
     * Test of enrolStudent method, of class School.
     */
    @Test
    public void testEnrolStudent() {
        System.out.println("enrolStudent");
        String name = "Test";
        String firstName = "Tester";
        String course = "Topics";
        School instance = new School("TestSchool");
        instance.enrolStudent(name, firstName, course);
    }
}
