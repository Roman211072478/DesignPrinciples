/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.adp.correction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Roman
 */
public class Student {
    
    private Map<String,Subject> subjectsList = new HashMap();
   
    public Student()
    {
        
    }
    
    public void addSubject(Subject subject)
    {
        subjectsList.put(subject.getSubjectName(),subject);
    }
    
    public Map<String,Subject> getSubjects()
    {
        return subjectsList;
    }
}
