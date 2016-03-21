/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principles.lsp;

import com.tp2.principles.sixprinciples.lsp.violation.Rectangle;
import com.tp2.principles.sixprinciples.lsp.violation.Circle;
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
public class LspViolatioTest {
    
    private Rectangle rectangle;
    public LspViolatioTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testLsp() {
    
        Assert.assertEquals(rectangle.calculatePerimeter(5, 5), 20);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        rectangle = new Circle();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
