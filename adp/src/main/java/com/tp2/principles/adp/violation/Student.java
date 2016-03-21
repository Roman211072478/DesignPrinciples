/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.adp.violation;


import java.util.HashMap;

import java.util.Map;

/**
 *
 * @author Roman
 */
public class Student {
    
    private Map<String,Subject> subjectsList = new HashMap();
    private Map<String,Marks> marks = new HashMap();
   
    public Student()
    {
        
    }
    
    public void addSubject(Subject subject)
    {
        subjectsList.put(subject.getSubjectName(),subject);
    }
     public void addMarks(Marks mark,String subjectName)
    {
        marks.put(subjectName, mark);
    }
    
    public Map<String,Subject> getSubjects()
    {
        return subjectsList;
    }
     public Map<String,Marks> getMarks()
    {
        return marks;
    }
    
    
}
