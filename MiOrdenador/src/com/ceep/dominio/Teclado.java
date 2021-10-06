package com.ceep.dominio;

/**
 *
 * @author Ignacio Pérez Jiménez
 */
public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;

    //Constructor
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclados;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + '}' + super.toString();
    }

    
}
