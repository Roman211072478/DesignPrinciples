/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principles.ocp;


import com.tp2.principles.sixprinciples.ocp.violation.Animal;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Roman
 */
public class OcpViolationTest {
    
    private Animal animalObject; 
    
    public OcpViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testOcpViolationDog() {
      animalObject.setType("dog");
        
      Assert.assertEquals(animalObject.makeSound(), "woof");
    }
    @Test
    public void testOcpViolationCat() {
      animalObject.setType("cat");
        
        Assert.assertEquals(animalObject.makeSound(), "meoow");
    }
    @Test
    public void testOcpViolationDefault() {
      animalObject.setType("nothing");
        
       Assert.assertEquals(animalObject.makeSound(), "no sound");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        animalObject = new Animal();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
