/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.coreprinciples.inheritance;

import com.tp2.principles.coreprinciples.abtracts.PersonAbstract;



/**
 *
 * @author Roman
 */
public class SoccerPlayer extends PersonAbstract{
    
    private int goals;
    private String position;
    
    public SoccerPlayer()
    {       
    }
    public SoccerPlayer(String firstName,String lastName,int age)
    {
        super(firstName,lastName,age);
    }
    
    //getters
    public String getPosition()
    {
        return this.position;
    }
    public int getGoalsScored(){
        return this.goals;
    }
    //setters
    public void setPosition(String position)
    {
         this.position = position;
    }
     public void setGoalsScored(int goals)
    {
         this.goals = goals;
    }
   
    
}
