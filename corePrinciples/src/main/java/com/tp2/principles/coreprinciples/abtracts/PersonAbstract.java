/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.coreprinciples.abtracts;

/**
 *
 * @author Roman
 */
public abstract class PersonAbstract {
     private int age;
    private String firstName;
    private String lastName;
    
    //default constructor
    public PersonAbstract()
    {}
    
    public PersonAbstract(String firstName,String lastName,int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    //getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    
   //setters
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}
