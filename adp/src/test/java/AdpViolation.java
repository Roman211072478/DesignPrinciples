/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tp2.principles.adp.violation.Marks;
import com.tp2.principles.adp.violation.Student;
import com.tp2.principles.adp.violation.Subject;
import java.util.HashMap;
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
public class AdpViolation {
     private Student student;
    private Subject subject;
     private Map<String,Subject> subjectsList = new HashMap();
     private Marks mark;
     private Map<String,Marks> marksList = new HashMap();
     
    public AdpViolation() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAdpViolation() {
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
    public void testAdpViolationMarks() {
        subject.setSubjectCode(123);
        subject.setSubjectName("ISYA");
        mark.setMark(79);
                
        student.addSubject(subject);
        student.addMarks(mark, subject.getSubjectName());
                
        subjectsList = student.getSubjects();
        marksList = student.getMarks();
        
        subject = new Subject();
        mark = new Marks();
 
        subject = (Subject)  subjectsList.get("ISYA");
        mark = (Marks) marksList.get("ISYA");
        
        
        Assert.assertEquals(subject.getSubjectName(), "ISYA");
        Assert.assertEquals(mark.getMark(),79);
        
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
        mark = new Marks();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
