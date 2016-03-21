/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.sixprinciples.srp.correction;



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
    
    public Rectangle(int length,int width)
    {
        this.length = length;
        this.width = width;
    }
    
    public int getLength()
    {
        return this.length;
    }
    public int getWidth()
    {
        return this.width;
    }
    
}
/*
This class has one responsibility and that is to serve as an object that
gets and sets values
*/
