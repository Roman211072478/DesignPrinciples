/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp2.principles.sixprinciples.isp.correction;

/**
 *
 * @author Roman
 */
public class Student implements Study{

    @Override
    public String eat() {
        return "eating";
    }

    @Override
    public String study() {
        return "studying";
    }
    
}
