/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.zad1;

import java.util.Date;

/**
 *
 * @author Kazik
 */
public class Osoba {
    public String imie;
    public String nazwisko;
    public Date data_urodzenia;
    public String plec;
    
    public String getImie(){
        return imie;
    }
    
    public String getNazwisko(){
        return nazwisko;
    }
    
    public Date getDataUrodzenia(){
        return data_urodzenia;
    }
    
    public String getPlec(){
        return plec;
    }
    
    public String toString() {
        return "Osoba '" + getImie()+getNazwisko()+ getPlec()+"urodzony"+getDataUrodzenia();
    }
}
