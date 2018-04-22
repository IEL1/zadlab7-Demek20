/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.zad1;

import java.util.Random;

/**
 *
 * @author Szymon Bronski
 */
public class Punkt2D {
    public double x;
    public double y;
    
    public Punkt2D(double x, double y){
    this.x = x;
    this.y =y;
    }
    
    public Punkt2D(){
        this.x = 0;
        this.y = 0;
    }
    
    public void Losuj(){
        Random losowanie = new Random();
        x = (-10) + (10 - (-10)) * losowanie.nextDouble();
        y = (-10) + (10 - (-10)) * losowanie.nextDouble(); 
    }
    
    @Override
    public String toString(){
    return "Punkt 2D ma współrzędne:("+ Double.toString(x)+","+Double.toString(y)+")";
    }
    
}
