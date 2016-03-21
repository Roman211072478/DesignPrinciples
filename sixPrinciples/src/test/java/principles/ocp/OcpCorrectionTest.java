/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principles.ocp;

import com.tp2.principles.sixprinciples.ocp.correction.Animal;
import com.tp2.principles.sixprinciples.ocp.correction.Cat;
import com.tp2.principles.sixprinciples.ocp.correction.Dog;
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
public class OcpCorrectionTest {
    
    private Animal dog;
    private Animal cat;
    
    public OcpCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testOcpCorrectionDog() {
    
        
      Assert.assertEquals(dog.makeSound(), "woof");
    }
    @Test
    public void testOcpCorrectionnCat() {
      
        
        Assert.assertEquals(cat.makeSound(), "meoow");
    }   

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        dog = new Dog();
        cat = new Cat();
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
