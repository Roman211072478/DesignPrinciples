/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tp2.principles.coreprinciples.abtracts.PersonAbstract;
import com.tp2.principles.coreprinciples.encapsulation.Person;
import com.tp2.principles.coreprinciples.interfaces.PlayerDetails;
import com.tp2.principles.coreprinciples.polymorphism.Player;
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
public class PolymorphismTest {
    
    private Player playerObject; 
    private PlayerDetails playerDetailObject;
    private PersonAbstract person;
    
    public PolymorphismTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testPolymorphismTheory() {
        playerDetailObject = playerObject;
        person =  playerObject;
        
        
        Assert.assertSame(playerDetailObject, playerObject, "Objects aren't the same");
        Assert.assertSame(person, playerObject, "Objects aren't the same");
  
    }
     @Test
    public void testPolymorphism() {
        playerObject = new Player("fiki","awesome",25);
        
        playerObject.setDivision("U/19");
        
        Assert.assertEquals(playerObject.getAge(),25, "Objects aren't the same");
        Assert.assertEquals(playerObject.getDivision(), "U/19", "Objects aren't the same");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        playerObject = new Player();
       
       
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
