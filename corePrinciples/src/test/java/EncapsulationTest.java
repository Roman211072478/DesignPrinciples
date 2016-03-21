/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tp2.principles.coreprinciples.encapsulation.Person;
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
public class EncapsulationTest {
    private Person personObject;
    
    
    public EncapsulationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testEncapsulation() {
        personObject.setFirstName("Adele");
        personObject.setLastName("Braaf");
        personObject.setAge(23);
        
        Assert.assertEquals(personObject.getFirstName(), "Adele","values weren't equal");
    
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        personObject = new Person();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
