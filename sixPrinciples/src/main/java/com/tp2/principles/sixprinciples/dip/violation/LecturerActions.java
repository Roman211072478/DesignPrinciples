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
public class LecturerActions {
    
    private String instruction;
    public LecturerActions()
    {
        instruction = "TP2 assignments are due";
    }
    
    public String performAction()
    {
        return instruction;
    }
    
}
