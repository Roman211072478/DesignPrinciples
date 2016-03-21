/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.compositions;

import com.tp2.principles.coreprinciples.encapsulation.Person;

/**
 *
 * @author Roman
 */

public class Coach {
    
    private Person personObject = new Person();
    private int staffCode;
    private String typeOCoach;
    
    
    public Coach()
    {}
    
    public void setPerson(Person personObject)
    {
        this.personObject = personObject;
    }
    public Person getPerson()
    {
        return this.personObject;
    }
    
    public int getStaffCode()
    {   
        return this.staffCode;
    }
    
    public String getTypeOfCoach()
    {   
        return this.typeOCoach;
    }
   
    public void setStaffCode(int staffCode)
    {   
         this.staffCode = staffCode;
    }
    
    public void setTypeOfCoach(String typeOCoach)
    {   
         this.typeOCoach = typeOCoach;
    }
}
