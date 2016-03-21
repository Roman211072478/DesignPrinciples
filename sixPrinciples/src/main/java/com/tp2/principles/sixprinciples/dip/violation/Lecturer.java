/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.sixprinciples.dip.violation;


/**
 *
 * @author Roman
 */
public class Lecturer { 
    
    private LecturerActions action = new LecturerActions();
    
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
    public String performAnAction()
    {
        return action.performAction();
    }
}

