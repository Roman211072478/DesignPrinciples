/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.adp.correction;

/**
 *
 * @author Roman
 */
public class Subject extends Marks{
   // private Marks marks =  new Marks();
    private int subjectCode;
    private String subjectName;
    
    public Subject()
    {
    }
    
    //getters and setters
    public String getSubjectName()
    {
        return this.subjectName;
    }
    public int getSubjectCode()
    {
        return this.subjectCode;
    }
    //setters
    public void setSubjectName(String subjectName)
    {
         this.subjectName = subjectName;
    }
    public void setSubjectCode(int subjectCode)
    {
         this.subjectCode = subjectCode;
    }
    
    @Override
     public void setMark(int mark)
    {
        super.setMark(mark);
    }
     
    @Override
       public int getMark()
    {
        return super.getMark();
    }
    
}
