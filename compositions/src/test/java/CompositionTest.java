/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tp2.principles.compositions.Coach;
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
public class CompositionTest {
    
    private Person personObject;
    private Coach coachObject;
    
    public CompositionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testComposition() 
     {
      
       coachObject.setStaffCode(123456);
       
       Assert.assertEquals(coachObject.getStaffCode(),123456,"Error values are not the same");
     }
     
     @Test
     public void testCompositionPersonObject() 
     {
         coachObject.setPerson(personObject);        
         Assert.assertNotNull(coachObject.getPerson());
     }
      @Test
     public void testPersonValues() 
     {
         coachObject.setPerson(personObject);     
         
         personObject = new Person();
         personObject = coachObject.getPerson();
         
         Assert.assertEquals(personObject.getFirstName(),"Fiki","First name should be = Fiki");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        personObject =  new Person("Fiki","Roam",25); 
        coachObject =  new Coach() ;
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
