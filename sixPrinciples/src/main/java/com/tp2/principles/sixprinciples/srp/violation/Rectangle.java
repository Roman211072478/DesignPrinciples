/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.sixprinciples.srp.violation;

/**
 *
 * @author Roman
 */
public class Rectangle {
    
    private int length;
    private int width;
    
    public Rectangle()
    {
        //default constructor
    }
    
    public Rectangle(int length,int width)//to use a constructor to set variables
    {
        this.length = length;
        this.width = width;
    }
    
    //getters
    public int getLength()
    {
        return this.length;
    }
    public int getWidth()
    {
        return this.width;
    }
    /*
    The method below can be define in another class and used only to perform
    this action    */
    public int calulateArea()
    {
        return length * width;
    }
}
/*
SRP, is the Single Responsibility Principle, as you can see the above code looks
correct. It will work by all means, but this violates the SRP principle. As you 
can see it performs more than one responsibility. In this example the class
don't only hold attributes but calculates the area, which there is nothing wrong
with it, but to imply the SRP, one would need to slpit it and perfomr the 
calculations in a different class.
*/