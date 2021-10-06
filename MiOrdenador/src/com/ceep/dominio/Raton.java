package com.ceep.dominio;

/**
 *
 * @author Ignacio Pérez Jiménez
 */
public class Raton {
    private int idRaton;
    private int contadorRatones;

    //Constructor
    public Raton(int idRaton, int contadorRatones) {
        this.idRaton = idRaton;
        this.contadorRatones = contadorRatones;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
    }
    
    
}
