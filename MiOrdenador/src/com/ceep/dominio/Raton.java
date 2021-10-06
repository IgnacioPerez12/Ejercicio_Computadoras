package com.ceep.dominio;

/**
 *
 * @author Ignacio Pérez Jiménez
 */
public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;

    //Constructor
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++contadorRatones;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}' + super.toString();
    }

    
    
    
}
