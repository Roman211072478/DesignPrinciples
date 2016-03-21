/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.coreprinciples.polymorphism;

import com.tp2.principles.coreprinciples.abtracts.PersonAbstract;

import com.tp2.principles.coreprinciples.interfaces.PlayerDetails;

/**
 *
 * @author Roman
 */
public  class Player extends PersonAbstract  implements PlayerDetails {

    private String division;
    private int gamesPlayed;
    
    public Player()
    {
        super();
    }
    public Player(String firstName,String lastName,int age)
    {
        super(firstName,lastName,age);
    }
    
    @Override
    public String getDivision() {
        return this.division;
    }

   

    @Override
    public int getGamesPlayed() {
        return this.gamesPlayed;
    }
    
 @Override
    public void setDivision(String division) {
        this.division = division;
    }
    @Override
    public void setGamesPlayed(int gamesPlayed) {
         this.gamesPlayed = gamesPlayed;
    }
    
}
