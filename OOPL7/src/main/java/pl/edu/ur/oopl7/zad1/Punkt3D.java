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
public class Punkt3D extends Punkt2D{
    public double z;
    
    public Punkt3D(double x, double y, double z){
    this.x = x;
    this.y = y;
    this.z = z;
    }
    
    public Punkt3D(){
    x = 0;
    y = 0;
    }
    
    @Override
   public void Losuj(){
        Random losowanie = new Random();
        x = (-10) + (10 - (-10)) * losowanie.nextDouble();
        y = (-10) + (10 - (-10)) * losowanie.nextDouble();
        z = (-10) + (10 - (-10)) * losowanie.nextDouble();
    }
   
   @Override
    public String toString(){
    return "Punkt 3D ma współrzędne:("+ Double.toString(x)+","+Double.toString(y)+","+ Double.toString(z)+")";
    }

}
