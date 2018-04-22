/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7.zad1;

/**
 *
 * @author Kazik
 */
public class Student extends Osoba {
    public int nrIndeksu;
    public String typStudiow;
    public String kierunek;
    public int rokStudiow;

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public String getKierunek() {
        return kierunek;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }
    
    @Override
    public String toString(){
        return "Student " + getImie()+getNazwisko()+"o numerze indeksu"+ getNrIndeksu()+getPlec()+"urodzony"+getDataUrodzenia()
                + "studiuje"+ getKierunek()+"na"+getRokStudiow()+ "roku";
    }
}
