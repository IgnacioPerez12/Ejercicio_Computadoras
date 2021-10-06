package com.ceep.dominio;

/**
 *
 * @author Ignacio Pérez Jiménez
 */
public class Teclado {
    private int idTeclado;
    private int contadorTeclados;

    //Constructor
    public Teclado(int idTeclado, int contadorTeclados) {
        this.idTeclado = idTeclado;
        this.contadorTeclados = contadorTeclados;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclados=" + contadorTeclados + '}';
    }
    
}
