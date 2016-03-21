/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tp2.principles.adp.correction.Student;
import com.tp2.principles.adp.correction.Subject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class AdpCorrectionTest {
    
    private Student student;
    private Subject subject;
     private Map<String,Subject> subjectsList = new HashMap();
    
    public AdpCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testApdCorrection() {
        subject.setSubjectCode(123);
        subject.setSubjectName("ISYA");

       
        student.addSubject(subject);
        
        subjectsList = student.getSubjects();
        
        subject = new Subject();
        
      
        
        subject = (Subject)  subjectsList.get("ISYA");
        
        Assert.assertEquals(subject.getSubjectName(), "ISYA");
        Assert.assertEquals(subject.getSubjectCode(),123);
    
    }
     @Test
    public void testApdCorrectionMark() {
        subject.setSubjectCode(123);
        subject.setSubjectName("ISYA");
        subject.setMark(76);

        student.addSubject(subject);
        
        subjectsList = student.getSubjects();
        
        subject = new Subject();               
        
        subject = (Subject)  subjectsList.get("ISYA");
        
        Assert.assertEquals(subject.getMark(), 76);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        student = new Student();
        subject = new Subject();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
