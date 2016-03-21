/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principles.dip;

import com.tp2.principles.sixprinciples.dip.violation.Lecturer;
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
public class DipVioationTest {
    private Lecturer lecturer;
    
    public DipVioationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testDip() {
        Assert.assertEquals(lecturer.performAnAction(),"TP2 assignments are due" );
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        lecturer = new Lecturer();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
