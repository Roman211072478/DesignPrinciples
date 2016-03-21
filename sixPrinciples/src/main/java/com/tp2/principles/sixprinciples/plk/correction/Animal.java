/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.sixprinciples.plk.correction;



/**
 *
 * @author Roman
 */
public class Animal {
    private Dog dog = new Dog();
    private Species species = new Species();
    
   
    public Animal()
    {}
    
    // returning what we need from the classes but not its reference
    public String getDogType()
    {
        return dog.getDogType();
    }
    
     public String getSpecies()
    {
        return species.getSpecies();
    }
    
    
 
}