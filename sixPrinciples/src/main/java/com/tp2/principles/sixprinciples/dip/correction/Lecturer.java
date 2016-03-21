/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.sixprinciples.dip.correction;

/**
 *
 * @author Roman
 */
public class Lecturer implements LecturerActionInterface{
    
     private int empId;
    
    public Lecturer()
    {
    }
    
    public int getEmpId()
    {
        return this.empId;
    }
    public void setEmpId(int empId)
    {
        this.empId = empId;
    }
    
    @Override
    public String performAction() {
        return "TP2 assignments are due"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
