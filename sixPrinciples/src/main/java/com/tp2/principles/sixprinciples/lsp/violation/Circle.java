/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.sixprinciples.lsp.violation;

/**
 *
 * @author Roman
 */
public class Circle extends Rectangle{
    
    
    public int calculatePerimeter(int length, int breath)
    {
        return ((length * 2) + (breath * 2));
    }
    
}
