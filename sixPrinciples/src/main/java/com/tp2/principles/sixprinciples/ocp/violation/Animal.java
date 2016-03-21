/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.sixprinciples.ocp.violation;

/**
 *
 * @author Roman
 */
public class Animal {
    private String sound;
    private String type;
    
    public Animal()
    {
      //default constructor  
    }
    
    public String getType()
    {
        return this.type;
    }
     public String makeSound()
    {
        return this.sound;
    }
    
     public void setType(String type)
    {
         this.type = type;
         
         switch(type)
         {
             case "dog": sound = "woof";
             break;
             case "cat": sound = "meoow";
             break;
             default: sound ="no sound";
         };
    }

    
}
