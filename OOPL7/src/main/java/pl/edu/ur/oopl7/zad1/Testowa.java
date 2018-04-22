/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.zad1;
import java.util.Scanner;
/**
 *
 * @author Szymon Bronski
 */
public class Testowa {
    Scanner scanner = new Scanner(System.in);
    private double x;
    private double y;
    private double z;
    
    private Punkt2D losowy2D;
    private Punkt2D nolosowy2D;
    private Punkt3D losowy3D;
    private Punkt3D nolosowy3D;
    
    private Punkt2D[] tablica2D = new Punkt2D[100];
    private Punkt3D[] tablica3D = new Punkt3D[100];
    
    public Testowa(){
        System.out.println("Podaj X"); 
        x = scanner.nextDouble();
        
        System.out.println("Podaj Y"); 
        y= scanner.nextDouble();
        
        System.out.println("Podaj Z"); 
        z = scanner.nextDouble();
        
        losowy2D = new Punkt2D();
        losowy2D.Losuj();
        
        nolosowy2D = new Punkt2D(x,y);
        
        losowy3D = new Punkt3D();
        losowy3D.Losuj();
        
        nolosowy3D = new Punkt3D(x,y,z);
    }
    
    public void test2D(){
       System.out.println("2D losowy");
        System.out.println(losowy2D.toString());
        
        System.out.println("2D nielosowy");
        System.out.println(nolosowy2D.toString());
    }
      
    public void test3D(){
       System.out.println("3D losowy");
        System.out.println(losowy3D.toString());
        
        System.out.println("3D nielosowy");
        System.out.println(nolosowy3D.toString());
    }
    
    public void tablica2D(){
        for(int i=0; i<100;i++){
            tablica2D[i] = new Punkt2D();
            tablica2D[i].Losuj();
        }
    }
    
     public void tablica3D(){
        for(int i=0; i<100;i++){
            tablica2D[i] = new Punkt3D();
            tablica2D[i].Losuj();
        }
    }
     
     
     public void testCO(){
        for (int i=0; i<100; i++){
            for (int j=0; j<100; j++){
                if( (tablica2D[i].x == tablica3D[j].x) && (tablica2D[i].y == tablica3D[j].y) )
                    System.out.println(i+1 + " punkt 2D ma wspolne wspolrzedne z " + j+1 + ". punktem 3D (" + tablica2D[i].toString() + ")");
            }
        }
    }
}
