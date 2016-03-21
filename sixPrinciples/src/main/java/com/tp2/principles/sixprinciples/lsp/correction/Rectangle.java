/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.sixprinciples.lsp.correction;



/**
 *
 * @author Roman
 */
public class Rectangle extends PerimeterClass {
    private int width;
    private int lenth;

    public Rectangle(int width,int lenth)
    {
        this.width = width;
        this.lenth = lenth;
    }
    public void setRectWidth(int width){
            this.width = width;
    }

    public void setRectHeight(int height){
            this.lenth = height;
    }


    public int getRectWidth(){
            return width;
    }

    public int getRectHeight(){
            return lenth;
    }
 
    
}
