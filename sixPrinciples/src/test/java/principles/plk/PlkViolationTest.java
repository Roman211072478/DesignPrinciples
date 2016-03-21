/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principles.plk;


import com.tp2.principles.sixprinciples.plk.violation.Animal;
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
public class PlkViolationTest {
    private Animal animalObject;
    
    public PlkViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testPlkViolation() {
        Assert.assertEquals(animalObject.getSpecies().getDog().getDogType(), "pitbull");
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
