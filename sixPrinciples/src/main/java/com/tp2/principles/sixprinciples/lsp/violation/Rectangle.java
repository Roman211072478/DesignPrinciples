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
public class Rectangle {
    private int width;
    private int height;

    public void setRectWidth(int width){
            this.width = width;
    }

    public void setRectHeight(int height){
            this.height = height;
    }


    public int getRectWidth(){
            return width;
    }

    public int getRectHeight(){
            return height;
    }
    
    public int calculatePerimeter(int length, int breath)
    {
        return ((length * 2) + (breath * 2));
    }
    
}
