/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.tp2.principles.coreprinciples.inheritance.SoccerPlayer;
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
public class InheritanceTest {
    
    private SoccerPlayer soccerPlayerObject ;
    
    public InheritanceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testInheritance() {
         soccerPlayerObject.setGoalsScored(15);
         soccerPlayerObject.setPosition("Striker");
         Assert.assertEquals(soccerPlayerObject.getFirstName(),"fiki", "person object wasn't set");
          Assert.assertEquals(soccerPlayerObject.getPosition(),"Striker");
         
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        soccerPlayerObject = new SoccerPlayer("fiki","awesome",25);
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
